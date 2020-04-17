/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import listener.OutputListener;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kadir
 */
public class Command extends BaseCommand
{
    Process proc = null;
    OutputListener listener;

    public Command() {
    }
    @Override
    public void setWorkingDirectory(File workingDirectory) {
        super.setWorkingDirectory(workingDirectory); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void setCommandString(String commandString) {
        super.setCommandString(commandString); //To change body of generated methods, choose Tools | Templates.
    }

    public void setOutputListener(OutputListener outputListener) {
     listener = outputListener;
    }

    @Override
   public void runCommand() 
   {   
        try {
            proc = Runtime.getRuntime().exec(getCommandString(), null, getWorkingDirectory());
        } catch (IOException ex) {
            Logger.getLogger(Command.class.getName()).log(Level.SEVERE, null, ex);
        }
   		if (proc != null) {
		   BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));
		   PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(proc.getOutputStream())), true);
		   try {
		      String line;
		      while ((line = in.readLine()) != null) {
		        // System.out.println(line);
		        listener.dispatchOutput(line);
                     }
		      proc.waitFor();
		      in.close();
		      out.close();
		      proc.destroy();
		   }
		   catch (Exception e) {
		      e.printStackTrace();
		   }
		}  
       listener.dispatchOutput(getCommandString());
   }
}
