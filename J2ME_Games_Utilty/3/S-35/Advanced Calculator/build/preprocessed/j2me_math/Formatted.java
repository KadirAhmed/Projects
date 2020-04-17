

package j2me_math;


import java.util.Vector;

/**
 *
 * @author Ron
 */
public class Formatted

{

    String formatted_decimal="0";
    String Formatted_value="";

    public Formatted()
    {

    }

    public String GetFormatted(String Decimal)
    {

     formatted_decimal = Decimal;
     String integer_part=null, fraction_part="";

      if(formatted_decimal.indexOf("E")==-1)
      {

       Formatted_value= formatted_decimal;

      }

       else
       {
            if(Double.parseDouble(formatted_decimal)<1)
            {

                 String e[] = this.split(formatted_decimal,"E");

               // int n = Integer.parseInt(e[1], 10);

                int power = Math.abs(Integer.parseInt(e[1], 10));

                String temp[] = this.split(e[0],".");

                integer_part = temp[0]; fraction_part=temp[1];


                               String joint = ".";

                              for(int i=1;i<=power-integer_part.length();i++)
                                {

                                        joint+="0";

                                 }

                              Formatted_value =  joint +integer_part+ fraction_part;


            }

            else
            {

                String e[] = this.split(formatted_decimal,"E");

                int power = Math.abs(Integer.parseInt(e[1], 10));

                String temp[] = this.split(e[0],".");

                integer_part = temp[0]; fraction_part=temp[1];



                      if(power<integer_part.length() &&  Integer.parseInt(e[1], 10) < 0 )
                      {


                          int diff = integer_part.length()-power;

                           String f1=  integer_part.substring(0, diff)+".";
                           String f2= temp[0].substring(diff,integer_part.length() );

                       //    String evaluated = f1+f2+ fraction_part;


                           Formatted_value = f1+f2+ fraction_part;

                      }

                     else if (Integer.parseInt(e[1], 10) > 0 && fraction_part.length()<=power)
                      {

                         String joint = "";

                                             for(int i=1;i<=power-fraction_part.length();i++)
                                                  {
                                                    joint+="0";
                                                  }


                         Formatted_value = integer_part+fraction_part+joint;


                      }

                      else if (Integer.parseInt(e[1], 10) > 0 && fraction_part.length()>power)
                      {


                          int diff = power;

                           String f1= fraction_part.substring(0, diff)+".";
                           String f2= temp[1].substring(diff,fraction_part.length() );

                        Formatted_value = integer_part+f1+f2;

                      }


            }

       }
  return  Formatted_value;
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


public String replace(String _text, String _searchStr, String _replacementStr)
{
// String buffer to store str
StringBuffer sb = new StringBuffer();

// Search for search
int searchStringPos = _text.indexOf(_searchStr);
int startPos = 0;
int searchStringLength = _searchStr.length();

// Iterate to add string
                   
                     while (searchStringPos != -1)

                     {
                       sb.append(_text.substring(startPos, searchStringPos)).append(_replacementStr);
                       startPos = searchStringPos + searchStringLength;
                       searchStringPos = _text.indexOf(_searchStr, startPos);
                     }

// Create string
sb.append(_text.substring(startPos,_text.length()));

return sb.toString();

}

}

