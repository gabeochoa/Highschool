/**
 * 
 * 
 * @author Gabriel Ochoa 
 * @version September 22, 2010
 */
public class Average
{// Start Average
    public static void main()
    {
        System.out.println("How many grades do you want to enter?");
        int num = ei.i();
        
        if(num == 3){ avg3();}
         if(num == 4){}
          if(num == 5){}
        
 
    }//End main()
    public static void avg3(){
    
        int g1 = ei.i();
        int g2 = ei.i();
        int g3 = ei.i();
        double avg = (g1 + g2 + g3)/3.0;
        System.out.println("Your average is " + avg);
        if(avg==100){String lettergrade = "A+"}
        System.out.println("and your letter grade is " + lettergrade);
            }
    }        
}//End Average