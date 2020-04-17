/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import java.io.File;

/**
 *
 * @author kadir
 */
public abstract class BaseCommand {
 
 private String commandString;
 private File workingDirectory = new File(System.getProperty("user.home"));
        
    abstract void runCommand();

    protected String getCommandString() {
        return commandString;
    }

    public void setCommandString(String commandString) {
        this.commandString = commandString;
    }

    protected File getWorkingDirectory() {
        return workingDirectory;
    }

    public void setWorkingDirectory(File workingDirectory) {
        this.workingDirectory = workingDirectory;
    }
}
