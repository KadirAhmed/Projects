/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hello;
import com.sun.lwuit.*;
import com.sun.lwuit.events.*;
import j2me_math.Formatted;
import j2me_math.MathEvaluator;
import j2me_math.Real;

/**
 *
 * @author Ahmed
 */
public class Plot  implements ActionListener
  {

     protected Form Trace;
     public Display d1;

     double x_unit=1 ,  y_unit=1;
     double x_count=1,  y_count=1;
     int xx,yy ,x_limit,yy_limit;

     String function, replaced_x ; MathEvaluator f_y;
     Formatted f;

      Form  cal_sci;

     public void startPlot(Form sci_cal) {

     // Display.init(this);
     //d1=Display.getInstance();

         cal_sci=sci_cal;

     f= new Formatted();

         Trace = new Form("Trace")

         {
            private double domain1,domain2,range1, rang2;

            public void keyReleased(int key)
            {

                switch(key )
                 {

                     case -1:
                     {

                         y_count+=.1;
                         Real y_power= new Real("10");
                         y_power.pow(new Real(y_count+""));
                         y_unit= Double.parseDouble(y_power.toString());
                         this.repaint();
                         break;

                     }

                     case -2:
                     {
                         y_count+=-.1;
                         Real y_power= new Real("10");
                         y_power.pow(new Real(y_count+""));
                         y_unit= Double.parseDouble(y_power.toString());
                         this.repaint();
                         break;

                     }

                     case -3:
                     {
                         x_count+=.1;
                         Real x_power= new Real("10");
                         x_power.pow(new Real(x_count+""));
                         x_unit= Double.parseDouble(x_power.toString());
                         this.repaint();
                         break;

                     }


                     case -4:
                     {

                         x_count+=-.1;
                         Real x_power= new Real("10");
                         x_power.pow(new Real(x_count+""));
                         x_unit= Double.parseDouble(x_power.toString());
                         this.repaint();
                         break;

                     }

                    case -5:
                    {

                    cal_sci.show();
                       
                    }


                 }

            }

         public void paint(Graphics g)
         {

              g.setColor(25);

        //   g.fillRect(10,30,50,70);
             g.drawLine(this.getWidth()/2,0, this.getWidth()/2,this.getHeight() ); // x-axis
             g.drawLine(0,this.getHeight()/2, this.getWidth(),this.getHeight()/2 ); // x-axis
        //     g.drawString( "ggg", this.getWidth()/2,20 );



              for(xx=0; xx<=getWidth();xx+=10) { g.drawRect(xx, this.getHeight()/2, 0,5); }


               for(yy=0; yy<=getHeight();yy+=10){ g.drawRect( this.getWidth()/2,yy, 5,0); }
           
// g.drawString(this.getWidth()+"<w "+"h>"+this.getHeight(),120,160);

   int V_x,V_y;


   //Font fnt = null ; fnt.create("Tohoma");g.setFont(fnt);



//Font fnt=g.getFont().createSystemFont(g.getFont()., V_y, V_y);



    g.drawString( "unit x="+x_unit,3,2 );
    g.drawString( "unit y="+y_unit,3,20 );
    g.drawString( "-120",0,this.getHeight()/2+5 );
    g.drawString( "+120",this.getWidth()-35,this.getHeight()/2+5 );


    
                //  g.scale(0,0);

                for(int x=-120; x<=120; x+=1 )

                {

                    try{
                  
                      domain1 = x*x_unit; replaced_x = f.replace(function,"x",( "("+ domain1+")"));
                      
                       f_y.setExpression(replaced_x);

                       Real Y1=new Real(f_y.getValue().doubleValue() *  y_unit+"");
                      
                      domain2 = (x+1)*x_unit; replaced_x = f.replace(function,"x",("("+domain2+")"));
                      f_y.setExpression(replaced_x);

                      Real Y2=new Real(f_y.getValue().doubleValue()*y_unit+"");

                    //Real Y1=new Real(""+Math.sin(Math.toRadians(x*x_unit))*y_unit );

                


               // X1.acos();

                //  Real Y2=new Real(""+Math.sin(Math.toRadians((x+1)*x_unit))*y_unit );
                    // X2.ln();
                      

                       int  y1= (int) ( Y1.toInteger() );
                       int  y2= (int) ( Y2.toInteger() );

               

                       g.drawLine(( x+this.getWidth()/2 ),  ( this.getHeight()/2- y1),
                       x+1+this.getWidth()/2,( this.getHeight()/2- y2));

                    }

                    catch(Exception ex)
                    {

                    }

                }
                    }

         };



      Trace.show();

    }

       void setFunction(String func)

       {

         this.function=func;

         return;

       }



    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }

    public void actionPerformed(ActionEvent ae) {


        cal_sci.show();


    }

}

