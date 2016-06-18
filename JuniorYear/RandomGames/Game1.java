
/**
 * Write a description of class Game1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
public class Game1
{
    

public static int r;
public static int ftime = 1;
public static int g=1;
 
public static void main(){ 
    while(ftime == 1)
    {
        int r = randomnums();
        System.out.println("Guess a number between 1-100");
        ftime = 0;
    }
    int a = ei.i();
     right(a);
    }
 public static void right(int a){
        if (a<r){
        
       System.out.println("Too Low!");
       System.out.println("You Lose.");
        }
     else if (a>r){
        
       System.out.println("Too High!"); 
       System.out.println("You Lose.");
        }
        
        else if (a==r){
        
       System.out.println("Correct!");  
       System.out.println("You got it in "+g+" tries");
    } 
    else{System.out.println("WTF!");}
}
  
 public static int randomnums(){
    
     Random generator = new Random();
      r = generator.nextInt(10);
      return r;
    }
}
    