
/**
 * Write a description of class Part2 here.
 * 
 * @author Gabriel Ochoa 
 * @version  1.0
 */
public class Part2
{
   public static int numsp,place=0,x;
   public static String trans;
   public static void main()
   {
       System.out.println("Enter a sentence this program will count the spaces in the sentence");
       String str = ei.s();
       int len = str.length();
       String uplet = str.toUpperCase();
       while(x<len){
            //String letter = translate(uplet);
            char letteru = uplet.charAt(place);
            int letter = translate(letteru);
            place++;
            x++;
        }
        System.out.println("the number of spaces is "+numsp);
        menu();
    }
    public static int translate(char h1)
    {
       int l=0;
       int loop = 1;
       while(loop == 1){
           if(h1 == ' '){numsp++;loop=0;}
          else {numsp+=0;loop=0;}
      } 
      
       return l;
    }
    public static void menu()
    {
        System.out.println("\n\nTry Again?");
        int loop = 1;
        while (loop==1){
         String choice = ei.s();
        if(choice.equalsIgnoreCase("yes")){loop=2;main();}
        else if(choice.equalsIgnoreCase("no")){loop=2;}
        else{System.out.println("You didn't enter 'yes' or 'no'!\n");}
       }
        
    }
   } 
