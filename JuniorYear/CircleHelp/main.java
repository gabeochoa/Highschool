
/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class main
{
  public static void main(){
        
        int count = 0;
        while(count>5)
        {
            if(count % 5 == 0)
            {
                System.out.println("The remainder when "+count+" is divided by 5 equals 0");
                System.out.println("Therefore "+count+" is a multiple of 5");
            }
            count++;
        }
    }
}
