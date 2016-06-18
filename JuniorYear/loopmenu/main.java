
/**
 * //This program will input 3 numbers from 
       //the user and allow them to choose to calculate
       //Mean, Median, Max, Min
 * 
 * @author Gabriel Ochoa 
 * @version 1.3
 */
public class main
{
     //Clears BlueJ's Terminal window
    private static void clearScreen(String main) {
      if(main.equalsIgnoreCase("yes")){main();}
      else{
      System.out.print("\u000C");}
    }
    static double a,b,c,sum,med,low,high,median,ans;
    private static String loop = "yes";
    
    //This program will input 3 numbers from 
       //the user and allow them to choose to calculate
       //Mean, Median, Max, Min
       
    public static void main(){
        System.out.println("\nThis program will allow you to choose an option to calculate \nand then the user will input 3 numbers");
          System.out.println("\nMean, Median, Max, Min\nWhat Do You want to do?\n");
        while(loop.equalsIgnoreCase("yes")){ 
          System.out.println("\n1.Mean\n2.Median\n3.Max\n4.Min\n");
          String cont = ei.s();
         if(cont.equalsIgnoreCase("1")||cont.equalsIgnoreCase("Mean")){loop="exit"; Mean();}
     else if(cont.equalsIgnoreCase("2")||cont.equalsIgnoreCase("Median")){ loop="exit";Median();}
     else if(cont.equalsIgnoreCase("3")||cont.equalsIgnoreCase("Max")){ loop="exit";Max();}
     else if(cont.equalsIgnoreCase("4")||cont.equalsIgnoreCase("Min")){ loop="exit";Min();}
     else{System.out.println("\nYou didn't Choose an item on the menu.\n");}
    }
}
    public static void Mean(){
      System.out.println("\na * b * c /3.0= ?");
      System.out.println("\nEnter a:");
      a = ei.i();
      System.out.println("\nEnter b:");
      b = ei.i();
       System.out.println("\nEnter c:");
      c = ei.i();
      
      sum = (a*b*c);
      ans = (sum/3.0);
      System.out.println("\n"+a+" * "+b+" *"+c+" /3.0 = "+ans);
      System.out.println("\nor "+sum+" /3.0 = "+ans);
      
      tryagain();
    }
    public static void Median(){
      System.out.println("\nDetermines which is the median.");
      System.out.println("\nEnter a:");
      a = ei.i();
      System.out.println("\nEnter b:");
      b = ei.i();
      System.out.println("\nEnter c:");
      c = ei.i();
      
     if ( ((a>b) && (a<c)||(a>c) && (a<b)) ){
         median = a;}
     else if( ((b>a) && (b<c)||(b>c) && (b<a)) ){
         median = b;}
     else if( ((c>a) && (c<b)||(c>b) && (c<a)) ){
         median = c;}
     else{}    
      System.out.println("\n"+median+" is the median");
      
      tryagain();
    }
    public static void Max(){
      System.out.println("\n Checks which out of a.b. or c is the biggest\n");
      System.out.println("\nEnter a:");
      a = ei.i();
      System.out.println("\nEnter b:");
      b = ei.i();
      System.out.println("\nEnter c:");
      c = ei.i();
     
      if(a>b && a>c){high = a;}
      else if (b>c && b>a){high = b;}
      else if (c>a && c>b){
               high = c;
             if(a>b){
                 med = a; low = b; } else if(b>a){med = b; low = a;}}
      else {System.out.println("\nSomething must have gone wrong!\n");}
      
      System.out.println("\n"+high+"is bigger than "+med+" and "+low);
      
      tryagain();
    }
    public static void Min(){
      System.out.println("\n Checks which out of a.b. or c is the biggest\n");
      System.out.println("\nEnter a:");
      a = ei.i();
      System.out.println("\nEnter b:");
      b = ei.i();
      System.out.println("\nEnter c:");
      c = ei.i();
     
      if(a>b && a>c){high = a;}
      else if (b>c && b>a){high = b;}
      else if (c>a && c>b){
               high = c;
             if(a>b){
                 med = a; low = b; } else if(b>a){med = b; low = a;}}
      else {System.out.println("\nSomething must have gone wrong!\n");}
      
      System.out.println("\n"+low+"is smaller than "+med+" and "+high);
      
      tryagain();
    }
    public static void tryagain(){
      System.out.println("\nTry again.\n Will clear BlueJ's terminal window?");
            String trya = ei.s();
            if(trya.equalsIgnoreCase("yes")){
                clearScreen("yes");
                
            }
            else { System.out.println("\nClear Screen?");
             String clear = ei.s();
            if(clear.equalsIgnoreCase("yes")){
                clearScreen("no");
            }
            else{}
    }
}
}
