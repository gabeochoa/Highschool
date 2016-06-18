
/**
 * Write a description of class simpletoCode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class CodedWords
{   public static String trans="",Let;
    public static int place = 0,x=0;
    public static void main()
    {
        System.out.println("1. To Code \n2. From Code");
        //Scanner s = new Scanner(System.in);
       // String menu = s.nextLine();
        int loop = 1;
        while(loop == 1){
            Scanner s = new Scanner(System.in);
            String menu = s.nextLine();
         if((menu == "1")||(menu.equalsIgnoreCase("To")))
            {
                blue();
                loop=0;
            }
         else if((menu == "2")||(menu.equalsIgnoreCase("From")))
            {
                red();
                loop=0;
            }
         else
         {
            System.out.println("\n You Didn't choose something on the list");
         }
        }
    }
    public static void blue()
    {
        System.out.println("Enter text: ");
        Scanner s = new Scanner(System.in);
        Let = s.nextLine();
        String uplet = Let.toUpperCase();
        int len = uplet.length();
        while(x<len){
            //String letter = translate(uplet);
            char letteru = uplet.charAt(place);
            String letter = translate(letteru);
            System.out.println(letteru +" = "+letter);
            trans = new StringBuffer(trans).insert(place,letter).toString();
            place++;
            x++;
        }
        System.out.println(trans);
    }
    public static String translate(char h1)
    {
       String l = " ";
       int loop = 1;
       while(loop == 1){
       if(h1 == 'A'){l="H";loop=0;}
       else if(h1 == 'B'){l="I";loop=0;}
       else if(h1 == 'C'){l="J";loop=0;}
       else if(h1 == 'D'){l="K";loop=0;}
       else if(h1 == 'E'){l="L";loop=0;}
       else if(h1 == 'F'){l="M";loop=0;}
       else if(h1 == 'G'){l="N";loop=0;}
       else if(h1 == 'H'){l="O";loop=0;}
       else if(h1 == 'I'){l="P";loop=0;}
       else if(h1 == 'J'){l="Q";loop=0;}
       else if(h1 == 'K'){l="R";loop=0;}
       else if(h1 == 'L'){l="S";loop=0;}
       else if(h1 == 'M'){l="T";loop=0;}
       else if(h1 == 'N'){l="U";loop=0;}
       else if(h1 == 'O'){l="V";loop=0;}
       else if(h1 == 'P'){l="W";loop=0;}
       else if(h1 == 'Q'){l="X";loop=0;}
       else if(h1 == 'R'){l="Y";loop=0;}
       else if(h1 == 'S'){l="Z";loop=0;}
       else if(h1 == 'T'){l="A";loop=0;}
       else if(h1 == 'U'){l="B";loop=0;}
       else if(h1 == 'V'){l="C";loop=0;}
       else if(h1 == 'W'){l="D";loop=0;}
       else if(h1 == 'X'){l="E";loop=0;}
       else if(h1 == 'Y'){l="F";loop=0;}
       else if(h1 == 'Z'){l="G";loop=0;}
       else              {l=" ";loop=0;}
      } 
      
       return l;
    }
    public static void red()
    {
     System.out.println("Enter coded text: ");
        Scanner s = new Scanner(System.in);
        Let = s.nextLine();
        String uplet = Let.toUpperCase();
        int len = uplet.length();
        while(x<len){
        //String letter = translate(uplet);
        char letteru = uplet.charAt(place);
        String letter = fromCode(letteru);
        System.out.println(letteru +" = "+letter);
        trans = new StringBuffer(trans).insert(place,letter).toString();
        place++;
        x++;
        }
        System.out.println(trans);   
    }
    public static String fromCode(char h1)
    {
       String l = " ";
       int loop = 1;
       while(loop == 1){
       if(h1 == 'H'){l="A";loop=0;}
       else if(h1 == 'I'){l="B";loop=0;}
       else if(h1 == 'J'){l="C";loop=0;}
       else if(h1 == 'K'){l="D";loop=0;}
       else if(h1 == 'L'){l="E";loop=0;}
       else if(h1 == 'M'){l="F";loop=0;}
       else if(h1 == 'N'){l="G";loop=0;}
       else if(h1 == 'O'){l="H";loop=0;}
       else if(h1 == 'P'){l="I";loop=0;}
       else if(h1 == 'Q'){l="J";loop=0;}
       else if(h1 == 'R'){l="K";loop=0;}
       else if(h1 == 'S'){l="L";loop=0;}
       else if(h1 == 'T'){l="M";loop=0;}
       else if(h1 == 'U'){l="N";loop=0;}
       else if(h1 == 'V'){l="O";loop=0;}
       else if(h1 == 'W'){l="P";loop=0;}
       else if(h1 == 'X'){l="Q";loop=0;}
       else if(h1 == 'Y'){l="R";loop=0;}
       else if(h1 == 'Z'){l="S";loop=0;}
       else if(h1 == 'A'){l="T";loop=0;}
       else if(h1 == 'B'){l="U";loop=0;}
       else if(h1 == 'C'){l="V";loop=0;}
       else if(h1 == 'D'){l="W";loop=0;}
       else if(h1 == 'E'){l="X";loop=0;}
       else if(h1 == 'F'){l="Y";loop=0;}
       else if(h1 == 'G'){l="Z";loop=0;}
       else if(h1 == ' '){l=" ";loop=0;}
      }
      
       return l;
    }
}
