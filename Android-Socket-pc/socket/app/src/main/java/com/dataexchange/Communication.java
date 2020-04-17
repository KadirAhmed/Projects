package com.dataexchange;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import java.net.InetAddress;
import java.net.Socket;

import packet.callback.PeerListener;
import packet.callback.SocketHandlerListener;
import packet.callback.WifiConnectionListener;
import packet.core.SocketHandler;

public class Communication extends AppCompatActivity implements WifiConnectionListener, PeerListener {

    private String ipAddress;
    private NetAddress netAddress;
    static Socket conn;

    private String ClassName = Communication.class.getSimpleName();
    SocketHandlerListener socketHandlerListener;

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communication);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        netAddress = new NetAddress(Communication.this);
        Log.e(ClassName, netAddress.getIpAddress());
        ((TextView)findViewById(R.id.ipAdress)).setText(netAddress.getIpAddress());
        new SocketHandler().checkWifiStatus(this);
        ((Button)findViewById(R.id.sendbutton)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String sendingText = ((EditText)findViewById(R.id.sendingtext)).getText().toString();
                Log.e(ClassName, sendingText);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        socketHandlerListener.sendClientTextDataToPeer(sendingText);
                    }
                }).start();

            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_communication, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onPeerFound(String verificationCode) {

    }

    @Override
    public void onPeerFound(SocketHandlerListener socketHandlerListener) {
        this.socketHandlerListener = socketHandlerListener;
    }

    @Override
    public void onGetTextDataFromPeer(final String data) {

        Log.e(ClassName, "onGetTextDataFromPeer : "+data);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                ((EditText)findViewById(R.id.getText)).setText(data);
            }
        });
    }

    @Override
    public void onConnectionStablished(String connectedDeviceId, InetAddress inetAddress) {

    }

    @Override
    public void onConnectionStablished() {
      System.out.print("Connection Estanlished");
    }

    @Override
    public void onConnectionLost() {

    }
}
