/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packet.core;

import packet.callback.PeerListener;
import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import packet.front.PC;
import packet.callback.WifiConnectionListener;
import packet.callback.SocketHandlerListener;

/**
 *
 * @author kadir
 */
public class SocketHandler implements SocketHandlerListener{
    
/**
 * The static method for getting Local IP address of this machine in a WIFI conncted network. 
 */

   static   InetAddress inetAddress, inet6Address = null; // it is ip_version_6 by default//
   static   Inet4Address inet4Address = null;
   static boolean isResolved = false;
   
   private Thread searchWifiIP, peerThread ;
   private Runnable searchIPRunnable, peerRunnable;
   
   private Socket socketConnection;
   private PeerListener peerListener;
   private WifiConnectionListener wifiConnectinListener; 

    private static InetAddress getInet6Address() {
        return inet6Address;
    }

    private static Inet4Address getInet4Address() {
        return inet4Address;
    }
    
    private static boolean  resolveLocalIPAddress()
    {
        
        try {
            Enumeration e = NetworkInterface.getNetworkInterfaces();
            while(e.hasMoreElements())
            {
                NetworkInterface n = (NetworkInterface) e.nextElement();
                Enumeration ee = n.getInetAddresses();
            // filter  loopbacks and and down interfaces//  

                if( ! n.isUp()){ continue; }
                if( n.isLoopback() ){ continue; }
                
//               System.out.println("Virtual "+n.isVirtual());
//               System.out.println("Pinpoint  "+n.isPointToPoint());
//               System.out.println("Loopback  "+n.isLoopback());
//               System.out.println("UP  "+n.isUp());


                while (ee.hasMoreElements())
                {
                  inetAddress =  (InetAddress) ee.nextElement();
                   if(inetAddress instanceof Inet4Address)
                   {
                       inet4Address = (Inet4Address) inetAddress;
                   }
                   else{
                       inet6Address = inetAddress;
                   }
                   System.out.println("IP Address :" + inetAddress.getHostAddress()  +"---------------------------------------------------------------------------");
           //        System.out.println("isAnyLocalAddress " + i.isAnyLocalAddress() );
                 //  System.out.println("isLinkLocalAddress " + i.isLinkLocalAddress() );
               //    System.out.println("isLoopbackAddress :" + i.isLoopbackAddress());
//                   System.out.println("isMCGlobal " + i.isMCGlobal());
//                   System.out.println("isMCLinkLocal " + i.isMCLinkLocal() );
//                   System.out.println("isMCNodeLocal :" + i.isMCNodeLocal());
//                   System.out.println("isMCOrgLocal " + i.isMCOrgLocal());
//                   System.out.println("isMCSiteLocal " + i.isMCSiteLocal() );
//                   System.out.println("isMulticastAddress " + i.isMulticastAddress());
                   //System.out.println("isSiteLocalAddress " + i.isSiteLocalAddress());                

                }
               //   System.out.println("\n\n");
                 isResolved = true;

            
            }       } catch (SocketException ex) {
                      System.out.println("SocketException : " +ex+"");
                  isResolved = false;
                  
        }

        return (inet4Address != null) && (inet6Address != null); 
    }
    
     public  void checkWifiStatus(Object listener ) {
        wifiConnectinListener = (WifiConnectionListener) listener;
        searchIPRunnable = new Runnable() {
            @Override
            public void run() 
            {
                  while(!SocketHandler.resolveLocalIPAddress()){
                  }
                  wifiConnectinListener.onConnectionStablished();
                  //connectToPeer(listener, ipAdress);
            }
        };
        searchWifiIP = new Thread(searchIPRunnable);
        searchWifiIP.start();    
    }
     
      public void connectToPeer(Object listener, String ipAdress) {
      System.out.println(ipAdress);
       peerListener  =  ((PeerListener) listener);
       String VerificationCode ;
       boolean isConnectionEstablished = false;
                while(socketConnection == null)
                 {
                   try {
                          //  socketConnection = new Socket(SocketHandler.getInet4Address(), 5000); 
                          socketConnection = new Socket(ipAdress, 5000);     
                         //  Thread.currentThread().sleep(5000);
                   } 
                   catch (IOException ex) 
                   {
                    Logger.getLogger(PC.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println(ex+"");
                   } 
                }
            
    VerificationCode = getDataFromPeer();
    isConnectionEstablished = verifyPeer(VerificationCode);
    if(isConnectionEstablished)
    {
        peerListener.onPeerFound("found");
        peerListener.onPeerFound(this);
        startGettingTextData();
    }
    else{
        connectToPeer(listener, ipAdress);
    }
    }
 private  void sendDataToPeer(String stringData ){
                			try {
				DataOutputStream dos = new DataOutputStream(socketConnection.getOutputStream());
				dos.writeUTF(stringData);
   			} catch (Exception exception ) {
                                                                     System.out.println(exception+"");
			}
 
 }
  private boolean verifyPeer(String verifyCode ){
                			try {
			           DataOutputStream dos = new DataOutputStream(socketConnection.getOutputStream());
		                                  dos.writeUTF(verifyCode);
                                                                          return getDataFromPeer().equals("OK") ? true :false;
   			} catch (Exception exception ) {
                                                                     System.out.println(exception+"");
                                                                     return false;
			}
 
 }
  private String getDataFromPeer() 
   {
     String stringData = "";
       try {
	DataInputStream dis = new DataInputStream(socketConnection.getInputStream());
	stringData = dis.readUTF();
                     } 
               catch (Exception e1) 
                     {
                      System.out.println(e1+"");
	}
       
           return stringData;
            }

    private void startGettingTextData() {
        while(true)
        {
            String data = getDataFromPeer();    
            peerListener.onGetTextDataFromPeer(data);
        }
        
    }

    @Override
    public void sendClientTextDataToPeer(String textData) {
         sendDataToPeer(textData);
    }
}
