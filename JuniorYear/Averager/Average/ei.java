import java.io.*;
import java.lang.*;
/**
 * This is class Ei
 * 
 * By RK 
 * It makes input fun and easy
 * 
 * */
public class ei
{

    public static String s()
    {
    BufferedReader stdin;
    stdin = new BufferedReader(new InputStreamReader(System.in));
    String responce = "hold";
    System.out.print(": ");
    try
    {
    responce = stdin.readLine();
    }
    catch(Exception e)
    {
        System.out.println("error");
    }    
    
    return responce;
    }
    
    
    

    public static int i()
    {
    BufferedReader stdin;
    stdin = new BufferedReader(new InputStreamReader(System.in));
    int i = 0;
    //System.out.print("enter your grade: ");
    System.out.print(": ");
    try
    {
    i = Integer.parseInt(stdin.readLine());
    }
    catch(Exception e)
    {
        System.out.println("error");
    }    
    
    return i;
    }
    
    
    public static double d()
    {
    int go = 1;
    double number = 0;
    BufferedReader stdin;
    stdin = new BufferedReader(new InputStreamReader(System.in));
    String responce = "hold";
    //System.out.print("enter your double: ");
    try
    {
    responce = stdin.readLine();
    }
    catch(Exception e)
    {
        System.out.println("error");
    }    
    
   
   
    int decimalPoint = responce.indexOf(".");
    
  
    if (decimalPoint == 0)
        {
            String Back = responce.substring(decimalPoint+1);
            int length = Back.length();
            int B = Integer.parseInt(Back);
            number = ((double)B/(Math.pow(10,length)));
         }
   else
   {
       
       if (decimalPoint == -1)    
            {
                int A = Integer.parseInt(responce);
                number = A;  
                 
            }
         
        else
        {
            if (decimalPoint != -1)
            {
            String Front = responce.substring(0,decimalPoint);
            String Back = responce.substring(decimalPoint+1);
            int length = Back.length();
    
            int A = Integer.parseInt(Front);
            int B = Integer.parseInt(Back);
     
            number = A + ((double)B/(Math.pow(10,length)));
        
             }
       } 
   }   
return number;    
    
}
}