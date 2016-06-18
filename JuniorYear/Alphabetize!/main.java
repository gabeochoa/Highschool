
/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class main
{
    public static String s1,s2,s3;
    public static void main()
    {
      System.out.println("This Program Alphabetizes 3 words");
      System.out.println("Enter First word");
        s1 = input();
      System.out.println("Enter Second word");
        s2= input();
      System.out.println("Enter Third word");
        s3 = input();
      System.out.println("Press Enter/Return to continue");
      String cont = input();
      compare();
    }
    public static void compare()
    {
        if((s1.compareToIgnoreCase(s2))<0)
        {
            if((s1.compareToIgnoreCase(s3))<0){s1first();}
            else{s1second();}
        }
        else
        {
            if((s1.compareToIgnoreCase(s3))>0){s1last();}
            else{s1second();}   
        }
    }
    public static void s1first()
    {
      if((s2.compareToIgnoreCase(s3))<0)
        {
           System.out.println("In Alphabetical Order:");
            System.out.println("1. "+s1);
             System.out.println("2. "+s2);
              System.out.println("3. "+s3);
        }
        else
        {
            System.out.println("In Alphabetical Order:");
             System.out.println("1. "+s1);
              System.out.println("2. "+s3);
               System.out.println("3. "+s2);
        }  
    }
    public static void s1second()
    {
     if((s2.compareToIgnoreCase(s3))<0)
        {
           System.out.println("In Alphabetical Order:");
            System.out.println("1. "+s2);
             System.out.println("2. "+s1);
              System.out.println("3. "+s3);
        }
        else
        {
           System.out.println("In Alphabetical Order:");
            System.out.println("1. "+s3);
             System.out.println("2. "+s1);
              System.out.println("3. "+s2);
        }     
    }
    public static void s1last()
    {
     if((s2.compareToIgnoreCase(s3))<0)
        {
           System.out.println("In Alphabetical Order:");
            System.out.println("1. "+s2);
             System.out.println("2. "+s3);
              System.out.println("3. "+s1);
        }
        else
        {
           System.out.println("In Alphabetical Order:");
            System.out.println("1. "+s3);
             System.out.println("2. "+s2);
              System.out.println("3. "+s1);
        }   
    }
    public static String input()
    {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        return input;
    }
}
