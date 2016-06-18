
/**
 * Write a description of class randgen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class randgen
{
   public static int main()
   {
        Random rand = new Random();
        int r = rand.nextInt(12)+1;
        return r;
    }
}
