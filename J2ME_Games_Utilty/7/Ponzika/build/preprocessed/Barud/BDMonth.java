/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Barud;

import java.util.Calendar;
import java.util.TimeZone;

/**
 *
 * @author User
 */

public class BDMonth
{

    Day [] d; 
    int total_day,serial,Greg_serial,first_week_day,yr,bd_yr,greg_day; 
    String Month_name,Greg_mName;
   
     String[]  week_day_name = {"SunDay","MonDay","TuesDay","WednesDay","ThursDay","FriDay","Saturday"}; 
    
    
    BDMonth()
    {
        
    }
    
    
void Create( int day_tot,int srl,int fwd,int year)
    {
        
         boolean leap_year;
       
         total_day=day_tot;
         
         this.serial=srl;
         this.first_week_day=fwd;
         this.yr=year;
         this.bd_yr=year-593;
         
           if((year+1)%400==0)     {leap_year=true;}
           else if((year+1)%100==0){leap_year=false;}  
           else if((year+1)%4==0)  {leap_year=true;}
           else                    {leap_year=false;}
        
           d=new Day[day_tot];
           
                   Calendar cal=Calendar.getInstance();
                   cal.setTimeZone(TimeZone.getTimeZone("GMT+06:00"));
                
           
           
       /*  
         for(int i=0;i<=(day_tot-1);i++)
         {
            d[i].B_day=(i+1); 
      
            d[i].week_day=((i+fwd)%7);
            
         }
        
         */
         
         switch(this.serial)
         {
         
             case 1:
             {
                 
                
                 
                 greg_day=14;
                 Greg_serial=4;
          
                 Greg_mName = "April";
                 
                            for(int i=0;i<=(day_tot-1);i++)
                                  {
                                        d[i]=new Day();
                                        d[i].B_day=(i+1);  
                                        
                                        d[i].grag_day=greg_day;
                                        d[i].Greg_month_serial=Greg_serial;
                                        d[i].Grag_month=Greg_mName;
                                        greg_day=greg_day+1;
                                        
                                        d[i].B_YEAR=this.bd_yr; d[i].Gr_YEAR=year;
                                       
                                        
                                        cal.set(Calendar.YEAR, year); 
                                        cal.set(Calendar.MONTH,Greg_serial-1);
                                        cal.set(Calendar.DAY_OF_MONTH, greg_day);
                 
                                      //  d[i].week_day_name=week_day_name[cal.get(Calendar.DAY_OF_WEEK)];
                  
                                    //    d[i].week_day=cal.get(cal.get(Calendar.DAY_OF_WEEK));
                                        
                                           
                                        
                                        
                                        if(greg_day>30)
                                        {
                                          greg_day=1;
                                          Greg_serial=Greg_serial+1;
                                          Greg_mName = "May";
                                          
                                        }
            
                                    }

                    break;
             
             }
                 
                     
             case 2:
             {
                 greg_day=15;
                 Greg_serial=5;
                 Greg_mName = "May";
                
                            for(int i=0;i<=(day_tot-1);i++)
                                  {
                                         d[i]=new Day();  
                                         d[i].B_day=(i+1);  
      
                                        d[i].grag_day=greg_day;
                                        d[i].Greg_month_serial=Greg_serial;
                                        d[i].Grag_month=Greg_mName;
                                        greg_day=greg_day+1;
                                        
                                        d[i].B_YEAR=this.bd_yr; d[i].Gr_YEAR=year;
                                        
                                        
                                          cal.set(Calendar.YEAR, year); 
                                          cal.set(Calendar.MONTH,Greg_serial-1);
                                          cal.set(Calendar.DAY_OF_MONTH, greg_day);
                 
                                      //  d[i].week_day_name=week_day_name[cal.get(Calendar.DAY_OF_WEEK)];
                  
                                     //  d[i].week_day=cal.get(cal.get(Calendar.DAY_OF_WEEK));
                                        
                                        
                                        
                                        
                                        if(greg_day>31)
                                        {
                                          greg_day=1;
                                           Greg_serial=Greg_serial+1;
                                           Greg_mName = "June";
                                        }
            
                                    }

                    break;
             
             }     
                 
                 
             case 3:
             {
                 greg_day=15;
                 Greg_serial=6;
                 Greg_mName = "June";
              
                            for(int i=0;i<=(day_tot-1);i++)
                                  {
                                         d[i]=new Day();  
                                         d[i].B_day=(i+1);  
      
                                        d[i].grag_day=greg_day;
                                        d[i].Greg_month_serial=Greg_serial; 
                                        d[i].Grag_month=Greg_mName;
                                        greg_day=greg_day+1;
           
                                        d[i].B_YEAR=this.bd_yr; d[i].Gr_YEAR=year;
                                        
                                        
                                        
                                        if(greg_day>30)
                                        {
                                          greg_day=1;
                                          Greg_serial=Greg_serial+1;
                                           Greg_mName = "July";
                                        }
            
                                    }

                    break;
             
             }
                 
                 
               case 4:
             {
                 greg_day=16;
                 Greg_serial=7;
                 Greg_mName = "July";
                 
                 
                 
                 
                 
                            for(int i=0;i<=(day_tot-1);i++)
                                  {
                                      
                                        d[i]=new Day();
                                        d[i].B_day=(i+1);  
      
                                        d[i].grag_day=greg_day;
                                        d[i].Greg_month_serial=Greg_serial; 
                                        d[i].Grag_month=Greg_mName;
                                        greg_day=greg_day+1;
            
                                        d[i].B_YEAR=this.bd_yr; d[i].Gr_YEAR=year;
                                        
                                        if(greg_day>31)
                                        {
                                          greg_day=1;
                                          Greg_serial=Greg_serial+1;
                                           Greg_mName = "August";
                                        }
            
                                    }

                    break;
             
             }  
                 
              case 5:
             {
                 greg_day=16;
                 Greg_serial=8;
                 Greg_mName = "August";
                 
                            for(int i=0;i<=(day_tot-1);i++)
                                  {
                                        d[i]=new Day();
                                        d[i].B_day=(i+1);  
      
                                        d[i].grag_day=greg_day;
                                        d[i].Greg_month_serial=Greg_serial; 
                                        d[i].Grag_month=Greg_mName;
                                        greg_day=greg_day+1;
                                        
                                        d[i].B_YEAR=this.bd_yr; d[i].Gr_YEAR=year;
            
                                        if(greg_day>31)
                                        {
                                          greg_day=1;
                                          Greg_serial=Greg_serial+1;
                                           Greg_mName = "September";
                                        }
            
                                    }

                    break;
             
             } 
         
                  
                  
                  
                case 6:
             {
                 greg_day=16;
                 Greg_serial=9;
               Greg_mName = "September";
                            for(int i=0;i<=(day_tot-1);i++)
                                  {
                                        d[i]=new Day();
                                        d[i].B_day=(i+1);  
      
                                        d[i].grag_day=greg_day;
                                        d[i].Greg_month_serial=Greg_serial; 
                                        d[i].Grag_month=Greg_mName;
                                        greg_day=greg_day+1;
          
                                        d[i].B_YEAR=this.bd_yr; d[i].Gr_YEAR=year;
                                        
                                        if(greg_day>30)
                                        {
                                          greg_day=1;
                                          Greg_serial=Greg_serial+1;
                                           Greg_mName = "October";
                                        }
            
                                    }

                    break;
             
             } 
         
                    
             case 7:
             {
                 greg_day=16;
                 Greg_serial=10;
                 Greg_mName = "October";
               
                            for(int i=0;i<=(day_tot-1);i++)
                                  {  
                                        d[i]=new Day();
                                        d[i].B_day=(i+1);  
      
                                        d[i].grag_day=greg_day;
                                        d[i].Greg_month_serial=Greg_serial;
                                        d[i].Grag_month=Greg_mName;
                                        greg_day=greg_day+1;
            
                                        d[i].B_YEAR=this.bd_yr; d[i].Gr_YEAR=year;
                                        
                                        if(greg_day>31)
                                        {
                                          greg_day=1;
                                          Greg_serial=Greg_serial+1;
                                           Greg_mName = "November";
                                        }
            
                                    }

                    break;
             
             }         
              
             case 8:
             {
                 greg_day=15;
                 Greg_serial=11;
                 Greg_mName = "November";
               
                            for(int i=0;i<=(day_tot-1);i++)
                                  {
                                          d[i]=new Day();
                                          d[i].B_day=(i+1);  
      
                                        d[i].grag_day=greg_day;
                                        d[i].Greg_month_serial=Greg_serial; 
                                        d[i].Grag_month=Greg_mName;
                                        greg_day=greg_day+1;
            
                                        d[i].B_YEAR=this.bd_yr; d[i].Gr_YEAR=year;
                                        
                                        if(greg_day>30)
                                        {
                                          greg_day=1;
                                          Greg_serial=Greg_serial+1;
                                            Greg_mName = "December";
                                        }
            
                                    }

                    break;
             
             } 
                   
                 
             case 9:
             {
                 greg_day=15;
                 Greg_serial=12;
                 Greg_mName = "December";
               
                            for(int i=0;i<=(day_tot-1);i++)
                                  {
                                      d[i]=new Day();
                                      
                                        d[i].B_day=(i+1);  
      
                                        d[i].grag_day=greg_day;
                                        d[i].Greg_month_serial=Greg_serial;
                                        d[i].Grag_month=Greg_mName;
                                        greg_day=greg_day+1;
            
                                          d[i].B_YEAR=this.bd_yr; d[i].Gr_YEAR=year;
                                        
                                        if(greg_day>31)
                                        {
                                          greg_day=1;
                                          Greg_serial=1;
                                          Greg_mName = "January";

                                         year=year+1;
                                          
                                        }
            
                                    }

                    break;
             
             }        
              
              case 10:
             {
                 greg_day=14;
                 Greg_serial=1;
                  Greg_mName = "January";

                            for(int i=0;i<=(day_tot-1);i++)
                                  {
                                          d[i]=new Day();
                                          d[i].B_day=(i+1);  
      
                                        d[i].grag_day=greg_day;
                                        d[i].Greg_month_serial=Greg_serial; 
                                        d[i].Grag_month=Greg_mName;
                                        
                                           
                                        d[i].B_YEAR=this.bd_yr; d[i].Gr_YEAR=year+1;
                                        
                                        greg_day=greg_day+1;
            
                                        if(greg_day>31)
                                        {
                                          greg_day=1;
                                          Greg_serial=Greg_serial+1;
                                          
                                          Greg_mName = "February";

                                          
                                        }
            
                                    }

                    break;
             
             }           
                 
             case 11:
             {
                 greg_day=13;
                 Greg_serial=2;
                 Greg_mName = "February";

                            for(int i=0;i<=(day_tot-1);i++)
                                  {
                                          d[i]=new Day();
                                          d[i].B_day=(i+1);  
      
                                        d[i].grag_day=greg_day;
                                        d[i].Greg_month_serial=Greg_serial; 
                                        d[i].Grag_month=Greg_mName;
                                        greg_day=greg_day+1;
                                        
                                         d[i].B_YEAR=bd_yr; d[i].Gr_YEAR=year+1;
            
                                        if(!(leap_year) && (greg_day>28) )
                                        { 
                                            greg_day=1; Greg_serial=Greg_serial+1;
                                            Greg_mName = "March";
                                        }
            
                                        else if((leap_year) && (greg_day>29))
                                        {  
                                            greg_day=1;
                                            Greg_serial=Greg_serial+1;
                                            Greg_mName = "March";

                                        }
                                        
                                        
                                        
                                    }

                    break;
             
             }     
               
           case 12:
             {
                 greg_day=15;
                 Greg_serial=3;
                 Greg_mName = "March";

                            for(int i=0;i<=(29);i++)
                                  {
                                          d[i]=new Day();
                                          d[i].B_day=(i+1);  
      
                                        d[i].grag_day=greg_day;
                                        d[i].Greg_month_serial=Greg_serial; 
                                        d[i].Grag_month=Greg_mName;
                                        greg_day=greg_day+1;
            
                                         d[i].B_YEAR=this.bd_yr; d[i].Gr_YEAR=year+1;
                                        
                                        if(greg_day>31)
                                        {
                                          greg_day=1;
                                          Greg_serial=Greg_serial+1;
                                          Greg_mName = "April";

                                        }
            
                                    }

                    break;
             
             }  
                 
                 
                    
                    
         }
         
      
         
         
    }
    
    void setBDate(String wd,String d,String m,String y)
    {
      
     return;
    
    }
   
  /*  
    String  getWeekDay(){ return this.wday; }  
    String  getDay(){  return this.day;  } 
    String  getMonth(){ return this.month; }
    String  getYear(){ return this.year; }
*/


}
