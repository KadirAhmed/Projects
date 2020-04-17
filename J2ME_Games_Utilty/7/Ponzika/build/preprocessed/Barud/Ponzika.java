
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Barud;

import com.sun.lwuit.Button;
//import com.sun.lwuit.Calendar;

import com.sun.lwuit.ComboBox;
import com.sun.lwuit.Container;
import com.sun.lwuit.Display;
import com.sun.lwuit.Form;
import com.sun.lwuit.Graphics;
import com.sun.lwuit.Image;
import com.sun.lwuit.Label;
import com.sun.lwuit.List;
import com.sun.lwuit.TextField;
import com.sun.lwuit.events.ActionEvent;
import com.sun.lwuit.events.ActionListener;
import com.sun.lwuit.layouts.BorderLayout;
import com.sun.lwuit.layouts.GridLayout;
import com.sun.lwuit.plaf.UIManager;
import com.sun.lwuit.util.Resources;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.Timer;
import java.util.Vector;
import javax.microedition.midlet.*;

/**
 * @author User
 */

public class Ponzika extends MIDlet implements ActionListener
{
    Thread t; Runnable r;
   
    Form Main,battle_filed; 
    int i=50;
    Button b1;//Btn b;
    int current_grag_year,current_bd_year;
 
    BDMonth[] bangla_month;
    
    int[] Month_serial={1,2,3,4,5,6,7,8,9,10,11,12};
    int[] day_of_mnth = {31,31,31,31,31,30,30,30,30,30,30,30};
    
    
     Button date_day[];
     Button mnth[];
    
     Label week[],  Gragorian;  
            
     int d,mn,wk;
     int month_for_count,day_for_count;
     Container date_day_container;
     Container mnth_container;
     Container mnth_with_year_container;
     Container container_for_day_allign;
     Container week_container;
     Container YEAR;
     ComboBox  cm;
     ComboBox tt;
     
     
     
     
    public void startApp()
    {
        //  Graphics G;
       
            Display.init(this);
         
       
            try
          {
                //open the resource file
                //get and set the theme
                Resources r = Resources.open("/rs.res");
                UIManager.getInstance().setThemeProps(r.getTheme("Theme 1"));
                
          }
                    
                 
                      
      catch (java.io.IOException e)
      {
                //if there is a problem print a message on console
                //in this case default settings will be used
                
          
          System.out.println
                        ("Unable to get Theme " + e.getMessage());
      }
    
  
            
            cm = null;
            List lst= new List();
           
            Gragorian = new Label();
           
             date_day= new Button[6*7];mnth= new Button[12]; week= new Button[7];
           
             
           YEAR = new Container(new GridLayout(1,2));
         
            tt= new ComboBox(); 
            
            for(int BD_YR=1400;BD_YR<=1450;BD_YR+=1){tt.addItem(BD_YR+"");}
          
           
           
           
           date_day_container= new Container(new GridLayout(5,7));
           mnth_container = new Container(new GridLayout(2,6));
           week_container = new Container(new GridLayout(1,7));
            
           
            container_for_day_allign = new Container();
            
            mnth_with_year_container = new Container();
                    
              Calendar cal=Calendar.getInstance();
              
             
                cal.setTimeZone(TimeZone.getTimeZone("GMT+06:00"));
             
               cal.set(Calendar.YEAR, 2011); cal.set(Calendar.MONTH,11);
              
              
               cal.set(Calendar.YEAR, 2011); cal.set(Calendar.DAY_OF_MONTH, 18);
               
              
             bangla_month  = new BDMonth[12]; 

             Date dt = new Date();
            
             dt.setTime(  1000*(  ( dt.getTime()/1000 )   -  24*3600*365*24L));  
         
              
            
   
     //        CreateYear(1410);
              
             
            // String[] x =  split(cal.getDate().toString()," ");
             
     
            /* 
             battle_filed = new Form(bangla_month[12-1].d[30-1].B_day+","
                     
                                     +bangla_month[12-1].d[30-1].grag_day+","
                                     +bangla_month[12-1].d[30-1].Greg_month_serial+
                                      ","+bangla_month[12-1].d[30-1].B_YEAR+","+bangla_month[12-1].d[30-1].Gr_YEAR  );  
             */
             

                  battle_filed = new Form(" ");
             
               //  battle_filed = new Form(cal.getTime()+"");
             
           
           
           
           
                      
             for( d=0;d<=30;d++)
             {
                // day=d;
                 
                 String dat;
                 
                 
                 date_day[d]=new Button()
                         {
                           int serial = (d+1);  
                             
                        public void paint(Graphics g)
                        {
                          try 
                          {
                              
                               g.drawImage(Image.createImage("/"+"d"+serial+".PNG"),getX(), getY());
                             //  repaint();
                          } 
                         
                          catch (IOException ex) 
                          {
                           ex.printStackTrace();
                       }

                          
                        }
                         
                         
                         }
                         
                         ;
                 
               
                try
                {
                    //dat=bangla_month[0].d[d].B_day+","+bangla_month[0].d[d].grag_day;
                   date_day[d].setText((d+1)+"");
                   //date_day[d].addActionListener(this);
                   
                   
                   
                        date_day[d].addActionListener(new ActionListener()
                           {
                           

                                public void actionPerformed(ActionEvent ae) 
                                {
                     
                                    // CreateYear(1409);

                                     
                                   //  day_for_count = Integer.parseInt(null)
                                  
                                       Button x = new Button();
                                        
                                        x= (Button) ae.getSource();
                                        day_for_count = Integer.parseInt(x.getText());
                                   
                                        Calendar cal=Calendar.getInstance();
              
             
                                       cal.setTimeZone(TimeZone.getTimeZone("GMT+06:00"));
             
                                       cal.set(Calendar.YEAR, bangla_month[month_for_count-1].d[day_for_count-1].Gr_YEAR); 
                                       cal.set(Calendar.MONTH,bangla_month[month_for_count-1].d[day_for_count-1].Greg_month_serial);
              
              
                                       cal.set(Calendar.DAY_OF_MONTH, bangla_month[month_for_count-1].d[day_for_count-1].grag_day);
                                     
                         
                                       
                    
                                     Gragorian.setText(
                     
                                     +bangla_month[month_for_count-1].d[day_for_count-1].grag_day+"-"
                                     +bangla_month[month_for_count-1].d[day_for_count-1].Greg_month_serial+
                                      "-"+bangla_month[month_for_count-1].d[day_for_count-1].Gr_YEAR
                                      );
                        
                              container_for_day_allign.repaint();
                              
 
                              
                                  }
                            });
                   
                        
                   
               //    date_day_container.addComponent(date_day[d]);
                    
                }
                catch(Exception exc){} 
            
             
             }
           
            for( mn=0;mn<=11;mn++)
             {
                
                 
                 mnth[mn]=new Button()
                         {
                            int  serial = (mn+1);  
                             
                        public void paint(Graphics g)
                        {
                          try 
                          {
                              
                               g.drawImage(Image.createImage("/"+serial+".PNG"),getX(), getY());
                              // g.setColor(7012351);
                             //  repaint();
                               
                          } 
                         
                          catch (IOException ex) 
                          {
                           ex.printStackTrace();
                       }

                          
                        }
                         
                         
                         };
                         
                         
                 
               
                try
                {
                    //dat=bangla_month[0].d[d].B_day+","+bangla_month[0].d[d].grag_day;
                 // date_day[d].setText(dat);
                    
                    mnth[mn].setText((mn+1)+""); 
                    
                         mnth[mn].addActionListener(new ActionListener()
                                 {

                                   public void actionPerformed(ActionEvent ae) 
                                    {
                       
                                     date_day_container.removeAll();
                                       
                                     
                                   boolean  leap_year;
                                //   CreateYear(1410);
                                     
                                     
                                      //  CreateYear(1409);
                                        Button x = new Button();
                                        
                                        x= (Button) ae.getSource();
                                        month_for_count = Integer.parseInt(x.getText());
                                        int YR = Integer.parseInt((String) tt.getSelectedItem())+593;
                                   
                                        CreateYear(YR-593);
                                      //     bangla_month
                                        
                                                   // for(int din=0; din<=day_of_mnth[month_for_count-1]-1;din++)
                                                   
                                               //  for(int din=0; din<=bangla_month[month_for_count-1].total_day-1;din++)
                                                    
                                        
                                        int limit=0;
        
                                       
        
                                                      if((YR+1)%400==0)      {leap_year=true;}
                                                 else if((YR+1)%100==0)      {leap_year=false;}  
                                                 else if((YR+1)%4==0)        {leap_year=true;}
                                                 else                        {leap_year=false;}
        
                                                    
                                                      if (leap_year && ((month_for_count-1)==10)){limit=31-1;}
                                                      else{limit=day_of_mnth[month_for_count-1]-1;}
                                                       
                                                      
                                    Calendar cal=Calendar.getInstance(TimeZone.getTimeZone("GMT+06:00"));
                                                      
                                                       //  cal.setTimeZone(TimeZone.getTimeZone("GMT+06:00"));
                                                     
                                    cal.set(Calendar.YEAR, bangla_month[month_for_count-1].d[1-1].Gr_YEAR); 
                                  //  cal.set(Calendar.MONTH,bangla_month[month_for_count-1].d[1-1].Greg_month_serial-1);
                                                      
                                     cal.set(Calendar.MONTH,bangla_month[month_for_count-1].d[1-1].Greg_month_serial-1);
                                     cal.set(Calendar.DAY_OF_MONTH,bangla_month[month_for_count-1].d[1-1].grag_day);
                                    
                                 //     Gragorian.setText(cal.get(Calendar.DAY_OF_WEEK)+","+cal.get(Calendar.DATE)+","+cal.get(Calendar.MONTH));             
                                        
                                         //  container_for_day_allign.repaint();
                                                     
                                           int add =cal.get(Calendar.DAY_OF_WEEK); 
                                        
                                           if( (add%7)==0 ){add=0;} else{add=add;}
                                           
                                            
                                           
                                           
                                           for(int j =0; j<=add-1; j++)
                                           {
                                               
                                                  date_day_container.addComponent(new Button(" "));
                                           
                                           }
                                                  
                                                    for(int din=0; din<=limit;din++)
                                                    {
                                                    
                                                        
                                                        date_day_container.addComponent( date_day[din]);
                                                    
                                                        
                                                    }
                                     
                                         date_day_container.repaint();
                                        
                                         
                                    }
                         
                                 });
                         
                         
                    mnth_container.addComponent(mnth[mn]);
                    
                }
                catch(Exception exc){} 
            
             
             }
            
            
               for( wk=0;wk<=6;wk++)
               {
                     String dat;
                 
                 
                 week[wk]=new Button()
                         {
                           int serial = (wk+1);  
                             
                        public void paint(Graphics g)
                        {
                          try 
                          {
                              
                               g.drawImage(Image.createImage("/wk"+"d"+serial+".PNG"),getX(), getY());
                            //   repaint();
                          } 
                         
                          catch (IOException ex) 
                          {
                           ex.printStackTrace();
                       }

                          
                        }
                         
                         
                         }
                         
                         ;
                 
               
                try
                {
                     week[wk].setText("  "); 
                            
                     week_container.addComponent(week[wk]);
                    
                }
                
                catch(Exception exc){} 
                 
                
               }
            
       
             
             battle_filed.setLayout(new BorderLayout());
             container_for_day_allign.setLayout( new BorderLayout());
             mnth_with_year_container.setLayout(new BorderLayout());
             
             container_for_day_allign.addComponent(BorderLayout.NORTH,week_container);
             container_for_day_allign.addComponent(BorderLayout.CENTER,date_day_container); 
          //   container_for_day_allign.addComponent(BorderLayout.SOUTH,Gragorian);
         //    Gragorian.setText("4, DECEMBER , 1948");
             
           //  battle_filed.addComponent(lst);
          //
             YEAR.addComponent(tt);YEAR.addComponent(Gragorian) ;
              //battle_filed.addComponent(YEAR);
       //      mnth_with_year_container.addComponent(BorderLayout.NORTH,YEAR);
             mnth_with_year_container.addComponent(BorderLayout.CENTER,mnth_container);
                        //   battle_filed.addComponent(mnth_container);
             
       //     battle_filed.addComponent(BorderLayout.CENTER,week_container); 
             
             mnth_with_year_container.addComponent(BorderLayout.NORTH,YEAR);
             
            
             battle_filed.addComponent(BorderLayout.CENTER,container_for_day_allign);// battle_filed.addComponent(b1);
             battle_filed.addComponent(BorderLayout.NORTH,mnth_with_year_container);
             //container_for_day_allign.addComponent(BorderLayout.SOUTH,Gragorian);
             
             
         //  battle_filed.repaint();
        //   battle_filed.setFocused(b);   
             
             
             battle_filed.setFocused(tt);
             
             battle_filed.show();
            
            
        
    }
    
    
    
    
    public void pauseApp() 
    {
      
    }
    
    public void destroyApp(boolean unconditional) 
    {
    }

    public void run() 
    {
        
    }

    public void actionPerformed(ActionEvent ae) 
    {
   
     ///   Button source = (Button) ae.getSource();
        
        
        
        
        
        
        
         
        
        
        
        
        
        
    }
    
public  String[] split(String original, String regex)
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

    private void CreateYear(int B_Year) 
    {
        
    boolean  leap_year;
        
        int Grag_yr = B_Year+593;
        
                if((Grag_yr+1)%400==0)      {leap_year=true;}
           else if((Grag_yr+1)%100==0)      {leap_year=false;}  
           else if((Grag_yr+1)%4==0)        {leap_year=true;}
           else                             {leap_year=false;}
        
               
             i=0;
        
           for(int m=0;m<=11;m++)
            {
            
                if((m==10) && (leap_year) )
                {
                    bangla_month[m]=new BDMonth();
                    bangla_month[m].Create(31, (m+1), i , Grag_yr);
                    
                    i=i+1;
                }
                
                else{  bangla_month[m]=new BDMonth(); bangla_month[m].Create(day_of_mnth[i], (m+1), i , Grag_yr);}
              
            
            
            }
        
        
        
      return;
      
      
        
        
    }


   
}



