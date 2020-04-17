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
public interface PeerListener {
    void onPeerFound(String verificationCode);
    void onPeerFound(SocketHandlerListener socketHandlerListener);     
    public void onGetTextDataFromPeer(String data);
}
