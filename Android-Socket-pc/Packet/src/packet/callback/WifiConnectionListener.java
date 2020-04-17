/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packet.callback;

import java.net.InetAddress;

/**
 *
 * @author kadir
 */
public interface WifiConnectionListener {
    void onConnectionStablished(String connectedDeviceId, InetAddress inetAddress); // TODO : OPTIONAL  Will be impleted in future//
    void onConnectionStablished();
    void onConnectionLost();
    
}
