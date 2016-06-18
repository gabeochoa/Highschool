
/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Random;
public  class main
{

public static int r;
public static int ftime = 1;
 
public static void main(){ 
    int r = randomnums();
    while(ftime == 1)
    {
        System.out.println("Guess a number between 1-100");
        ftime = 0;
    }
    int a = ei.i();
     right(a);
    }
 public static void right(int a){
        if (a<r){
        
       System.out.println("Too Low!");main();
         g++;
        }
     else if (a>r){
        
       System.out.println("Too High!"); main();
         
        }
        
        else{
             if (a==r){
        
       System.out.println("Correct!");  
        }
    } }
    }
 public static int randomnums(){
    
     Random generator = new Random();
      r = generator.nextInt(100);
      return r;
    }
    }
