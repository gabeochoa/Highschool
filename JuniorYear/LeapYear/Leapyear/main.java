
/**
 * Leap Year
 * 
 * @author Gabriel Ochoa 
 * @version 1.0
 */
public class main
{
  public static void enter(){
    
    int yearinput;
    System.out.println("Enter year: ");
    yearinput = ei.i();
    if(yearinput <= 1582 ){
        System.out.println("Error: input less than 1582");}
        else{         
    calculate(yearinput);
}
    }
  public static void calculate(int yearinput){
    
    if((yearinput % 4) == 0){ 
        String isit = "Yes, " + yearinput + " is a leap year";
        output(isit);
    }
      else{
        String isit = "No, " + yearinput + " is a not leap year";
         output(isit);
        }
    }
  public static void output(String isit){
            
      System.out.println(isit);}
}
