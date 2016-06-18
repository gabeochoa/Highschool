
/**
 * This program will display
 * My name and the date the program 
 * was written
 * 
 * @author Gabe Ochoa
 * @version September 13 - 14, 2010
 */

import java.util.Scanner;

public class MyName{
    public static void main(String args[]) {
        String nam = new Scanner(System.in);
        String name = "Gabe";
        String date = "September 14, 2010";
        
       System.out.println("Your name is " + name); 
       System.out.println("The date is " + date);  
    }//end main
}//end MyName    