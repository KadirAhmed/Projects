
package hello;

import com.sun.lwuit.geom.Dimension;

import javax.microedition.midlet.*;
import com.sun.lwuit.*;
import com.sun.lwuit.Button;
import com.sun.lwuit.TextArea;
import com.sun.lwuit.animations.*;
import com.sun.lwuit.events.*;
import com.sun.lwuit.layouts.GridLayout;
import com.sun.lwuit.plaf.UIManager;
import com.sun.lwuit.util.Resources;
import j2me_math.Formatted;
import j2me_math.MathEvaluator;
import java.util.Vector;

public class SCIENTIFIC_CALCULATOR extends MIDlet implements ActionListener,Runnable
{
  private Form mFirstForm, mSecondForm;
  TextArea  x;TextArea result; 
  Container text,angle,button, rslt,graph, expssn_scrol,grid[],brac;


   String Selected_button_string = null;

   Container Super;

   Vector v;

   String Last_ans=null;
   int left,right,position=-1, Lpos=0,Rpos=0;
   
    private RadioButton rad;
    private RadioButton deg;
    private RadioButton grad;
    //private RadioButton none;
     private Button button_PI;


    private ButtonGroup BtnGrp;
    private Button button_remove;
    private Button button_sin;
    private Button button_cos;
    private Button button_acos;
    private Button button_tan;
    private Button button_asin;
    private Button button_atan;
    private Button button_sinh;
    private Button button_cosh;
    private Button button_tanh;
    private Button button_power;
    private Button button_Log;
    private Button button_fact;
    private Button button_Ln;
    private Button button_aLn;
    private Button button_aLog;
    private Button button_plus;
    private Button button_L_brac;
    private Button button_minus;
    private Button button_R_brac;
    private Button button_mult;
    private Button button_divid;
    private Button button_0;
    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_4;
    private Button button_5;
    private Button button_6;
    private Button button_9;
    private Button button_7;
    private Button button_8;
    private Button button_point;
   // private Button button_equal;
     private Button button_all_clear;
       private Button button_ans;
 //   private Button button_graph;

     private Button Trace,X,Exit;

    private MathEvaluator me;
    private String focused;
    private Button button_Lshift;
    private Button button_Rshift;
    private Dimension d;
    private Plot plot;
    private Container last_shape;

    
   public void startApp()

 {

     if (mFirstForm == null)
   {

         Display.init(this);

try
 {
   
    //  Resources r = Resources.open("/ron.res");
  // Resources r = Resources.open("/ron_black.res");

     Resources r = Resources.open("/walton.res");
     UIManager.getInstance().setThemeProps(r.getTheme(r.getThemeResourceNames()[0]));

   

 }

catch (java.io.IOException e)
{
}


       v= new Vector(); 
       me= new MathEvaluator();
       plot = new Plot();
       mFirstForm = new Form("")

       {  
           public void keyReleased(int key)

           {

             switch(key)
             {

               case -1: { break;} case -2: { break;} case -3: { break;} case -4: { break;}

                 case -5: 
                 {

                     try
                     {
                        Button b=( Button )this.getFocused(); focused = b.getText().trim();

                      if(
                      (b.equals(button_sin))||(b.equals(button_cos)) ||(b.equals(button_tan)) ||
                      (b.equals(button_asin))||b.equals(button_acos)||b.equals(button_atan)||
                      (b.equals(button_sinh))||(b.equals(button_cosh))||(b.equals(button_tanh))||
                      (b.equals(button_Log))||(b.equals(button_Ln))||(b.equals(button_aLog))||
                      (b.equals(button_aLn))

                      )

                      {

                           insert(position, focused+"(");

                          // result.setText(Evaluated_result()); //



                      }

                          else if( (b.equals(button_power))){   insert(position, "^");}
                          else if( (b.equals(button_fact))) {   insert(position, "!");}

                         else if( (b.equals(button_Lshift))){  Left_shift();}
                         else if( (b.equals(button_Rshift))){  Right_shift();}
                         else if( (b.equals(button_remove))){  Remove();}

                          else if( (b.equals(rad))){ BtnGrp.setSelected(rad) ;result.setText( Evaluated_result() );}
                          else if( (b.equals(deg))){ BtnGrp.setSelected(deg); result.setText( Evaluated_result() ); }
                          else if( (b.equals(grad))){BtnGrp.setSelected(grad);result.setText( Evaluated_result() );}

                       //   else if( (b.equals(none))){BtnGrp.setSelected(none);result.setText( Evaluated_result() );}

                         else if( (b.equals(Trace)))
                         {
                           plot.setFunction( Function() );  plot.f_y= me;
                           //Form current = Display.getInstance().getCurrent();

                          plot.startPlot(mFirstForm);
                         }
                         else if( (b.equals(Exit))) {   }

                         else if( (b.equals(button_all_clear)))
                                 {
                                       result.setText("");
                                       v.removeAllElements();position =-1;
                                       Left_shift();

                                 }

                          else {   insert(position, focused); }// x.setText(x.getText()+focused);}

                     break;
                     }

                     catch(Exception EX)
                     {

                     }

                 }

                 default :
                  {
                  
                      if((""+( char ) key).equals("#"))
                      {
                       insert(position,"." );
                      }

                      else{ insert(position,""+( char ) key ); }

                      break;
                  }

             }
            
           }
       
       };
 
     //  mFirstForm.addFocusListener(this);

        grid = new Container[7];

       last_shape=  new Container(new GridLayout(1,3));
       brac  =  new Container(new GridLayout(1,2));

        for(int i=0; i<=5;i++)
        {

            grid[i]= new Container(new GridLayout(1,6));
           
              if(i==0)
              {
               grid[i]= new Container(new GridLayout(1,4));
                
              }

              if(i==5)
              {
               grid[i]= new Container(new GridLayout(1,2));
                
              }

        }



       text = new Container(new GridLayout(1,1));

     //  angle = new Container(new GridLayout(1,4));
   //   button = new Container(new GridLayout(8,4));

     expssn_scrol = new Container(new GridLayout(1,4));

      rslt= new Container(new GridLayout(3,1)); graph =new Container(new GridLayout(1,2));

      
       
       x= new TextArea();  x.setEditable(false);
       x.setColumns(50);   x.setRows(0);
       
       x.setFocusable(false);

       text.addComponent(x);
       rslt.addComponent(text);

       result= new TextArea(); result.setColumns(50); result.setEditable(false);//result.setSingleLineTextArea(true);
     
       result.setFocusable(false); //text.addComponent(result);
       
       Trace=new Button("         Trace");  X=new Button("              x");  //Exit=new Button(" Exit");
  //     graph.addComponent(X); graph.addComponent(Trace);//graph.addComponent(Exit);
           
       X.addActionListener(this);  Trace.addActionListener(this);  Trace.addActionListener(this);


       rslt.addComponent(result); // rslt.addComponent(graph);
      
        rad=new RadioButton("Rad");       rad.addActionListener(this);
        deg=new RadioButton("Deg");       deg.addActionListener(this);
        grad=new RadioButton("Grad");     grad.addActionListener(this);
       // none=new RadioButton("Default");  none.addActionListener(this);

        BtnGrp = new ButtonGroup();

       BtnGrp.add(rad); BtnGrp.add(deg); BtnGrp.add(grad);//BtnGrp.add(none);

        angle =new Container(new GridLayout(1,3));

       this.angle.addComponent(rad);  this.angle.addComponent(deg);  this.angle.addComponent(grad);

       rslt.addComponent(angle); //rslt.addComponent(graph);


      button_ans= new Button("        Ans ");  button_ans.addActionListener(this);
      button_PI = new Button("     pi ");   button_PI.addActionListener(this);

       button_remove = new Button("  remove"); button_remove.addActionListener(this);

       button_sin = new Button("      sin");   button_sin.addActionListener(this);
       button_cos = new Button("      cos");   button_cos.addActionListener(this);
       button_tan = new Button("      tan");   button_tan.addActionListener(this);

       button_asin = new Button("   asin"); button_asin.addActionListener(this);
       button_acos = new Button("   acos"); button_acos.addActionListener(this);
       button_atan = new Button("   atan"); button_atan.addActionListener(this);

       button_sinh = new Button("Sinh"); button_sinh.addActionListener(this);
       button_cosh = new Button("Cosh"); button_cosh.addActionListener(this);
       button_tanh = new Button("Tanh"); button_tanh.addActionListener(this);

       button_power = new Button("  x^n "); button_power.addActionListener(this);
       button_fact = new Button( "   n! ");  button_fact.addActionListener(this);

       button_Log = new Button("     log");   button_Log.addActionListener(this);
       button_Ln = new Button("      ln ");     button_Ln.addActionListener(this);

       button_L_brac = new Button("     (");   button_L_brac.addActionListener(this);
       button_R_brac = new Button("     )");   button_R_brac.addActionListener(this);


       button_aLog = new Button("   alog");  button_aLog.addActionListener(this);
       button_aLn = new Button("    aln");      button_aLn.addActionListener(this);

       button_plus =  new Button("     + ");    button_plus.addActionListener(this);
       button_minus = new Button("     - ");    button_minus.addActionListener(this);
       button_mult =  new Button("     * ");    button_mult.addActionListener(this);
       button_divid = new Button("     / ");    button_divid.addActionListener(this);
   
       button_0 = new Button("     0");         button_0.addActionListener(this);
       button_1 = new Button("     1");         button_1.addActionListener(this);
       button_2 = new Button("     2");         button_2.addActionListener(this);

       button_3 = new Button("     3");        button_3.addActionListener(this);
       button_4 = new Button("     4");         button_4.addActionListener(this);
       button_5 = new Button("     5 ");        button_5.addActionListener(this);

       button_6 = new Button("     6 ");       button_6.addActionListener(this);
       button_7 = new Button("     7 ");       button_7.addActionListener(this);
       button_8 = new Button("     8 ");       button_8.addActionListener(this);
       button_9 = new Button("     9 ");       button_9.addActionListener(this);

       button_point = new Button("                      .");      button_point.addActionListener(this);

       button_all_clear = new Button("     clear");      button_all_clear.addActionListener(this);

       button_Lshift = new Button("         <");     button_Lshift.addActionListener(this);

       button_Rshift = new Button("         >");     button_Rshift.addActionListener(this);

      //button.addComponent(rad); button.addComponent(deg); button.addComponent(grad);

  /*
      button.addComponent(button_0);



     // button.addComponent(button_remove);
      button.addComponent(button_sin);
      button.addComponent(button_cos);
      button.addComponent(button_tan);   button.addComponent(button_1);

      button.addComponent(button_asin);
      button.addComponent(button_acos);
      button.addComponent(button_atan);  button.addComponent(button_2);

      button.addComponent(button_sinh);
      button.addComponent(button_cosh);
      button.addComponent(button_tanh);  button.addComponent(button_3);
      button.addComponent(button_Log);
      button.addComponent(button_Ln);  button.addComponent(button_power);

      button.addComponent(button_4);


       button.addComponent(button_aLog);
       button.addComponent(button_aLn);button.addComponent(button_fact);   button.addComponent(button_5);

       button.addComponent(button_L_brac); button.addComponent(button_plus);button.addComponent(button_minus);

       button.addComponent(button_6);

       button.addComponent(button_R_brac);

       button.addComponent(button_mult);
       button.addComponent(button_divid);   button.addComponent(button_7);

      // button.addComponent(button_Lshift);
     //  button.addComponent(button_Rshift);
        button.addComponent(button_point);
        button.addComponent(button_8);

       button.addComponent(button_PI);
       button.addComponent(button_9);

        */

        this.expssn_scrol.addComponent(button_all_clear);
        this.expssn_scrol.addComponent(button_remove);
       // button.addComponent(button_all_clear);
      //  button.addComponent(button_remove);
        this.expssn_scrol.addComponent(button_Lshift);
        this.expssn_scrol.addComponent(button_Rshift);
     //
      

       
   //    button.addComponent(button_ans);
  //     button.addComponent(button_graph);


        brac.addComponent(this.button_L_brac); brac.addComponent(this.button_R_brac);

       grid[0].addComponent(button_sin); grid[0].addComponent(button_cos);
       grid[0].addComponent(button_tan); grid[0].addComponent(brac);
      

       grid[1].addComponent(button_asin); grid[1].addComponent(button_acos);
       grid[1].addComponent(button_atan); grid[1].addComponent(button_7);
       grid[1].addComponent(button_8);    grid[1].addComponent(button_9);

       grid[2].addComponent(button_sinh); grid[2].addComponent(button_cosh);
       grid[2].addComponent(button_tanh); grid[2].addComponent(button_4);
       grid[2].addComponent(button_5);    grid[2].addComponent(button_6);

       grid[3].addComponent(this.button_Log);    grid[3].addComponent(button_Ln);
       grid[3].addComponent(this.button_power);  grid[3].addComponent(button_1);
       grid[3].addComponent(button_2);           grid[3].addComponent(button_3);

       grid[4].addComponent(this.button_aLog); grid[4].addComponent(button_aLn);
       grid[4].addComponent(this.button_fact); grid[4].addComponent(button_0);
       grid[4].addComponent(button_plus);       grid[4].addComponent(button_minus);

/*
       grid[5].addComponent(this.button_L_brac); grid[5].addComponent(this.button_R_brac);
       grid[5].addComponent(this.button_PI); grid[5].addComponent(button_6);
    */

       grid[5].addComponent(this.button_point);
       //grid[6].addComponent(button_8);
      // grid[6].addComponent(button_9);

    last_shape.addComponent(this.button_PI); last_shape.addComponent(button_mult);
    
   last_shape.addComponent(button_divid);

         grid[5].addComponent(last_shape);


       rslt.addComponent(expssn_scrol);


            for(int g=0;g<=5;g++)
            {

               rslt.addComponent(grid[g]);
            }



       Super= new Container(); Super.setFocusable(false);
    
      //   d = mFirstForm.getPreferredSize();


      // Super.addComponent(text);
       
       
       Super.addComponent(rslt);//Super.addComponent(expssn_scrol);
     //  mFirstForm.addComponent(angle);
    //  Super.addComponent(button);


      mFirstForm.addComponent(Super);

/*
     button_sin.addActionListener((ActionListener) new ActionListener()
     {
            public void actionPerformed(ActionEvent evt)
            {
               button_sin_ActionPerformed(evt);

            }
        });

*/

      //mFirstForm.addComponent(button_cos);
     //    button_cos.addActionListener(this);

  // mFirstForm.setTransitionOutAnimator(CommonTransitions.createSlide(CommonTransitions.SLIDE_HORIZONTAL, false,200));

   mSecondForm = new Form("Second Form");

      Button button2 = new Button("Switch");
      mSecondForm.addComponent(button2);
    button2.addActionListener(this);

      mSecondForm.setTransitionOutAnimator(
        CommonTransitions.createSlide(
          CommonTransitions.SLIDE_HORIZONTAL, true, 200));

           
            mFirstForm.show();

       new Thread(this).start();

     }

Left_shift();

 }

 public void pauseApp()
    {

    }

    public void destroyApp(boolean unconditional) {}

/*
public void actionPerformed(ActionEvent ae)
{
     Form current = Display.getInstance().getCurrent();
     if (current == mFirstForm) {

        Display.init(this);

      mSecondForm.show();
     } else if (current == mSecondForm) {
      //
       Display.init(this);
         
         mFirstForm.show();
     }
    }

*/

public void actionPerformed(ActionEvent ae)
{

    if(ae.getSource()==this.button_0) { this.insert(position, "0");}
    else if(ae.getSource()==this.button_1){this.insert(position, "1"); }
    else if(ae.getSource()==this.button_2) {  this.insert(position, "2"); }
   
    else if(ae.getSource()==this.button_3) { this.insert(position, "3"); }
    else if(ae.getSource()==this.button_4) { this.insert(position, "4"); }
    else if(ae.getSource()==this.button_5) { this.insert(position, "5"); }

    else if(ae.getSource()==this.button_6) { this.insert(position, "6"); }
    else if(ae.getSource()==this.button_7) { this.insert(position, "7"); }
    else if(ae.getSource()==this.button_8) { this.insert(position, "8"); }
    else if(ae.getSource()==this.button_9) { this.insert(position, "9"); }

    else if(ae.getSource()==this.button_L_brac) { this.insert(position, "("); }
    else if(ae.getSource()==this.button_Ln)     {  this.insert(position, "ln(");  }
    else if(ae.getSource()==this.button_Log) {  this.insert(position, "log("); }
    else if(ae.getSource()==this.button_R_brac) { this.insert(position, ")"); }
    else if(ae.getSource()==this.button_aLn) { this.insert(position, "aln("); }

    else if(ae.getSource()==this.button_aLog) { this.insert(position, "alog("); }
    else if(ae.getSource()==this.button_acos) {  this.insert(position, "acos("); }

     else if(ae.getSource()==this.rad) {  result.setText( Evaluated_result() );}
     else if(ae.getSource()==this.deg) {  result.setText( Evaluated_result() );}
     else if(ae.getSource()==this.grad) { result.setText( Evaluated_result() );}
     else if(ae.getSource()==this.button_PI) { this.insert(position, "pi"); }
    

    else if(ae.getSource()==this.button_Lshift)
    {
        Left_shift();
    }

    else if(ae.getSource()==this.button_asin) { this.insert(position, "asin("); }

    else if(ae.getSource()==this.button_atan) {  this.insert(position, "atan("); }

    else if(ae.getSource()==this.button_remove)

    {
        Remove();
    }

    else if(ae.getSource()==this.button_cos) {  this.insert(position, "cos("); }
    else if(ae.getSource()==this.button_cosh) { this.insert(position, "Cosh("); }
    else if(ae.getSource()==this.button_divid) { this.insert(position, "/"); }

    else if(ae.getSource()==this.button_all_clear)
    {
        
            result.setText("");
            v.removeAllElements();position =-1; Left_shift();


    }

    else if(ae.getSource()==this.button_fact) {  this.insert(position, "!"); }

    else if(ae.getSource()==this.button_Rshift)
    {

       Right_shift();

    }

    else if(ae.getSource()==this.button_minus) {  this.insert(position, "-"); }

    else if(ae.getSource()==this.button_mult) {  this.insert(position, "*"); }
    else if(ae.getSource()==this.button_plus) { this.insert(position, "+"); }
    else if(ae.getSource()==this.button_point) {  this.insert(position, ".");}
    else if(ae.getSource()==this.button_power) {  this.insert(position, "^"); }
    else if(ae.getSource()==this.button_sin) {  this.insert(position, "sin("); }

    else if(ae.getSource()==this.button_sinh) {  this.insert(position, "Sinh("); }
    else if(ae.getSource()==this.button_tan)  {  this.insert(position, "tan("); }
    else if(ae.getSource()==this.button_tanh) { this.insert(position, "Tanh("); }


     else if(ae.getSource()==this.X) {  this.insert(position, "x"); }
     else if(ae.getSource()==this.Exit) {  this.destroyApp(true); this.notifyDestroyed(); }



      else if(ae.getSource()==this.Trace) 
      {

        plot.setFunction( Function() );  plot.f_y= me;
       //Form current = Display.getInstance().getCurrent();

            plot.startPlot(mFirstForm);

      }
    
    else if(ae.getSource()==this.Exit) 
    
    {

      

    }


 }

    public void run()
    {

        try

        {
           mFirstForm.setPreferredSize(d);

        }
        catch(Exception EX)
        {

        }

    }

    public String Evaluated_result()
    {

       Formatted f= new Formatted();

        switch(this.BtnGrp.getSelectedIndex())
        {
            case -1: { me.d=true; me.g=false; me.r=false; break; }
            case  0: { me.d=false;me.g=false; me.r=true; break;  }
            case  1: { me.d=true; me.g=false; me.r=false; break; }
            case  2: { me.d=false;me.g=true;  me.r=false; break; }
            case  3: { me.d=true; me.g=false; me.r=false; break; }

            default: { me.d=true; me.g=false; me.r=false; break; }

        }

       // me.setExpression(x.getText());


      String  rplc=f.replace(x.getText(), "acos", "one");

      rplc=f.replace(rplc, "asin", "two");
      rplc=f.replace(rplc, "atan", "three");
      rplc=f.replace(rplc, "aln",  "four");
      rplc=f.replace(rplc, "alog", "five");

      rplc=f.replace(rplc, "pi", "(3.1415926535897932384626433832795)");

      rplc=f.replace(rplc, "|", "");
      

       me.setExpression(rplc);

   //    result.setText(me.getValue()+"");

       if((me.getValue()+"").equals("null")) { return "Invalid input";}
     

       else{  return (me.getValue()+""); }

    }

    public String Function()
            
    {
    
          Formatted f= new Formatted();

        switch(this.BtnGrp.getSelectedIndex())
        {
            case -1: { me.d=true; me.g=false; me.r=false; break; }
            case  0: { me.d=false;me.g=false; me.r=true; break;  }
            case  1: { me.d=true; me.g=false; me.r=false; break; }
            case  2: { me.d=false;me.g=true;  me.r=false; break; }
            case  3: { me.d=true; me.g=false; me.r=false; break; }

            default: { me.d=true; me.g=false; me.r=false; break; }

        }

       // me.setExpression(x.getText());


      String  rplc=f.replace(x.getText(), "acos", "one");

      rplc=f.replace(rplc, "asin", "two");
      rplc=f.replace(rplc, "atan", "three");
      rplc=f.replace(rplc, "aln",  "four");
      rplc=f.replace(rplc, "alog", "five");

       rplc=f.replace(rplc, "pi", "(3.1415926535897932384626433832795)");

      rplc=f.replace(rplc, "|", "");
      

      // me.setExpression(rplc);

   //    result.setText(me.getValue()+"");

 
        return rplc;
    
     
    
    }



    private void scrolString(Vector v, int position)
    {


     if(position>=0 && position<=v.size())
     {

         v.insertElementAt("|",position);

     }


    }


     void Right_shift()
     {

        v.removeElement("|");
        position +=1;

        if(position==v.size()+1) {position=0;}

        scrolString(v,position);

        String Str = "";

        for(int i=0;i<=v.size()-1;i+=1)
        {
          //  Str+=v.get(i);

            Str+= (String) v.elementAt(i);


        }

        this.x.setText( Str );

     }



    void Left_shift()

    {
        v.removeElement("|");

        position -=1;

        if(position==-1||position==-2) {position=v.size();}

        scrolString(v,position);

        String Str = "";

        for(int i=0;i<=v.size()-1;i+=1)
        {
            Str+= (String) v.elementAt(i);
        }

        this.x.setText( Str );

    }


    void Remove()

    {

       try
      {

     //.....   v.remove(position-1);
        v.removeElementAt(position-1);

        position-=1;

      //   scrolString(v, position);

        String Str = "";

        for(int i=0;i<=v.size()-1;i+=1)
        {
            Str+=(String) v.elementAt(i);
        }

         this.x.setText( Str);

        result.setText(Evaluated_result());

      }

      catch(Exception ex)
      {

      }

    }

    void insert(int pos, String op)

    {

          try
      {

       v.removeElementAt(position);
       v.insertElementAt( op,pos);

        position+=1;

         scrolString(v, position);

        String Str = "";

        for(int i=0;i<=v.size()-1;i+=1)
        {
            Str+= (String) v.elementAt(i);
        }

         this.x.setText( Str);

           result.setText(Evaluated_result()); //

      }

      catch(Exception ex)
      {

      }

    }

}


