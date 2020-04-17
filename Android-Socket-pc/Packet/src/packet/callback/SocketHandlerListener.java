/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packet.callback;

/**
 *
 * @author kadir
 */
public interface SocketHandlerListener {
    void sendClientTextDataToPeer(String textData);
}
