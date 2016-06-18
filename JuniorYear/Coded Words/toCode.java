/**
* Write a description of class main here.
*
* @author (your name)
* @version (a version number or a date)
*/
import java.util.Scanner;
public class toCode
{   
    public static String trans;
    public static int place = -1;
    public static void blue()
    {
        System.out.println("Enter a string.");
        Scanner s = new Scanner(System.in);
        String Let = s.nextLine();
        toDecimal(Let);
    }
    public static void toDecimal(String str)
    {
        int i = str.length();
        int a = 0;
        int b = 1;
        int x;
        try
        {
          for(x=0; x<=i;x++)
          {
            System.out.println(str + i);
            String hexletter = str.substring(a,b); 
            String test = decode(hexletter);
            System.out.println(test);
            x+=1;
          }
        }
        catch (NumberFormatException nx) {
            System.out.println("phghcfjxzqewrsdt");
        }
    }
    public static String decode(String hl)
    {
       
        String letter = hexlet(hl);
        place+=1;
        trans = new StringBuffer(trans).insert(place,letter).toString();
        return trans;
    }
    public static String hexlet(String h1)
    {
       String l = " ";
       int loop = 1;
       while(loop == 1){
       if(h1 == "40"){}
       else if(h1 == "41"){l="A";loop=0;}
       else if(h1 == "42"){l="B";loop=0;}
       else if(h1 == "43"){l="C";loop=0;}
       else if(h1 == "44"){l="D";loop=0;}
       else if(h1 == "45"){l="E";loop=0;}
       else if(h1 == "46"){l="F";loop=0;}
       else if(h1 == "47"){l="G";loop=0;}
       else if(h1 == "48"){l="H";loop=0;}
       else if(h1 == "49"){l="I";loop=0;}
       else if(h1 == "4A"){l="J";loop=0;}
       else if(h1 == "4B"){l="K";loop=0;}
       else if(h1 == "4C"){l="L";loop=0;}
       else if(h1 == "4D"){l="M";loop=0;}
       else if(h1 == "4E"){l="N";loop=0;}
       else if(h1 == "4F"){l="O";loop=0;}
       else if(h1 == "50"){l="P";loop=0;}
       else if(h1 == "51"){l="Q";loop=0;}
       else if(h1 == "52"){l="R";loop=0;}
       else if(h1 == "53"){l="S";loop=0;}
       else if(h1 == "54"){l="T";loop=0;}
       else if(h1 == "55"){l="U";loop=0;}
       else if(h1 == "56"){l="V";loop=0;}
       else if(h1 == "57"){l="W";loop=0;}
       else if(h1 == "58"){l="X";loop=0;}
       else if(h1 == "59"){l="Y";loop=0;}
       else if(h1 == "5A"){l="Z";loop=0;}
       else if(h1 == "5B"){l="[";loop=0;}
       else if(h1 == "5C"){l="'\'";loop=0;}
       else if(h1 == "5D"){l="]";loop=0;}
       else if(h1 == "5E"){l="^";loop=0;}
       else if(h1 == "5F"){l="_";loop=0;}
       else if(h1 == "60"){l="'";loop=0;}
       else if(h1 == "61"){l="a";loop=0;}
       else if(h1 == "62"){l="b";loop=0;}
       else if(h1 == "63"){}
       else if(h1 == "64"){}
       else if(h1 == "65"){}
       else if(h1 == "66"){}
       else if(h1 == "67"){}
       else if(h1 == "68"){}
       else if(h1 == "69"){}
       else if(h1 == "6A"){}
       else if(h1 == "6B"){}
       else if(h1 == "6C"){}
       else if(h1 == "6D"){}
      } 
       return l;
    }
}