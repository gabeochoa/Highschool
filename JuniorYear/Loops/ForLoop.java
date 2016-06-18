
/**
 * Write a description of class ForLoop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ForLoop
{
    public static void foraverage()
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
        for (int number = 1; number <= numGrade; number++) {
           
           System.out.println("Enter a grade");
            double grade = ei.d();
            sum = sum + grade;
           System.out.println(sum);
        }//end for loop
        double avg=(sum)/numGrade;
      System.out.println("Your average is " + avg);
}}
