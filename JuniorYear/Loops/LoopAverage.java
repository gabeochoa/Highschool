/**INTRODUCTION TO LOOPS
 * 
 * Loops allow us to repeat 
 * the execution of code without
 * rewriting it over again.
 * 
 * Types of Loops we will be working with
 *     - while loop
 *     - for loop
 * Both of these loops will tell the computer
 * to repeat code as long as a boolean condition
 * is true.
 * 
 * We need to make sure we avoid infinite loops
 * or loops that never end.
 * 
 * @author Mr. Cleary 
 * @version October 6, 2010
 */
public class LoopAverage
{// Start Average
    public static void whileaverage()
    {
        //This program will ask the user how
        //many grades they want to average
        //and then allow the user to input those
        //grades and calculate the average
        
        System.out.println("How many grades do you have?");
        int numGrade = ei.i();//store the number of grades
        
        int count = 0;//count will keep track of how many times
                      //we go through our loop 
        
        double sum = 0;//the sum variable will store the sum              
                       //of all grades entered  
        //start the while loop
        while(count < numGrade)
        {
            System.out.println("Enter a grade");
            double grade = ei.d();
            sum = sum + grade;
           System.out.println(sum);
           count = count + 1;
       }//end loop
       
    }//End whileaverage()
}//End Average