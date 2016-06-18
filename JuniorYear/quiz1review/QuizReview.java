/**
 * This program is a study guide for the test on 10/25/07.
 * Be sure you can understand all the code in this program
 * 
 * @author Mr. Cleary 
 * @version October 4, 2010
 * 
 */
public class QuizReview
{
    public static void main()
    {
       //Change the values of the variables below
       //to see what happens to the output  
        
        int x = 16;
        int y = 3;
        int z;
        
        double a = 2.5;
        double b = 6.3;
        double d = 2.0;
        double c;
        
        //VARIABLE REVIEW      
        
        //z = (x * b);
        //System.out.println(z);
        c = y * a;
        System.out.println(c);
        z = (int) (x/b);
        System.out.println(z);
        z = x % y;//returns the remainder
        System.out.println(z);
        c = x/d;
        System.out.println(c);
        z = x/y;
        System.out.println(z);
        c = y + b;
        System.out.println(c);
        
        
        
        //****************************************************************
        
        //Change the value of the variables to see different results
        //also, change the conditional statements to see what happens
        
        int m = 10;
        int n = 15;
        int r = -8;
        
        if(m <= n)
        {    System.out.println("Yes!");
        }else{
            System.out.println("No!");
        }    
     
     
       
       if(r < m)
       {     if(r < n)
             {   System.out.println("Blue");
            }else{
                System.out.println("Red"); 
        }
       }else{
            if(m > n)
            {    System.out.println("Yellow");
            }else{
                System.out.println("Green");
            } 
     }
     
     if(( m > n) || (n < r))
     {
         System.out.println("The or statement is true");
        }else{
            System.out.println("The or statement is false");
        }
   
         if(( m > n) && (r < m))
     {
         System.out.println("The AND statement is true");
        }else{
            System.out.println("The AND statement is false");
        }
    }
    //*********************************************************************
   
//Write the SAT PROGRAM BELOW
   /*
    * Write a program that will input the users SAT Score and out put the following.  USE IF – ELSE Structure.

    *   if(score is between 200 and 300)
    *   S.O.P(“Your score is in the low range”);

    *   if(score is between 301and 400 )
    *   S.O.P(“Your score is in the medium low range”);
    *   if(score is between 401 and 600)
    *   S.O.P(“Your score is in the middle range”);

    *   if(score is between 601 and 700)
    *   S.O.P(“ Your score is in the middle to high range”);

    *   if (score is greater than 700)
    *   S.O.P(“Your score was in the high range”);
*/
  
   }//end main
}//end Class












