

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ron;

import com.sun.lwuit.Button;
import com.sun.lwuit.ComboBox;
import com.sun.lwuit.Command;
import com.sun.lwuit.Container;
import com.sun.lwuit.Display;
import com.sun.lwuit.Form;
import com.sun.lwuit.Graphics;
import com.sun.lwuit.Label;
import com.sun.lwuit.List;
import com.sun.lwuit.TextArea;
import com.sun.lwuit.TextField;
import com.sun.lwuit.events.ActionEvent;
import com.sun.lwuit.events.ActionListener;
import com.sun.lwuit.layouts.BorderLayout;
import com.sun.lwuit.layouts.GridLayout;
import com.sun.lwuit.plaf.UIManager;
import com.sun.lwuit.util.Resources;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import javax.microedition.midlet.*;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

/**
 * @author walton
 */

public class Wazzle extends MIDlet implements ActionListener
{

    private Form Game,MainForm,Complete,Word,preview,abt;
    private Button dice[] ;
    private int column,random,row,level,top[];
    private Container Board,score,timer,n_level;
    private Vector  random_order,random_fixed,random_char,top_scor;
    private Random r;
    private int current_index,move=1,correct=0;
    public String match[],prob[]=null, current_string[];
    char word[];

    public Label move_score,time;

    boolean gameOver=false,previewed=false;

    Timer Game_time;
    PlayerTimerTask timer_task;


    int mili_sec=0,h,m,s,fixed[];
  
    private Command prvw,Top_player,Clear;
    private Command BackCommand,Exit,Select, About,Back;
    private List list;
    private Container puzzle_item;
    private Label numeric;
    private Label wordic;
    private List list2;
    private int random_word;
    private int total_fixed;
    int last_played;
    String last_played_name=null;
    private RecordStore rs;

    public void startApp()
    {

     if(MainForm==null)
     {
           Display.init(this);

          try
          {

              Resources rs =Resources.open("/labyrinth.res");
              UIManager.getInstance().setThemeProps(rs.getTheme(rs.getThemeResourceNames()[0]));
          }
           catch(Exception ex)
          {

          }
           
random_order= new Vector();
random_fixed= new Vector();
random_char=new Vector();
top_scor = new Vector();

               prob=new String[9];
               fixed= new int[15];

            prob[0]="KNOWTHY SELF";
            prob[1]="*PRESS**ANY**KEY***TO***START ";
            prob[2]="TIME**IS*TOOEASY***TO***WASTE ";
            prob[3]="GOD****DOES****NOTPLAY***DICE ";
            prob[4]="*HARD*TO*DO**BUT***EASY*TO SAY";
            prob[5]="WALTONMOBILE**AT***EVERYHAND *";
            prob[6]="JUST*****FOR**THE*BELIEFIN YOU";
            prob[7]="*SHOW*US*THE*RIGHTWAY TOHEAVEN";
            prob[8]="EUREKAI HAVEFOUND***THE*TRICK*";

     MainBoard();


        }


    }

    public void GameBoard(int lvl)
{


            Game_time = new Timer();
            timer_task = new PlayerTimerTask();
            Game_time.scheduleAtFixedRate(timer_task, 1, 1000);

            prvw=new Command("Preview");
            BackCommand = new Command("Back");

         column=lvl; row=lvl;

         Board = new Container(new GridLayout(row,column));
         score = new Container (new GridLayout(1,2));
         n_level =new Container(new GridLayout(1,2));
         timer = new Container(new GridLayout(1,1));

         dice = new Button[row*column];  
         match = new String[row*column];

         move_score= new Label(); time= new Label();

         score.addComponent(0,new Label("Move  "));
         score.addComponent(1,move_score);

       //  timer.addComponent(0,new Label("Time"));
         timer.addComponent(0,time);


  for(int i=0; i<=row*column-1; i++)
  {
      if ( i==row*column-1)
       {random_order.insertElementAt(" ", i);  match[i]=" ";   }

             else { random_order.insertElementAt((i+1) + "", i); match[i]=(i+1)+"";   }
  }


  int count =row*column;

   for(int i=0; i<=(row*column-1); i++)
   {

    int rand=this.GetRandom(count);
    if( ( (String) random_order.elementAt(rand)).equals(" ") ){ current_index=i;}

   dice[i]= new Button(); dice[i].setText((String) random_order.elementAt(rand));

   Board.addComponent(i, dice[i]);

   random_order.removeElementAt(rand);

   count--;


  }

         Game = new Form()
         {

             public void keyReleased(int key)
             {

               //move_score.setText(""+key );


                switch(key)
                {

                    case -1 :
                    {

                       try
                       {
                        dice[current_index].setText(dice[current_index+column].getText());
                        dice[current_index+column].setText(" ");

                         current_index= current_index+column;
                         Game.setFocused(dice[current_index]);move_score.setText(""+move++ );


                          if(isOver())
                          { //move_score.setText("Over"+correct);
                          break;
                          } else{ break;}//

                       //  break;

                        }
                       catch(Exception ex)
                       {

                          // current_index=current_index-column;
                           Game.setFocused(dice[current_index]);
                           break;

                       }


                       //

                    }

                      case -2 :
                    {
                         try
                         {
                        dice[current_index].setText(dice[current_index-column].getText());
                        dice[current_index-column].setText(" ");

                         current_index= current_index-column;
                         Game.setFocused(dice[current_index]);
                         move_score.setText(""+move++ );

                           if(isOver())
                           { //move_score.setText("Over"+correct);
                             break;
                           } else{ break;}//

                       //break;

                        }
                       catch(Exception ex)
                       {

                        //   current_index=current_index+column;
                           Game.setFocused(dice[current_index]);
                          break;

                       }


                    }


                    case -3:

                    {
                         if(((current_index+1)%column)==0) {  Game.setFocused(dice[current_index]); break;}

                              else
                               {

                                      dice[current_index].setText(dice[current_index+1].getText());
                                       dice[current_index+1].setText(" ");

                                        current_index= current_index+1;
                                        Game.setFocused(dice[current_index]);
                                        move_score.setText(""+move++ );

                                          if(isOver())
                                          {   break;
                                          }
                                          else{ break;}//

                                      //  break;
                               }



                    }


                    case -4:

                    {
                              if((current_index%column)==0) {  Game.setFocused(dice[current_index]); break;}

                              else
                               {

                                      dice[current_index].setText(dice[current_index-1].getText());
                                       dice[current_index-1].setText(" ");

                                        current_index= current_index-1;
                                        Game.setFocused(dice[current_index]);
                                        move_score.setText(""+move++ );

                                         if(isOver()){
                                             //move_score.setText("Over"+correct);
                                             break;} else{ break;}//

                                  //   break;
                               }

                              //  if(isOver()){ move_score.setText("Over"); } else{}//

                    }

                  
                     case -6:
                    {

                       Preview_numeric(level);

                        break;
                    }

                         case -7:
                    {

                       Game_time.cancel();
                       timer_task.cancel();

                      MainForm.show();

                      break;
                    }


                }

             }

         };

Game.addCommand(prvw);Game.addCommand(BackCommand);

         Game.setLayout(new BorderLayout());
         Game.addComponent(BorderLayout.NORTH,timer);
         Game.addComponent(BorderLayout.CENTER,Board);
         Game.addComponent(BorderLayout.SOUTH,score);
         Game.setFocused(dice[current_index]);

         Game.show();

         return;
 }

public void GameBoard_word(int lvl,int rw)
{
            Game_time = new Timer();
            timer_task = new PlayerTimerTask();
            Game_time.scheduleAtFixedRate(timer_task, 1, 1000);
                                  
            prvw=new Command("Preview");
           BackCommand = new Command("Back");
            // random_word = GetRandom(9);

            if(random_word>0)
            {
                random_fixed.removeAllElements();
                random_char.removeAllElements();

                row=5; column=6;  word=prob[random_word].toCharArray();

                total_fixed=0;

                for(int i=0; i<=row*column-1;i++)
                 {

                    if((word[i]+"").equals("*"))
                    {
                      fixed[total_fixed]=i;
                      total_fixed=total_fixed+1;
                    }

                   else{random_fixed.addElement(word[i]+"");}

                 }

              int fix_rnd=word.length-total_fixed;
              int c=fix_rnd;

              for(int j=0;j<=c-1;j++)
              {
                 int rand=this.GetRandom(fix_rnd);
                 random_char.addElement((String)random_fixed.elementAt(rand));
                 random_fixed.removeElementAt(rand);
                 fix_rnd=fix_rnd-1;

              }

                  for(int i=0; i<=total_fixed-1;i++)
                  {
                      
                      random_char.insertElementAt("*", fixed[i]);
                      
                  }


            }


             else { row = 3;column = 4; word=prob[random_word].toCharArray(); }


         Board = new Container(new GridLayout(row,column));
         score = new Container (new GridLayout(1,2));
         n_level =new Container(new GridLayout(1,2));
         timer = new Container(new GridLayout(1,1));

         dice = new Button[row*column];


         random_order= new Vector();
         match = new String[row*column];

         move_score= new Label(); time= new Label();

         score.addComponent(0,new Label("Move  "));
         score.addComponent(1,move_score);

       //  timer.addComponent(0,new Label("Time"));
         timer.addComponent(0,time);


  for(int i=0; i<=row*column-1; i++)
  {
    /*  if ( i==column*column-1)
       {random_order.insertElementAt(" ", i);  match[i]=" ";   }

             else { random_order.insertElementAt((i+1) + "", i); match[i]=(i+1)+"";   }

  */

       random_order.insertElementAt(word[i]+"", i); match[i]=word[i]+"";

  }

//random_fixed.trimToSize();
 //move_score.setText(""+total_fixed+","+ word.length+","+(word.length-total_fixed)+","+random_char.size());
  //int count =row*column;



 if(random_word==0)

 { 
     
    
     
 if(!previewed)    
 {
     int count =row*column;
   for(int i=0; i<=(row*column-1); i++)
   {

    int rand=this.GetRandom(count);
    if( ( (String) random_order.elementAt(rand)).equals(" ") ){ current_index=i;}

   dice[i]= new Button(); dice[i].setText((String) random_order.elementAt(rand));

   Board.addComponent(i, dice[i]);

   random_order.removeElementAt(rand);

   count--;


  }

    }

 else
 {
    for(int i=0; i<=(row*column-1); i++)
     {
      dice[i]= new Button(); dice[i].setText(current_string[i]);
       Board.addComponent(i, dice[i]);

     }



 }



    }




 else

 {

   if(!previewed)
   {
    for(int i =0; i<=row*column-1;i++)
     {

          if( ( (String) random_char.elementAt(i)).equals(" ") ){ current_index=i;}
  dice[i]= new Button(); dice[i].setText((String) random_char.elementAt(i));

  Board.addComponent(i, dice[i]);

       }
    }

 else
   {
       for(int i=0; i<=row*column-1;i++)
       {

       dice[i]= new Button(); dice[i].setText(current_string[i]);
       Board.addComponent(i, dice[i]);
       }


    }

 }



         Game = new Form()
         {

             public void keyReleased(int key)
             {

                switch(key)
                {

                    case -1 :
                    {

                       try
                       {
                        dice[current_index].setText(dice[current_index+column].getText());
                        dice[current_index+column].setText(" ");

                         current_index= current_index+column;
                         Game.setFocused(dice[current_index]);move_score.setText(""+move++ );


                          if(isOver())
                          { //move_score.setText("Over"+correct);
                          break;
                          } else{ break;}//

                       //  break;

                        }
                       catch(Exception ex)
                       {

                          // current_index=current_index-column;
                           Game.setFocused(dice[current_index]);
                           break;

                       }


                       //

                    }

                      case -2 :
                    {
                         try
                         {
                        dice[current_index].setText(dice[current_index-column].getText());
                        dice[current_index-column].setText(" ");

                         current_index= current_index-column;
                         Game.setFocused(dice[current_index]);
                         move_score.setText(""+move++ );

                           if(isOver())
                           { //move_score.setText("Over"+correct);
                             break;
                           } else{ break;}//

                       //break;

                        }
                       catch(Exception ex)
                       {

                        //   current_index=current_index+column;
                           Game.setFocused(dice[current_index]);
                          break;

                       }


                    }


                    case -3:

                    {
                         if(((current_index+1)%column)==0) {  Game.setFocused(dice[current_index]); break;}

                              else
                               {

                                      dice[current_index].setText(dice[current_index+1].getText());
                                       dice[current_index+1].setText(" ");

                                        current_index= current_index+1;
                                        Game.setFocused(dice[current_index]);
                                        move_score.setText(""+move++ );

                                          if(isOver())
                                          {   break;
                                          }
                                          else{ break;}//

                                      //  break;
                               }



                    }


                    case -4:

                    {
                              if((current_index%column)==0) {  Game.setFocused(dice[current_index]); break;}

                              else
                               {

                                      dice[current_index].setText(dice[current_index-1].getText());
                                       dice[current_index-1].setText(" ");

                                        current_index= current_index-1;
                                        Game.setFocused(dice[current_index]);
                                        move_score.setText(""+move++ );

                                         if(isOver()){
                                             //move_score.setText("Over"+correct);
                                             break;} else{ break;}//

                                  //   break;
                               }

                              //  if(isOver()){ move_score.setText("Over"); } else{}//

                    }

                 


                    case -6:
                    {

                        Preview(level);

                        break;
                    }

                       case -7:
                    {

                       Game_time.cancel();
                       timer_task.cancel();

                      MainForm.show();
                     break;
                    }



                }

             }

         };


Game.addCommand(prvw);Game.addCommand(BackCommand);

//Game.addCommand(BackCommand);
//Game.addCommandListener(this);

         Game.setLayout(new BorderLayout());
         Game.addComponent(BorderLayout.NORTH,timer);
         Game.addComponent(BorderLayout.CENTER,Board);
         Game.addComponent(BorderLayout.SOUTH,score);
         Game.setFocused(dice[current_index]);

         Game.show();

         return;
 }

public void Preview(int lvl)
{
  
    /*          Game_time = new Timer();
            timer_task = new PlayerTimerTask();
            Game_time.scheduleAtFixedRate(timer_task, 1, 1000);
   */


     current_string=new String[row*column];

  for(int i=0; i<=row*column-1;i++)
  {

      current_string[i]=dice[i].getText();

  }


            BackCommand = new Command("Back");
             
         Board = new Container(new GridLayout(row,column));
         score = new Container (new GridLayout(1,2));
         n_level =new Container(new GridLayout(1,2));
         timer = new Container(new GridLayout(1,1));

         dice = new Button[row*column];  random_order= new Vector();
         match = new String[row*column];

         move_score= new Label(); time= new Label();

         score.addComponent(0,new Label("Move  "));
         score.addComponent(1,move_score);

       //  timer.addComponent(0,new Label("Time"));
         timer.addComponent(0,time);


  for(int i=0; i<=row*column-1; i++)
  {
    /*  if ( i==column*column-1)
       {random_order.insertElementAt(" ", i);  match[i]=" ";   }

             else { random_order.insertElementAt((i+1) + "", i); match[i]=(i+1)+"";   }

  */

       random_order.insertElementAt(word[i]+"", i); match[i]=word[i]+"";



  }


  int count =row*column;



   for(int i=0; i<=(row*column-1); i++)
   {

   // int rand=this.GetRandom(count);
   // if( ( (String) random_order.elementAt(rand)).equals(" ") ){ current_index=i;}

   dice[i]= new Button(); dice[i].setText((String) random_order.elementAt(i));

   Board.addComponent(i, dice[i]);

 //  random_order.removeElementAt(rand);

   count--;


  }


         Game = new Form("Preview")
         {

             public void keyReleased(int key)
             {
                     switch(key)
                     {

                         case -6:

                         {
                           Game_time.cancel();
                           timer_task.cancel();

                           previewed=true;

                           GameBoard_word(level,random_word);

                           break;
                         }



                     }



             }


         };


//Game.addCommand(prvw);
Game.addCommand(BackCommand);
//Game.addCommandListener(this);

         Game.setLayout(new BorderLayout());
       //  Game.addComponent(BorderLayout.NORTH,timer);
         Game.addComponent(BorderLayout.CENTER,Board);
        // Game.addComponent(BorderLayout.SOUTH,score);
        Game.setFocused(score);

         Game.show();

         return;
 }

public void Preview_numeric(int lvl)
{

    /*          Game_time = new Timer();
            timer_task = new PlayerTimerTask();
            Game_time.scheduleAtFixedRate(timer_task, 1, 1000);
   */


     current_string=new String[row*column];

  for(int i=0; i<=row*column-1;i++)
  {

      current_string[i]=dice[i].getText();

  }


            BackCommand = new Command("Back");

         Board = new Container(new GridLayout(row,column));
         score = new Container (new GridLayout(1,2));
         n_level =new Container(new GridLayout(1,2));
         timer = new Container(new GridLayout(1,1));

         dice = new Button[row*column];  random_order= new Vector();
         match = new String[row*column];

         move_score= new Label(); time= new Label();

         score.addComponent(0,new Label("Move  "));
         score.addComponent(1,move_score);

       //  timer.addComponent(0,new Label("Time"));
         timer.addComponent(0,time);


  for(int i=0; i<=row*column-1; i++)
  {
    /*  if ( i==column*column-1)
       {random_order.insertElementAt(" ", i);  match[i]=" ";   }

             else { random_order.insertElementAt((i+1) + "", i); match[i]=(i+1)+"";   }

  */

      // random_order.insertElementAt(word[i]+"", i); match[i]=word[i]+"";



  }


  //int count =row*column;



   for(int i=0; i<=(row*column-1); i++)
   {

   // int rand=this.GetRandom(count);
   // if( ( (String) random_order.elementAt(rand)).equals(" ") ){ current_index=i;}

       if(i==(row*column-1))
       {
         dice[i]= new Button(); dice[i].setText(" ");
       }
  else
       {
          dice[i]= new Button(); dice[i].setText((i+1)+"");
        }
   Board.addComponent(i, dice[i]);

 //  random_order.removeElementAt(rand);

  // count--;


  }


         Game = new Form("Preview")
         {

             public void keyReleased(int key)
             {
                     switch(key)
                     {

                         case -6:

                         {
                           Game_time.cancel();
                           timer_task.cancel();

                           previewed=true;

                           GameBoard(level);

                           break;
                         }



                     }



             }


         };


//Game.addCommand(prvw);
Game.addCommand(BackCommand);
//Game.addCommandListener(this);

         Game.setLayout(new BorderLayout());
       //  Game.addComponent(BorderLayout.NORTH,timer);
         Game.addComponent(BorderLayout.CENTER,Board);
      //   Game.addComponent(BorderLayout.SOUTH,score);
        Game.setFocused(score);

         Game.show();

         return;
 }



public void MainBoard()



{


   puzzle_item = new Container(new BorderLayout());

   numeric=new Label("Numeric");

   
list = new List();
list.addItem("3 X 3");
list.addItem("4 X 4");
list.addItem("5 X 5");
list.addItem("6 X 6");
list.addItem("7 X 7");

list.addItem("Word");


//puzzle_item.addComponent(BorderLayout.CENTER,numeric);
puzzle_item.addComponent(BorderLayout.CENTER,list);
//puzzle_item.addComponent(wordic);
//puzzle_item.addComponent(list2);

Exit= new Command("Exit");Select= new Command("Select");
About=new Command("About");

MainForm =new Form("Wazzle")

{

    public void keyReleased(int key)

    {

        switch(key)
        {

            case -5:

            {

                level= list.getSelectedIndex()+3;

                 move=1; mili_sec=0;

                  if(level<8) { GameBoard(level); }
                  if(level>=8)
                  { 
                  
                      previewed=false;
                      random_word=GetRandom(9);GameBoard_word(level,random_word);

                  }

                 break;
            }



               case -6:

            {

                    about();

                    break;
               
            }

                          case -7:

                         {

                             notifyDestroyed();


                           break;
                         }



        }



    }


};


//MainForm.addCommand(Top_player);
MainForm.addCommand(About);
MainForm.addCommand(Exit);
MainForm.setLayout(new BorderLayout());


MainForm.addComponent(BorderLayout.CENTER,puzzle_item);MainForm.show();

return;

}


void about()
    {


     Back = new Command("Back");

           abt = new Form()
           {

                   public void keyReleased(int key)
               {

                        switch(key)
                        {
                            case -6:

                            {
                               MainBoard();
                               break;
                            }



                        }




                  }

            };


/*
            abt.addComponent(new Container(new GridLayout(2,1)) );
            abt.addComponent(new Label("Developer: Walton Mobile"));

            abt.addComponent(new Label("All Rights Reserved."));
              abt.addComponent(new Label("This application or parts of this Application or parts thereof"));

              abt.addComponent(new Label("must not be used or reproduced in any manner without return permission "));
                abt.addComponent(new Label("Address: R B Group, Jibon Bima Tower(Level-12),10,Dilkusha,Dhaka-1000,Bangladesh"));
             


            abt.addComponent(new Label("web: www.waltoncellphone.com"));

            */

            TextArea claimer = new TextArea("Developer: Walton Mobile,Bangladesh."+"\n\n"+
                                        "All Rights Reserved. "+
                                        "This application or parts thereof,"+
                                        "must not be used or reproduced in any manner "+
                                        "without return permission."+"\n\n"+
                                        "Address: R B Group,Jibon Bima Tower(Level-12)"+"\n"+
                                        "10,Dilkusha,Dhaka-1000,Bangladesh"+"\n\n"+
                                        "Web : www.waltoncellphone.com");


            claimer.setEditable(false); 
            abt.addComponent(claimer);

            
            abt.addCommand(Back);
            abt.show();

    return;
}


public void TopPlayer()
    {


      list2 = new List();
      BackCommand=new Command("Back");
      Clear = new Command("Clear");
      RecordEnumeration re;

      Hashtable hast = new Hashtable();

      int i=0; Vector sort = new Vector();  Integer[] sorted;

                String str=""; String x[] = new String[2];


               try
                {
                     rs = RecordStore.openRecordStore("High Score", true);

                    re = rs.enumerateRecords(null, null, false);

             while(re.hasNextElement())
             {

                          int id =re.nextRecordId();

                           byte b[] = rs.getRecord(id);
                           str= new String(b,0,b.length);

                           x=split(str," # ");
                         //  list2.addItem((String)str);

                           hast.put(x[1], x[0]);
                         //  list2.addItem(hast.get(x));

                          sort.addElement(  Integer.valueOf(x[1]+"")   );

                           i++;

                       //if(i==5){break;}

             }


                    hast.put((last_played+""),last_played_name); sort.addElement(  Integer.valueOf(last_played+""));




                }

                catch(Exception ex)
                {

                }
                try {rs.closeRecordStore();}
                catch(Exception ex){}

              // list2.addItem(hast.get(x[1])+".."+x[1]);

                sorted = new Integer[sort.size()];
                sort.copyInto(sorted);

               Quicksort qsrt= new Quicksort();qsrt.sort(sorted);


                   try {
                        rs.deleteRecordStore("High Score");
                    } catch (RecordStoreException ex) {
                        ex.printStackTrace();
                    }




                  try
                  {
                      String appt=null;

                       rs = RecordStore.openRecordStore("High Score",true);

                          for(int p=sorted.length-1; p>=0;p--)
                             {
                                   list2.addItem(hast.get(  qsrt.numbers[p]+""  )+" - "+qsrt.numbers[p] );

                               appt=hast.get(  qsrt.numbers[p]+""  )+" # "+ qsrt.numbers[p];


                                byte bytes[] = appt.getBytes();
                                rs.addRecord(bytes,0,bytes.length);
                                

                             }

                  }

               catch(Exception ex) {}

                try {rs.closeRecordStore();}
                catch(Exception ex){}



  /*
             for(int p=sorted.length-1; p>=0;p--)
             {
                 list2.addItem(hast.get(  qsrt.numbers[p]+""  )+".."+qsrt.numbers[p] );

             }
*/





     Form TopScore= new Form("RANK")
     {
         public void keyReleased(int key)
         {
         
          switch(key)
          {

              case -6:
              {

                MainForm.show();
                break;
              }
           case -7:
              {
                    try {
                        rs.deleteRecordStore("High Score");
                    } catch (RecordStoreException ex) {
                        ex.printStackTrace();
                    }
                   TopPlayer();
                break;
              }
          }


         }

     };


    TopScore.addComponent(list2);
    TopScore.addCommand(BackCommand); TopScore.addCommand(Clear);
    TopScore.show();

        return;

}


    public void pauseApp()
    {

    }

    public void destroyApp(boolean unconditional)
    {
    }

    int GetRandom(int c)

    {

         r = new Random(System.currentTimeMillis());

         return (r.nextInt(c)) ;

    }


   boolean isOver()
    {

      for(int i=0; i<=row*column-1;i++)
      {
          correct=0;
          
          if(dice[i].getText().equals(match[i].toString()))
          {
              correct=correct+1;
          }
          
          else{ break;}

      }

          if(correct==(row*column))
          
          {
            //  move_score.setText(dice[0].getText()+dice[1].getText()+dice[2].getText()+dice[3].getText());
           // move_score.setText(".."+match[0]+match[1]+match[2]+match[3]+"ct="+correct);
              return true;

          }
          else
          {
                  //move_score.setText(".."+match[0]+match[1]+match[2]+match[3]+"cf="+correct);

               if(correct==1)
                                {

                                     Game_time .cancel();
                                     timer_task .cancel();

                                     Container end = new Container(new GridLayout(7,1));
                                     Label mv=new Label("Move  : "+(move-1));
                                     Label tm=new Label("Time  : "+s+" s "+m+" m "+h+" h");
                                     Label lv=new Label("Level :"+(list.getSelectedIndex()+3));
                                     Label scr=new Label("Score:"+(int)(100+(list.getSelectedIndex()+3) * (1000/Float.parseFloat((move)*(mili_sec)+""))));

                                     Label nm_plate=new Label("Add Your Name");

                                //     TextArea name = new TextArea(1, 20, TextArea.ANY);

                                     final TextField name = new TextField();
                                      name.setColumns(50);
                                      name.setText("");

                                      last_played=(int)(100+(list.getSelectedIndex()+3) * (1000/Float.parseFloat((move)*(mili_sec)+"")));



                                  final Button OK = new Button("             SAVE");

                                          OK.addActionListener(new ActionListener()
                                          {

                                              public void actionPerformed(ActionEvent evt)
                                              {
                                                 last_played_name=name.getText();
                                                  save(name.getText());

                                              }

                                          });



                                     Complete= new Form("Game Completed")

                                    {


                                    };

                                   /*
                                    BackCommand = new Command("Back");
                                    Complete.addCommand(BackCommand);
                                    Complete.addCommand(new Command(""));
                                    Complete.addCommandListener(this);

                                    */

                                   end.addComponent(mv); end.addComponent(tm);  end.addComponent(lv);

                                  end.addComponent(scr);  end.addComponent(nm_plate);
                                   end.addComponent(name);end.addComponent(OK);
                                    Complete.addComponent(end);
                                    Complete.setFocused(name);
                                    Complete.show();
                                   
                                 }

             return false;
          }

       


    }


   private void save(String nam)
    {
          TopPlayer();


    }
    public void actionPerformed(ActionEvent ae)
    {

    }


private class PlayerTimerTask extends TimerTask
{
		public final void run()
                {

                    h = mili_sec/3600;
                    m= ((mili_sec%3600))/60;
                    s= ((mili_sec%3600)%60);

                     time.setText("Time :  "+(s)+" s"+ " "+ (int)(m)+" m"+ " "+(int)(h)+" h" );

                   mili_sec++;

		}
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


class Quicksort
{
	public Integer[] numbers;
	private int number;


	public void sort(Integer[] values)
        {


		// Check for empty or null array
		if (values ==null || values.length==0)
                {
			return;
		}
                this.numbers=new Integer[values.length];
		this.numbers = values;
		number = values.length;
		quicksort(0, number - 1);
	}

Quicksort  ()

{

}
	private void quicksort(int low, int high) {
		int i = low, j = high;

		Integer pivot = numbers[low + (high-low)/2];


		while (i <= j) {

			while (numbers[i].intValue() < pivot.intValue()) {
				i++;
			}

			while (numbers[j].intValue() > pivot.intValue()) {
				j--;
			}

			if (i <= j) {
				exchange(i, j);
				i++;
				j--;
			}
		}

		if (low < j)
			quicksort(low, j);
		if (i < high)
			quicksort(i, high);
	}

	private void exchange(int i, int j)
        {
		Integer temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}
}

