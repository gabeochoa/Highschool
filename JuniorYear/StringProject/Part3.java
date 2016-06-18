
/**
 * Write a description of class Part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.StringTokenizer;
public class Part3
{
   public static int numsp,place=0,pl=0,x,secondsp,firstsp,letcount = 0;
   public static String trans,s1,word,s2;
   public static void main()
   {
        System.out.println("Enter a string?");
        //'They went to the concert and found it most cool' is my test
        // it should end up as 'to the concert and found it'
            s1 = ei.s();
            s2 = s1;
            actualmain();
        }
   public static void actualmain()
   {            
               // Split string into words
               StringTokenizer st = new StringTokenizer(s2);
               while (st.hasMoreTokens()) 
               {
                   word =(st.nextToken());
                   if(word.length() == 4)
                   {
                      s2 = s2.replace(word,"");
                      System.out.println(s2);  
                    }
                   else{System.out.println(s2);} 
                }
               System.out.println("\n\n\n\n"+s1+"\n Has been turned into \n"+s2);
               //find a 4 letter word
       
               //take it out with sub string
               //redo util out of words 
               //put together sentence
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
