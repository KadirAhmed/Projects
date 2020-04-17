/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clipboard;

import clipboard.listener.ClipBoardChangeListener;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.FlavorEvent;
import java.awt.datatransfer.FlavorListener;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kadir
 */
public class UserClipBoard {

    private ClipBoardChangeListener clipDataChangeListener;
    public static void main(String args[]){
      //  paste();
    }
    
    
    public void setListener(ClipBoardChangeListener listener)
    {
        this.clipDataChangeListener = listener;
    }
    
    public void getData() {
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    DataFlavor flavor = DataFlavor.stringFlavor;
    Object data = new Object() ;
    Object previousData = new Object() ;
    ArrayList list = new ArrayList();
    
 
    while ( true ) 
    {
        try 
        {
          data = clipboard.getData(flavor);
        
        if(!previousData.equals(data))
        {
          //System.out.println((String) data );
          clipDataChangeListener.onDataChanged((String)data);
        }
        previousData = data;
        Thread.sleep(50);
      } 
          catch (UnsupportedFlavorException|IOException|InterruptedException e) {
          System.out.println(e);
      }
    }
 
  }
    
    public void setData(String selected)
    {
      StringSelection stringSelection = new StringSelection(selected);
      Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
      clipboard.setContents(stringSelection, null);
    }
    
}
