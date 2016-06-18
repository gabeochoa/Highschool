/**
 * This class will be an introduction to the 
 * Random Class which we will use to generate 
 * Random Numbers.
 * 
 *
 * Random Class Method:
 * Random()
 * .nextInt()
 *   
 * @author Gabriel Ochoa
 * @version October 21, 2008
 */
import java.util.*;
public class RandomNumbers
{
    public static String mname;
    public static int x,month,a;
    public static void main()
    {
       System.out.println("How many random months?");
      x = ei.i();
      randmonths(x);
    }
    public static void randmonths(int x){
        System.out.println("Here are some random months");
       while( a<x){ 
        Random generator = new Random(); //creates a Random Number generator
                                // object called generator
       month = generator.nextInt(12)+1;// Choses a number between -12 and 12 then adds 1
       
       if(month == 1){
                mname = "January";
            }
  else{ if(month == 2){
                mname = "Febuary";
            }
  else{ if(month == 3){
                mname = "March";
            }
  else{ if(month == 4){
                mname = "April";
            }
  else{ if(month == 5){
                mname = "May";
            }
  else{ if(month == 6){
                mname = "June";
            }
  else{ if(month == 7){
                mname = "July";
            }
  else{ if(month == 8){
                mname = "August";
            }
  else{ if(month == 9){
                mname = "September";
            }
  else{ if(month == 10){
                mname = "October";
            }
  else{ if(month == 11){
                mname = "November";
            }
  else{ if(month == 12){
                mname = "December";
            }
  else{}
}}}}}}}}}}}
        a++;
       System.out.println("The month is "+mname);
        
        
    
    }}
}