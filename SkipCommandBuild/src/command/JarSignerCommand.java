/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import java.io.File;
import listener.OutputListener;

/**
 *
 * @author kadir
 */
public class JarSignerCommand extends Command {

    @Override
    public void setCommandString(String commandString) {
        super.setCommandString(commandString); //To change body of generated methods, choose Tools | Templates.
    }
    
    final static String SPACE = " ";
    final String jarSigner = "jarsigner";
    final String keyStore = "-keystore";
    final String storepass = "-storepass";
    final String digestalg = "-digestalg";
    final String signedjar = "-signedjar";
    final String sigalg = "-sigalg";
    String sigAlgo, digestAlgo, keyStorePath, newSignedSha2ApkPath, signedSha1ApkPath, 
            keyStorePassWord, extraCommand, command="";

    public String getExtraCommand() {
        return extraCommand;
    }

    public void setExtraCommand(String extracommand) {
        this.extraCommand = extracommand;
    }

    public String getKeyStorePassWord() {
        return keyStorePassWord;
    }

    public void setKeyStorePassWord(String keyStorePassWord) {
        this.keyStorePassWord = keyStorePassWord;
    }
    
    public String getSigAlgo() {
        return sigAlgo;
    }

    public void setSigAlgo(String sigAlgo) {
        this.sigAlgo = sigAlgo;
    }

    public String getDigestAlgo() {
        return digestAlgo;
    }

    public void setDigestAlgo(String digestAlgo) {
        this.digestAlgo = digestAlgo;
    }

    public String getKeyStorePath() {
        return keyStorePath;
    }

    public void setKeyStorePath(String keyStorePath) {
        this.keyStorePath = keyStorePath;
    }

    public String getNewSignedSha2ApkPath() {
        return newSignedSha2ApkPath;
    }

    public void setNewSignedSha2ApkPath(String newSignedSha2ApkPath) {
        this.newSignedSha2ApkPath = newSignedSha2ApkPath;
    }

    public String getSignedSha1ApkPath() {
        return signedSha1ApkPath;
    }

    public void setSignedSha1ApkPath(String signedSha1ApkPath) {
        this.signedSha1ApkPath = signedSha1ApkPath;
    }
    
    @Override
    public void setWorkingDirectory(File workingDirectory) {
        super.setWorkingDirectory(workingDirectory); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void runCommand() {
        super.runCommand(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setOutputListener(OutputListener outputListener) {
        super.setOutputListener(outputListener); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String buildCommand(){
        addCommandWord(jarSigner);
        addCommandWord(keyStore);
        addCommandWord(getKeyStorePath());
        addCommandWord(storepass);
        addCommandWord(getKeyStorePassWord());
        addCommandWord(sigalg);
        addCommandWord(getSigAlgo());
        addCommandWord(digestalg);
        addCommandWord(getDigestAlgo());
        addCommandWord(signedjar);
        addCommandWord(getNewSignedSha2ApkPath());
        addCommandWord(getSignedSha1ApkPath());
        addCommandWord(getExtraCommand());
        
        return command;
    }
    
    private void  addCommandWord(String commandWord )
    {
       this.command += commandWord.concat(SPACE);
    }
    
}
