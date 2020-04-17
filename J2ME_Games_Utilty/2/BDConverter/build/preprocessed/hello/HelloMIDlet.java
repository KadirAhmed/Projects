/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hello;

import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import javax.microedition.global.Formatter;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordStore;


/**
 * @author Ron
 */
public class HelloMIDlet extends MIDlet implements CommandListener,ItemStateListener,Runnable{

    private boolean midletPaused = false;
    Thread t; //double x;

    //<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private Command backCommand;
    private Command backCommand1;
    private Command backCommand2;
    private Command okCommand;
    private Command okCommand3;
    private Command backCommand3;
    private Command okCommand2;
    private Command okCommand1;
    private Command backCommand6;
    private Command backCommand5;
    private Command backCommand4;
    private Command okCommand4;
    private Form form;
    private StringItem stringItem;
    private TextField textField;
    private TextField textField2;
    private TextField textField1;
    private TextField textField3;
    private TextField textField4;
    private List list;
    private Form form1;
    private TextField textField7;
    private TextField textField8;
    private TextField textField9;
    private TextField textField5;
    private TextField textField6;
    private TextField textField13;
    private TextField textField12;
    private TextField textField15;
    private TextField textField14;
    private TextField textField11;
    private TextField textField10;
    private TextField textField17;
    private TextField textField16;
    private Form form2;
    private TextField textField22;
    private TextField textField23;
    private TextField textField20;
    private TextField textField21;
    private TextField textField18;
    private TextField textField19;
    private Form form3;
    private TextField textField24;
    private TextField textField25;
    private TextField textField33;
    private TextField textField32;
    private TextField textField31;
    private TextField textField30;
    private TextField textField29;
    private TextField textField28;
    private TextField textField27;
    private TextField textField26;
    private TextField textField37;
    private TextField textField36;
    private TextField textField35;
    private TextField textField34;
    private TextField textField38;
    private List list1;
    private Form form4;
    private TextField textField39;
    private TextField textField40;
    private TextField textField41;
    private List list2;
    private TextBox textBox;
    private Form form5;
    private TextField textField44;
    private TextField textField43;
    private TextField textField42;
    private Form form6;
    private TextField textField45;
    private TextField textField46;
    //</editor-fold>//GEN-END:|fields|0|
    private RecordStore rs;
    private Hashtable vv;
    private String Update="";
    private String delete="";

    private String multiplier="";
    //</editor-fold>

    /**
     * The HelloMIDlet constructor.
     */
    public HelloMIDlet() {
    }

    //<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
    //</editor-fold>//GEN-END:|methods|0|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initilizes the application.
     * It is called only once when the MIDlet is started. The method is called before the <code>startMIDlet</code> method.
     */
    private void initialize() {//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
    }//GEN-BEGIN:|0-initialize|2|
    //</editor-fold>//GEN-END:|0-initialize|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
        switchDisplayable(null, getList());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
    }//GEN-BEGIN:|3-startMIDlet|2|
    //</editor-fold>//GEN-END:|3-startMIDlet|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
    }//GEN-BEGIN:|4-resumeMIDlet|2|
    //</editor-fold>//GEN-END:|4-resumeMIDlet|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The <code>display</code> instance is taken from <code>getDisplay</code> method. This method is used by all actions in the design for switching displayable.
     * @param alert the Alert which is temporarily set to the display; if <code>null</code>, then <code>nextDisplayable</code> is set immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
        Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
    }//GEN-BEGIN:|5-switchDisplayable|2|
    //</editor-fold>//GEN-END:|5-switchDisplayable|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a particular displayable.
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {//GEN-END:|7-commandAction|0|7-preCommandAction
        // write pre-action user code here
        if (displayable == form) {//GEN-BEGIN:|7-commandAction|1|71-preAction
            if (command == backCommand) {//GEN-END:|7-commandAction|1|71-preAction
                // write pre-action user code here
                switchDisplayable(null, getList());//GEN-LINE:|7-commandAction|2|71-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|3|129-preAction
        } else if (displayable == form1) {
            if (command == backCommand) {//GEN-END:|7-commandAction|3|129-preAction
                // write pre-action user code here
                switchDisplayable(null, getList());//GEN-LINE:|7-commandAction|4|129-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|5|107-preAction
        } else if (displayable == form2) {
            if (command == backCommand) {//GEN-END:|7-commandAction|5|107-preAction
                // write pre-action user code here
                switchDisplayable(null, getList());//GEN-LINE:|7-commandAction|6|107-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|7|131-preAction
        } else if (displayable == form3) {
            if (command == backCommand) {//GEN-END:|7-commandAction|7|131-preAction
                // write pre-action user code here
                switchDisplayable(null, getList());//GEN-LINE:|7-commandAction|8|131-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|9|156-preAction
        } else if (displayable == form4) {
            if (command == backCommand2) {//GEN-END:|7-commandAction|9|156-preAction
                // write pre-action user code here
                switchDisplayable(null, getList1());//GEN-LINE:|7-commandAction|10|156-postAction
                // write post-action user code here
            } else if (command == okCommand) {//GEN-LINE:|7-commandAction|11|150-preAction

             try
                {
                     rs = RecordStore.openRecordStore("Unit", true);

                  String appt = " "+textField39.getString()+" = "+textField41.getString()+" x "+ textField40.getString();

                   //  appt = appt+"#"+textField41.getString();

                     byte bytes[] = appt.getBytes();
                     rs.addRecord(bytes,0,bytes.length);


                }

                catch(Exception ex)
                {
                      switchDisplayable(null, getTextBox());
                }
                try
                {
                    rs.closeRecordStore();
                }
                catch(Exception ex)
                {
                         switchDisplayable(null, getTextBox());
                }

           TextBox t = getTextBox(); textBox.setString("User Unit Saved");
           switchDisplayable(null, getTextBox());


//GEN-LINE:|7-commandAction|12|150-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|13|179-preAction
        } else if (displayable == form5) {
            if (command == backCommand4) {//GEN-END:|7-commandAction|13|179-preAction
                // write pre-action user code here
                switchDisplayable(null, getList2());//GEN-LINE:|7-commandAction|14|179-postAction
                // write post-action user code here
            } else if (command == okCommand4) {//GEN-LINE:|7-commandAction|15|177-preAction
              list2.deleteAll();

                String value =  (String) vv.get(Update);

                int id = Integer.parseInt(value, 10);


              // this.textField2.setLabel(Update);this.textField3.setLabel(Update);

                try
                {
                     rs = RecordStore.openRecordStore("Unit", true);



       String new_data = "1"+" "+textField42.getString()+" = "+textField44.getString()+" x "+ textField43.getString();


                   byte bytes[] = new_data.getBytes();

                   rs.setRecord(id, bytes, 0, bytes.length);


                }

                catch(Exception ex)
                {
                  switchDisplayable(null, getTextBox());
                }
                try
                {
                    rs.closeRecordStore();
                }
                catch(Exception ex)
                {
                    switchDisplayable(null, getTextBox());
                }

                TextBox t = getTextBox(); this.textBox.setString("User Unit Updated");

                this.switchDisplayable(null, getTextBox());


//GEN-LINE:|7-commandAction|16|177-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|17|185-preAction
        } else if (displayable == form6) {
            if (command == backCommand5) {//GEN-END:|7-commandAction|17|185-preAction


                switchDisplayable(null, getList2());//GEN-LINE:|7-commandAction|18|185-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|19|64-preAction
        } else if (displayable == list) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|19|64-preAction
                // write pre-action user code here
                listAction();//GEN-LINE:|7-commandAction|20|64-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|21|138-preAction
        } else if (displayable == list1) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|21|138-preAction
                // write pre-action user code here
                list1Action();//GEN-LINE:|7-commandAction|22|138-postAction
                // write post-action user code here
            } else if (command == backCommand6) {//GEN-LINE:|7-commandAction|23|188-preAction
                // write pre-action user code here
                switchDisplayable(null, getList());//GEN-LINE:|7-commandAction|24|188-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|25|159-preAction
        } else if (displayable == list2) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|25|159-preAction
                // write pre-action user code here
                list2Action();//GEN-LINE:|7-commandAction|26|159-postAction
                // write post-action user code here
            } else if (command == backCommand3) {//GEN-LINE:|7-commandAction|27|163-preAction
                // write pre-action user code here
                switchDisplayable(null, getList1());//GEN-LINE:|7-commandAction|28|163-postAction
                // write post-action user code here
            } else if (command == okCommand1) {//GEN-LINE:|7-commandAction|29|166-preAction

                t= new Thread(this);t.start();



                /*
                Formatted f=new Formatted();

                this.getTextField45(); this.getTextField46();

               String uu = list2.getString(list2.getSelectedIndex());

             //  String value =  (String) vv.get(uu);


              String mult[] = f.split(uu, "=");

               mult=f.split(mult[1], "x");

             String unit1[] = f.split(uu, "="); this.textField45.setLabel(unit1[0]);
             String unit2[] = f.split(uu, "x"); this.textField46.setLabel(unit2[1]);

              textField45.setString(unit1[0]);textField46.setString(unit2[0]);

                 //list2.deleteAll();

              */
              switchDisplayable(null,getForm6());



//GEN-LINE:|7-commandAction|30|166-postAction
                // write post-action user code here
            } else if (command == okCommand2) {//GEN-LINE:|7-commandAction|31|168-preAction
                 Update = list2.getString(list2.getSelectedIndex());
//GEN-LINE:|7-commandAction|32|168-postAction
               this.switchDisplayable(null, getForm5());



            } else if (command == okCommand3) {//GEN-LINE:|7-commandAction|33|171-preAction

                delete = list2.getString(list2.getSelectedIndex());

                String value =  (String) vv.get(delete);

                int id = Integer.parseInt(value, 10);

                try
                {
                     rs = RecordStore.openRecordStore("Unit", true);

                     rs.deleteRecord(id);

                }

                catch(Exception ex)
                {
                  switchDisplayable(null, getTextBox());
                }
                try
                {
                    rs.closeRecordStore();
                }
                catch(Exception ex)
                {
                    switchDisplayable(null, getTextBox());

                }

                TextBox t = getTextBox(); this.textBox.setString("User Unit Deleted");


                 switchDisplayable(null, getTextBox());

                 list2.deleteAll();

//GEN-LINE:|7-commandAction|34|171-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|35|153-preAction
        } else if (displayable == textBox) {
            if (command == backCommand1) {//GEN-END:|7-commandAction|35|153-preAction
                // write pre-action user code here
                switchDisplayable(null, getList1());//GEN-LINE:|7-commandAction|36|153-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|37|7-postCommandAction
        }//GEN-END:|7-commandAction|37|7-postCommandAction
        // write post-action user code here
    }//GEN-BEGIN:|7-commandAction|38|
    //</editor-fold>//GEN-END:|7-commandAction|38|


    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: form ">//GEN-BEGIN:|14-getter|0|14-preInit
    /**
     * Returns an initiliazed instance of form component.
     * @return the initialized component instance
     */
    public Form getForm() {
        if (form == null) {//GEN-END:|14-getter|0|14-preInit
            // write pre-init user code here
            form = new Form("Length", new Item[] { getStringItem(), getTextField(), getTextField1(), getTextField2(), getTextField3(), getTextField4() });//GEN-BEGIN:|14-getter|1|14-postInit
            form.addCommand(getBackCommand());
            form.setCommandListener(this);//GEN-END:|14-getter|1|14-postInit

            form.setItemStateListener(this);

        }//GEN-BEGIN:|14-getter|2|
        return form;
    }
    //</editor-fold>//GEN-END:|14-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem ">//GEN-BEGIN:|16-getter|0|16-preInit
    /**
     * Returns an initiliazed instance of stringItem component.
     * @return the initialized component instance
     */
    public StringItem getStringItem() {
        if (stringItem == null) {//GEN-END:|16-getter|0|16-preInit
            // write pre-init user code here
            stringItem = new StringItem("Length Conversion", "Type Numeric");//GEN-LINE:|16-getter|1|16-postInit
            // write post-init user code here
        }//GEN-BEGIN:|16-getter|2|
        return stringItem;
    }
    //</editor-fold>//GEN-END:|16-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField ">//GEN-BEGIN:|23-getter|0|23-preInit
    /**
     * Returns an initiliazed instance of textField component.
     * @return the initialized component instance
     */
    public TextField getTextField() {
        if (textField == null) {//GEN-END:|23-getter|0|23-preInit
            // write pre-init user code here
            textField = new TextField("Meter", null, 32, TextField.DECIMAL);//GEN-LINE:|23-getter|1|23-postInit



        }//GEN-BEGIN:|23-getter|2|
        return textField;
    }
    //</editor-fold>//GEN-END:|23-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField1 ">//GEN-BEGIN:|24-getter|0|24-preInit
    /**
     * Returns an initiliazed instance of textField1 component.
     * @return the initialized component instance
     */
    public TextField getTextField1() {
        if (textField1 == null) {//GEN-END:|24-getter|0|24-preInit
            // write pre-init user code here
            textField1 = new TextField("Inch", null, 32, TextField.DECIMAL);//GEN-LINE:|24-getter|1|24-postInit
            // write post-init user code here
        }//GEN-BEGIN:|24-getter|2|
        return textField1;
    }
    //</editor-fold>//GEN-END:|24-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField2 ">//GEN-BEGIN:|25-getter|0|25-preInit
    /**
     * Returns an initiliazed instance of textField2 component.
     * @return the initialized component instance
     */
    public TextField getTextField2() {
        if (textField2 == null) {//GEN-END:|25-getter|0|25-preInit
            // write pre-init user code here
            textField2 = new TextField("Gauge", null, 32, TextField.DECIMAL);//GEN-LINE:|25-getter|1|25-postInit
            // write post-init user code here
        }//GEN-BEGIN:|25-getter|2|
        return textField2;
    }
    //</editor-fold>//GEN-END:|25-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField3 ">//GEN-BEGIN:|26-getter|0|26-preInit
    /**
     * Returns an initiliazed instance of textField3 component.
     * @return the initialized component instance
     */
    public TextField getTextField3() {
        if (textField3 == null) {//GEN-END:|26-getter|0|26-preInit
            // write pre-init user code here
            textField3 = new TextField("Mile", null, 32, TextField.DECIMAL);//GEN-LINE:|26-getter|1|26-postInit
            // write post-init user code here
        }//GEN-BEGIN:|26-getter|2|
        return textField3;
    }
    //</editor-fold>//GEN-END:|26-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField4 ">//GEN-BEGIN:|28-getter|0|28-preInit
    /**
     * Returns an initiliazed instance of textField4 component.
     * @return the initialized component instance
     */
    public TextField getTextField4() {
        if (textField4 == null) {//GEN-END:|28-getter|0|28-preInit
            // write pre-init user code here
            textField4 = new TextField("Foot", null, 32, TextField.DECIMAL);//GEN-LINE:|28-getter|1|28-postInit
            // write post-init user code here
        }//GEN-BEGIN:|28-getter|2|
        return textField4;
    }
    //</editor-fold>//GEN-END:|28-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: list ">//GEN-BEGIN:|63-getter|0|63-preInit
    /**
     * Returns an initiliazed instance of list component.
     * @return the initialized component instance
     */
    public List getList() {
        if (list == null) {//GEN-END:|63-getter|0|63-preInit
            // write pre-init user code here
            list = new List("list", Choice.IMPLICIT);//GEN-BEGIN:|63-getter|1|63-postInit
            list.append("Length", null);
            list.append("Area", null);
            list.append("Volume", null);
            list.append("Weight", null);
            list.append("User Unit", null);
            list.setCommandListener(this);
            list.setSelectedFlags(new boolean[] { false, false, false, false, false });//GEN-END:|63-getter|1|63-postInit
            // write post-init user code here
        }//GEN-BEGIN:|63-getter|2|
        return list;
    }
    //</editor-fold>//GEN-END:|63-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: listAction ">//GEN-BEGIN:|63-action|0|63-preAction
    /**
     * Performs an action assigned to the selected list element in the list component.
     */
    public void listAction() {//GEN-END:|63-action|0|63-preAction
        // enter pre-action user code here
        String __selectedString = getList().getString(getList().getSelectedIndex());//GEN-BEGIN:|63-action|1|66-preAction
        if (__selectedString != null) {
            if (__selectedString.equals("Length")) {//GEN-END:|63-action|1|66-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm());//GEN-LINE:|63-action|2|66-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Area")) {//GEN-LINE:|63-action|3|68-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm1());//GEN-LINE:|63-action|4|68-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Volume")) {//GEN-LINE:|63-action|5|105-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm2());//GEN-LINE:|63-action|6|105-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Weight")) {//GEN-LINE:|63-action|7|124-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm3());//GEN-LINE:|63-action|8|124-postAction
                // write post-action user code here
            } else if (__selectedString.equals("User Unit")) {//GEN-LINE:|63-action|9|134-preAction
                // write pre-action user code here
                switchDisplayable(null, getList1());//GEN-LINE:|63-action|10|134-postAction
                // write post-action user code here
            }//GEN-BEGIN:|63-action|11|63-postAction
        }//GEN-END:|63-action|11|63-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|63-action|12|
    //</editor-fold>//GEN-END:|63-action|12|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand ">//GEN-BEGIN:|70-getter|0|70-preInit
    /**
     * Returns an initiliazed instance of backCommand component.
     * @return the initialized component instance
     */
    public Command getBackCommand() {
        if (backCommand == null) {//GEN-END:|70-getter|0|70-preInit
            // write pre-init user code here
            backCommand = new Command("Back", Command.BACK, 0);//GEN-LINE:|70-getter|1|70-postInit
            // write post-init user code here
        }//GEN-BEGIN:|70-getter|2|
        return backCommand;
    }
    //</editor-fold>//GEN-END:|70-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: form1 ">//GEN-BEGIN:|73-getter|0|73-preInit
    /**
     * Returns an initiliazed instance of form1 component.
     * @return the initialized component instance
     */
    public Form getForm1() {
        if (form1 == null) {//GEN-END:|73-getter|0|73-preInit
            // write pre-init user code here
            form1 = new Form("Area", new Item[] { getTextField5(), getTextField6(), getTextField7(), getTextField8(), getTextField9(), getTextField10(), getTextField11(), getTextField12(), getTextField13(), getTextField14(), getTextField15(), getTextField16(), getTextField17() });//GEN-BEGIN:|73-getter|1|73-postInit
            form1.addCommand(getBackCommand());
            form1.setCommandListener(this);//GEN-END:|73-getter|1|73-postInit

            form1.setItemStateListener(this);

        }//GEN-BEGIN:|73-getter|2|
        return form1;
    }
    //</editor-fold>//GEN-END:|73-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField5 ">//GEN-BEGIN:|74-getter|0|74-preInit
    /**
     * Returns an initiliazed instance of textField5 component.
     * @return the initialized component instance
     */
    public TextField getTextField5() {
        if (textField5 == null) {//GEN-END:|74-getter|0|74-preInit
            // write pre-init user code here
            textField5 = new TextField("Square Hand", null, 32, TextField.DECIMAL);//GEN-LINE:|74-getter|1|74-postInit
            // write post-init user code here
        }//GEN-BEGIN:|74-getter|2|
        return textField5;
    }
    //</editor-fold>//GEN-END:|74-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField6 ">//GEN-BEGIN:|75-getter|0|75-preInit
    /**
     * Returns an initiliazed instance of textField6 component.
     * @return the initialized component instance
     */
    public TextField getTextField6() {
        if (textField6 == null) {//GEN-END:|75-getter|0|75-preInit
            // write pre-init user code here
            textField6 = new TextField("Gonda", null, 32, TextField.DECIMAL);//GEN-LINE:|75-getter|1|75-postInit
            // write post-init user code here
        }//GEN-BEGIN:|75-getter|2|
        return textField6;
    }
    //</editor-fold>//GEN-END:|75-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField7 ">//GEN-BEGIN:|76-getter|0|76-preInit
    /**
     * Returns an initiliazed instance of textField7 component.
     * @return the initialized component instance
     */
    public TextField getTextField7() {
        if (textField7 == null) {//GEN-END:|76-getter|0|76-preInit
            // write pre-init user code here
            textField7 = new TextField("Sotak", null, 32, TextField.DECIMAL);//GEN-LINE:|76-getter|1|76-postInit
            // write post-init user code here
        }//GEN-BEGIN:|76-getter|2|
        return textField7;
    }
    //</editor-fold>//GEN-END:|76-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField8 ">//GEN-BEGIN:|77-getter|0|77-preInit
    /**
     * Returns an initiliazed instance of textField8 component.
     * @return the initialized component instance
     */
    public TextField getTextField8() {
        if (textField8 == null) {//GEN-END:|77-getter|0|77-preInit
            // write pre-init user code here
            textField8 = new TextField("Katha", null, 32, TextField.DECIMAL);//GEN-LINE:|77-getter|1|77-postInit
            // write post-init user code here
        }//GEN-BEGIN:|77-getter|2|
        return textField8;
    }
    //</editor-fold>//GEN-END:|77-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField9 ">//GEN-BEGIN:|78-getter|0|78-preInit
    /**
     * Returns an initiliazed instance of textField9 component.
     * @return the initialized component instance
     */
    public TextField getTextField9() {
        if (textField9 == null) {//GEN-END:|78-getter|0|78-preInit
            // write pre-init user code here
            textField9 = new TextField("Bigha", null, 32, TextField.DECIMAL);//GEN-LINE:|78-getter|1|78-postInit
            // write post-init user code here
        }//GEN-BEGIN:|78-getter|2|
        return textField9;
    }
    //</editor-fold>//GEN-END:|78-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField10 ">//GEN-BEGIN:|82-getter|0|82-preInit
    /**
     * Returns an initiliazed instance of textField10 component.
     * @return the initialized component instance
     */
    public TextField getTextField10() {
        if (textField10 == null) {//GEN-END:|82-getter|0|82-preInit
            // write pre-init user code here
            textField10 = new TextField("Square Foot", null, 32, TextField.DECIMAL);//GEN-LINE:|82-getter|1|82-postInit
            // write post-init user code here
        }//GEN-BEGIN:|82-getter|2|
        return textField10;
    }
    //</editor-fold>//GEN-END:|82-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField11 ">//GEN-BEGIN:|83-getter|0|83-preInit
    /**
     * Returns an initiliazed instance of textField11 component.
     * @return the initialized component instance
     */
    public TextField getTextField11() {
        if (textField11 == null) {//GEN-END:|83-getter|0|83-preInit
            // write pre-init user code here
            textField11 = new TextField("Square Meter", null, 32, TextField.DECIMAL);//GEN-LINE:|83-getter|1|83-postInit
            // write post-init user code here
        }//GEN-BEGIN:|83-getter|2|
        return textField11;
    }
    //</editor-fold>//GEN-END:|83-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField12 ">//GEN-BEGIN:|84-getter|0|84-preInit
    /**
     * Returns an initiliazed instance of textField12 component.
     * @return the initialized component instance
     */
    public TextField getTextField12() {
        if (textField12 == null) {//GEN-END:|84-getter|0|84-preInit
            // write pre-init user code here
            textField12 = new TextField("Square Gauge", null, 32, TextField.DECIMAL);//GEN-LINE:|84-getter|1|84-postInit
            // write post-init user code here
        }//GEN-BEGIN:|84-getter|2|
        return textField12;
    }
    //</editor-fold>//GEN-END:|84-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField13 ">//GEN-BEGIN:|85-getter|0|85-preInit
    /**
     * Returns an initiliazed instance of textField13 component.
     * @return the initialized component instance
     */
    public TextField getTextField13() {
        if (textField13 == null) {//GEN-END:|85-getter|0|85-preInit
            // write pre-init user code here
            textField13 = new TextField("Akor", null, 32, TextField.DECIMAL);//GEN-LINE:|85-getter|1|85-postInit
            // write post-init user code here
        }//GEN-BEGIN:|85-getter|2|
        return textField13;
    }
    //</editor-fold>//GEN-END:|85-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField14 ">//GEN-BEGIN:|86-getter|0|86-preInit
    /**
     * Returns an initiliazed instance of textField14 component.
     * @return the initialized component instance
     */
    public TextField getTextField14() {
        if (textField14 == null) {//GEN-END:|86-getter|0|86-preInit
            // write pre-init user code here
            textField14 = new TextField("Shotok", null, 32, TextField.DECIMAL);//GEN-LINE:|86-getter|1|86-postInit
            // write post-init user code here
        }//GEN-BEGIN:|86-getter|2|
        return textField14;
    }
    //</editor-fold>//GEN-END:|86-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField15 ">//GEN-BEGIN:|87-getter|0|87-preInit
    /**
     * Returns an initiliazed instance of textField15 component.
     * @return the initialized component instance
     */
    public TextField getTextField15() {
        if (textField15 == null) {//GEN-END:|87-getter|0|87-preInit
            // write pre-init user code here
            textField15 = new TextField("Square Mile", null, 32, TextField.DECIMAL);//GEN-LINE:|87-getter|1|87-postInit
            // write post-init user code here
        }//GEN-BEGIN:|87-getter|2|
        return textField15;
    }
    //</editor-fold>//GEN-END:|87-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField16 ">//GEN-BEGIN:|88-getter|0|88-preInit
    /**
     * Returns an initiliazed instance of textField16 component.
     * @return the initialized component instance
     */
    public TextField getTextField16() {
        if (textField16 == null) {//GEN-END:|88-getter|0|88-preInit
            // write pre-init user code here
            textField16 = new TextField("Aor", null, 32, TextField.DECIMAL);//GEN-LINE:|88-getter|1|88-postInit
            // write post-init user code here
        }//GEN-BEGIN:|88-getter|2|
        return textField16;
    }
    //</editor-fold>//GEN-END:|88-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField17 ">//GEN-BEGIN:|89-getter|0|89-preInit
    /**
     * Returns an initiliazed instance of textField17 component.
     * @return the initialized component instance
     */
    public TextField getTextField17() {
        if (textField17 == null) {//GEN-END:|89-getter|0|89-preInit
            // write pre-init user code here
            textField17 = new TextField("Square Inch", null, 32, TextField.DECIMAL);//GEN-LINE:|89-getter|1|89-postInit
            // write post-init user code here
        }//GEN-BEGIN:|89-getter|2|
        return textField17;
    }
    //</editor-fold>//GEN-END:|89-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: form2 ">//GEN-BEGIN:|97-getter|0|97-preInit
    /**
     * Returns an initiliazed instance of form2 component.
     * @return the initialized component instance
     */
    public Form getForm2() {
        if (form2 == null) {//GEN-END:|97-getter|0|97-preInit
            // write pre-init user code here
            form2 = new Form("Volume", new Item[] { getTextField18(), getTextField19(), getTextField20(), getTextField21(), getTextField22(), getTextField23() });//GEN-BEGIN:|97-getter|1|97-postInit
            form2.addCommand(getBackCommand());
            form2.setCommandListener(this);//GEN-END:|97-getter|1|97-postInit

            form2.setItemStateListener(this);

        }//GEN-BEGIN:|97-getter|2|
        return form2;
    }
    //</editor-fold>//GEN-END:|97-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField18 ">//GEN-BEGIN:|98-getter|0|98-preInit
    /**
     * Returns an initiliazed instance of textField18 component.
     * @return the initialized component instance
     */
    public TextField getTextField18() {
        if (textField18 == null) {//GEN-END:|98-getter|0|98-preInit
            // write pre-init user code here
            textField18 = new TextField("Cubic Meter", null, 32, TextField.DECIMAL);//GEN-LINE:|98-getter|1|98-postInit
            // write post-init user code here
        }//GEN-BEGIN:|98-getter|2|
        return textField18;
    }
    //</editor-fold>//GEN-END:|98-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField19 ">//GEN-BEGIN:|99-getter|0|99-preInit
    /**
     * Returns an initiliazed instance of textField19 component.
     * @return the initialized component instance
     */
    public TextField getTextField19() {
        if (textField19 == null) {//GEN-END:|99-getter|0|99-preInit
            // write pre-init user code here
            textField19 = new TextField("Cubic Centimeter", null, 32, TextField.DECIMAL);//GEN-LINE:|99-getter|1|99-postInit
            // write post-init user code here
        }//GEN-BEGIN:|99-getter|2|
        return textField19;
    }
    //</editor-fold>//GEN-END:|99-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField20 ">//GEN-BEGIN:|100-getter|0|100-preInit
    /**
     * Returns an initiliazed instance of textField20 component.
     * @return the initialized component instance
     */
    public TextField getTextField20() {
        if (textField20 == null) {//GEN-END:|100-getter|0|100-preInit
            // write pre-init user code here
            textField20 = new TextField("Cubic Foot", null, 32, TextField.DECIMAL);//GEN-LINE:|100-getter|1|100-postInit
            // write post-init user code here
        }//GEN-BEGIN:|100-getter|2|
        return textField20;
    }
    //</editor-fold>//GEN-END:|100-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField21 ">//GEN-BEGIN:|101-getter|0|101-preInit
    /**
     * Returns an initiliazed instance of textField21 component.
     * @return the initialized component instance
     */
    public TextField getTextField21() {
        if (textField21 == null) {//GEN-END:|101-getter|0|101-preInit
            // write pre-init user code here
            textField21 = new TextField("Cubic Gauge", null, 32, TextField.DECIMAL);//GEN-LINE:|101-getter|1|101-postInit
            // write post-init user code here
        }//GEN-BEGIN:|101-getter|2|
        return textField21;
    }
    //</editor-fold>//GEN-END:|101-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField22 ">//GEN-BEGIN:|102-getter|0|102-preInit
    /**
     * Returns an initiliazed instance of textField22 component.
     * @return the initialized component instance
     */
    public TextField getTextField22() {
        if (textField22 == null) {//GEN-END:|102-getter|0|102-preInit
            // write pre-init user code here
            textField22 = new TextField("Gallon", null, 32, TextField.DECIMAL);//GEN-LINE:|102-getter|1|102-postInit
            // write post-init user code here
        }//GEN-BEGIN:|102-getter|2|
        return textField22;
    }
    //</editor-fold>//GEN-END:|102-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField23 ">//GEN-BEGIN:|103-getter|0|103-preInit
    /**
     * Returns an initiliazed instance of textField23 component.
     * @return the initialized component instance
     */
    public TextField getTextField23() {
        if (textField23 == null) {//GEN-END:|103-getter|0|103-preInit
            // write pre-init user code here
            textField23 = new TextField("Liter", null, 32, TextField.DECIMAL);//GEN-LINE:|103-getter|1|103-postInit
            // write post-init user code here
        }//GEN-BEGIN:|103-getter|2|
        return textField23;
    }
    //</editor-fold>//GEN-END:|103-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: form3 ">//GEN-BEGIN:|109-getter|0|109-preInit
    /**
     * Returns an initiliazed instance of form3 component.
     * @return the initialized component instance
     */
    public Form getForm3() {
        if (form3 == null) {//GEN-END:|109-getter|0|109-preInit
            // write pre-init user code here
            form3 = new Form("Weight", new Item[] { getTextField24(), getTextField25(), getTextField26(), getTextField27(), getTextField28(), getTextField29(), getTextField30(), getTextField31(), getTextField32(), getTextField33(), getTextField34(), getTextField35(), getTextField36(), getTextField37(), getTextField38() });//GEN-BEGIN:|109-getter|1|109-postInit
            form3.addCommand(getBackCommand());
            form3.setCommandListener(this);//GEN-END:|109-getter|1|109-postInit

            form3.setItemStateListener(this);

        }//GEN-BEGIN:|109-getter|2|
        return form3;
    }
    //</editor-fold>//GEN-END:|109-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField24 ">//GEN-BEGIN:|110-getter|0|110-preInit
    /**
     * Returns an initiliazed instance of textField24 component.
     * @return the initialized component instance
     */
    public TextField getTextField24() {
        if (textField24 == null) {//GEN-END:|110-getter|0|110-preInit
            // write pre-init user code here
            textField24 = new TextField("Kg", null, 32, TextField.DECIMAL);//GEN-LINE:|110-getter|1|110-postInit
            // write post-init user code here
        }//GEN-BEGIN:|110-getter|2|
        return textField24;
    }
    //</editor-fold>//GEN-END:|110-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField25 ">//GEN-BEGIN:|111-getter|0|111-preInit
    /**
     * Returns an initiliazed instance of textField25 component.
     * @return the initialized component instance
     */
    public TextField getTextField25() {
        if (textField25 == null) {//GEN-END:|111-getter|0|111-preInit
            // write pre-init user code here
            textField25 = new TextField("Gram", null, 32, TextField.DECIMAL);//GEN-LINE:|111-getter|1|111-postInit
            // write post-init user code here
        }//GEN-BEGIN:|111-getter|2|
        return textField25;
    }
    //</editor-fold>//GEN-END:|111-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField26 ">//GEN-BEGIN:|112-getter|0|112-preInit
    /**
     * Returns an initiliazed instance of textField26 component.
     * @return the initialized component instance
     */
    public TextField getTextField26() {
        if (textField26 == null) {//GEN-END:|112-getter|0|112-preInit
            // write pre-init user code here
            textField26 = new TextField("Quintal", null, 32, TextField.DECIMAL);//GEN-LINE:|112-getter|1|112-postInit
            // write post-init user code here
        }//GEN-BEGIN:|112-getter|2|
        return textField26;
    }
    //</editor-fold>//GEN-END:|112-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField27 ">//GEN-BEGIN:|113-getter|0|113-preInit
    /**
     * Returns an initiliazed instance of textField27 component.
     * @return the initialized component instance
     */
    public TextField getTextField27() {
        if (textField27 == null) {//GEN-END:|113-getter|0|113-preInit
            // write pre-init user code here
            textField27 = new TextField("Tonn", null, 32, TextField.DECIMAL);//GEN-LINE:|113-getter|1|113-postInit
            // write post-init user code here
        }//GEN-BEGIN:|113-getter|2|
        return textField27;
    }
    //</editor-fold>//GEN-END:|113-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField28 ">//GEN-BEGIN:|114-getter|0|114-preInit
    /**
     * Returns an initiliazed instance of textField28 component.
     * @return the initialized component instance
     */
    public TextField getTextField28() {
        if (textField28 == null) {//GEN-END:|114-getter|0|114-preInit
            // write pre-init user code here
            textField28 = new TextField("Metric Tonn", null, 32, TextField.DECIMAL);//GEN-LINE:|114-getter|1|114-postInit
            // write post-init user code here
        }//GEN-BEGIN:|114-getter|2|
        return textField28;
    }
    //</editor-fold>//GEN-END:|114-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField29 ">//GEN-BEGIN:|115-getter|0|115-preInit
    /**
     * Returns an initiliazed instance of textField29 component.
     * @return the initialized component instance
     */
    public TextField getTextField29() {
        if (textField29 == null) {//GEN-END:|115-getter|0|115-preInit
            // write pre-init user code here
            textField29 = new TextField("Tola", null, 32, TextField.DECIMAL);//GEN-LINE:|115-getter|1|115-postInit
            // write post-init user code here
        }//GEN-BEGIN:|115-getter|2|
        return textField29;
    }
    //</editor-fold>//GEN-END:|115-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField30 ">//GEN-BEGIN:|116-getter|0|116-preInit
    /**
     * Returns an initiliazed instance of textField30 component.
     * @return the initialized component instance
     */
    public TextField getTextField30() {
        if (textField30 == null) {//GEN-END:|116-getter|0|116-preInit
            // write pre-init user code here
            textField30 = new TextField("Sotak", null, 32, TextField.DECIMAL);//GEN-LINE:|116-getter|1|116-postInit
            // write post-init user code here
        }//GEN-BEGIN:|116-getter|2|
        return textField30;
    }
    //</editor-fold>//GEN-END:|116-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField31 ">//GEN-BEGIN:|117-getter|0|117-preInit
    /**
     * Returns an initiliazed instance of textField31 component.
     * @return the initialized component instance
     */
    public TextField getTextField31() {
        if (textField31 == null) {//GEN-END:|117-getter|0|117-preInit
            // write pre-init user code here
            textField31 = new TextField("Poa", null, 32, TextField.DECIMAL);//GEN-LINE:|117-getter|1|117-postInit
            // write post-init user code here
        }//GEN-BEGIN:|117-getter|2|
        return textField31;
    }
    //</editor-fold>//GEN-END:|117-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField32 ">//GEN-BEGIN:|118-getter|0|118-preInit
    /**
     * Returns an initiliazed instance of textField32 component.
     * @return the initialized component instance
     */
    public TextField getTextField32() {
        if (textField32 == null) {//GEN-END:|118-getter|0|118-preInit
            // write pre-init user code here
            textField32 = new TextField("Sher", null, 32, TextField.DECIMAL);//GEN-LINE:|118-getter|1|118-postInit
            // write post-init user code here
        }//GEN-BEGIN:|118-getter|2|
        return textField32;
    }
    //</editor-fold>//GEN-END:|118-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField33 ">//GEN-BEGIN:|119-getter|0|119-preInit
    /**
     * Returns an initiliazed instance of textField33 component.
     * @return the initialized component instance
     */
    public TextField getTextField33() {
        if (textField33 == null) {//GEN-END:|119-getter|0|119-preInit
            // write pre-init user code here
            textField33 = new TextField("Mon", null, 32, TextField.DECIMAL);//GEN-LINE:|119-getter|1|119-postInit
            // write post-init user code here
        }//GEN-BEGIN:|119-getter|2|
        return textField33;
    }
    //</editor-fold>//GEN-END:|119-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField34 ">//GEN-BEGIN:|120-getter|0|120-preInit
    /**
     * Returns an initiliazed instance of textField34 component.
     * @return the initialized component instance
     */
    public TextField getTextField34() {
        if (textField34 == null) {//GEN-END:|120-getter|0|120-preInit
            // write pre-init user code here
            textField34 = new TextField("Ouns", null, 32, TextField.DECIMAL);//GEN-LINE:|120-getter|1|120-postInit
            // write post-init user code here
        }//GEN-BEGIN:|120-getter|2|
        return textField34;
    }
    //</editor-fold>//GEN-END:|120-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField35 ">//GEN-BEGIN:|121-getter|0|121-preInit
    /**
     * Returns an initiliazed instance of textField35 component.
     * @return the initialized component instance
     */
    public TextField getTextField35() {
        if (textField35 == null) {//GEN-END:|121-getter|0|121-preInit
            // write pre-init user code here
            textField35 = new TextField("Hondor", null, 32, TextField.DECIMAL);//GEN-LINE:|121-getter|1|121-postInit
            // write post-init user code here
        }//GEN-BEGIN:|121-getter|2|
        return textField35;
    }
    //</editor-fold>//GEN-END:|121-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField36 ">//GEN-BEGIN:|122-getter|0|122-preInit
    /**
     * Returns an initiliazed instance of textField36 component.
     * @return the initialized component instance
     */
    public TextField getTextField36() {
        if (textField36 == null) {//GEN-END:|122-getter|0|122-preInit
            // write pre-init user code here
            textField36 = new TextField("Pound", null, 32, TextField.DECIMAL);//GEN-LINE:|122-getter|1|122-postInit
            // write post-init user code here
        }//GEN-BEGIN:|122-getter|2|
        return textField36;
    }
    //</editor-fold>//GEN-END:|122-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField37 ">//GEN-BEGIN:|123-getter|0|123-preInit
    /**
     * Returns an initiliazed instance of textField37 component.
     * @return the initialized component instance
     */
    public TextField getTextField37() {
        if (textField37 == null) {//GEN-END:|123-getter|0|123-preInit
            // write pre-init user code here
            textField37 = new TextField("Ouns-troy", null, 32, TextField.DECIMAL);//GEN-LINE:|123-getter|1|123-postInit
            // write post-init user code here
        }//GEN-BEGIN:|123-getter|2|
        return textField37;
    }
    //</editor-fold>//GEN-END:|123-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField38 ">//GEN-BEGIN:|133-getter|0|133-preInit
    /**
     * Returns an initiliazed instance of textField38 component.
     * @return the initialized component instance
     */
    public TextField getTextField38() {
        if (textField38 == null) {//GEN-END:|133-getter|0|133-preInit
            // write pre-init user code here
            textField38 = new TextField("Vori", null, 32, TextField.DECIMAL);//GEN-LINE:|133-getter|1|133-postInit
            // write post-init user code here
        }//GEN-BEGIN:|133-getter|2|
        return textField38;
    }
    //</editor-fold>//GEN-END:|133-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand ">//GEN-BEGIN:|149-getter|0|149-preInit
    /**
     * Returns an initiliazed instance of okCommand component.
     * @return the initialized component instance
     */
    public Command getOkCommand() {
        if (okCommand == null) {//GEN-END:|149-getter|0|149-preInit
            // write pre-init user code here
            okCommand = new Command("Save", Command.OK, 0);//GEN-LINE:|149-getter|1|149-postInit
            // write post-init user code here
        }//GEN-BEGIN:|149-getter|2|
        return okCommand;
    }
    //</editor-fold>//GEN-END:|149-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand1 ">//GEN-BEGIN:|152-getter|0|152-preInit
    /**
     * Returns an initiliazed instance of backCommand1 component.
     * @return the initialized component instance
     */
    public Command getBackCommand1() {
        if (backCommand1 == null) {//GEN-END:|152-getter|0|152-preInit
            // write pre-init user code here
            backCommand1 = new Command("Back", Command.BACK, 0);//GEN-LINE:|152-getter|1|152-postInit
            // write post-init user code here
        }//GEN-BEGIN:|152-getter|2|
        return backCommand1;
    }
    //</editor-fold>//GEN-END:|152-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand2 ">//GEN-BEGIN:|155-getter|0|155-preInit
    /**
     * Returns an initiliazed instance of backCommand2 component.
     * @return the initialized component instance
     */
    public Command getBackCommand2() {
        if (backCommand2 == null) {//GEN-END:|155-getter|0|155-preInit
            // write pre-init user code here
            backCommand2 = new Command("Back", Command.BACK, 0);//GEN-LINE:|155-getter|1|155-postInit
            // write post-init user code here
        }//GEN-BEGIN:|155-getter|2|
        return backCommand2;
    }
    //</editor-fold>//GEN-END:|155-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: list1 ">//GEN-BEGIN:|137-getter|0|137-preInit
    /**
     * Returns an initiliazed instance of list1 component.
     * @return the initialized component instance
     */
    public List getList1() {
        if (list1 == null) {//GEN-END:|137-getter|0|137-preInit
            // write pre-init user code here
            list1 = new List("Add Unit", Choice.IMPLICIT);//GEN-BEGIN:|137-getter|1|137-postInit
            list1.append("Add", null);
            list1.append("Open", null);
            list1.addCommand(getBackCommand6());
            list1.setCommandListener(this);
            list1.setSelectedFlags(new boolean[] { false, false });//GEN-END:|137-getter|1|137-postInit
            // write post-init user code here
        }//GEN-BEGIN:|137-getter|2|
        return list1;
    }
    //</editor-fold>//GEN-END:|137-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: list1Action ">//GEN-BEGIN:|137-action|0|137-preAction
    /**
     * Performs an action assigned to the selected list element in the list1 component.
     */
    public void list1Action() {//GEN-END:|137-action|0|137-preAction
        // enter pre-action user code here
        String __selectedString = getList1().getString(getList1().getSelectedIndex());//GEN-BEGIN:|137-action|1|140-preAction
        if (__selectedString != null) {
            if (__selectedString.equals("Add")) {//GEN-END:|137-action|1|140-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm4());//GEN-LINE:|137-action|2|140-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Open")) {//GEN-LINE:|137-action|3|141-preAction

                List tmp =getList2();     list2.deleteAll();


                RecordEnumeration re;

                String str="";

                vv =new Hashtable();

               try
                {
                     rs = RecordStore.openRecordStore("Unit", true);


                    re = rs.enumerateRecords(null, null, false);

             int i=0;


             while(re.hasNextElement())
             {

                          int id =re.nextRecordId();

                           byte b[] = rs.getRecord(id);
                           str= new String(b,0,b.length);

                           list2.append(str, null);

                           vv.put(str, id+"");

             }


                }

                catch(Exception ex)
                {

                }

                try
                {
                    rs.closeRecordStore();
                }
                catch(Exception ex)
                {

                }


                if(list2.size()!=0)
                {
                  TextBox t = getTextBox(); this.textBox.setString("Action Performed");
                  this.switchDisplayable(null, getList2());
                }


                  // this.switchDisplayable(null, getList2());

                else
                {
                     TextBox t = getTextBox(); this.textBox.setString("No Data Found");
                     this.switchDisplayable(null, getTextBox());
                }
/*
switchDisplayable (null, getList2 ());//GEN-LINE:|137-action|4|141-postAction
                // write post-action user code here
                */
            }//GEN-BEGIN:|137-action|5|137-postAction
        }//GEN-END:|137-action|5|137-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|137-action|6|
    //</editor-fold>//GEN-END:|137-action|6|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: form4 ">//GEN-BEGIN:|142-getter|0|142-preInit
    /**
     * Returns an initiliazed instance of form4 component.
     * @return the initialized component instance
     */
    public Form getForm4() {
        if (form4 == null) {//GEN-END:|142-getter|0|142-preInit
            // write pre-init user code here
            form4 = new Form("User Unit", new Item[] { getTextField39(), getTextField40(), getTextField41() });//GEN-BEGIN:|142-getter|1|142-postInit
            form4.addCommand(getOkCommand());
            form4.addCommand(getBackCommand2());
            form4.setCommandListener(this);//GEN-END:|142-getter|1|142-postInit
            // write post-init user code here
        }//GEN-BEGIN:|142-getter|2|
        return form4;
    }
    //</editor-fold>//GEN-END:|142-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField39 ">//GEN-BEGIN:|145-getter|0|145-preInit
    /**
     * Returns an initiliazed instance of textField39 component.
     * @return the initialized component instance
     */
    public TextField getTextField39() {
        if (textField39 == null) {//GEN-END:|145-getter|0|145-preInit
            // write pre-init user code here
            textField39 = new TextField("User Unit 1", null, 32, TextField.ANY);//GEN-LINE:|145-getter|1|145-postInit
            // write post-init user code here
        }//GEN-BEGIN:|145-getter|2|
        return textField39;
    }
    //</editor-fold>//GEN-END:|145-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField40 ">//GEN-BEGIN:|146-getter|0|146-preInit
    /**
     * Returns an initiliazed instance of textField40 component.
     * @return the initialized component instance
     */
    public TextField getTextField40() {
        if (textField40 == null) {//GEN-END:|146-getter|0|146-preInit
            // write pre-init user code here
            textField40 = new TextField("User Unit 2", null, 32, TextField.ANY);//GEN-LINE:|146-getter|1|146-postInit
            // write post-init user code here
        }//GEN-BEGIN:|146-getter|2|
        return textField40;
    }
    //</editor-fold>//GEN-END:|146-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField41 ">//GEN-BEGIN:|148-getter|0|148-preInit
    /**
     * Returns an initiliazed instance of textField41 component.
     * @return the initialized component instance
     */
    public TextField getTextField41() {
        if (textField41 == null) {//GEN-END:|148-getter|0|148-preInit
            // write pre-init user code here
            textField41 = new TextField("Unit 1 = ? x  Unit 2 Give in Box Bellow :", null, 32, TextField.DECIMAL);//GEN-LINE:|148-getter|1|148-postInit
            // write post-init user code here
        }//GEN-BEGIN:|148-getter|2|
        return textField41;
    }
    //</editor-fold>//GEN-END:|148-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textBox ">//GEN-BEGIN:|151-getter|0|151-preInit
    /**
     * Returns an initiliazed instance of textBox component.
     * @return the initialized component instance
     */
    public TextBox getTextBox() {
        if (textBox == null) {//GEN-END:|151-getter|0|151-preInit
            // write pre-init user code here
            textBox = new TextBox("Message", "User Unit Saved", 100, TextField.ANY);//GEN-BEGIN:|151-getter|1|151-postInit
            textBox.addCommand(getBackCommand1());
            textBox.setCommandListener(this);//GEN-END:|151-getter|1|151-postInit
            // write post-init user code here
        }//GEN-BEGIN:|151-getter|2|
        return textBox;
    }
    //</editor-fold>//GEN-END:|151-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: list2 ">//GEN-BEGIN:|158-getter|0|158-preInit
    /**
     * Returns an initiliazed instance of list2 component.
     * @return the initialized component instance
     */
    public List getList2() {
        if (list2 == null) {//GEN-END:|158-getter|0|158-preInit
            // write pre-init user code here
            list2 = new List("User Units", Choice.IMPLICIT);//GEN-BEGIN:|158-getter|1|158-postInit
            list2.addCommand(getBackCommand3());
            list2.addCommand(getOkCommand1());
            list2.addCommand(getOkCommand2());
            list2.addCommand(getOkCommand3());
            list2.setCommandListener(this);//GEN-END:|158-getter|1|158-postInit
            // write post-init user code here
        }//GEN-BEGIN:|158-getter|2|
        return list2;
    }
    //</editor-fold>//GEN-END:|158-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: list2Action ">//GEN-BEGIN:|158-action|0|158-preAction
    /**
     * Performs an action assigned to the selected list element in the list2 component.
     */
    public void list2Action() {//GEN-END:|158-action|0|158-preAction
        // enter pre-action user code here
        String __selectedString = getList2().getString(getList2().getSelectedIndex());//GEN-LINE:|158-action|1|158-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|158-action|2|
    //</editor-fold>//GEN-END:|158-action|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand3 ">//GEN-BEGIN:|162-getter|0|162-preInit
    /**
     * Returns an initiliazed instance of backCommand3 component.
     * @return the initialized component instance
     */
    public Command getBackCommand3() {
        if (backCommand3 == null) {//GEN-END:|162-getter|0|162-preInit
            // write pre-init user code here
            backCommand3 = new Command("Back", Command.BACK, 0);//GEN-LINE:|162-getter|1|162-postInit
            // write post-init user code here
        }//GEN-BEGIN:|162-getter|2|
        return backCommand3;
    }
    //</editor-fold>//GEN-END:|162-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand1 ">//GEN-BEGIN:|165-getter|0|165-preInit
    /**
     * Returns an initiliazed instance of okCommand1 component.
     * @return the initialized component instance
     */
    public Command getOkCommand1() {
        if (okCommand1 == null) {//GEN-END:|165-getter|0|165-preInit
            // write pre-init user code here
            okCommand1 = new Command("Use", Command.OK, 0);//GEN-LINE:|165-getter|1|165-postInit
            // write post-init user code here
        }//GEN-BEGIN:|165-getter|2|
        return okCommand1;
    }
    //</editor-fold>//GEN-END:|165-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand2 ">//GEN-BEGIN:|167-getter|0|167-preInit
    /**
     * Returns an initiliazed instance of okCommand2 component.
     * @return the initialized component instance
     */
    public Command getOkCommand2() {
        if (okCommand2 == null) {//GEN-END:|167-getter|0|167-preInit
            // write pre-init user code here
            okCommand2 = new Command("Update", Command.OK, 0);//GEN-LINE:|167-getter|1|167-postInit
            // write post-init user code here
        }//GEN-BEGIN:|167-getter|2|
        return okCommand2;
    }
    //</editor-fold>//GEN-END:|167-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand3 ">//GEN-BEGIN:|170-getter|0|170-preInit
    /**
     * Returns an initiliazed instance of okCommand3 component.
     * @return the initialized component instance
     */
    public Command getOkCommand3() {
        if (okCommand3 == null) {//GEN-END:|170-getter|0|170-preInit
            // write pre-init user code here
            okCommand3 = new Command("Delete", Command.OK, 0);//GEN-LINE:|170-getter|1|170-postInit
            // write post-init user code here
        }//GEN-BEGIN:|170-getter|2|
        return okCommand3;
    }
    //</editor-fold>//GEN-END:|170-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand4 ">//GEN-BEGIN:|176-getter|0|176-preInit
    /**
     * Returns an initiliazed instance of okCommand4 component.
     * @return the initialized component instance
     */
    public Command getOkCommand4() {
        if (okCommand4 == null) {//GEN-END:|176-getter|0|176-preInit
            // write pre-init user code here
            okCommand4 = new Command("Update", Command.OK, 0);//GEN-LINE:|176-getter|1|176-postInit
            // write post-init user code here
        }//GEN-BEGIN:|176-getter|2|
        return okCommand4;
    }
    //</editor-fold>//GEN-END:|176-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: form5 ">//GEN-BEGIN:|172-getter|0|172-preInit
    /**
     * Returns an initiliazed instance of form5 component.
     * @return the initialized component instance
     */
    public Form getForm5() {
        if (form5 == null) {//GEN-END:|172-getter|0|172-preInit
            // write pre-init user code here
            form5 = new Form("Update", new Item[] { getTextField42(), getTextField43(), getTextField44() });//GEN-BEGIN:|172-getter|1|172-postInit
            form5.addCommand(getOkCommand4());
            form5.addCommand(getBackCommand4());
            form5.setCommandListener(this);//GEN-END:|172-getter|1|172-postInit
            // write post-init user code here
        }//GEN-BEGIN:|172-getter|2|
        return form5;
    }
    //</editor-fold>//GEN-END:|172-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField42 ">//GEN-BEGIN:|173-getter|0|173-preInit
    /**
     * Returns an initiliazed instance of textField42 component.
     * @return the initialized component instance
     */
    public TextField getTextField42() {
        if (textField42 == null) {//GEN-END:|173-getter|0|173-preInit
            // write pre-init user code here
            textField42 = new TextField("User Unit 1", null, 32, TextField.ANY);//GEN-LINE:|173-getter|1|173-postInit
            // write post-init user code here
        }//GEN-BEGIN:|173-getter|2|
        return textField42;
    }
    //</editor-fold>//GEN-END:|173-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField43 ">//GEN-BEGIN:|174-getter|0|174-preInit
    /**
     * Returns an initiliazed instance of textField43 component.
     * @return the initialized component instance
     */
    public TextField getTextField43() {
        if (textField43 == null) {//GEN-END:|174-getter|0|174-preInit
            // write pre-init user code here
            textField43 = new TextField("User Unir 2", null, 32, TextField.ANY);//GEN-LINE:|174-getter|1|174-postInit
            // write post-init user code here
        }//GEN-BEGIN:|174-getter|2|
        return textField43;
    }
    //</editor-fold>//GEN-END:|174-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField44 ">//GEN-BEGIN:|175-getter|0|175-preInit
    /**
     * Returns an initiliazed instance of textField44 component.
     * @return the initialized component instance
     */
    public TextField getTextField44() {
        if (textField44 == null) {//GEN-END:|175-getter|0|175-preInit
            // write pre-init user code here
            textField44 = new TextField("Unit 1 = ? x  Unit 2 Give in Box Bellow :", null, 32, TextField.DECIMAL);//GEN-LINE:|175-getter|1|175-postInit
            // write post-init user code here
        }//GEN-BEGIN:|175-getter|2|
        return textField44;
    }
    //</editor-fold>//GEN-END:|175-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand4 ">//GEN-BEGIN:|178-getter|0|178-preInit
    /**
     * Returns an initiliazed instance of backCommand4 component.
     * @return the initialized component instance
     */
    public Command getBackCommand4() {
        if (backCommand4 == null) {//GEN-END:|178-getter|0|178-preInit
            // write pre-init user code here
            backCommand4 = new Command("Back", Command.BACK, 0);//GEN-LINE:|178-getter|1|178-postInit
            // write post-init user code here
        }//GEN-BEGIN:|178-getter|2|
        return backCommand4;
    }
    //</editor-fold>//GEN-END:|178-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand5 ">//GEN-BEGIN:|184-getter|0|184-preInit
    /**
     * Returns an initiliazed instance of backCommand5 component.
     * @return the initialized component instance
     */
    public Command getBackCommand5() {
        if (backCommand5 == null) {//GEN-END:|184-getter|0|184-preInit
            // write pre-init user code here
            backCommand5 = new Command("Back", Command.BACK, 0);//GEN-LINE:|184-getter|1|184-postInit
            // write post-init user code here
        }//GEN-BEGIN:|184-getter|2|
        return backCommand5;
    }
    //</editor-fold>//GEN-END:|184-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: form6 ">//GEN-BEGIN:|181-getter|0|181-preInit
    /**
     * Returns an initiliazed instance of form6 component.
     * @return the initialized component instance
     */
    public Form getForm6() {
        if (form6 == null) {//GEN-END:|181-getter|0|181-preInit
            // write pre-init user code here
            form6 = new Form("User Unit In Use", new Item[] { getTextField45(), getTextField46() });//GEN-BEGIN:|181-getter|1|181-postInit
            form6.addCommand(getBackCommand5());
            form6.setCommandListener(this);//GEN-END:|181-getter|1|181-postInit
            // write post-init user code here
            form6.setItemStateListener(this);
        }//GEN-BEGIN:|181-getter|2|
        return form6;
    }
    //</editor-fold>//GEN-END:|181-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField45 ">//GEN-BEGIN:|182-getter|0|182-preInit
    /**
     * Returns an initiliazed instance of textField45 component.
     * @return the initialized component instance
     */
    public TextField getTextField45() {
        if (textField45 == null) {//GEN-END:|182-getter|0|182-preInit
            // write pre-init user code here
            textField45 = new TextField("Unit 1", null, 32, TextField.DECIMAL);//GEN-LINE:|182-getter|1|182-postInit
            // write post-init user code here
        }//GEN-BEGIN:|182-getter|2|
        return textField45;
    }
    //</editor-fold>//GEN-END:|182-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField46 ">//GEN-BEGIN:|183-getter|0|183-preInit
    /**
     * Returns an initiliazed instance of textField46 component.
     * @return the initialized component instance
     */
    public TextField getTextField46() {
        if (textField46 == null) {//GEN-END:|183-getter|0|183-preInit
            // write pre-init user code here
            textField46 = new TextField("Unit 2", null, 32, TextField.DECIMAL);//GEN-LINE:|183-getter|1|183-postInit
            // write post-init user code here
        }//GEN-BEGIN:|183-getter|2|
        return textField46;
    }
    //</editor-fold>//GEN-END:|183-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand6 ">//GEN-BEGIN:|187-getter|0|187-preInit
    /**
     * Returns an initiliazed instance of backCommand6 component.
     * @return the initialized component instance
     */
    public Command getBackCommand6() {
        if (backCommand6 == null) {//GEN-END:|187-getter|0|187-preInit
            // write pre-init user code here
            backCommand6 = new Command("Back", Command.BACK, 0);//GEN-LINE:|187-getter|1|187-postInit
            // write post-init user code here
        }//GEN-BEGIN:|187-getter|2|
        return backCommand6;
    }
    //</editor-fold>//GEN-END:|187-getter|2|


    /**
     * Returns a display instance.
     * @return the display instance.
     */
    public Display getDisplay () {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable (null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started.
     * Checks whether the MIDlet have been already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet ();
        } else {
            initialize ();
            startMIDlet ();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     * @param unconditional if true, then the MIDlet has to be unconditionally terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }

    public void itemStateChanged(Item item)
    {
          Formatted x= new Formatted();

           String standard_meter="0", square_hand="0",Cube_meter="0", weight="0";


        if(item.equals(textField) )
        {

        standard_meter =   "0"+textField.getString();

            textField1.setString(   x.GetFormatted(    39.37*Double.parseDouble(standard_meter)+"")  );
            textField2.setString(   x.GetFormatted(1.0936*Double.parseDouble(standard_meter)+""));
            textField3.setString(   x.GetFormatted(.000625*Double.parseDouble(standard_meter)+""));
            textField4.setString(   x.GetFormatted(  3.28084*Double.parseDouble(standard_meter)+""));


        }


        else if(  item.equals(textField1)  )
        {

             standard_meter =     x.GetFormatted ( ( 1/39.37) *Double.parseDouble("0"+textField1.getString())+"");

            textField.setString(standard_meter);

            textField2.setString( x.GetFormatted(  1.0936*Double.parseDouble(standard_meter)+"")        );
            textField3.setString( x.GetFormatted( .000625*Double.parseDouble(standard_meter)+""));
            textField4.setString( x.GetFormatted( 3.28084*Double.parseDouble(standard_meter)+""));
        }

        else if( item.equals(textField2))
        {

            standard_meter =x.GetFormatted( .9144 *Double.parseDouble("0"+textField2.getString())+"");

            textField.setString(standard_meter);

            textField1.setString(x.GetFormatted( 39.37*Double.parseDouble(standard_meter)+""));
            textField3.setString(x.GetFormatted( .000625*Double.parseDouble(standard_meter)+""));
            textField4.setString(x.GetFormatted( 3.28084*Double.parseDouble(standard_meter)+""));
        }


        else if(item.equals(textField3))
        {

             standard_meter = x.GetFormatted( 1600 *Double.parseDouble("0"+textField3.getString())+"");

            textField.setString(standard_meter);

            textField1.setString(x.GetFormatted( 39.37*Double.parseDouble(standard_meter)+""));
            textField2.setString( x.GetFormatted(  1.0936*Double.parseDouble(standard_meter)+"")        );
           // textField3.setString(x.GetFormatted( .000625*Double.parseDouble(standard_meter)+""));
            textField4.setString(x.GetFormatted( 3.28084*Double.parseDouble(standard_meter)+""));

        }

         else if(item.equals(textField4))
        {

             standard_meter = x.GetFormatted(0.305 *Double.parseDouble("0"+textField4.getString())+"");

            textField.setString(standard_meter);

            textField1.setString(x.GetFormatted( 39.37*Double.parseDouble(standard_meter)+""));
            textField2.setString( x.GetFormatted(  1.0936*Double.parseDouble(standard_meter)+"")        );
            textField3.setString(x.GetFormatted( .000625*Double.parseDouble(standard_meter)+""));
         //   textField4.setString(x.GetFormatted( 3.28084*Double.parseDouble(standard_meter)+""));


        }


           if(item.equals(textField5))
           {

              square_hand =   x.GetFormatted(   Double.parseDouble("0"+textField5.getString())+"");

              textField6.setString( x.GetFormatted(  1* Double.parseDouble(square_hand)+"") );
              textField7.setString( x.GetFormatted( .05 * Double.parseDouble(square_hand)+""));
              textField8.setString( x.GetFormatted( .003125*Double.parseDouble(square_hand)+""));
              textField9.setString( x.GetFormatted(  .00015625*Double.parseDouble(square_hand)+""));

              textField10.setString( x.GetFormatted( 2.25*Double.parseDouble(square_hand)+""));
              textField11.setString( x.GetFormatted( .209*Double.parseDouble(square_hand)+""));

              textField12.setString( x.GetFormatted( .25*Double.parseDouble(square_hand)+""));

              textField13.setString( x.GetFormatted( .000051652*Double.parseDouble(square_hand)+""));
              textField14.setString( x.GetFormatted( .005165289*Double.parseDouble(square_hand)+""));
              textField15.setString( x.GetFormatted( .00000008*Double.parseDouble(square_hand)+""));
              textField16.setString( x.GetFormatted( .000006537*Double.parseDouble(square_hand)+""));
              textField17.setString( x.GetFormatted( 324*Double.parseDouble(square_hand)+""));
              
           }

        else if(item.equals(textField6))
        {


             square_hand =  x.GetFormatted(   1* Double.parseDouble("0"+textField6.getString())+"");

              textField5.setString( x.GetFormatted( 1* Double.parseDouble(square_hand)+""));
           //   textField6.setString( x.GetFormatted(  1* Double.parseDouble(square_hand)+"") );
              textField7.setString( x.GetFormatted( .05 * Double.parseDouble(square_hand)+""));
              textField8.setString( x.GetFormatted( .003125*Double.parseDouble(square_hand)+""));
              textField9.setString( x.GetFormatted(  .00015625*Double.parseDouble(square_hand)+""));

              textField10.setString( x.GetFormatted( 2.25*Double.parseDouble(square_hand)+""));
              textField11.setString( x.GetFormatted( .209*Double.parseDouble(square_hand)+""));

              textField12.setString( x.GetFormatted( .25*Double.parseDouble(square_hand)+""));

              textField13.setString( x.GetFormatted( .000051652*Double.parseDouble(square_hand)+""));
              textField14.setString( x.GetFormatted( .005165289*Double.parseDouble(square_hand)+""));
              textField15.setString( x.GetFormatted( .00000008*Double.parseDouble(square_hand)+""));
              textField16.setString( x.GetFormatted( .000006537*Double.parseDouble(square_hand)+""));
              textField17.setString( x.GetFormatted( 324*Double.parseDouble(square_hand)+""));


        }

  else if(item.equals(textField7))
        {


             square_hand = x.GetFormatted( 20 * Double.parseDouble("0"+textField7.getString())+"");

             textField5.setString(x.GetFormatted( 1* Double.parseDouble(square_hand)+""));
             textField6.setString( x.GetFormatted(  1* Double.parseDouble(square_hand)+"") );
             // textField7.setString( x.GetFormatted( .05 * Double.parseDouble(square_hand)+""));
              textField8.setString( x.GetFormatted( .003125*Double.parseDouble(square_hand)+""));
              textField9.setString( x.GetFormatted(  .00015625*Double.parseDouble(square_hand)+""));

              textField10.setString( x.GetFormatted( 2.25*Double.parseDouble(square_hand)+""));
              textField11.setString( x.GetFormatted( .209*Double.parseDouble(square_hand)+""));

              textField12.setString( x.GetFormatted( .25*Double.parseDouble(square_hand)+""));

              textField13.setString( x.GetFormatted( .000051652*Double.parseDouble(square_hand)+""));
              textField14.setString( x.GetFormatted( .005165289*Double.parseDouble(square_hand)+""));
              textField15.setString( x.GetFormatted( .00000008*Double.parseDouble(square_hand)+""));
              textField16.setString( x.GetFormatted( .000006537*Double.parseDouble(square_hand)+""));
              textField17.setString( x.GetFormatted( 324*Double.parseDouble(square_hand)+""));



        }

        else if(item.equals(textField8))
        {


             square_hand = x.GetFormatted( 320* Double.parseDouble("0"+textField8.getString())+"");

                textField5.setString(x.GetFormatted( 1* Double.parseDouble(square_hand)+""));
              textField6.setString( x.GetFormatted(  1* Double.parseDouble(square_hand)+"") );
              textField7.setString( x.GetFormatted( .05 * Double.parseDouble(square_hand)+""));
            //  textField8.setString( x.GetFormatted( .003125*Double.parseDouble(square_hand)+""));
              textField9.setString( x.GetFormatted(  .00015625*Double.parseDouble(square_hand)+""));

              textField10.setString( x.GetFormatted( 2.25*Double.parseDouble(square_hand)+""));
              textField11.setString( x.GetFormatted( .209*Double.parseDouble(square_hand)+""));

              textField12.setString( x.GetFormatted( .25*Double.parseDouble(square_hand)+""));

              textField13.setString( x.GetFormatted( .000051652*Double.parseDouble(square_hand)+""));
              textField14.setString( x.GetFormatted( .005165289*Double.parseDouble(square_hand)+""));
              textField15.setString( x.GetFormatted( .00000008*Double.parseDouble(square_hand)+""));
              textField16.setString( x.GetFormatted( .000006537*Double.parseDouble(square_hand)+""));
              textField17.setString( x.GetFormatted( 324*Double.parseDouble(square_hand)+""));



        }

        else if(item.equals(textField9))
        {


             square_hand = x.GetFormatted( 6400* Double.parseDouble("0"+textField9.getString())+"");

              textField5.setString(x.GetFormatted( 1* Double.parseDouble(square_hand)+""));
              textField6.setString( x.GetFormatted(  1* Double.parseDouble(square_hand)+"") );
              textField7.setString( x.GetFormatted( .05 * Double.parseDouble(square_hand)+""));
              textField8.setString( x.GetFormatted( .003125*Double.parseDouble(square_hand)+""));
           //   textField9.setString( x.GetFormatted(  .00015625*Double.parseDouble(square_hand)+""));

              textField10.setString( x.GetFormatted( 2.25*Double.parseDouble(square_hand)+""));
              textField11.setString( x.GetFormatted( .209*Double.parseDouble(square_hand)+""));

              textField12.setString( x.GetFormatted( .25*Double.parseDouble(square_hand)+""));

              textField13.setString( x.GetFormatted( .000051652*Double.parseDouble(square_hand)+""));
              textField14.setString( x.GetFormatted( .005165289*Double.parseDouble(square_hand)+""));
              textField15.setString( x.GetFormatted( .00000008*Double.parseDouble(square_hand)+""));
              textField16.setString( x.GetFormatted( .000006537*Double.parseDouble(square_hand)+""));
              textField17.setString( x.GetFormatted( 324*Double.parseDouble(square_hand)+""));
        }

        else if(item.equals(textField10))
        {


              square_hand = x.GetFormatted( .44444 * Double.parseDouble("0"+textField10.getString())+"");

              textField5.setString(x.GetFormatted( 1* Double.parseDouble(square_hand)+""));
              textField6.setString( x.GetFormatted(  1* Double.parseDouble(square_hand)+"") );
              textField7.setString( x.GetFormatted( .05 * Double.parseDouble(square_hand)+""));
              textField8.setString( x.GetFormatted( .003125*Double.parseDouble(square_hand)+""));
              textField9.setString( x.GetFormatted(  .00015625*Double.parseDouble(square_hand)+""));

             // textField10.setString( x.GetFormatted( 2.25*Double.parseDouble(square_hand)+""));
              textField11.setString( x.GetFormatted( .209*Double.parseDouble(square_hand)+""));

              textField12.setString( x.GetFormatted( .25*Double.parseDouble(square_hand)+""));

              textField13.setString( x.GetFormatted( .000051652*Double.parseDouble(square_hand)+""));
              textField14.setString( x.GetFormatted( .005165289*Double.parseDouble(square_hand)+""));
              textField15.setString( x.GetFormatted( .00000008*Double.parseDouble(square_hand)+""));
              textField16.setString( x.GetFormatted( .000006537*Double.parseDouble(square_hand)+""));
              textField17.setString( x.GetFormatted( 324*Double.parseDouble(square_hand)+""));

        }

           else if(item.equals(textField11))
        {


              square_hand = x.GetFormatted( 4.784688995 * Double.parseDouble("0"+textField11.getString())+"");

              textField5.setString(x.GetFormatted( 1* Double.parseDouble(square_hand)+""));
              textField6.setString( x.GetFormatted(  1* Double.parseDouble(square_hand)+"") );
              textField7.setString( x.GetFormatted( .05 * Double.parseDouble(square_hand)+""));
              textField8.setString( x.GetFormatted( .003125*Double.parseDouble(square_hand)+""));
              textField9.setString( x.GetFormatted(  .00015625*Double.parseDouble(square_hand)+""));

              textField10.setString( x.GetFormatted( 2.25*Double.parseDouble(square_hand)+""));
             // textField11.setString( x.GetFormatted( .209*Double.parseDouble(square_hand)+""));

              textField12.setString( x.GetFormatted( .25*Double.parseDouble(square_hand)+""));

              textField13.setString( x.GetFormatted( .000051652*Double.parseDouble(square_hand)+""));
              textField14.setString( x.GetFormatted( .005165289*Double.parseDouble(square_hand)+""));
              textField15.setString( x.GetFormatted( .00000008*Double.parseDouble(square_hand)+""));
              textField16.setString( x.GetFormatted( .000006537*Double.parseDouble(square_hand)+""));
              textField17.setString( x.GetFormatted( 324*Double.parseDouble(square_hand)+""));

        }

         else if(item.equals(textField12))
        {


              square_hand = x.GetFormatted( 4* Double.parseDouble("0"+textField12.getString())+"");

              textField5.setString(x.GetFormatted( 1* Double.parseDouble(square_hand)+""));
              textField6.setString( x.GetFormatted(  1* Double.parseDouble(square_hand)+"") );
              textField7.setString( x.GetFormatted( .05 * Double.parseDouble(square_hand)+""));
              textField8.setString( x.GetFormatted( .003125*Double.parseDouble(square_hand)+""));
              textField9.setString( x.GetFormatted(  .00015625*Double.parseDouble(square_hand)+""));

              textField10.setString( x.GetFormatted( 2.25*Double.parseDouble(square_hand)+""));
              textField11.setString( x.GetFormatted( .209*Double.parseDouble(square_hand)+""));

           //   textField12.setString( x.GetFormatted( .25*Double.parseDouble(square_hand)+""));

              textField13.setString( x.GetFormatted( .000051652*Double.parseDouble(square_hand)+""));
              textField14.setString( x.GetFormatted( .005165289*Double.parseDouble(square_hand)+""));
              textField15.setString( x.GetFormatted( .00000008*Double.parseDouble(square_hand)+""));
              textField16.setString( x.GetFormatted( .000006537*Double.parseDouble(square_hand)+""));
              textField17.setString( x.GetFormatted( 324*Double.parseDouble(square_hand)+""));

        }

         else if(item.equals(textField13))
        {


              square_hand = x.GetFormatted( 19360* Double.parseDouble("0"+textField13.getString())+"");

              textField5.setString(x.GetFormatted( 1* Double.parseDouble(square_hand)+""));
              textField6.setString( x.GetFormatted(  1* Double.parseDouble(square_hand)+"") );
              textField7.setString( x.GetFormatted( .05 * Double.parseDouble(square_hand)+""));
              textField8.setString( x.GetFormatted( .003125*Double.parseDouble(square_hand)+""));
              textField9.setString( x.GetFormatted(  .00015625*Double.parseDouble(square_hand)+""));

              textField10.setString( x.GetFormatted( 2.25*Double.parseDouble(square_hand)+""));
              textField11.setString( x.GetFormatted( .209*Double.parseDouble(square_hand)+""));

              textField12.setString( x.GetFormatted( .25*Double.parseDouble(square_hand)+""));

           //   textField13.setString( x.GetFormatted( .000051652*Double.parseDouble(square_hand)+""));
              textField14.setString( x.GetFormatted( .005165289*Double.parseDouble(square_hand)+""));
              textField15.setString( x.GetFormatted( .00000008*Double.parseDouble(square_hand)+""));
              textField16.setString( x.GetFormatted( .000006537*Double.parseDouble(square_hand)+""));
              textField17.setString( x.GetFormatted( 324*Double.parseDouble(square_hand)+""));

        }


        else if(item.equals(textField14))
        {


              square_hand = x.GetFormatted( 193.6 * Double.parseDouble("0"+textField14.getString())+"");

              textField5.setString(x.GetFormatted( 1* Double.parseDouble(square_hand)+""));
              textField6.setString( x.GetFormatted(  1* Double.parseDouble(square_hand)+"") );
              textField7.setString( x.GetFormatted( .05 * Double.parseDouble(square_hand)+""));
              textField8.setString( x.GetFormatted( .003125*Double.parseDouble(square_hand)+""));
              textField9.setString( x.GetFormatted(  .00015625*Double.parseDouble(square_hand)+""));

              textField10.setString( x.GetFormatted( 2.25*Double.parseDouble(square_hand)+""));
              textField11.setString( x.GetFormatted( .209*Double.parseDouble(square_hand)+""));

              textField12.setString( x.GetFormatted( .25*Double.parseDouble(square_hand)+""));

              textField13.setString( x.GetFormatted( .000051652*Double.parseDouble(square_hand)+""));
           //   textField14.setString( x.GetFormatted( .005165289*Double.parseDouble(square_hand)+""));
              textField15.setString( x.GetFormatted( .00000008*Double.parseDouble(square_hand)+""));
              textField16.setString( x.GetFormatted( .000006537*Double.parseDouble(square_hand)+""));
              textField17.setString( x.GetFormatted( 324*Double.parseDouble(square_hand)+""));

        }


        else if(item.equals(textField15))
        {


              square_hand = x.GetFormatted( 12390400 * Double.parseDouble("0"+textField15.getString())+"");

              textField5.setString(x.GetFormatted( 1* Double.parseDouble(square_hand)+""));
              textField6.setString( x.GetFormatted(  1* Double.parseDouble(square_hand)+"") );
              textField7.setString( x.GetFormatted( .05 * Double.parseDouble(square_hand)+""));
              textField8.setString( x.GetFormatted( .003125*Double.parseDouble(square_hand)+""));
              textField9.setString( x.GetFormatted(  .00015625*Double.parseDouble(square_hand)+""));

              textField10.setString( x.GetFormatted( 2.25*Double.parseDouble(square_hand)+""));
              textField11.setString( x.GetFormatted( .209*Double.parseDouble(square_hand)+""));

              textField12.setString( x.GetFormatted( .25*Double.parseDouble(square_hand)+""));

              textField13.setString( x.GetFormatted( .000051652*Double.parseDouble(square_hand)+""));
              textField14.setString( x.GetFormatted( .005165289*Double.parseDouble(square_hand)+""));
             // textField15.setString( x.GetFormatted( .00000008*Double.parseDouble(square_hand)+""));
              textField16.setString( x.GetFormatted( .000006537*Double.parseDouble(square_hand)+""));
              textField17.setString( x.GetFormatted( 324*Double.parseDouble(square_hand)+""));

        }

         else if(item.equals(textField16))
        {

              square_hand = x.GetFormatted( 152960 * Double.parseDouble("0"+textField16.getString())+"");

              textField5.setString(x.GetFormatted( 1* Double.parseDouble(square_hand)+""));
              textField6.setString( x.GetFormatted(  1* Double.parseDouble(square_hand)+"") );
              textField7.setString( x.GetFormatted( .05 * Double.parseDouble(square_hand)+""));
              textField8.setString( x.GetFormatted( .003125*Double.parseDouble(square_hand)+""));
              textField9.setString( x.GetFormatted(  .00015625*Double.parseDouble(square_hand)+""));

              textField10.setString( x.GetFormatted( 2.25*Double.parseDouble(square_hand)+""));
              textField11.setString( x.GetFormatted( .209*Double.parseDouble(square_hand)+""));

              textField12.setString( x.GetFormatted( .25*Double.parseDouble(square_hand)+""));

              textField13.setString( x.GetFormatted( .000051652*Double.parseDouble(square_hand)+""));
              textField14.setString( x.GetFormatted( .005165289*Double.parseDouble(square_hand)+""));
              textField15.setString( x.GetFormatted( .00000008*Double.parseDouble(square_hand)+""));
            //  textField16.setString( x.GetFormatted( .000006537*Double.parseDouble(square_hand)+""));
              textField17.setString( x.GetFormatted( 324*Double.parseDouble(square_hand)+""));

        }


         else if(item.equals(textField17))
        {



              square_hand = x.GetFormatted( .003086419 * Double.parseDouble("0"+textField17.getString())+"");

              textField5.setString(x.GetFormatted( 1* Double.parseDouble(square_hand)+""));
              textField6.setString( x.GetFormatted(  1* Double.parseDouble(square_hand)+"") );
              textField7.setString( x.GetFormatted( .05 * Double.parseDouble(square_hand)+""));
              textField8.setString( x.GetFormatted( .003125*Double.parseDouble(square_hand)+""));
              textField9.setString( x.GetFormatted(  .00015625*Double.parseDouble(square_hand)+""));

              textField10.setString( x.GetFormatted( 2.25*Double.parseDouble(square_hand)+""));
              textField11.setString( x.GetFormatted( .209*Double.parseDouble(square_hand)+""));

              textField12.setString( x.GetFormatted( .25*Double.parseDouble(square_hand)+""));

              textField13.setString( x.GetFormatted( .000051652*Double.parseDouble(square_hand)+""));
              textField14.setString( x.GetFormatted( .005165289*Double.parseDouble(square_hand)+""));
              textField15.setString( x.GetFormatted( .00000008*Double.parseDouble(square_hand)+""));
              textField16.setString( x.GetFormatted( .000006537*Double.parseDouble(square_hand)+""));
             // textField17.setString( x.GetFormatted( 324*Double.parseDouble(square_hand)+""));

        }


           if(item.equals(textField18))

           {

               Cube_meter = x.GetFormatted(1* Double.parseDouble("0"+textField18.getString())+"");

               textField19.setString( x.GetFormatted( 1000000 *Double.parseDouble(Cube_meter)+"") );
               textField20.setString( x.GetFormatted( 35.3 *Double.parseDouble(Cube_meter)+"") );
               textField21.setString( x.GetFormatted( 1.308*Double.parseDouble(Cube_meter)+"") );
               textField22.setString( x.GetFormatted( 220*Double.parseDouble(Cube_meter)+"") );
               textField23.setString( x.GetFormatted( 1000*Double.parseDouble(Cube_meter)+"") );




           }

        else if(item.equals(textField19))

           {

               Cube_meter = x.GetFormatted(0.000001* Double.parseDouble("0"+textField19.getString())+"");

               textField18.setString( x.GetFormatted( 1*Double.parseDouble(Cube_meter)+"") );
            //   textField19.setString( x.GetFormatted( 1000000 *Double.parseDouble(Cube_meter)+"") );
               textField20.setString( x.GetFormatted( 35.3 *Double.parseDouble(Cube_meter)+"") );
               textField21.setString( x.GetFormatted( 1.308*Double.parseDouble(Cube_meter)+"") );
               textField22.setString( x.GetFormatted( 220*Double.parseDouble(Cube_meter)+"") );
               textField23.setString( x.GetFormatted( 1000*Double.parseDouble(Cube_meter)+"") );




           }

        else if(item.equals(textField20))

           {

               Cube_meter = x.GetFormatted(0.0283* Double.parseDouble("0"+textField20.getString())+"");

               textField18.setString( x.GetFormatted( 1*Double.parseDouble(Cube_meter)+"") );
               textField19.setString( x.GetFormatted( 1000000 *Double.parseDouble(Cube_meter)+"") );
               //textField20.setString( x.GetFormatted( 35.3 *Double.parseDouble(Cube_meter)+"") );
               textField21.setString( x.GetFormatted( 1.308*Double.parseDouble(Cube_meter)+"") );
               textField22.setString( x.GetFormatted( 220*Double.parseDouble(Cube_meter)+"") );
               textField23.setString( x.GetFormatted( 1000*Double.parseDouble(Cube_meter)+"") );




           }



        else if(item.equals(textField21))

           {

               Cube_meter = x.GetFormatted(0.7645* Double.parseDouble("0"+textField21.getString())+"");

               textField18.setString( x.GetFormatted( 1*Double.parseDouble(Cube_meter)+"") );
               textField19.setString( x.GetFormatted( 1000000 *Double.parseDouble(Cube_meter)+"") );
               textField20.setString( x.GetFormatted( 35.3 *Double.parseDouble(Cube_meter)+"") );
               //textField21.setString( x.GetFormatted( 1.308*Double.parseDouble(Cube_meter)+"") );
               textField22.setString( x.GetFormatted( 220*Double.parseDouble(Cube_meter)+"") );
               textField23.setString( x.GetFormatted( 1000*Double.parseDouble(Cube_meter)+"") );




           }

        else if(item.equals(textField22))

           {

               Cube_meter = x.GetFormatted(0.00454545* Double.parseDouble("0"+textField22.getString())+"");

               textField18.setString( x.GetFormatted( 1*Double.parseDouble(Cube_meter)+"") );
               textField19.setString( x.GetFormatted( 1000000 *Double.parseDouble(Cube_meter)+"") );
               textField20.setString( x.GetFormatted( 35.3 *Double.parseDouble(Cube_meter)+"") );
               textField21.setString( x.GetFormatted( 1.308*Double.parseDouble(Cube_meter)+"") );
           //    textField22.setString( x.GetFormatted( 220*Double.parseDouble(Cube_meter)+"") );
               textField23.setString( x.GetFormatted( 1000*Double.parseDouble(Cube_meter)+"") );




           }

   else if(item.equals(textField23))

           {

               Cube_meter = x.GetFormatted(0.001* Double.parseDouble("0"+textField23.getString())+"");

               textField18.setString( x.GetFormatted( 1*Double.parseDouble(Cube_meter)+"") );
               textField19.setString( x.GetFormatted( 1000000 *Double.parseDouble(Cube_meter)+"") );
               textField20.setString( x.GetFormatted( 35.3 *Double.parseDouble(Cube_meter)+"") );
               textField21.setString( x.GetFormatted( 1.308*Double.parseDouble(Cube_meter)+"") );
               textField22.setString( x.GetFormatted( 220*Double.parseDouble(Cube_meter)+"") );
              // textField23.setString( x.GetFormatted( 1000*Double.parseDouble(Cube_meter)+"") );



           }



         if(item.equals(textField24))
         {


             weight = x.GetFormatted(1*Double.parseDouble("0"+textField24.getString())+"");

           //  textField24.setString( x.GetFormatted( 1 *Double.parseDouble(weight)+"") +"" );
               textField25.setString( x.GetFormatted( 1000.0*Double.parseDouble(weight)+"") );
               textField26.setString( x.GetFormatted( 0.01*Double.parseDouble(weight)+"") );
               textField27.setString( x.GetFormatted( 0.000984251*Double.parseDouble(weight)+"") );
               textField28.setString( x.GetFormatted( 0.001*Double.parseDouble(weight)+"") );

               textField29.setString( x.GetFormatted( 85.7163827*Double.parseDouble(weight)+"") );

               textField30.setString( x.GetFormatted( 17.14327654*Double.parseDouble(weight)+"") );

               textField31.setString( x.GetFormatted( 4.28*Double.parseDouble(weight)+"") );

               textField32.setString( x.GetFormatted( 1.075268817*Double.parseDouble(weight)+"") );
               textField33.setString( x.GetFormatted( 0.02679528403*Double.parseDouble(weight)+"") );
               textField34.setString( x.GetFormatted( 35.27336861*Double.parseDouble(weight)+"") );
               textField35.setString( x.GetFormatted( 0.01968503937*Double.parseDouble(weight)+"") );

               textField36.setString( x.GetFormatted( 2.204585538*Double.parseDouble(weight)+"") );
               textField37.setString( x.GetFormatted(  32.1507466*Double.parseDouble(weight)+"") );
               textField38.setString( x.GetFormatted(  85.7163827*Double.parseDouble(weight)+"") );





         }


         else if (item.equals(textField25))
         {


             weight = x.GetFormatted((1/1000.0)*Double.parseDouble("0"+textField25.getString())+"");

               textField24.setString( x.GetFormatted( 1 *Double.parseDouble(weight)+"") +"" );
              // textField25.setString( x.GetFormatted( 1000.0*Double.parseDouble(weight)+"") );
               textField26.setString( x.GetFormatted( 0.01*Double.parseDouble(weight)+"") );
               textField27.setString( x.GetFormatted( 0.000984251*Double.parseDouble(weight)+"") );
               textField28.setString( x.GetFormatted( 0.001*Double.parseDouble(weight)+"") );

               textField29.setString( x.GetFormatted( 85.7163827*Double.parseDouble(weight)+"") );

               textField30.setString( x.GetFormatted( 17.14327654*Double.parseDouble(weight)+"") );

               textField31.setString( x.GetFormatted( 4.28*Double.parseDouble(weight)+"") );

               textField32.setString( x.GetFormatted( 1.075268817*Double.parseDouble(weight)+"") );
               textField33.setString( x.GetFormatted( 0.02679528403*Double.parseDouble(weight)+"") );
               textField34.setString( x.GetFormatted( 35.27336861*Double.parseDouble(weight)+"") );
               textField35.setString( x.GetFormatted( 0.01968503937*Double.parseDouble(weight)+"") );

               textField36.setString( x.GetFormatted( 2.204585538*Double.parseDouble(weight)+"") );
               textField37.setString( x.GetFormatted(  32.1507466*Double.parseDouble(weight)+"") );
               textField38.setString( x.GetFormatted(  85.7163827*Double.parseDouble(weight)+"") );

         }


         else if (item.equals(textField26))
         {


              weight = x.GetFormatted((1/0.01)*Double.parseDouble("0"+textField26.getString())+"");

               textField24.setString( x.GetFormatted( 1 *Double.parseDouble(weight)+"") +"" );
               textField25.setString( x.GetFormatted( 1000.0*Double.parseDouble(weight)+"") );
              // textField26.setString( x.GetFormatted( 0.01*Double.parseDouble(weight)+"") );
               textField27.setString( x.GetFormatted( 0.000984251*Double.parseDouble(weight)+"") );
               textField28.setString( x.GetFormatted( 0.001*Double.parseDouble(weight)+"") );

               textField29.setString( x.GetFormatted( 85.7163827*Double.parseDouble(weight)+"") );

               textField30.setString( x.GetFormatted( 17.14327654*Double.parseDouble(weight)+"") );

               textField31.setString( x.GetFormatted( 4.28*Double.parseDouble(weight)+"") );

               textField32.setString( x.GetFormatted( 1.075268817*Double.parseDouble(weight)+"") );
               textField33.setString( x.GetFormatted( 0.02679528403*Double.parseDouble(weight)+"") );
               textField34.setString( x.GetFormatted( 35.27336861*Double.parseDouble(weight)+"") );
               textField35.setString( x.GetFormatted( 0.01968503937*Double.parseDouble(weight)+"") );

               textField36.setString( x.GetFormatted( 2.204585538*Double.parseDouble(weight)+"") );
               textField37.setString( x.GetFormatted(  32.1507466*Double.parseDouble(weight)+"") );
               textField38.setString( x.GetFormatted(  85.7163827*Double.parseDouble(weight)+"") );

         }





   else if (item.equals(textField27))
         {


              weight = x.GetFormatted((1/0.000984251)*Double.parseDouble("0"+textField27.getString())+"");

               textField24.setString( x.GetFormatted( 1 *Double.parseDouble(weight)+"") +"" );
               textField25.setString( x.GetFormatted( 1000.0*Double.parseDouble(weight)+"") );
               textField26.setString( x.GetFormatted( 0.01*Double.parseDouble(weight)+"") );
               //textField27.setString( x.GetFormatted( 0.000984251*Double.parseDouble(weight)+"") );
               textField28.setString( x.GetFormatted( 0.001*Double.parseDouble(weight)+"") );

               textField29.setString( x.GetFormatted( 85.7163827*Double.parseDouble(weight)+"") );

               textField30.setString( x.GetFormatted( 17.14327654*Double.parseDouble(weight)+"") );

               textField31.setString( x.GetFormatted( 4.28*Double.parseDouble(weight)+"") );

               textField32.setString( x.GetFormatted( 1.075268817*Double.parseDouble(weight)+"") );
               textField33.setString( x.GetFormatted( 0.02679528403*Double.parseDouble(weight)+"") );
               textField34.setString( x.GetFormatted( 35.27336861*Double.parseDouble(weight)+"") );
               textField35.setString( x.GetFormatted( 0.01968503937*Double.parseDouble(weight)+"") );

               textField36.setString( x.GetFormatted( 2.204585538*Double.parseDouble(weight)+"") );
               textField37.setString( x.GetFormatted(  32.1507466*Double.parseDouble(weight)+"") );
               textField38.setString( x.GetFormatted(  85.7163827*Double.parseDouble(weight)+"") );

         }

   else if (item.equals(textField28))
         {


              weight = x.GetFormatted((1/0.001)*Double.parseDouble("0"+textField28.getString())+"");

               textField24.setString( x.GetFormatted( 1 *Double.parseDouble(weight)+"") +"" );
               textField25.setString( x.GetFormatted( 1000.0*Double.parseDouble(weight)+"") );
               textField26.setString( x.GetFormatted( 0.01*Double.parseDouble(weight)+"") );
               textField27.setString( x.GetFormatted( 0.000984251*Double.parseDouble(weight)+"") );
              // textField28.setString( x.GetFormatted( 0.001*Double.parseDouble(weight)+"") );

               textField29.setString( x.GetFormatted( 85.7163827*Double.parseDouble(weight)+"") );

               textField30.setString( x.GetFormatted( 17.14327654*Double.parseDouble(weight)+"") );

               textField31.setString( x.GetFormatted( 4.28*Double.parseDouble(weight)+"") );

               textField32.setString( x.GetFormatted( 1.075268817*Double.parseDouble(weight)+"") );
               textField33.setString( x.GetFormatted( 0.02679528403*Double.parseDouble(weight)+"") );
               textField34.setString( x.GetFormatted( 35.27336861*Double.parseDouble(weight)+"") );
               textField35.setString( x.GetFormatted( 0.01968503937*Double.parseDouble(weight)+"") );

               textField36.setString( x.GetFormatted( 2.204585538*Double.parseDouble(weight)+"") );
               textField37.setString( x.GetFormatted(  32.1507466*Double.parseDouble(weight)+"") );
               textField38.setString( x.GetFormatted(  85.7163827*Double.parseDouble(weight)+"") );

         }




         else if (item.equals(textField29))
         {


              weight = x.GetFormatted((1/85.7163827)*Double.parseDouble("0"+textField29.getString())+"");

               textField24.setString( x.GetFormatted( 1 *Double.parseDouble(weight)+"") +"" );
               textField25.setString( x.GetFormatted( 1000.0*Double.parseDouble(weight)+"") );
               textField26.setString( x.GetFormatted( 0.01*Double.parseDouble(weight)+"") );
               textField27.setString( x.GetFormatted( 0.000984251*Double.parseDouble(weight)+"") );
               textField28.setString( x.GetFormatted( 0.001*Double.parseDouble(weight)+"") );

          //     textField29.setString( x.GetFormatted( 85.7163827*Double.parseDouble(weight)+"") );

               textField30.setString( x.GetFormatted( 17.14327654*Double.parseDouble(weight)+"") );

               textField31.setString( x.GetFormatted( 4.28*Double.parseDouble(weight)+"") );

               textField32.setString( x.GetFormatted( 1.075268817*Double.parseDouble(weight)+"") );
               textField33.setString( x.GetFormatted( 0.02679528403*Double.parseDouble(weight)+"") );
               textField34.setString( x.GetFormatted( 35.27336861*Double.parseDouble(weight)+"") );
               textField35.setString( x.GetFormatted( 0.01968503937*Double.parseDouble(weight)+"") );

               textField36.setString( x.GetFormatted( 2.204585538*Double.parseDouble(weight)+"") );
               textField37.setString( x.GetFormatted(  32.1507466*Double.parseDouble(weight)+"") );
               textField38.setString( x.GetFormatted(  85.7163827*Double.parseDouble(weight)+"") );

         }

         else if (item.equals(textField30))
         {


              weight = x.GetFormatted((1/17.14327654)*Double.parseDouble("0"+textField30.getString())+"");

               textField24.setString( x.GetFormatted( 1 *Double.parseDouble(weight)+"") +"" );
               textField25.setString( x.GetFormatted( 1000.0*Double.parseDouble(weight)+"") );
               textField26.setString( x.GetFormatted( 0.01*Double.parseDouble(weight)+"") );
               textField27.setString( x.GetFormatted( 0.000984251*Double.parseDouble(weight)+"") );
               textField28.setString( x.GetFormatted( 0.001*Double.parseDouble(weight)+"") );

               textField29.setString( x.GetFormatted( 85.7163827*Double.parseDouble(weight)+"") );

             //  textField30.setString( x.GetFormatted( 17.14327654*Double.parseDouble(weight)+"") );

               textField31.setString( x.GetFormatted( 4.28*Double.parseDouble(weight)+"") );

               textField32.setString( x.GetFormatted( 1.075268817*Double.parseDouble(weight)+"") );
               textField33.setString( x.GetFormatted( 0.02679528403*Double.parseDouble(weight)+"") );
               textField34.setString( x.GetFormatted( 35.27336861*Double.parseDouble(weight)+"") );
               textField35.setString( x.GetFormatted( 0.01968503937*Double.parseDouble(weight)+"") );

               textField36.setString( x.GetFormatted( 2.204585538*Double.parseDouble(weight)+"") );
               textField37.setString( x.GetFormatted(  32.1507466*Double.parseDouble(weight)+"") );
               textField38.setString( x.GetFormatted(  85.7163827*Double.parseDouble(weight)+"") );

         }

          else if (item.equals(textField31))
         {


              weight = x.GetFormatted((1/4.28)*Double.parseDouble("0"+textField31.getString())+"");

               textField24.setString( x.GetFormatted( 1 *Double.parseDouble(weight)+"") +"" );
               textField25.setString( x.GetFormatted( 1000.0*Double.parseDouble(weight)+"") );
               textField26.setString( x.GetFormatted( 0.01*Double.parseDouble(weight)+"") );
               textField27.setString( x.GetFormatted( 0.000984251*Double.parseDouble(weight)+"") );
               textField28.setString( x.GetFormatted( 0.001*Double.parseDouble(weight)+"") );

               textField29.setString( x.GetFormatted( 85.7163827*Double.parseDouble(weight)+"") );

               textField30.setString( x.GetFormatted( 17.14327654*Double.parseDouble(weight)+"") );

            //   textField31.setString( x.GetFormatted( 4.28*Double.parseDouble(weight)+"") );

               textField32.setString( x.GetFormatted( 1.075268817*Double.parseDouble(weight)+"") );
               textField33.setString( x.GetFormatted( 0.02679528403*Double.parseDouble(weight)+"") );
               textField34.setString( x.GetFormatted( 35.27336861*Double.parseDouble(weight)+"") );
               textField35.setString( x.GetFormatted( 0.01968503937*Double.parseDouble(weight)+"") );

               textField36.setString( x.GetFormatted( 2.204585538*Double.parseDouble(weight)+"") );
               textField37.setString( x.GetFormatted(  32.1507466*Double.parseDouble(weight)+"") );
               textField38.setString( x.GetFormatted(  85.7163827*Double.parseDouble(weight)+"") );

         }

          else if (item.equals(textField32))
         {


              weight = x.GetFormatted((1/1.075268817)*Double.parseDouble("0"+textField32.getString())+"");

               textField24.setString( x.GetFormatted( 1 *Double.parseDouble(weight)+"") +"" );
               textField25.setString( x.GetFormatted( 1000.0*Double.parseDouble(weight)+"") );
               textField26.setString( x.GetFormatted( 0.01*Double.parseDouble(weight)+"") );
               textField27.setString( x.GetFormatted( 0.000984251*Double.parseDouble(weight)+"") );
               textField28.setString( x.GetFormatted( 0.001*Double.parseDouble(weight)+"") );

               textField29.setString( x.GetFormatted( 85.7163827*Double.parseDouble(weight)+"") );

               textField30.setString( x.GetFormatted( 17.14327654*Double.parseDouble(weight)+"") );

               textField31.setString( x.GetFormatted( 4.28*Double.parseDouble(weight)+"") );

             //  textField32.setString( x.GetFormatted( 1.075268817*Double.parseDouble(weight)+"") );
               textField33.setString( x.GetFormatted( 0.02679528403*Double.parseDouble(weight)+"") );
               textField34.setString( x.GetFormatted( 35.27336861*Double.parseDouble(weight)+"") );
               textField35.setString( x.GetFormatted( 0.01968503937*Double.parseDouble(weight)+"") );

               textField36.setString( x.GetFormatted( 2.204585538*Double.parseDouble(weight)+"") );
               textField37.setString( x.GetFormatted(  32.1507466*Double.parseDouble(weight)+"") );
               textField38.setString( x.GetFormatted(  85.7163827*Double.parseDouble(weight)+"") );

         }

      else if (item.equals(textField33))
         {


              weight = x.GetFormatted((1/0.02679528403)*Double.parseDouble("0"+textField33.getString())+"");

               textField24.setString( x.GetFormatted( 1 *Double.parseDouble(weight)+"") +"" );
               textField25.setString( x.GetFormatted( 1000.0*Double.parseDouble(weight)+"") );
               textField26.setString( x.GetFormatted( 0.01*Double.parseDouble(weight)+"") );
               textField27.setString( x.GetFormatted( 0.000984251*Double.parseDouble(weight)+"") );
               textField28.setString( x.GetFormatted( 0.001*Double.parseDouble(weight)+"") );

               textField29.setString( x.GetFormatted( 85.7163827*Double.parseDouble(weight)+"") );

               textField30.setString( x.GetFormatted( 17.14327654*Double.parseDouble(weight)+"") );

               textField31.setString( x.GetFormatted( 4.28*Double.parseDouble(weight)+"") );

               textField32.setString( x.GetFormatted( 1.075268817*Double.parseDouble(weight)+"") );
              // textField33.setString( x.GetFormatted( 0.02679528403*Double.parseDouble(weight)+"") );
               textField34.setString( x.GetFormatted( 35.27336861*Double.parseDouble(weight)+"") );
               textField35.setString( x.GetFormatted( 0.01968503937*Double.parseDouble(weight)+"") );

               textField36.setString( x.GetFormatted( 2.204585538*Double.parseDouble(weight)+"") );
               textField37.setString( x.GetFormatted(  32.1507466*Double.parseDouble(weight)+"") );
               textField38.setString( x.GetFormatted(  85.7163827*Double.parseDouble(weight)+"") );

         }

          else if (item.equals(textField34))
         {


              weight = x.GetFormatted((1/35.27336861)*Double.parseDouble("0"+textField34.getString())+"");

               textField24.setString( x.GetFormatted( 1 *Double.parseDouble(weight)+"") +"" );
               textField25.setString( x.GetFormatted( 1000.0*Double.parseDouble(weight)+"") );
               textField26.setString( x.GetFormatted( 0.01*Double.parseDouble(weight)+"") );
               textField27.setString( x.GetFormatted( 0.000984251*Double.parseDouble(weight)+"") );
               textField28.setString( x.GetFormatted( 0.001*Double.parseDouble(weight)+"") );

               textField29.setString( x.GetFormatted( 85.7163827*Double.parseDouble(weight)+"") );

               textField30.setString( x.GetFormatted( 17.14327654*Double.parseDouble(weight)+"") );

               textField31.setString( x.GetFormatted( 4.28*Double.parseDouble(weight)+"") );

               textField32.setString( x.GetFormatted( 1.075268817*Double.parseDouble(weight)+"") );
               textField33.setString( x.GetFormatted( 0.02679528403*Double.parseDouble(weight)+"") );
            //   textField34.setString( x.GetFormatted( 35.27336861*Double.parseDouble(weight)+"") );
               textField35.setString( x.GetFormatted( 0.01968503937*Double.parseDouble(weight)+"") );

               textField36.setString( x.GetFormatted( 2.204585538*Double.parseDouble(weight)+"") );
               textField37.setString( x.GetFormatted(  32.1507466*Double.parseDouble(weight)+"") );
               textField38.setString( x.GetFormatted(  85.7163827*Double.parseDouble(weight)+"") );

         }

          else if (item.equals(textField35))
         {


              weight = x.GetFormatted((1/0.01968503937)*Double.parseDouble("0"+textField35.getString())+"");

               textField24.setString( x.GetFormatted( 1 *Double.parseDouble(weight)+"") +"" );
               textField25.setString( x.GetFormatted( 1000.0*Double.parseDouble(weight)+"") );
               textField26.setString( x.GetFormatted( 0.01*Double.parseDouble(weight)+"") );
               textField27.setString( x.GetFormatted( 0.000984251*Double.parseDouble(weight)+"") );
               textField28.setString( x.GetFormatted( 0.001*Double.parseDouble(weight)+"") );

               textField29.setString( x.GetFormatted( 85.7163827*Double.parseDouble(weight)+"") );

               textField30.setString( x.GetFormatted( 17.14327654*Double.parseDouble(weight)+"") );

               textField31.setString( x.GetFormatted( 4.28*Double.parseDouble(weight)+"") );

               textField32.setString( x.GetFormatted( 1.075268817*Double.parseDouble(weight)+"") );
               textField33.setString( x.GetFormatted( 0.02679528403*Double.parseDouble(weight)+"") );
               textField34.setString( x.GetFormatted( 35.27336861*Double.parseDouble(weight)+"") );
             //  textField35.setString( x.GetFormatted( 0.01968503937*Double.parseDouble(weight)+"") );

               textField36.setString( x.GetFormatted( 2.204585538*Double.parseDouble(weight)+"") );
               textField37.setString( x.GetFormatted(  32.1507466*Double.parseDouble(weight)+"") );
               textField38.setString( x.GetFormatted(  85.7163827*Double.parseDouble(weight)+"") );

         }

          else if (item.equals(textField36))
         {


              weight = x.GetFormatted((1/2.204585538)*Double.parseDouble("0"+textField36.getString())+"");

               textField24.setString( x.GetFormatted( 1 *Double.parseDouble(weight)+"") +"" );
               textField25.setString( x.GetFormatted( 1000.0*Double.parseDouble(weight)+"") );
               textField26.setString( x.GetFormatted( 0.01*Double.parseDouble(weight)+"") );
               textField27.setString( x.GetFormatted( 0.000984251*Double.parseDouble(weight)+"") );
               textField28.setString( x.GetFormatted( 0.001*Double.parseDouble(weight)+"") );

               textField29.setString( x.GetFormatted( 85.7163827*Double.parseDouble(weight)+"") );

               textField30.setString( x.GetFormatted( 17.14327654*Double.parseDouble(weight)+"") );

               textField31.setString( x.GetFormatted( 4.28*Double.parseDouble(weight)+"") );

               textField32.setString( x.GetFormatted( 1.075268817*Double.parseDouble(weight)+"") );
               textField33.setString( x.GetFormatted( 0.02679528403*Double.parseDouble(weight)+"") );
               textField34.setString( x.GetFormatted( 35.27336861*Double.parseDouble(weight)+"") );
               textField35.setString( x.GetFormatted( 0.01968503937*Double.parseDouble(weight)+"") );

             //  textField36.setString( x.GetFormatted( 2.204585538*Double.parseDouble(weight)+"") );
               textField37.setString( x.GetFormatted(  32.1507466*Double.parseDouble(weight)+"") );
               textField38.setString( x.GetFormatted(  85.7163827*Double.parseDouble(weight)+"") );

         }

         else if (item.equals(textField37))
         {


              weight = x.GetFormatted((1/32.1507466)*Double.parseDouble("0"+textField37.getString())+"");

               textField24.setString( x.GetFormatted( 1 *Double.parseDouble(weight)+"") +"" );
               textField25.setString( x.GetFormatted( 1000.0*Double.parseDouble(weight)+"") );
               textField26.setString( x.GetFormatted( 0.01*Double.parseDouble(weight)+"") );
               textField27.setString( x.GetFormatted( 0.000984251*Double.parseDouble(weight)+"") );
               textField28.setString( x.GetFormatted( 0.001*Double.parseDouble(weight)+"") );

               textField29.setString( x.GetFormatted( 85.7163827*Double.parseDouble(weight)+"") );

               textField30.setString( x.GetFormatted( 17.14327654*Double.parseDouble(weight)+"") );

               textField31.setString( x.GetFormatted( 4.28*Double.parseDouble(weight)+"") );

               textField32.setString( x.GetFormatted( 1.075268817*Double.parseDouble(weight)+"") );
               textField33.setString( x.GetFormatted( 0.02679528403*Double.parseDouble(weight)+"") );
               textField34.setString( x.GetFormatted( 35.27336861*Double.parseDouble(weight)+"") );
               textField35.setString( x.GetFormatted( 0.01968503937*Double.parseDouble(weight)+"") );

               textField36.setString( x.GetFormatted( 2.204585538*Double.parseDouble(weight)+"") );
              // textField37.setString( x.GetFormatted(  32.1507466*Double.parseDouble(weight)+"") );

              textField38.setString( x.GetFormatted(  85.7163827*Double.parseDouble(weight)+"") );
         }



           else if (item.equals(textField38))
         {


              weight = x.GetFormatted((1/85.7163827)*Double.parseDouble("0"+textField38.getString())+"");

               textField24.setString( x.GetFormatted( 1 *Double.parseDouble(weight)+"") +"" );
               textField25.setString( x.GetFormatted( 1000.0*Double.parseDouble(weight)+"") );
               textField26.setString( x.GetFormatted( 0.01*Double.parseDouble(weight)+"") );
               textField27.setString( x.GetFormatted( 0.000984251*Double.parseDouble(weight)+"") );
               textField28.setString( x.GetFormatted( 0.001*Double.parseDouble(weight)+"") );

               textField29.setString( x.GetFormatted( 85.7163827*Double.parseDouble(weight)+"") );

               textField30.setString( x.GetFormatted( 17.14327654*Double.parseDouble(weight)+"") );

               textField31.setString( x.GetFormatted( 4.28*Double.parseDouble(weight)+"") );

               textField32.setString( x.GetFormatted( 1.075268817*Double.parseDouble(weight)+"") );
               textField33.setString( x.GetFormatted( 0.02679528403*Double.parseDouble(weight)+"") );
               textField34.setString( x.GetFormatted( 35.27336861*Double.parseDouble(weight)+"") );
               textField35.setString( x.GetFormatted( 0.01968503937*Double.parseDouble(weight)+"") );

               textField36.setString( x.GetFormatted( 2.204585538*Double.parseDouble(weight)+"") );
               textField37.setString( x.GetFormatted(  32.1507466*Double.parseDouble(weight)+"") );

              //textField38.setString( x.GetFormatted(  85.7163827*Double.parseDouble(weight)+"") );
         }


           if(item.equals(textField45))
           {

               Formatted f=new Formatted();

                  String out= Double.parseDouble(multiplier)+"";

                  String factor=f.GetFormatted(out);


                  double unit2 = Double.parseDouble(factor)* Double.parseDouble("0"+textField45.getString());
                  textField46.setString(unit2+"");
           
           }


           if(item.equals(textField46))
           {

               Formatted f=new Formatted();

                  String out= (1/Double.parseDouble(multiplier)+"");

                  String factor=f.GetFormatted(out);


                  double converted = Double.parseDouble(factor)* Double.parseDouble("0"+textField46.getString());
                  textField45.setString(converted+"");

           }










    }

    public void run()
    {

     
               Formatted f=new Formatted();

                this.getTextField45(); this.getTextField46();

               String uu = list2.getString(list2.getSelectedIndex());

             //  String value =  (String) vv.get(uu);


              String mult[] = f.split(uu, "=");

               mult=f.split(mult[1], "x");

         multiplier =  mult[0];


           
             String unit1[] = f.split(uu, "="); this.textField45.setLabel(unit1[0]);
             String unit2[] = f.split(uu, "x"); this.textField46.setLabel(unit2[1]);

           

        //     this.textField45.setLabel(mult[0]); this.textField45.setLabel(mult[0]);


           // textField45.setString(mult[0]);textField46.setString(mult[1]);
   
         //  textField45.setString(unit1[0]);textField46.setString(unit2[0]);



        



    }

  

}
