/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packet.core;

import android.util.Log;

import packet.callback.PeerListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.UUID;

import packet.callback.SocketHandlerListener;
import packet.callback.WifiConnectionListener;

/**
 *
 * @author kadir
 */
public class SocketHandler implements SocketHandlerListener {

    /**
     * The static method for getting Local IP address of this machine in a WIFI conncted network.
     */

    static InetAddress inetAddress, inet6Address = null; // it is ip_version_6 by default//
    static Inet4Address inet4Address = null;
    static boolean isResolved = false;

    private Thread searchWifiIP, peerThread;
    private Runnable searchIPRunnable, peerRunnable;

    private Socket socketConnection;
    private PeerListener peerListener;
    private WifiConnectionListener wifiConnectinListener;
    private ServerSocket dataSocket;
    private Socket peerSocket;

    public static InetAddress getInet6Address() {
        return inet6Address;
    }

    public static Inet4Address getInet4Address() {
        return inet4Address;
    }

    public static boolean resolveLocalIPAddress() {

        try {
            Enumeration e = NetworkInterface.getNetworkInterfaces();
            while (e.hasMoreElements()) {
                NetworkInterface n = (NetworkInterface) e.nextElement();
                Enumeration ee = n.getInetAddresses();
                // filter  loopbacks and and down interfaces//

                if (!n.isUp()) {
                    continue;
                }
                if (n.isLoopback()) {
                    continue;
                }

//               System.out.println("Virtual "+n.isVirtual());
//               System.out.println("Pinpoint  "+n.isPointToPoint());
//               System.out.println("Loopback  "+n.isLoopback());
//               System.out.println("UP  "+n.isUp());


                while (ee.hasMoreElements()) {
                    inetAddress = (InetAddress) ee.nextElement();
                    if (inetAddress instanceof Inet4Address) {
                        inet4Address = (Inet4Address) inetAddress;
                    } else {
                        inet6Address = inetAddress;
                    }
                    System.out.println("IP Address :" + inetAddress.getHostAddress() + "---------------------------------------------------------------------------");
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


            }
        } catch (SocketException ex) {
            System.out.println("SocketException : " + ex + "");
            isResolved = false;

        }

        return (inet4Address != null) && (inet6Address != null);
    }

    public void checkWifiStatus(final Object listener) {
        wifiConnectinListener = (WifiConnectionListener) listener;
        searchIPRunnable = new Runnable() {
            @Override
            public void run() {
                while (!SocketHandler.resolveLocalIPAddress()) {
                }
                wifiConnectinListener.onConnectionStablished();
                connectPeer(listener);
            }
        };
        searchWifiIP = new Thread(searchIPRunnable);
        searchWifiIP.start();
    }

    private void connectPeer(Object listener) {
        peerListener = (PeerListener) listener;
        try {
            dataSocket = new ServerSocket(5000, 1, SocketHandler.getInet4Address());
            peerSocket = dataSocket.accept();
            String verificationCode = UUID.randomUUID().toString();
            sendDataString(verificationCode);

            if (verifyPeerOnReturnCode(verificationCode)) {
                sendDataString("OK");
                peerListener.onPeerFound(this);
                startGettingTextData();
            } else {
                connectPeer(listener);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private  void sendDataToPeer(String stringData ){
        try {
            DataOutputStream dos = new DataOutputStream(peerSocket.getOutputStream());
            dos.writeUTF(stringData);
        } catch (Exception exception ) {
            System.out.println(exception+"");
        }

    }

    private boolean verifyPeerOnReturnCode(String verificationCode) {
        try {
            DataInputStream dis = new DataInputStream(peerSocket.getInputStream());
            String returnString = dis.readUTF();
            return returnString.equals(verificationCode) ? true : false;

        } catch (Exception e1) {
            return false;
        }
    }

    private String getDataString() {
        try {
            DataInputStream dis = new DataInputStream(peerSocket.getInputStream());
            String dataString = dis.readUTF();
            System.out.println(dis);
            return dataString;
        } catch (Exception e1) {
            return "";
        }

    }

    private void sendDataString(String dataString) {
        try {
            DataOutputStream outputCodeStream = new DataOutputStream(peerSocket.getOutputStream());
            outputCodeStream.writeUTF(dataString);
        } catch (Exception exception) {
            Log.e(Class.class.getSimpleName(), exception + "");
        }
    }

    private void startGettingTextData() {
        while (true) {
            String data = getDataString();
            System.out.println(data);
            peerListener.onGetTextDataFromPeer(data);
        }
    }

    @Override
    public void sendClientTextDataToPeer(String textData) {
        sendDataToPeer(textData);
    }
}