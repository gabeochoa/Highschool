
/**
 * Calculates the average of a certain amount of numbers
 * 
 * @author (Gabriel Oochoa 
 * @version (a version number or a date)
 */
import java.util.*;

public class AvgofRand
{
    public static int nt,sum,rand,x;
    public static double avg;
    public static void main(){
        System.out.println("Calculates the average of a certain amount of numbers");
        System.out.println("\nEnter amount of numbers:");
        nt = ei.i();
        average();
    }
    public static void average(){
    
        Random r = new Random();
        while (x<nt){
        rand = r.nextInt(100);
        System.out.println(rand);
        sum = rand + sum;
        x++;
    }
    
        avg = sum/nt;
         System.out.println("Your average is "+avg);
    }
}
