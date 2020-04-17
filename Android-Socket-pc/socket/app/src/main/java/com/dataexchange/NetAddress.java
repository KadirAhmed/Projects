package com.dataexchange;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.text.format.Formatter;
import android.util.Log;

import java.net.InetAddress;

import static android.content.Context.WIFI_SERVICE;

/**
 * Created by kadir on 05/02/18.
 */

public class NetAddress
{
    WifiManager wifiMgr;
    Context context;
    String hostAddress, ipAddress, hostName;
    InetAddress inetAddress;
    AsyncTask asyncTask;
    String ClassName = NetAddress.class.getName();

    NetAddress (Context applicationContext)
    {
        context = applicationContext;
        wifiMgr = (WifiManager) context.getSystemService(WIFI_SERVICE);
    }
    public String getHostName() {
        return hostName;
    }

    public String getHostAddress() {
     return "";
    }

    public String getIpAddress() {
        Log.e("NetAddress", wifiMgr.getConnectionInfo().getBSSID() + " " + wifiMgr.getConnectionInfo());
       return ipAddress = Formatter.formatIpAddress(wifiMgr.getConnectionInfo().getIpAddress());

    }
}
