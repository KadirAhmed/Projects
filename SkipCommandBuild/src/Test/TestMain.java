/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import command.Command;
import listener.OutputListener;

/**
 *
 * @author kadir
 */
public class TestMain {
    
    public static void main(String args[])
    {
    
        
Command cm = new Command();
cm.setCommandString("adb install /home/kadir/Desktop/FILEZILA/DOCOMO/2_SuperBattery_2.9.2_D/SuperBattery_2.9.2_stage_d_sha2.apk");
cm.setOutputListener(new OutputListener() {
    @Override
    public void dispatchOutput(String outut) {
        System.out.println(outut);
    }
});
cm.runCommand();
    }
}
