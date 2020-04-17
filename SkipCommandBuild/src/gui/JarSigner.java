/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import command.Command;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import listener.OutputListener;

/**
 *
 * @author kadir
 */
public class JarSigner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
//               try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ApkBuilder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ApkBuilder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ApkBuilder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ApkBuilder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ApkBuilder().setVisible(true);
//            }
//        });


//Command cm = new Command();
//cm.setCommandString("adb install /home/kadir/Desktop/FILEZILA/DOCOMO/32_SuperBattery_2.9.5_D/SuperBattery_2.9.5_stage_d_sha2.apk");
//cm.setOutputListener(new OutputListener() {
//    @Override
//    public void dispatchOutput(String outut) {
//
//        System.out.println(outut);
//    }
//});
//cm.runCommand();
  
   // File adbdirectory = new File("/home/kadir/Android/Sdk/platform-tools");
    ProcessBuilder process = new  ProcessBuilder("7z", "a","Protected123.zip", "-p123", "/home/kadir/Desktop/FILEZILA/DOCOMO/32_SuperBattery_2.9.5_D/SuperBattery_2.9.5_stage_d_sha2.apk");
    process.directory(new File("/home/kadir/Desktop/FILEZILA/DOCOMO"));
   
   Process prcss =  process.start();
    
    
           BufferedReader reader = new BufferedReader(new InputStreamReader(
                prcss.getInputStream()));
        String readline;
        while ((readline = reader.readLine()) != null) {
            System.out.println(readline);
        }

   
   
   
   
   
   
    }
    
}
