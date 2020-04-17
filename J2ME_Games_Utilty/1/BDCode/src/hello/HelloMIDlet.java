
package hello;

import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordStore;
import org.netbeans.microedition.lcdui.SimpleTableModel;
import org.netbeans.microedition.lcdui.TableItem;

/**
 * @author Ron
 */
public class HelloMIDlet extends MIDlet implements CommandListener, ItemCommandListener,Runnable, ItemStateListener{

    private boolean midletPaused = false;

    Thread t;
    Postal pstl;
    NWD nwdl;
    
    boolean p=false,nwd=false;
    
    //<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private java.util.Hashtable __previousDisplayables = new java.util.Hashtable();
    private Command exitCommand;
    private Command object;
    private Command object2;
    private Command object1;
    private Command exitCommand1;
    private Command itemCommand;
    private Command okCommand1;
    private Command backCommand;
    private Command backCommand2;
    private Command okCommand2;
    private Command backCommand3;
    private Command backCommand5;
    private Command backCommand4;
    private Command okCommand;
    private Command backCommand1;
    private Command backCommand8;
    private Command backCommand7;
    private Command okCommand7;
    private Command okCommand4;
    private Command okCommand3;
    private Command backCommand6;
    private Command okCommand6;
    private Command okCommand5;
    private Command okCommand9;
    private Command backCommand11;
    private Command okCommand11;
    private Command okCommand10;
    private Command backCommand12;
    private Command okCommand8;
    private Command backCommand9;
    private Command backCommand10;
    private Form form;
    private TableItem tableItem;
    private Form form1;
    private ChoiceGroup choiceGroup;
    private Form form2;
    private TableItem tableItem1;
    private TextBox textBox;
    private Form form3;
    private TextField textField;
    private TextBox textBox1;
    private TextBox textBox2;
    private List list;
    private Form form4;
    private TextField textField2;
    private List list1;
    private Form form5;
    private TextField textField3;
    private TextField textField1;
    private List list2;
    private TextBox textBox3;
    private List list3;
    private Form form6;
    private TextField textField5;
    private TextField textField4;
    private Form form8;
    private TextField textField9;
    private TextField textField8;
    private Form form7;
    private TextField textField6;
    private TextField textField7;
    private List list4;
    private SimpleTableModel tableModel1;
    private Font font1;
    private SimpleTableModel tableModel2;
    private Ticker ticker;
    //</editor-fold>//GEN-END:|fields|0|
    private RecordStore rs,rs1; String [] C_P;
    private Hashtable vv,vv1;
    private String delete="";
    private String Update="";
    //</editor-fold>

   
    public HelloMIDlet()
    {

    }

    //<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
    /**
     * Switches a display to previous displayable of the current displayable.
     * The <code>display</code> instance is obtain from the <code>getDisplay</code> method.
     */
    private void switchToPreviousDisplayable() {
        Displayable __currentDisplayable = getDisplay().getCurrent();
        if (__currentDisplayable != null) {
            Displayable __nextDisplayable = (Displayable) __previousDisplayables.get(__currentDisplayable);
            if (__nextDisplayable != null) {
                switchDisplayable(null, __nextDisplayable);
            }
        }
    }
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

        switchDisplayable(null, getList());//GEN-LINE:|3-startMIDlet|1|3-postAction

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
        Displayable __currentDisplayable = display.getCurrent();
        if (__currentDisplayable != null  &&  nextDisplayable != null) {
            __previousDisplayables.put(nextDisplayable, __currentDisplayable);
        }
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
        if (displayable == form) {//GEN-BEGIN:|7-commandAction|1|222-preAction
            if (command == backCommand3) {//GEN-END:|7-commandAction|1|222-preAction
                // write pre-action user code here
                switchDisplayable(null, getList());//GEN-LINE:|7-commandAction|2|222-postAction
                // write post-action user code here
            } else if (command == exitCommand) {//GEN-LINE:|7-commandAction|3|19-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|4|19-postAction
                // write post-action user code here
            } else if (command == object) {//GEN-LINE:|7-commandAction|5|62-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm());//GEN-LINE:|7-commandAction|6|62-postAction
                // write post-action user code here
            } else if (command == object1) {//GEN-LINE:|7-commandAction|7|63-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm2());//GEN-LINE:|7-commandAction|8|63-postAction
                // write post-action user code here
            } else if (command == object2) {//GEN-LINE:|7-commandAction|9|64-preAction
                // write pre-action user code here
                switchDisplayable(null, getTextBox());//GEN-LINE:|7-commandAction|10|64-postAction
                // write post-action user code here
            } else if (command == okCommand2) {//GEN-LINE:|7-commandAction|11|168-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm3());//GEN-LINE:|7-commandAction|12|168-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|13|272-preAction
        } else if (displayable == form1) {
            if (command == backCommand3) {//GEN-END:|7-commandAction|13|272-preAction
                // write pre-action user code here
                switchDisplayable(null, getList());//GEN-LINE:|7-commandAction|14|272-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|15|221-preAction
        } else if (displayable == form2) {
            if (command == backCommand3) {//GEN-END:|7-commandAction|15|221-preAction
                // write pre-action user code here
                switchDisplayable(null, getList());//GEN-LINE:|7-commandAction|16|221-postAction
                // write post-action user code here
            } else if (command == exitCommand1) {//GEN-LINE:|7-commandAction|17|76-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|18|76-postAction
                // write post-action user code here
            } else if (command == object) {//GEN-LINE:|7-commandAction|19|69-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm());//GEN-LINE:|7-commandAction|20|69-postAction
                // write post-action user code here
            } else if (command == object1) {//GEN-LINE:|7-commandAction|21|70-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm2());//GEN-LINE:|7-commandAction|22|70-postAction
                // write post-action user code here
            } else if (command == object2) {//GEN-LINE:|7-commandAction|23|71-preAction
                // write pre-action user code here
                switchDisplayable(null, getTextBox());//GEN-LINE:|7-commandAction|24|71-postAction
                // write post-action user code here
            } else if (command == okCommand2) {//GEN-LINE:|7-commandAction|25|166-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm3());//GEN-LINE:|7-commandAction|26|166-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|27|163-preAction
        } else if (displayable == form3) {
            if (command == backCommand2) {//GEN-END:|7-commandAction|27|163-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm1());//GEN-LINE:|7-commandAction|28|163-postAction
                // write post-action user code here
            } else if (command == backCommand3) {//GEN-LINE:|7-commandAction|29|225-preAction
                // write pre-action user code here
                switchDisplayable(null, getList());//GEN-LINE:|7-commandAction|30|225-postAction
                // write post-action user code here
            } else if (command == okCommand1) {//GEN-LINE:|7-commandAction|31|155-preAction

                p=true;    nwd=false;


                t= new Thread(this);

                t.start();

                switchDisplayable(null, getTextBox1());//GEN-LINE:|7-commandAction|32|155-postAction


            }//GEN-BEGIN:|7-commandAction|33|265-preAction
        } else if (displayable == form4) {
            if (command == backCommand3) {//GEN-END:|7-commandAction|33|265-preAction
                // write pre-action user code here
                switchDisplayable(null, getList());//GEN-LINE:|7-commandAction|34|265-postAction
                // write post-action user code here
            } else if (command == okCommand6) {//GEN-LINE:|7-commandAction|35|334-preAction

                p=false;    nwd=true;


                t= new Thread(this);

                t.start();

                switchDisplayable(null, getTextBox2());//GEN-LINE:|7-commandAction|36|334-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|37|341-preAction
        } else if (displayable == form5) {
            if (command == backCommand8) {//GEN-END:|7-commandAction|37|341-preAction
                // write pre-action user code here
                switchDisplayable(null, getList1());//GEN-LINE:|7-commandAction|38|341-postAction
                // write post-action user code here
            } else if (command == okCommand) {//GEN-LINE:|7-commandAction|39|298-preAction


                 try
                {
                     rs = RecordStore.openRecordStore("POSTAL", true);

                     String appt = textField1.getString()+" - "+textField3.getString();
                     byte bytes[] = appt.getBytes();
                     rs.addRecord(bytes,0,bytes.length);


                }

                catch(Exception ex)
                {
                      switchDisplayable(null, getTextBox3());
                }
                try
                {
                    rs.closeRecordStore();
                }
                catch(Exception ex)
                {
                         switchDisplayable(null, getTextBox3());
                }

           TextBox t = getTextBox3(); this.textBox3.setString("Action PerFormed");
           switchDisplayable(null, getTextBox3());



//GEN-LINE:|7-commandAction|40|298-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|41|337-preAction
        } else if (displayable == form6) {
            if (command == backCommand7) {//GEN-END:|7-commandAction|41|337-preAction
                // write pre-action user code here
                switchDisplayable(null, getList1());//GEN-LINE:|7-commandAction|42|337-postAction
                // write post-action user code here
            } else if (command == okCommand5) {//GEN-LINE:|7-commandAction|43|332-preAction

              list2.deleteAll();

                String value =  (String) vv.get(Update);

                int id = Integer.parseInt(value, 10);


              // this.textField2.setLabel(Update);this.textField3.setLabel(Update);

                try
                {
                     rs = RecordStore.openRecordStore("POSTAL", true);
                    String new_data = textField4.getString()+ " - " +textField5.getString();
                   byte bytes[] = new_data.getBytes();

                   rs.setRecord(id, bytes, 0, bytes.length);


                }

                catch(Exception ex)
                {
                  switchDisplayable(null, getTextBox3());
                }
                try
                {
                    rs.closeRecordStore();
                }
                catch(Exception ex)
                {
                    switchDisplayable(null, getTextBox3());
                }

                TextBox t = getTextBox3(); this.textBox3.setString("Action Performed");

                this.switchDisplayable(null, getTextBox3());


//GEN-LINE:|7-commandAction|44|332-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|45|362-preAction
        } else if (displayable == form7) {
            if (command == backCommand10) {//GEN-END:|7-commandAction|45|362-preAction
                // write pre-action user code here
                switchDisplayable(null, getList3());//GEN-LINE:|7-commandAction|46|362-postAction
                // write post-action user code here
            } else if (command == okCommand8) {//GEN-LINE:|7-commandAction|47|360-preAction


                List x= getList4(); list4.deleteAll();


               try
                {
                     rs1 = RecordStore.openRecordStore("NWD", true);

                     String appt = textField6.getString()+" - "+textField7.getString();
                     byte bytes[] = appt.getBytes();
                     rs1.addRecord(bytes,0,bytes.length);


                }

                catch(Exception ex)
                {
                      switchDisplayable(null, getTextBox3());
                }
                try
                {
                    rs1.closeRecordStore();
                }
                catch(Exception ex)
                {
                         switchDisplayable(null, getTextBox3());
                }

           TextBox t = getTextBox3(); this.textBox3.setString("Action PerFormed");
           switchDisplayable(null, getTextBox3());







//GEN-LINE:|7-commandAction|48|360-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|49|379-preAction
        } else if (displayable == form8) {
            if (command == backCommand12) {//GEN-END:|7-commandAction|49|379-preAction
                // write pre-action user code here
                switchDisplayable(null, getList4());//GEN-LINE:|7-commandAction|50|379-postAction
                // write post-action user code here
            } else if (command == okCommand11) {//GEN-LINE:|7-commandAction|51|382-preAction

              list4.deleteAll();

                String value =  (String) vv1.get(Update);

                int id = Integer.parseInt(value, 10);


              // this.textField2.setLabel(Update);this.textField3.setLabel(Update);

                try
                {
                     rs1 = RecordStore.openRecordStore("NWD", true);
                    String new_data = textField8.getString()+ " - " +textField9.getString();
                   byte bytes[] = new_data.getBytes();

                   rs1.setRecord(id, bytes, 0, bytes.length);


                }

                catch(Exception ex)
                {
                  switchDisplayable(null, getTextBox3());
                }
                try
                {
                    rs1.closeRecordStore();
                }
                catch(Exception ex)
                {
                    switchDisplayable(null, getTextBox3());
                }

                TextBox t = getTextBox3(); this.textBox3.setString("Action Performed");

                this.switchDisplayable(null, getTextBox3());


//GEN-LINE:|7-commandAction|52|382-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|53|237-preAction
        } else if (displayable == list) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|53|237-preAction
                // write pre-action user code here
                listAction();//GEN-LINE:|7-commandAction|54|237-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|55|279-preAction
        } else if (displayable == list1) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|55|279-preAction
                // write pre-action user code here
                list1Action();//GEN-LINE:|7-commandAction|56|279-postAction
                // write post-action user code here
            } else if (command == backCommand4) {//GEN-LINE:|7-commandAction|57|307-preAction
                // write pre-action user code here
                switchDisplayable(null, getList());//GEN-LINE:|7-commandAction|58|307-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|59|317-preAction
        } else if (displayable == list2) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|59|317-preAction
                // write pre-action user code here
                list2Action();//GEN-LINE:|7-commandAction|60|317-postAction
                // write post-action user code here
            } else if (command == backCommand6) {//GEN-LINE:|7-commandAction|61|322-preAction
                // write pre-action user code here
                switchDisplayable(null, getList1());//GEN-LINE:|7-commandAction|62|322-postAction
                // write post-action user code here
            } else if (command == okCommand3) {//GEN-LINE:|7-commandAction|63|325-preAction

                Update = list2.getString(list2.getSelectedIndex());
//GEN-LINE:|7-commandAction|64|325-postAction

                this.switchDisplayable(null, getForm6());



            } else if (command == okCommand4) {//GEN-LINE:|7-commandAction|65|327-preAction



                delete = list2.getString(list2.getSelectedIndex());

                String value =  (String) vv.get(delete);

                int id = Integer.parseInt(value, 10);

                try
                {
                     rs = RecordStore.openRecordStore("POSTAL", true);

                     rs.deleteRecord(id);

                }

                catch(Exception ex)
                {
                  switchDisplayable(null, getTextBox3());
                }
                try
                {
                    rs.closeRecordStore();
                }
                catch(Exception ex)
                {
                    switchDisplayable(null, getTextBox3());

                }

                TextBox t = getTextBox3(); this.textBox3.setString("Action Performed");


                 switchDisplayable(null, getTextBox3());

                 list2.deleteAll();
//GEN-LINE:|7-commandAction|66|327-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|67|347-preAction
        } else if (displayable == list3) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|67|347-preAction
                // write pre-action user code here
                list3Action();//GEN-LINE:|7-commandAction|68|347-postAction
                // write post-action user code here
            } else if (command == backCommand9) {//GEN-LINE:|7-commandAction|69|353-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm4());//GEN-LINE:|7-commandAction|70|353-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|71|365-preAction
        } else if (displayable == list4) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|71|365-preAction
                // write pre-action user code here
                list4Action();//GEN-LINE:|7-commandAction|72|365-postAction
                // write post-action user code here
            } else if (command == backCommand11) {//GEN-LINE:|7-commandAction|73|369-preAction
                // write pre-action user code here
                switchDisplayable(null, getList3());//GEN-LINE:|7-commandAction|74|369-postAction
                // write post-action user code here
            } else if (command == okCommand10) {//GEN-LINE:|7-commandAction|75|377-preAction

                delete = list4.getString(list4.getSelectedIndex());

                String value =  (String) vv1.get(delete);

                int id = Integer.parseInt(value, 10);

                try
                {
                     rs1 = RecordStore.openRecordStore("NWD", true);

                     rs1.deleteRecord(id);

                }

                catch(Exception ex)
                {
                  switchDisplayable(null, getTextBox3());
                }
                try
                {
                    rs1.closeRecordStore();
                }
                catch(Exception ex)
                {
                    switchDisplayable(null, getTextBox3());

                }

                TextBox t = getTextBox3(); this.textBox3.setString("Action Performed");


                 switchDisplayable(null, getTextBox3());

                 list4.deleteAll();

//GEN-LINE:|7-commandAction|76|377-postAction
                // write post-action user code here
            } else if (command == okCommand9) {//GEN-LINE:|7-commandAction|77|375-preAction

                Update = list4.getString(list4.getSelectedIndex());

                this.switchDisplayable(null, getForm8());
//GEN-LINE:|7-commandAction|78|375-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|79|223-preAction
        } else if (displayable == textBox) {
            if (command == backCommand3) {//GEN-END:|7-commandAction|79|223-preAction
                // write pre-action user code here
                switchDisplayable(null, getList());//GEN-LINE:|7-commandAction|80|223-postAction
                // write post-action user code here
            } else if (command == object) {//GEN-LINE:|7-commandAction|81|118-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm());//GEN-LINE:|7-commandAction|82|118-postAction
                // write post-action user code here
            } else if (command == object1) {//GEN-LINE:|7-commandAction|83|119-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm2());//GEN-LINE:|7-commandAction|84|119-postAction
                // write post-action user code here
            } else if (command == object2) {//GEN-LINE:|7-commandAction|85|120-preAction
                // write pre-action user code here
                switchDisplayable(null, getTextBox());//GEN-LINE:|7-commandAction|86|120-postAction
                // write post-action user code here
            } else if (command == okCommand2) {//GEN-LINE:|7-commandAction|87|170-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm3());//GEN-LINE:|7-commandAction|88|170-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|89|150-preAction
        } else if (displayable == textBox1) {
            if (command == backCommand) {//GEN-END:|7-commandAction|89|150-preAction
                // write pre-action user code here
                switchToPreviousDisplayable();//GEN-LINE:|7-commandAction|90|150-postAction
                // write post-action user code here
            } else if (command == backCommand3) {//GEN-LINE:|7-commandAction|91|224-preAction
                // write pre-action user code here
                switchDisplayable(null, getList());//GEN-LINE:|7-commandAction|92|224-postAction
                // write post-action user code here
            } else if (command == object) {//GEN-LINE:|7-commandAction|93|172-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm());//GEN-LINE:|7-commandAction|94|172-postAction
                // write post-action user code here
            } else if (command == object1) {//GEN-LINE:|7-commandAction|95|173-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm2());//GEN-LINE:|7-commandAction|96|173-postAction
                // write post-action user code here
            } else if (command == object2) {//GEN-LINE:|7-commandAction|97|174-preAction
                // write pre-action user code here
                switchDisplayable(null, getTextBox());//GEN-LINE:|7-commandAction|98|174-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|99|218-preAction
        } else if (displayable == textBox2) {
            if (command == backCommand3) {//GEN-END:|7-commandAction|99|218-preAction
                // write pre-action user code here
                switchDisplayable(null, getList());//GEN-LINE:|7-commandAction|100|218-postAction
                // write post-action user code here
            } else if (command == backCommand5) {//GEN-LINE:|7-commandAction|101|268-preAction
                // write pre-action user code here
                switchToPreviousDisplayable();//GEN-LINE:|7-commandAction|102|268-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|103|304-preAction
        } else if (displayable == textBox3) {
            if (command == backCommand1) {//GEN-END:|7-commandAction|103|304-preAction
                // write pre-action user code here
                switchDisplayable(null, getList1());//GEN-LINE:|7-commandAction|104|304-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|105|7-postCommandAction
        }//GEN-END:|7-commandAction|105|7-postCommandAction
        // write post-action user code here
    }//GEN-BEGIN:|7-commandAction|106|
    //</editor-fold>//GEN-END:|7-commandAction|106|



    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|18-getter|0|18-preInit
    /**
     * Returns an initiliazed instance of exitCommand component.
     * @return the initialized component instance
     */
    public Command getExitCommand() {
        if (exitCommand == null) {//GEN-END:|18-getter|0|18-preInit
            // write pre-init user code here
            exitCommand = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|18-getter|1|18-postInit
            // write post-init user code here
        }//GEN-BEGIN:|18-getter|2|
        return exitCommand;
    }
    //</editor-fold>//GEN-END:|18-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: form ">//GEN-BEGIN:|14-getter|0|14-preInit
    /**
     * Returns an initiliazed instance of form component.
     * @return the initialized component instance
     */
    public Form getForm() {
        if (form == null) {//GEN-END:|14-getter|0|14-preInit
            // write pre-init user code here
            form = new Form("Walton", new Item[] { getTableItem() });//GEN-BEGIN:|14-getter|1|14-postInit
            form.addCommand(getExitCommand());
            form.addCommand(getObject());
            form.addCommand(getObject1());
            form.addCommand(getObject2());
            form.addCommand(getOkCommand2());
            form.addCommand(getBackCommand3());
            form.setCommandListener(this);//GEN-END:|14-getter|1|14-postInit
            // write post-init user code here
        }//GEN-BEGIN:|14-getter|2|
        return form;
    }
    //</editor-fold>//GEN-END:|14-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: tableItem ">//GEN-BEGIN:|22-getter|0|22-preInit
    /**
     * Returns an initiliazed instance of tableItem component.
     * @return the initialized component instance
     */
    public TableItem getTableItem() {
        if (tableItem == null) {//GEN-END:|22-getter|0|22-preInit
            // write pre-init user code here
            tableItem = new TableItem(getDisplay(), "Dhaka City");//GEN-BEGIN:|22-getter|1|22-postInit
            tableItem.setModel(getTableModel1());
            tableItem.setValuesFont(getFont1());//GEN-END:|22-getter|1|22-postInit
            // write post-init user code here
        }//GEN-BEGIN:|22-getter|2|
        return tableItem;
    }
    //</editor-fold>//GEN-END:|22-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: tableModel1 ">//GEN-BEGIN:|23-getter|0|23-preInit
    /**
     * Returns an initiliazed instance of tableModel1 component.
     * @return the initialized component instance
     */
    public SimpleTableModel getTableModel1() {
        if (tableModel1 == null) {//GEN-END:|23-getter|0|23-preInit
         /*
tableModel1 = new SimpleTableModel (new java.lang.String[][] {//GEN-BEGIN:|23-getter|1|23-postInit
new java.lang.String[] { "Dhaka GPO - 1000", "fdfd" },
new java.lang.String[] { "Dhaka Head Office -1100", "" },
new java.lang.String[] { "Dhaka Cantonment -1206", "" },
new java.lang.String[] { "Dhaka Polytechnic -1208", "" },
new java.lang.String[] { "BD Sharif - 1210", "" },
new java.lang.String[] { "Banani -1213", "" },
new java.lang.String[] { "Basabo - 1214", "" },
new java.lang.String[] { "Banga Bhaban - 1222", "" },
new java.lang.String[] { "Mirpur Sector-1 -1216 ", "" },
new java.lang.String[] { "Mirpur Sector- 1221", "" },
new java.lang.String[] { "Mirpur Bazar - 1218", "" },
new java.lang.String[] { "Mohammadpur H.S - 1207 ", "" },
new java.lang.String[] { "Shantinagar - 1217", "" },
new java.lang.String[] { "Sansad Bhaban - 1225", "" },
new java.lang.String[] { "Gulshan Mp Town - 1212", "" },
new java.lang.String[] { "Gendaria - 1204 ", "" },
new java.lang.String[] { "Wari - 1203", "" },
new java.lang.String[] { "New Market - 1205", "" },
new java.lang.String[] { "Jigatola - 1209", "" },
new java.lang.String[] { "Posta - 1211", "" },
new java.lang.String[] { "Tejgaon -1215", "" },
new java.lang.String[] { "Khilgaon", "" }}, null);//GEN-END:|23-getter|1|23-postInit
           // write post-init user code here

            */

tableModel1 = new SimpleTableModel (new java.lang.String[][] {
new java.lang.String[] { "Dhaka GPO - 1000" },
new java.lang.String[] { "Dhaka Head Office -1100" },
new java.lang.String[] { "Dhaka Cantonment -1206" },
new java.lang.String[] { "Dhaka Polytechnic -1208" },
new java.lang.String[] { "BD Sharif - 1210"},
new java.lang.String[] { "Banani -1213"  },
new java.lang.String[] { "Basabo - 1214"},
new java.lang.String[] { "Banga Bhaban - 1222" },
new java.lang.String[] { "Mirpur Sector-1 -1216 "},
new java.lang.String[] { "Mirpur Sector- 1221" },
new java.lang.String[] { "Mirpur Bazar - 1218" },
new java.lang.String[] { "Mohammadpur H.S - 1207 " },
new java.lang.String[] { "Shantinagar - 1217"},
new java.lang.String[] { "Sansad Bhaban - 1225" },
new java.lang.String[] { "Gulshan Mp Town - 1212" },
new java.lang.String[] { "Gendaria - 1204 " },
new java.lang.String[] { "Wari - 1203"},
new java.lang.String[] { "New Market - 1205" },
new java.lang.String[] { "Jigatola - 1209" },
new java.lang.String[] { "Posta - 1211" },
new java.lang.String[] { "Tejgaon -1215" },
new java.lang.String[] { "Khilgaon - 1219" }}, null);


        }//GEN-BEGIN:|23-getter|2|
        return tableModel1;
    }
    //</editor-fold>//GEN-END:|23-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: font1 ">//GEN-BEGIN:|24-getter|0|24-preInit
    /**
     * Returns an initiliazed instance of font1 component.
     * @return the initialized component instance
     */
    public Font getFont1() {
        if (font1 == null) {//GEN-END:|24-getter|0|24-preInit
            // write pre-init user code here
            font1 = Font.getFont(Font.FACE_MONOSPACE, Font.STYLE_PLAIN, Font.SIZE_MEDIUM);//GEN-LINE:|24-getter|1|24-postInit
            // write post-init user code here
        }//GEN-BEGIN:|24-getter|2|
        return font1;
    }
    //</editor-fold>//GEN-END:|24-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: object ">//GEN-BEGIN:|54-getter|0|54-preInit
    /**
     * Returns an initiliazed instance of object component.
     * @return the initialized component instance
     */
    public Command getObject() {
        if (object == null) {//GEN-END:|54-getter|0|54-preInit
            // write pre-init user code here
            object = new Command("Dhaka", Command.ITEM, 0);//GEN-LINE:|54-getter|1|54-postInit
            // write post-init user code here


        }//GEN-BEGIN:|54-getter|2|
        return object;
    }
    //</editor-fold>//GEN-END:|54-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: form1 ">//GEN-BEGIN:|52-getter|0|52-preInit
    /**
     * Returns an initiliazed instance of form1 component.
     * @return the initialized component instance
     */
    public Form getForm1() {
        if (form1 == null) {//GEN-END:|52-getter|0|52-preInit
            // write pre-init user code here
            form1 = new Form("Walton Postal Code ", new Item[] { getChoiceGroup() });//GEN-BEGIN:|52-getter|1|52-postInit
            form1.addCommand(getBackCommand3());
            form1.setCommandListener(this);//GEN-END:|52-getter|1|52-postInit
            // write post-init user code here
        }//GEN-BEGIN:|52-getter|2|
        return form1;
    }
    //</editor-fold>//GEN-END:|52-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: object1 ">//GEN-BEGIN:|56-getter|0|56-preInit
    /**
     * Returns an initiliazed instance of object1 component.
     * @return the initialized component instance
     */
    public Command getObject1() {
        if (object1 == null) {//GEN-END:|56-getter|0|56-preInit
            // write pre-init user code here
            object1 = new Command("Chittagong", Command.ITEM, 0);//GEN-LINE:|56-getter|1|56-postInit
            // write post-init user code here
        }//GEN-BEGIN:|56-getter|2|
        return object1;
    }
    //</editor-fold>//GEN-END:|56-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: object2 ">//GEN-BEGIN:|58-getter|0|58-preInit
    /**
     * Returns an initiliazed instance of object2 component.
     * @return the initialized component instance
     */
    public Command getObject2() {
        if (object2 == null) {//GEN-END:|58-getter|0|58-preInit
            // write pre-init user code here
            object2 = new Command("Other", Command.ITEM, 0);//GEN-LINE:|58-getter|1|58-postInit
            // write post-init user code here
        }//GEN-BEGIN:|58-getter|2|
        return object2;
    }
    //</editor-fold>//GEN-END:|58-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: form2 ">//GEN-BEGIN:|65-getter|0|65-preInit
    /**
     * Returns an initiliazed instance of form2 component.
     * @return the initialized component instance
     */
    public Form getForm2() {
        if (form2 == null) {//GEN-END:|65-getter|0|65-preInit
            // write pre-init user code here
            form2 = new Form("Walton", new Item[] { getTableItem1() });//GEN-BEGIN:|65-getter|1|65-postInit
            form2.addCommand(getObject());
            form2.addCommand(getObject1());
            form2.addCommand(getObject2());
            form2.addCommand(getExitCommand1());
            form2.addCommand(getOkCommand2());
            form2.addCommand(getBackCommand3());
            form2.setCommandListener(this);//GEN-END:|65-getter|1|65-postInit
            // write post-init user code here
        }//GEN-BEGIN:|65-getter|2|
        return form2;
    }
    //</editor-fold>//GEN-END:|65-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: tableItem1 ">//GEN-BEGIN:|68-getter|0|68-preInit
    /**
     * Returns an initiliazed instance of tableItem1 component.
     * @return the initialized component instance
     */
    public TableItem getTableItem1() {
        if (tableItem1 == null) {//GEN-END:|68-getter|0|68-preInit
            // write pre-init user code here
            tableItem1 = new TableItem(getDisplay(), "Chittagong");//GEN-BEGIN:|68-getter|1|68-postInit
            tableItem1.setModel(getTableModel2());
            tableItem1.setValuesFont(getFont1());//GEN-END:|68-getter|1|68-postInit
            // write post-init user code here
        }//GEN-BEGIN:|68-getter|2|
        return tableItem1;
    }
    //</editor-fold>//GEN-END:|68-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand1 ">//GEN-BEGIN:|75-getter|0|75-preInit
    /**
     * Returns an initiliazed instance of exitCommand1 component.
     * @return the initialized component instance
     */
    public Command getExitCommand1() {
        if (exitCommand1 == null) {//GEN-END:|75-getter|0|75-preInit
            // write pre-init user code here
            exitCommand1 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|75-getter|1|75-postInit
            // write post-init user code here
        }//GEN-BEGIN:|75-getter|2|
        return exitCommand1;
    }
    //</editor-fold>//GEN-END:|75-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: tableModel2 ">//GEN-BEGIN:|79-getter|0|79-preInit
    /**
     * Returns an initiliazed instance of tableModel2 component.
     * @return the initialized component instance
     */
    public SimpleTableModel getTableModel2() {
        if (tableModel2 == null) {//GEN-END:|79-getter|0|79-preInit
            // write pre-init user code here
            tableModel2 = new SimpleTableModel(new java.lang.String[][] {//GEN-BEGIN:|79-getter|1|79-postInit
                new java.lang.String[] { "Chittagong - 4000", "4000" },
                new java.lang.String[] { "Ctg Head Office- 4100", "4100" },
                new java.lang.String[] { "Ctg Airport - 4205", "4205" },
                new java.lang.String[] { "Ctg Polytechnic - 4209", "4209" },
                new java.lang.String[] { "Ctg Salors Colony - 4218", "4218" },
                new java.lang.String[] { "Ctg Customs - 4219", "4219" },
                new java.lang.String[] { "Ctg Cantonment - 4220", "4220" },
                new java.lang.String[] { "Chadgaon - 4212", "4212" },
                new java.lang.String[] { "Pahartoli - 4202", "4202" },
                new java.lang.String[] { "Patenga - 4204", "4204" },
                new java.lang.String[] { "Mohara - 4208", "4208" },
                new java.lang.String[] { "Mid Patenga C.Para - 4222", "4222" },
                new java.lang.String[] { "Amin Jute Mills - 4211", "4211" },
                new java.lang.String[] { "Ananda Bazar - 4215", "4215" },
                new java.lang.String[] { "Al-Amin Ba.Madrasa - 4221", "4221" },
                new java.lang.String[] { "Bayejid Bostami - 4210", "4210" },
                new java.lang.String[] { "Jalalabad Saleh Bazar - 4214", "4214" },
                new java.lang.String[] { "Judia Marina Aca - 4206", "4206" },
                new java.lang.String[] { "Hilshahar H.S - 4216", "4216" },
                new java.lang.String[] { "North Cattali - 4217", "4217" },
                new java.lang.String[] { "Export Pro. Zone - 4223", "4223" },
                new java.lang.String[] { "Wazadia MAdrasha - 4213", "4213" },
                new java.lang.String[] { "Feroj Shah Colony - 4207", "4207" }}, null);//GEN-END:|79-getter|1|79-postInit
            // write post-init user code here
        }//GEN-BEGIN:|79-getter|2|
        return tableModel2;
    }
    //</editor-fold>//GEN-END:|79-getter|2|



    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textBox ">//GEN-BEGIN:|114-getter|0|114-preInit
    /**
     * Returns an initiliazed instance of textBox component.
     * @return the initialized component instance
     */
    public TextBox getTextBox() {
        if (textBox == null) {//GEN-END:|114-getter|0|114-preInit
            // write pre-init user code here

            textBox = new TextBox("Other City", "NaraYanGonj -  1400\nMunshiGonj -  1500\nNarshingdi -1600\nJoydevpur-1700\nManikgonj - 1800\nTangail - 1900\nJamalpur - 2000\nSherpur - 2100\nMymenshingh - 2200\nKishorgonj - 2300\nNetrokona - 2400\nSunamgonj - 3000\nSylhet - 3100\nMoulavibazar - 3200\nHobigonj - 3300\nBrahmanbaria - 3400\nComilla- 3500\nChandpur - 3600\nLaxmipur - 3700\nNoakhali- 3800\nFeni - 3900\nKhagrachari - 4400\nRangamati -  4500\nBandarban -  4600\nCox\'s Bazar - 4700\nPanchagar - 5000\nThakurgaon -5100\nDinajpur - 5200\nNilfamari - 5300\nRangpur - 5400\nLalmonirhat - 5500\nKurigram - 5600\nGaibandha - 5700\nBogra- 5800\nJoypurhat - 5900\nRajshahi GPO - 6000\nGhoramara HP - 6100\nChapaiNawabgonj - 6300\nNatore - 6400\nNoagaon - 6500\nPabna - 6600\nSirajgonj - 6700\nKushtia - 7000\nMeherpur - 7100\nChuadanga - 7200\nJhenaidaha - 7300\nJessore - 7400\nNarail - 7500\nMagura - 7600\nRajbari - 7700\nFaridpur - 7800\nMadaripur - 7900\nSariatpur - 8000\nGopalgonj - 8100\nBarishal - 8200\nBhola - 8300\nJhalakathi - 8400\nPirojpur - 8500\nPatuakhali - 8600\nBarguna - 8700\nKhulna GPO - 9000\nKhulna Head Office - 9100\nBagerhat - 9300\nSatkhira - 9400", 1100,  TextField.UNEDITABLE);//GEN-BEGIN:|114-getter|1|114-postInit
            textBox.setTicker(getTicker());
            textBox.addCommand(getObject());
            textBox.addCommand(getObject1());
            textBox.addCommand(getObject2());
            textBox.addCommand(getOkCommand2());
            textBox.addCommand(getBackCommand3());
            textBox.setCommandListener(this);//GEN-END:|114-getter|1|114-postInit





    // textBox = new TextBox("textBox", "vfgfgf", 100, TextField.UNEDITABLE);

        }//GEN-BEGIN:|114-getter|2|
        return textBox;
    }
    //</editor-fold>//GEN-END:|114-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup ">//GEN-BEGIN:|124-getter|0|124-preInit
    /**
     * Returns an initiliazed instance of choiceGroup component.
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup() {
        if (choiceGroup == null) {//GEN-END:|124-getter|0|124-preInit
            // write pre-init user code here
            choiceGroup = new ChoiceGroup("Choice :", Choice.EXCLUSIVE);//GEN-BEGIN:|124-getter|1|124-postInit
            choiceGroup.append("Dhaka", null);
            choiceGroup.append("Chittagong", null);
            choiceGroup.append("Other", null);
            choiceGroup.append("Search", null);
            choiceGroup.append("Customise", null);
            choiceGroup.addCommand(getItemCommand());
            choiceGroup.setItemCommandListener(this);
            choiceGroup.setSelectedFlags(new boolean[] { false, false, false, false, false });//GEN-END:|124-getter|1|124-postInit
            // write post-init user code here
        }//GEN-BEGIN:|124-getter|2|
        return choiceGroup;
    }
    //</editor-fold>//GEN-END:|124-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemCommand ">//GEN-BEGIN:|126-getter|0|126-preInit
    /**
     * Returns an initiliazed instance of itemCommand component.
     * @return the initialized component instance
     */
    public Command getItemCommand() {
        if (itemCommand == null) {//GEN-END:|126-getter|0|126-preInit
            // write pre-init user code here
            itemCommand = new Command("OK", Command.ITEM, 0);//GEN-LINE:|126-getter|1|126-postInit


        }//GEN-BEGIN:|126-getter|2|
        return itemCommand;
    }
    //</editor-fold>//GEN-END:|126-getter|2|



    //<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Items ">//GEN-BEGIN:|17-itemCommandAction|0|17-preItemCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a particular item.
     * @param command the Command that was invoked
     * @param displayable the Item where the command was invoked
     */
    public void commandAction(Command command, Item item) {//GEN-END:|17-itemCommandAction|0|17-preItemCommandAction
        // write pre-action user code here
        if (item == choiceGroup) {//GEN-BEGIN:|17-itemCommandAction|1|130-preAction
            if (command == itemCommand) {//GEN-END:|17-itemCommandAction|1|130-preAction

                int choice = choiceGroup.getSelectedIndex();


                switch(choice)
                {

                    case 0:
                    {
                       switchDisplayable(null, getForm());
                       break;
                    }
                 case 1:
                    {
                       switchDisplayable(null, getForm2());
                       break;
                    }

                  case 2:
                    {
                       switchDisplayable(null,getTextBox() );
                       break;
                    }
                  case 3:
                    {
                       switchDisplayable(null,getForm3() );
                       break;
                    }

                  case 4:
                    {
                       switchDisplayable(null,getList1() );
                       break;
                    }


                }

                /*
//GEN-LINE:|17-itemCommandAction|2|130-postAction
               */ // write post-action user code here
            }//GEN-BEGIN:|17-itemCommandAction|3|17-postItemCommandAction
        }//GEN-END:|17-itemCommandAction|3|17-postItemCommandAction



    }//GEN-BEGIN:|17-itemCommandAction|4|
    //</editor-fold>//GEN-END:|17-itemCommandAction|4|



    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand ">//GEN-BEGIN:|149-getter|0|149-preInit
    /**
     * Returns an initiliazed instance of backCommand component.
     * @return the initialized component instance
     */
    public Command getBackCommand() {
        if (backCommand == null) {//GEN-END:|149-getter|0|149-preInit
            // write pre-init user code here
            backCommand = new Command("Back", Command.BACK, 0);//GEN-LINE:|149-getter|1|149-postInit
            // write post-init user code here
        }//GEN-BEGIN:|149-getter|2|
        return backCommand;
    }
    //</editor-fold>//GEN-END:|149-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textBox1 ">//GEN-BEGIN:|148-getter|0|148-preInit
    /**
     * Returns an initiliazed instance of textBox1 component.
     * @return the initialized component instance
     */
    public TextBox getTextBox1() {
        if (textBox1 == null) {//GEN-END:|148-getter|0|148-preInit

            textBox1 = new TextBox("Result", null, 1100, TextField.UNEDITABLE);//GEN-BEGIN:|148-getter|1|148-postInit
            textBox1.addCommand(getBackCommand());
            textBox1.addCommand(getObject());
            textBox1.addCommand(getObject1());
            textBox1.addCommand(getObject2());
            textBox1.addCommand(getBackCommand3());
            textBox1.setCommandListener(this);//GEN-END:|148-getter|1|148-postInit
            // write post-init user code here

        }//GEN-BEGIN:|148-getter|2|
        return textBox1;
    }
    //</editor-fold>//GEN-END:|148-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: form3 ">//GEN-BEGIN:|152-getter|0|152-preInit
    /**
     * Returns an initiliazed instance of form3 component.
     * @return the initialized component instance
     */
    public Form getForm3() {
        if (form3 == null) {//GEN-END:|152-getter|0|152-preInit
            // write pre-init user code here
            form3 = new Form("Search", new Item[] { getTextField() });//GEN-BEGIN:|152-getter|1|152-postInit
            form3.addCommand(getOkCommand1());
            form3.addCommand(getBackCommand2());
            form3.addCommand(getBackCommand3());
            form3.setCommandListener(this);//GEN-END:|152-getter|1|152-postInit
            // write post-init user code here
        }//GEN-BEGIN:|152-getter|2|
        return form3;
    }
    //</editor-fold>//GEN-END:|152-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand1 ">//GEN-BEGIN:|154-getter|0|154-preInit
    /**
     * Returns an initiliazed instance of okCommand1 component.
     * @return the initialized component instance
     */
    public Command getOkCommand1() {
        if (okCommand1 == null) {//GEN-END:|154-getter|0|154-preInit
            // write pre-init user code here
            okCommand1 = new Command("Ok", Command.OK, 0);//GEN-LINE:|154-getter|1|154-postInit

        }//GEN-BEGIN:|154-getter|2|
        return okCommand1;
    }
    //</editor-fold>//GEN-END:|154-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField ">//GEN-BEGIN:|153-getter|0|153-preInit
    /**
     * Returns an initiliazed instance of textField component.
     * @return the initialized component instance
     */
    public TextField getTextField() {
        if (textField == null) {//GEN-END:|153-getter|0|153-preInit
            // write pre-init user code here
            textField = new TextField("Search with first alphabet", null, 1, TextField.ANY);//GEN-BEGIN:|153-getter|1|153-postInit
            textField.setInitialInputMode("UCB_BASIC_LATIN");//GEN-END:|153-getter|1|153-postInit
            // write post-init user code here
        }//GEN-BEGIN:|153-getter|2|
        return textField;
    }
    //</editor-fold>//GEN-END:|153-getter|2|


    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand2 ">//GEN-BEGIN:|162-getter|0|162-preInit
    /**
     * Returns an initiliazed instance of backCommand2 component.
     * @return the initialized component instance
     */
    public Command getBackCommand2() {
        if (backCommand2 == null) {//GEN-END:|162-getter|0|162-preInit
            // write pre-init user code here
            backCommand2 = new Command("Back", Command.BACK, 0);//GEN-LINE:|162-getter|1|162-postInit
            // write post-init user code here
        }//GEN-BEGIN:|162-getter|2|
        return backCommand2;
    }
    //</editor-fold>//GEN-END:|162-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand2 ">//GEN-BEGIN:|165-getter|0|165-preInit
    /**
     * Returns an initiliazed instance of okCommand2 component.
     * @return the initialized component instance
     */
    public Command getOkCommand2() {
        if (okCommand2 == null) {//GEN-END:|165-getter|0|165-preInit
            // write pre-init user code here
            okCommand2 = new Command("Search", Command.OK, 0);//GEN-LINE:|165-getter|1|165-postInit
            // write post-init user code here
        }//GEN-BEGIN:|165-getter|2|
        return okCommand2;
    }
    //</editor-fold>//GEN-END:|165-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: ticker ">//GEN-BEGIN:|178-getter|0|178-preInit
    /**
     * Returns an initiliazed instance of ticker component.
     * @return the initialized component instance
     */
    public Ticker getTicker() {
        if (ticker == null) {//GEN-END:|178-getter|0|178-preInit
            // write pre-init user code here
            ticker = new Ticker("Walton NWD Code");//GEN-LINE:|178-getter|1|178-postInit
            // write post-init user code here
        }//GEN-BEGIN:|178-getter|2|
        return ticker;
    }
    //</editor-fold>//GEN-END:|178-getter|2|


    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textBox2 ">//GEN-BEGIN:|213-getter|0|213-preInit
    /**
     * Returns an initiliazed instance of textBox2 component.
     * @return the initialized component instance
     */
    public TextBox getTextBox2() {
        if (textBox2 == null) {//GEN-END:|213-getter|0|213-preInit
            // write pre-init user code here
            textBox2 = new TextBox("NWD Code", "Void", 800, TextField.ANY | TextField.UNEDITABLE);//GEN-BEGIN:|213-getter|1|213-postInit
            textBox2.setTicker(getTicker());
            textBox2.addCommand(getBackCommand3());
            textBox2.addCommand(getBackCommand5());
            textBox2.setCommandListener(this);//GEN-END:|213-getter|1|213-postInit
            // write post-init user code here
        }//GEN-BEGIN:|213-getter|2|
        return textBox2;
    }
    //</editor-fold>//GEN-END:|213-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand3 ">//GEN-BEGIN:|217-getter|0|217-preInit
    /**
     * Returns an initiliazed instance of backCommand3 component.
     * @return the initialized component instance
     */
    public Command getBackCommand3() {
        if (backCommand3 == null) {//GEN-END:|217-getter|0|217-preInit
            // write pre-init user code here
            backCommand3 = new Command("Main", Command.BACK, 0);//GEN-LINE:|217-getter|1|217-postInit
            // write post-init user code here
        }//GEN-BEGIN:|217-getter|2|
        return backCommand3;
    }
    //</editor-fold>//GEN-END:|217-getter|2|





    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: list ">//GEN-BEGIN:|236-getter|0|236-preInit
    /**
     * Returns an initiliazed instance of list component.
     * @return the initialized component instance
     */
    public List getList() {
        if (list == null) {//GEN-END:|236-getter|0|236-preInit
            // write pre-init user code here
            list = new List("Postal And Nwd Code", Choice.IMPLICIT);//GEN-BEGIN:|236-getter|1|236-postInit
            list.append("Postal Code", null);
            list.append("NWD code", null);
            list.setCommandListener(this);
            list.setSelectedFlags(new boolean[] { false, false });//GEN-END:|236-getter|1|236-postInit
            // write post-init user code here
        }//GEN-BEGIN:|236-getter|2|
        return list;
    }
    //</editor-fold>//GEN-END:|236-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: listAction ">//GEN-BEGIN:|236-action|0|236-preAction
    /**
     * Performs an action assigned to the selected list element in the list component.
     */
    public void listAction() {//GEN-END:|236-action|0|236-preAction
        // enter pre-action user code here
        String __selectedString = getList().getString(getList().getSelectedIndex());//GEN-BEGIN:|236-action|1|239-preAction
        if (__selectedString != null) {
            if (__selectedString.equals("Postal Code")) {//GEN-END:|236-action|1|239-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm1());//GEN-LINE:|236-action|2|239-postAction
                // write post-action user code here
            } else if (__selectedString.equals("NWD code")) {//GEN-LINE:|236-action|3|240-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm4());//GEN-LINE:|236-action|4|240-postAction
                // write post-action user code here
            }//GEN-BEGIN:|236-action|5|236-postAction
        }//GEN-END:|236-action|5|236-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|236-action|6|
    //</editor-fold>//GEN-END:|236-action|6|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: form4 ">//GEN-BEGIN:|242-getter|0|242-preInit
    /**
     * Returns an initiliazed instance of form4 component.
     * @return the initialized component instance
     */
    public Form getForm4() {
        if (form4 == null) {//GEN-END:|242-getter|0|242-preInit
            // write pre-init user code here
            form4 = new Form("NWD Code", new Item[] { getTextField2() });//GEN-BEGIN:|242-getter|1|242-postInit
            form4.addCommand(getBackCommand3());
            form4.addCommand(getOkCommand6());
            form4.setCommandListener(this);//GEN-END:|242-getter|1|242-postInit
            // write post-init user code here
        }//GEN-BEGIN:|242-getter|2|
        return form4;
    }
    //</editor-fold>//GEN-END:|242-getter|2|



    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField2 ">//GEN-BEGIN:|250-getter|0|250-preInit
    /**
     * Returns an initiliazed instance of textField2 component.
     * @return the initialized component instance
     */
    public TextField getTextField2() {
        if (textField2 == null) {//GEN-END:|250-getter|0|250-preInit
            // write pre-init user code here
            textField2 = new TextField("Give A Single Alphabet", null, 1, TextField.ANY);//GEN-LINE:|250-getter|1|250-postInit
            // write post-init user code here
        }//GEN-BEGIN:|250-getter|2|
        return textField2;
    }
    //</editor-fold>//GEN-END:|250-getter|2|





    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand5 ">//GEN-BEGIN:|267-getter|0|267-preInit
    /**
     * Returns an initiliazed instance of backCommand5 component.
     * @return the initialized component instance
     */
    public Command getBackCommand5() {
        if (backCommand5 == null) {//GEN-END:|267-getter|0|267-preInit
            // write pre-init user code here
            backCommand5 = new Command("Back", Command.BACK, 0);//GEN-LINE:|267-getter|1|267-postInit
            // write post-init user code here
        }//GEN-BEGIN:|267-getter|2|
        return backCommand5;
    }
    //</editor-fold>//GEN-END:|267-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: list1 ">//GEN-BEGIN:|278-getter|0|278-preInit
    /**
     * Returns an initiliazed instance of list1 component.
     * @return the initialized component instance
     */
    public List getList1() {
        if (list1 == null) {//GEN-END:|278-getter|0|278-preInit
            // write pre-init user code here
            list1 = new List("Select", Choice.IMPLICIT);//GEN-BEGIN:|278-getter|1|278-postInit
            list1.append("Add", null);
            list1.append("Open", null);
            list1.addCommand(getBackCommand4());
            list1.setCommandListener(this);
            list1.setSelectedFlags(new boolean[] { false, false });//GEN-END:|278-getter|1|278-postInit
            // write post-init user code here
        }//GEN-BEGIN:|278-getter|2|
        return list1;
    }
    //</editor-fold>//GEN-END:|278-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: list1Action ">//GEN-BEGIN:|278-action|0|278-preAction
    /**
     * Performs an action assigned to the selected list element in the list1 component.
     */
    public void list1Action() {//GEN-END:|278-action|0|278-preAction
        // enter pre-action user code here
        String __selectedString = getList1().getString(getList1().getSelectedIndex());//GEN-BEGIN:|278-action|1|313-preAction
        if (__selectedString != null) {
            if (__selectedString.equals("Add")) {//GEN-END:|278-action|1|313-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm5());//GEN-LINE:|278-action|2|313-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Open")) {//GEN-LINE:|278-action|3|314-preAction

           List tmp =getList2();     list2.deleteAll();


                RecordEnumeration re;

                String str="";

                vv =new Hashtable();

               try
                {
                     rs = RecordStore.openRecordStore("POSTAL", true);


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
                  TextBox t = getTextBox3(); this.textBox3.setString("Action Performed");
                  this.switchDisplayable(null, getList2());
                }


                  // this.switchDisplayable(null, getList2());

                else
                {
                     TextBox t = getTextBox3(); this.textBox3.setString("No Data Found");
                     this.switchDisplayable(null, getTextBox3());
                }


/*
switchDisplayable (null, getList2 ());//GEN-LINE:|278-action|4|314-postAction
*/                // write post-action user code here
            }//GEN-BEGIN:|278-action|5|278-postAction
        }//GEN-END:|278-action|5|278-postAction






    }//GEN-BEGIN:|278-action|6|
    //</editor-fold>//GEN-END:|278-action|6|






    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: form5 ">//GEN-BEGIN:|284-getter|0|284-preInit
    /**
     * Returns an initiliazed instance of form5 component.
     * @return the initialized component instance
     */
    public Form getForm5() {
        if (form5 == null) {//GEN-END:|284-getter|0|284-preInit
            // write pre-init user code here
            form5 = new Form("Add ", new Item[] { getTextField1(), getTextField3() });//GEN-BEGIN:|284-getter|1|284-postInit
            form5.addCommand(getOkCommand());
            form5.addCommand(getBackCommand8());
            form5.setCommandListener(this);//GEN-END:|284-getter|1|284-postInit
            // write post-init user code here
        }//GEN-BEGIN:|284-getter|2|
        return form5;
    }
    //</editor-fold>//GEN-END:|284-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField1 ">//GEN-BEGIN:|285-getter|0|285-preInit
    /**
     * Returns an initiliazed instance of textField1 component.
     * @return the initialized component instance
     */
    public TextField getTextField1() {
        if (textField1 == null) {//GEN-END:|285-getter|0|285-preInit
            // write pre-init user code here
            textField1 = new TextField("City: ", null, 32, TextField.ANY);//GEN-LINE:|285-getter|1|285-postInit
            // write post-init user code here
        }//GEN-BEGIN:|285-getter|2|
        return textField1;
    }
    //</editor-fold>//GEN-END:|285-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField3 ">//GEN-BEGIN:|286-getter|0|286-preInit
    /**
     * Returns an initiliazed instance of textField3 component.
     * @return the initialized component instance
     */
    public TextField getTextField3() {
        if (textField3 == null) {//GEN-END:|286-getter|0|286-preInit
            // write pre-init user code here
            textField3 = new TextField("Postal Code", null, 32, TextField.ANY);//GEN-LINE:|286-getter|1|286-postInit
            // write post-init user code here
        }//GEN-BEGIN:|286-getter|2|
        return textField3;
    }
    //</editor-fold>//GEN-END:|286-getter|2|



    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand ">//GEN-BEGIN:|297-getter|0|297-preInit
    /**
     * Returns an initiliazed instance of okCommand component.
     * @return the initialized component instance
     */
    public Command getOkCommand() {
        if (okCommand == null) {//GEN-END:|297-getter|0|297-preInit
            // write pre-init user code here
            okCommand = new Command("Save", Command.OK, 0);//GEN-LINE:|297-getter|1|297-postInit
            // write post-init user code here
        }//GEN-BEGIN:|297-getter|2|
        return okCommand;
    }
    //</editor-fold>//GEN-END:|297-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand1 ">//GEN-BEGIN:|303-getter|0|303-preInit
    /**
     * Returns an initiliazed instance of backCommand1 component.
     * @return the initialized component instance
     */
    public Command getBackCommand1() {
        if (backCommand1 == null) {//GEN-END:|303-getter|0|303-preInit
            // write pre-init user code here
            backCommand1 = new Command("Back", Command.BACK, 0);//GEN-LINE:|303-getter|1|303-postInit
            // write post-init user code here
        }//GEN-BEGIN:|303-getter|2|
        return backCommand1;
    }
    //</editor-fold>//GEN-END:|303-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand4 ">//GEN-BEGIN:|306-getter|0|306-preInit
    /**
     * Returns an initiliazed instance of backCommand4 component.
     * @return the initialized component instance
     */
    public Command getBackCommand4() {
        if (backCommand4 == null) {//GEN-END:|306-getter|0|306-preInit
            // write pre-init user code here
            backCommand4 = new Command("Back", Command.BACK, 0);//GEN-LINE:|306-getter|1|306-postInit
            // write post-init user code here
        }//GEN-BEGIN:|306-getter|2|
        return backCommand4;
    }
    //</editor-fold>//GEN-END:|306-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textBox3 ">//GEN-BEGIN:|302-getter|0|302-preInit
    /**
     * Returns an initiliazed instance of textBox3 component.
     * @return the initialized component instance
     */
    public TextBox getTextBox3() {
        if (textBox3 == null) {//GEN-END:|302-getter|0|302-preInit
            // write pre-init user code here
            textBox3 = new TextBox("Message", "Action Performed", 100, TextField.ANY);//GEN-BEGIN:|302-getter|1|302-postInit
            textBox3.addCommand(getBackCommand1());
            textBox3.setCommandListener(this);//GEN-END:|302-getter|1|302-postInit
            // write post-init user code here
        }//GEN-BEGIN:|302-getter|2|
        return textBox3;
    }
    //</editor-fold>//GEN-END:|302-getter|2|



    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: list2 ">//GEN-BEGIN:|316-getter|0|316-preInit
    /**
     * Returns an initiliazed instance of list2 component.
     * @return the initialized component instance
     */
    public List getList2() {
        if (list2 == null) {//GEN-END:|316-getter|0|316-preInit
            // write pre-init user code here
            list2 = new List("Open", Choice.EXCLUSIVE);//GEN-BEGIN:|316-getter|1|316-postInit
            list2.addCommand(getBackCommand6());
            list2.addCommand(getOkCommand3());
            list2.addCommand(getOkCommand4());
            list2.setCommandListener(this);//GEN-END:|316-getter|1|316-postInit
            // write post-init user code here
        }//GEN-BEGIN:|316-getter|2|
        return list2;
    }
    //</editor-fold>//GEN-END:|316-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: list2Action ">//GEN-BEGIN:|316-action|0|316-preAction
    /**
     * Performs an action assigned to the selected list element in the list2 component.
     */
    public void list2Action() {//GEN-END:|316-action|0|316-preAction
        // enter pre-action user code here
        String __selectedString = getList2().getString(getList2().getSelectedIndex());//GEN-LINE:|316-action|1|316-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|316-action|2|
    //</editor-fold>//GEN-END:|316-action|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand6 ">//GEN-BEGIN:|321-getter|0|321-preInit
    /**
     * Returns an initiliazed instance of backCommand6 component.
     * @return the initialized component instance
     */
    public Command getBackCommand6() {
        if (backCommand6 == null) {//GEN-END:|321-getter|0|321-preInit
            // write pre-init user code here
            backCommand6 = new Command("Back", Command.BACK, 0);//GEN-LINE:|321-getter|1|321-postInit
            // write post-init user code here
        }//GEN-BEGIN:|321-getter|2|
        return backCommand6;
    }
    //</editor-fold>//GEN-END:|321-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand3 ">//GEN-BEGIN:|324-getter|0|324-preInit
    /**
     * Returns an initiliazed instance of okCommand3 component.
     * @return the initialized component instance
     */
    public Command getOkCommand3() {
        if (okCommand3 == null) {//GEN-END:|324-getter|0|324-preInit
            // write pre-init user code here
            okCommand3 = new Command("Update", Command.OK, 0);//GEN-LINE:|324-getter|1|324-postInit
            // write post-init user code here
        }//GEN-BEGIN:|324-getter|2|
        return okCommand3;
    }
    //</editor-fold>//GEN-END:|324-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand4 ">//GEN-BEGIN:|326-getter|0|326-preInit
    /**
     * Returns an initiliazed instance of okCommand4 component.
     * @return the initialized component instance
     */
    public Command getOkCommand4() {
        if (okCommand4 == null) {//GEN-END:|326-getter|0|326-preInit
            // write pre-init user code here
            okCommand4 = new Command("Delete", Command.OK, 0);//GEN-LINE:|326-getter|1|326-postInit
            // write post-init user code here
        }//GEN-BEGIN:|326-getter|2|
        return okCommand4;
    }
    //</editor-fold>//GEN-END:|326-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand5 ">//GEN-BEGIN:|331-getter|0|331-preInit
    /**
     * Returns an initiliazed instance of okCommand5 component.
     * @return the initialized component instance
     */
    public Command getOkCommand5() {
        if (okCommand5 == null) {//GEN-END:|331-getter|0|331-preInit
            // write pre-init user code here
            okCommand5 = new Command("Update", Command.OK, 0);//GEN-LINE:|331-getter|1|331-postInit
            // write post-init user code here
        }//GEN-BEGIN:|331-getter|2|
        return okCommand5;
    }
    //</editor-fold>//GEN-END:|331-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: form6 ">//GEN-BEGIN:|328-getter|0|328-preInit
    /**
     * Returns an initiliazed instance of form6 component.
     * @return the initialized component instance
     */
    public Form getForm6() {
        if (form6 == null) {//GEN-END:|328-getter|0|328-preInit
            // write pre-init user code here
            form6 = new Form("Update", new Item[] { getTextField4(), getTextField5() });//GEN-BEGIN:|328-getter|1|328-postInit
            form6.addCommand(getOkCommand5());
            form6.addCommand(getBackCommand7());
            form6.setCommandListener(this);//GEN-END:|328-getter|1|328-postInit
            // write post-init user code here
        }//GEN-BEGIN:|328-getter|2|
        return form6;
    }
    //</editor-fold>//GEN-END:|328-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField4 ">//GEN-BEGIN:|329-getter|0|329-preInit
    /**
     * Returns an initiliazed instance of textField4 component.
     * @return the initialized component instance
     */
    public TextField getTextField4() {
        if (textField4 == null) {//GEN-END:|329-getter|0|329-preInit
            // write pre-init user code here
            textField4 = new TextField("City", null, 32, TextField.ANY);//GEN-LINE:|329-getter|1|329-postInit
            // write post-init user code here
        }//GEN-BEGIN:|329-getter|2|
        return textField4;
    }
    //</editor-fold>//GEN-END:|329-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField5 ">//GEN-BEGIN:|330-getter|0|330-preInit
    /**
     * Returns an initiliazed instance of textField5 component.
     * @return the initialized component instance
     */
    public TextField getTextField5() {
        if (textField5 == null) {//GEN-END:|330-getter|0|330-preInit
            // write pre-init user code here
            textField5 = new TextField("Postal Code", null, 32, TextField.ANY);//GEN-LINE:|330-getter|1|330-postInit
            // write post-init user code here
        }//GEN-BEGIN:|330-getter|2|
        return textField5;
    }
    //</editor-fold>//GEN-END:|330-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand6 ">//GEN-BEGIN:|333-getter|0|333-preInit
    /**
     * Returns an initiliazed instance of okCommand6 component.
     * @return the initialized component instance
     */
    public Command getOkCommand6() {
        if (okCommand6 == null) {//GEN-END:|333-getter|0|333-preInit
            // write pre-init user code here
            okCommand6 = new Command("OK", Command.OK, 0);//GEN-LINE:|333-getter|1|333-postInit
            // write post-init user code here
        }//GEN-BEGIN:|333-getter|2|
        return okCommand6;
    }
    //</editor-fold>//GEN-END:|333-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand7 ">//GEN-BEGIN:|336-getter|0|336-preInit
    /**
     * Returns an initiliazed instance of backCommand7 component.
     * @return the initialized component instance
     */
    public Command getBackCommand7() {
        if (backCommand7 == null) {//GEN-END:|336-getter|0|336-preInit
            // write pre-init user code here
            backCommand7 = new Command("Back", Command.BACK, 0);//GEN-LINE:|336-getter|1|336-postInit
            // write post-init user code here
        }//GEN-BEGIN:|336-getter|2|
        return backCommand7;
    }
    //</editor-fold>//GEN-END:|336-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand8 ">//GEN-BEGIN:|340-getter|0|340-preInit
    /**
     * Returns an initiliazed instance of backCommand8 component.
     * @return the initialized component instance
     */
    public Command getBackCommand8() {
        if (backCommand8 == null) {//GEN-END:|340-getter|0|340-preInit
            // write pre-init user code here
            backCommand8 = new Command("Back", Command.BACK, 0);//GEN-LINE:|340-getter|1|340-postInit
            // write post-init user code here
        }//GEN-BEGIN:|340-getter|2|
        return backCommand8;
    }
    //</editor-fold>//GEN-END:|340-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand7 ">//GEN-BEGIN:|344-getter|0|344-preInit
    /**
     * Returns an initiliazed instance of okCommand7 component.
     * @return the initialized component instance
     */
    public Command getOkCommand7() {
        if (okCommand7 == null) {//GEN-END:|344-getter|0|344-preInit
            // write pre-init user code here
            okCommand7 = new Command("Customise", Command.OK, 0);//GEN-LINE:|344-getter|1|344-postInit
            // write post-init user code here
        }//GEN-BEGIN:|344-getter|2|
        return okCommand7;
    }
    //</editor-fold>//GEN-END:|344-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand9 ">//GEN-BEGIN:|352-getter|0|352-preInit
    /**
     * Returns an initiliazed instance of backCommand9 component.
     * @return the initialized component instance
     */
    public Command getBackCommand9() {
        if (backCommand9 == null) {//GEN-END:|352-getter|0|352-preInit
            // write pre-init user code here
            backCommand9 = new Command("Back", Command.BACK, 0);//GEN-LINE:|352-getter|1|352-postInit
            // write post-init user code here
        }//GEN-BEGIN:|352-getter|2|
        return backCommand9;
    }
    //</editor-fold>//GEN-END:|352-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand8 ">//GEN-BEGIN:|359-getter|0|359-preInit
    /**
     * Returns an initiliazed instance of okCommand8 component.
     * @return the initialized component instance
     */
    public Command getOkCommand8() {
        if (okCommand8 == null) {//GEN-END:|359-getter|0|359-preInit
            // write pre-init user code here
            okCommand8 = new Command("Save", Command.OK, 0);//GEN-LINE:|359-getter|1|359-postInit
            // write post-init user code here
        }//GEN-BEGIN:|359-getter|2|
        return okCommand8;
    }
    //</editor-fold>//GEN-END:|359-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: list3 ">//GEN-BEGIN:|346-getter|0|346-preInit
    /**
     * Returns an initiliazed instance of list3 component.
     * @return the initialized component instance
     */
    public List getList3() {
        if (list3 == null) {//GEN-END:|346-getter|0|346-preInit
            // write pre-init user code here
            list3 = new List("Select", Choice.IMPLICIT);//GEN-BEGIN:|346-getter|1|346-postInit
            list3.append("Add", null);
            list3.append("Open", null);
            list3.addCommand(getBackCommand9());
            list3.setCommandListener(this);
            list3.setSelectedFlags(new boolean[] { false, false });//GEN-END:|346-getter|1|346-postInit
            // write post-init user code here
        }//GEN-BEGIN:|346-getter|2|
        return list3;
    }
    //</editor-fold>//GEN-END:|346-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: list3Action ">//GEN-BEGIN:|346-action|0|346-preAction
    /**
     * Performs an action assigned to the selected list element in the list3 component.
     */
    public void list3Action() {//GEN-END:|346-action|0|346-preAction
        // enter pre-action user code here
        String __selectedString = getList3().getString(getList3().getSelectedIndex());//GEN-BEGIN:|346-action|1|349-preAction
        if (__selectedString != null) {
            if (__selectedString.equals("Add")) {//GEN-END:|346-action|1|349-preAction
                // write pre-action user code here
                switchDisplayable(null, getForm7());//GEN-LINE:|346-action|2|349-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Open")) {//GEN-LINE:|346-action|3|350-preAction

                List tmp =getList4();     list4.deleteAll();


                RecordEnumeration re;

                String str="";

                vv1 =new Hashtable();

               try
                {
                     rs1 = RecordStore.openRecordStore("NWD", true);


                    re = rs1.enumerateRecords(null, null, false);

             int i=0;


             while(re.hasNextElement())
             {

                          int id =re.nextRecordId();

                           byte b[] = rs.getRecord(id);
                           str= new String(b,0,b.length);

                           list4.append(str, null);

                           vv1.put(str, id+"");

             }




                }

                catch(Exception ex)
                {

                }

                try
                {
                    rs1.closeRecordStore();
                }
                catch(Exception ex)
                {

                }


                if(list4.size()!=0)
                {
                  TextBox t = getTextBox3(); this.textBox3.setString("Action Performed");
                  this.switchDisplayable(null, getList4());
                }


                  // this.switchDisplayable(null, getList2());

                else
                {
                     TextBox t = getTextBox3(); this.textBox3.setString("No Data Found");
                     this.switchDisplayable(null, getTextBox3());
                }


                /*
switchDisplayable (null, getList4 ());//GEN-LINE:|346-action|4|350-postAction
                // write post-action user code here
                */
            }//GEN-BEGIN:|346-action|5|346-postAction
        }//GEN-END:|346-action|5|346-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|346-action|6|
    //</editor-fold>//GEN-END:|346-action|6|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: form7 ">//GEN-BEGIN:|355-getter|0|355-preInit
    /**
     * Returns an initiliazed instance of form7 component.
     * @return the initialized component instance
     */
    public Form getForm7() {
        if (form7 == null) {//GEN-END:|355-getter|0|355-preInit
            // write pre-init user code here
            form7 = new Form("Add", new Item[] { getTextField6(), getTextField7() });//GEN-BEGIN:|355-getter|1|355-postInit
            form7.addCommand(getOkCommand8());
            form7.addCommand(getBackCommand10());
            form7.setCommandListener(this);//GEN-END:|355-getter|1|355-postInit
            // write post-init user code here
        }//GEN-BEGIN:|355-getter|2|
        return form7;
    }
    //</editor-fold>//GEN-END:|355-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField6 ">//GEN-BEGIN:|356-getter|0|356-preInit
    /**
     * Returns an initiliazed instance of textField6 component.
     * @return the initialized component instance
     */
    public TextField getTextField6() {
        if (textField6 == null) {//GEN-END:|356-getter|0|356-preInit
            // write pre-init user code here
            textField6 = new TextField("City:", null, 32, TextField.ANY);//GEN-LINE:|356-getter|1|356-postInit
            // write post-init user code here
        }//GEN-BEGIN:|356-getter|2|
        return textField6;
    }
    //</editor-fold>//GEN-END:|356-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField7 ">//GEN-BEGIN:|357-getter|0|357-preInit
    /**
     * Returns an initiliazed instance of textField7 component.
     * @return the initialized component instance
     */
    public TextField getTextField7() {
        if (textField7 == null) {//GEN-END:|357-getter|0|357-preInit
            // write pre-init user code here
            textField7 = new TextField("NWD Code:", null, 32, TextField.ANY);//GEN-LINE:|357-getter|1|357-postInit
            // write post-init user code here
        }//GEN-BEGIN:|357-getter|2|
        return textField7;
    }
    //</editor-fold>//GEN-END:|357-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand10 ">//GEN-BEGIN:|361-getter|0|361-preInit
    /**
     * Returns an initiliazed instance of backCommand10 component.
     * @return the initialized component instance
     */
    public Command getBackCommand10() {
        if (backCommand10 == null) {//GEN-END:|361-getter|0|361-preInit
            // write pre-init user code here
            backCommand10 = new Command("Back", Command.BACK, 0);//GEN-LINE:|361-getter|1|361-postInit
            // write post-init user code here
        }//GEN-BEGIN:|361-getter|2|
        return backCommand10;
    }
    //</editor-fold>//GEN-END:|361-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: list4 ">//GEN-BEGIN:|364-getter|0|364-preInit
    /**
     * Returns an initiliazed instance of list4 component.
     * @return the initialized component instance
     */
    public List getList4() {
        if (list4 == null) {//GEN-END:|364-getter|0|364-preInit
            // write pre-init user code here
            list4 = new List("Open", Choice.IMPLICIT);//GEN-BEGIN:|364-getter|1|364-postInit
            list4.addCommand(getBackCommand11());
            list4.addCommand(getOkCommand9());
            list4.addCommand(getOkCommand10());
            list4.setCommandListener(this);//GEN-END:|364-getter|1|364-postInit
            // write post-init user code here
        }//GEN-BEGIN:|364-getter|2|
        return list4;
    }
    //</editor-fold>//GEN-END:|364-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: list4Action ">//GEN-BEGIN:|364-action|0|364-preAction
    /**
     * Performs an action assigned to the selected list element in the list4 component.
     */
    public void list4Action() {//GEN-END:|364-action|0|364-preAction
        // enter pre-action user code here
        String __selectedString = getList4().getString(getList4().getSelectedIndex());//GEN-LINE:|364-action|1|364-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|364-action|2|
    //</editor-fold>//GEN-END:|364-action|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand11 ">//GEN-BEGIN:|368-getter|0|368-preInit
    /**
     * Returns an initiliazed instance of backCommand11 component.
     * @return the initialized component instance
     */
    public Command getBackCommand11() {
        if (backCommand11 == null) {//GEN-END:|368-getter|0|368-preInit
            // write pre-init user code here
            backCommand11 = new Command("Back", Command.BACK, 0);//GEN-LINE:|368-getter|1|368-postInit
            // write post-init user code here
        }//GEN-BEGIN:|368-getter|2|
        return backCommand11;
    }
    //</editor-fold>//GEN-END:|368-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: form8 ">//GEN-BEGIN:|371-getter|0|371-preInit
    /**
     * Returns an initiliazed instance of form8 component.
     * @return the initialized component instance
     */
    public Form getForm8() {
        if (form8 == null) {//GEN-END:|371-getter|0|371-preInit
            // write pre-init user code here
            form8 = new Form("Update", new Item[] { getTextField8(), getTextField9() });//GEN-BEGIN:|371-getter|1|371-postInit
            form8.addCommand(getBackCommand12());
            form8.addCommand(getOkCommand11());
            form8.setCommandListener(this);//GEN-END:|371-getter|1|371-postInit
            // write post-init user code here
        }//GEN-BEGIN:|371-getter|2|
        return form8;
    }
    //</editor-fold>//GEN-END:|371-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField8 ">//GEN-BEGIN:|372-getter|0|372-preInit
    /**
     * Returns an initiliazed instance of textField8 component.
     * @return the initialized component instance
     */
    public TextField getTextField8() {
        if (textField8 == null) {//GEN-END:|372-getter|0|372-preInit
            // write pre-init user code here
            textField8 = new TextField("City:", null, 32, TextField.ANY);//GEN-LINE:|372-getter|1|372-postInit
            // write post-init user code here
        }//GEN-BEGIN:|372-getter|2|
        return textField8;
    }
    //</editor-fold>//GEN-END:|372-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField9 ">//GEN-BEGIN:|373-getter|0|373-preInit
    /**
     * Returns an initiliazed instance of textField9 component.
     * @return the initialized component instance
     */
    public TextField getTextField9() {
        if (textField9 == null) {//GEN-END:|373-getter|0|373-preInit
            // write pre-init user code here
            textField9 = new TextField("NWD Code :", null, 32, TextField.ANY);//GEN-LINE:|373-getter|1|373-postInit
            // write post-init user code here
        }//GEN-BEGIN:|373-getter|2|
        return textField9;
    }
    //</editor-fold>//GEN-END:|373-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand9 ">//GEN-BEGIN:|374-getter|0|374-preInit
    /**
     * Returns an initiliazed instance of okCommand9 component.
     * @return the initialized component instance
     */
    public Command getOkCommand9() {
        if (okCommand9 == null) {//GEN-END:|374-getter|0|374-preInit
            // write pre-init user code here
            okCommand9 = new Command("Update", Command.OK, 0);//GEN-LINE:|374-getter|1|374-postInit
            // write post-init user code here
        }//GEN-BEGIN:|374-getter|2|
        return okCommand9;
    }
    //</editor-fold>//GEN-END:|374-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand10 ">//GEN-BEGIN:|376-getter|0|376-preInit
    /**
     * Returns an initiliazed instance of okCommand10 component.
     * @return the initialized component instance
     */
    public Command getOkCommand10() {
        if (okCommand10 == null) {//GEN-END:|376-getter|0|376-preInit
            // write pre-init user code here
            okCommand10 = new Command("Delete", Command.OK, 0);//GEN-LINE:|376-getter|1|376-postInit
            // write post-init user code here
        }//GEN-BEGIN:|376-getter|2|
        return okCommand10;
    }
    //</editor-fold>//GEN-END:|376-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand12 ">//GEN-BEGIN:|378-getter|0|378-preInit
    /**
     * Returns an initiliazed instance of backCommand12 component.
     * @return the initialized component instance
     */
    public Command getBackCommand12() {
        if (backCommand12 == null) {//GEN-END:|378-getter|0|378-preInit
            // write pre-init user code here
            backCommand12 = new Command("Back", Command.BACK, 0);//GEN-LINE:|378-getter|1|378-postInit
            // write post-init user code here
        }//GEN-BEGIN:|378-getter|2|
        return backCommand12;
    }
    //</editor-fold>//GEN-END:|378-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand11 ">//GEN-BEGIN:|381-getter|0|381-preInit
    /**
     * Returns an initiliazed instance of okCommand11 component.
     * @return the initialized component instance
     */
    public Command getOkCommand11() {
        if (okCommand11 == null) {//GEN-END:|381-getter|0|381-preInit
            // write pre-init user code here
            okCommand11 = new Command("Update", Command.OK, 0);//GEN-LINE:|381-getter|1|381-postInit
            // write post-init user code here
        }//GEN-BEGIN:|381-getter|2|
        return okCommand11;
    }
    //</editor-fold>//GEN-END:|381-getter|2|




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

      




    }


    public void run()

    {


     if( (p==true) && (nwd==false))
     {
        
        
         pstl=new Postal();
         pstl.data();

         search(pstl);



      }

     if((p==false)&& (nwd==true))
     {

         NWD nwd_ = new NWD();

         nwd_.data();
         search(nwd_);


     }


        return;

    }


  public void search(Postal pstl)
  {

      if(( textField.getString().equals("A") ) ||(textField.getString().equals("a"))) {textBox1.setString(pstl.A);}
 else if ((textField.getString().equals("B")) || (textField.getString().equals("b"))) {textBox1.setString(pstl.B);}
 else if ((textField.getString().equals("C")) || (textField.getString().equals("c"))) {textBox1.setString(pstl.C);}
 else if ((textField.getString().equals("D")) || (textField.getString().equals("d"))) {textBox1.setString(pstl.D);}
 else if ((textField.getString().equals("E")) || (textField.getString().equals("e"))) {textBox1.setString(pstl.E);}
 else if ((textField.getString().equals("F")) || (textField.getString().equals("f"))) {textBox1.setString(pstl.F);}
 else if ((textField.getString().equals("G")) || (textField.getString().equals("g"))) {textBox1.setString(pstl.G);}

 else if ((textField.getString().equals("H")) || (textField.getString().equals("h"))) {textBox1.setString(pstl.H);}
 else if ((textField.getString().equals("I")) || (textField.getString().equals("i"))) {textBox1.setString(pstl.I);}
 else if ((textField.getString().equals("J")) || (textField.getString().equals("j"))) {textBox1.setString(pstl.J);}
 else if ((textField.getString().equals("K")) || (textField.getString().equals("k"))) {textBox1.setString(pstl.K);}
 else if ((textField.getString().equals("L")) || (textField.getString().equals("l"))) {textBox1.setString(pstl.L);}
 else if ((textField.getString().equals("M")) || (textField.getString().equals("m"))) {textBox1.setString(pstl.M);}

 else if ((textField.getString().equals("N")) || (textField.getString().equals("n"))) {textBox1.setString(pstl.N);}
 else if ((textField.getString().equals("O")) || (textField.getString().equals("o"))) {textBox1.setString(pstl.O);}
 else if ((textField.getString().equals("P")) || (textField.getString().equals("p"))) {textBox1.setString(pstl.P);}
 else if ((textField.getString().equals("Q")) || (textField.getString().equals("q"))) {textBox1.setString(pstl.Q);}
 else if ((textField.getString().equals("R")) || (textField.getString().equals("r"))) {textBox1.setString(pstl.R);}
 else if ((textField.getString().equals("S")) || (textField.getString().equals("s"))) {textBox1.setString(pstl.S);}

 else if ((textField.getString().equals("T")) || (textField.getString().equals("t"))) {textBox1.setString(pstl.T);}
 else if ((textField.getString().equals("U")) || (textField.getString().equals("u"))) {textBox1.setString(pstl.U);}
 else if ((textField.getString().equals("V")) || (textField.getString().equals("v"))) {textBox1.setString(pstl.V);}
 else if ((textField.getString().equals("W")) || (textField.getString().equals("w"))) {textBox1.setString(pstl.W);}
 else if ((textField.getString().equals("X")) || (textField.getString().equals("x"))) {textBox1.setString(pstl.X);}
 else if ((textField.getString().equals("Y")) || (textField.getString().equals("y"))) {textBox1.setString(pstl.Y);}
 else if ((textField.getString().equals("Z")) || (textField.getString().equals("z"))) {textBox1.setString(pstl.Z);}

 else  {textBox1.setString("No Result Found");}




  return;

  }

 public void search(NWD _nwd)
  {

       if(( textField2.getString().equals("A"))|| (textField2.getString().equals("a"))) {textBox2.setString(_nwd.A);}
 else if ((textField2.getString().equals("B")) || (textField2.getString().equals("b"))) {textBox2.setString(_nwd.B);}
 else if ((textField2.getString().equals("C")) || (textField2.getString().equals("c"))) {textBox2.setString(_nwd.C);}
 else if ((textField2.getString().equals("D")) || (textField2.getString().equals("d"))) {textBox2.setString(_nwd.D);}
 else if ((textField2.getString().equals("E")) || (textField2.getString().equals("e"))) {textBox2.setString(_nwd.E);}
 else if ((textField2.getString().equals("F")) || (textField2.getString().equals("f"))) {textBox2.setString(_nwd.F);}
 else if ((textField2.getString().equals("G")) || (textField2.getString().equals("g"))) {textBox2.setString(_nwd.G);}

 else if ((textField2.getString().equals("H")) || (textField2.getString().equals("h"))) {textBox2.setString(_nwd.H);}
 else if ((textField2.getString().equals("I")) || (textField2.getString().equals("i"))) {textBox2.setString(_nwd.I);}
 else if ((textField2.getString().equals("J")) || (textField2.getString().equals("j"))) {textBox2.setString(_nwd.J);}
 else if ((textField2.getString().equals("K")) || (textField2.getString().equals("k"))) {textBox2.setString(_nwd.K);}
 else if ((textField2.getString().equals("L")) || (textField2.getString().equals("l"))) {textBox2.setString(_nwd.L);}
 else if ((textField2.getString().equals("M")) || (textField2.getString().equals("m"))) {textBox2.setString(_nwd.M);}

 else if ((textField2.getString().equals("N")) || (textField2.getString().equals("n"))) {textBox2.setString(_nwd.N);}
 else if ((textField2.getString().equals("O")) || (textField2.getString().equals("o"))) {textBox2.setString(_nwd.O);}
 else if ((textField2.getString().equals("P")) || (textField2.getString().equals("p"))) {textBox2.setString(_nwd.P);}
 else if ((textField2.getString().equals("Q")) || (textField2.getString().equals("q"))) {textBox2.setString(_nwd.Q);}
 else if ((textField2.getString().equals("R")) || (textField2.getString().equals("r"))) {textBox2.setString(_nwd.R);}
 else if ((textField2.getString().equals("S")) || (textField2.getString().equals("s"))) {textBox2.setString(_nwd.S);}

 else if ((textField2.getString().equals("T")) || (textField2.getString().equals("t"))) {textBox2.setString(_nwd.T);}
 else if ((textField2.getString().equals("U")) || (textField2.getString().equals("u"))) {textBox2.setString(_nwd.U);}
 else if ((textField2.getString().equals("V")) || (textField2.getString().equals("v"))) {textBox2.setString(_nwd.V);}
 else if ((textField2.getString().equals("W")) || (textField2.getString().equals("w"))) {textBox2.setString(_nwd.W);}
 else if ((textField2.getString().equals("X")) || (textField2.getString().equals("x"))) {textBox2.setString(_nwd.X);}
 else if ((textField2.getString().equals("Y")) || (textField2.getString().equals("y"))) {textBox2.setString(_nwd.Y);}
 else if ((textField2.getString().equals("Z")) || (textField2.getString().equals("z"))) {textBox2.setString(_nwd.Z);}

 else  {textBox2.setString("No Result Found");}




  return;

  }


 public  String[] split(String original,String regex)
{

Vector nodes = new Vector();
String separator = regex;

int index = original.indexOf(separator);

while(index>=0)
{
nodes.addElement( original.substring(0, index) );
original = original.substring(index+separator.length());
index = original.indexOf(separator);
}

nodes.addElement( original );


String[] result = new String[ nodes.size() ];

if( nodes.size()>0 )
{
for(int loop=0; loop<nodes.size(); loop++)
{
   result[loop] = (String)nodes.elementAt(loop);

  }

}

return result;
}


}














