
/**
 * Read in program discription.
 * 
 * @author Gabriel Ochoa 
 * @version 3.0.1
 */
import java.math.*;

public class QuadMain
{ 
    //Clears BlueJ's Terminal window
    private static void clearScreen() {
      System.out.print("\u000C");
    }
    
    public static String cont = "yes";
    public static String str0 = "dont exit";
  
    public static void main(){
      
        while(cont.equalsIgnoreCase("yes")){ 
          input();
          System.out.println("");
          System.out.println("");
      
          System.out.println("\nEnter more equations?");
          cont = ei.s();
      if(cont.equalsIgnoreCase("yes")){
          System.out.println("Will Clear BlueJ's Terminal window.\nContinue?");
          String stillcont = ei.s();
          if(stillcont.equalsIgnoreCase("yes")){
              clearScreen();
              main();
    }
    }
    else{ if(cont.equalsIgnoreCase("no")){
            System.out.println("\nClear Screen?");
            String clear = ei.s();
            if(clear.equalsIgnoreCase("yes")){
                clearScreen();
            }
         }
    }
    }
    }
  public static void input(){
      String cont = "yes";
      String str0 = "dont exit";
      
      System.out.println("This computes the quadratic formula." +
                            "\nIt works for quadratic equations in the Standard Form: Ax^2 + Bx + C = 0" +
                            "\nUsing this equation: ");
      System.out.println("\n    -b ± SQRT(b^2 - 4ac)");
      System.out.println("x = ------------------- ");
      System.out.println("            2a");
      
      System.out.println("\nIt even determines if the roots are imaginary.\n");
      double a = 0;
     while(a==0){
      
      System.out.println("Enter a: ");
      a = ei.i(); 
      if(a==0){System.out.println("\nx will equal NaN and (-)Infinity if x=0. \nTry Again.\n");}
    }
       
      System.out.println("\nEnter b: ");
      double b = ei.i();
      
      System.out.println("\nEnter c: ");
      double c = ei.i();
     
      while(str0.equalsIgnoreCase("dont exit")){
      
      System.out.println("\nShow the work or not?");
      String work = ei.s();
      
      
      if(work.equalsIgnoreCase("no")){
        nowork(a,b,c);
        str0 = "exit";
    }
    else{
      if(work.equalsIgnoreCase("yes")){
        math(a,b,c);
        str0 = "exit";
    }
    else{System.out.println("\nYou didn't enter 'yes' or 'no'");}
    }
    }
    }
  public static void math(double a, double b, double c){
      System.out.println("    -b ± SQRT(b^2 - 4ac)");
      System.out.println("x = ------------------- ");
      System.out.println("            2a");
      
      System.out.println("");
      System.out.println("");
      
      System.out.println("    -(" +b+") ± SQRT("+ b +"^2 - 4(" + a + ")(" +c + ")");
      System.out.println("x = ------------------- ");
      System.out.println("            2(" + a + ")");
      
      System.out.println("");
      System.out.println("");
      
      double bsq = b*b;
      double forac = 4 * a * c;
      double atwo = a * 2;
      System.out.println("    -" +b+" ± SQRT("+ bsq+ "-" + forac+")");
      System.out.println("x = ------------------- ");
      System.out.println("           "+ atwo);
      
      System.out.println("");
      System.out.println("");
      
      double sr = bsq - forac;
      double bneg = b * -1;
      System.out.println("    "+bneg+" ± SQRT("+sr+")");
      System.out.println("x = ------------------- ");
      System.out.println("           "+ atwo);
      
      System.out.println("");
      System.out.println("");
      
      if (sr < 0){neginsideradical(sr,atwo,bneg);}
      else{
      double sqroot = Math.sqrt(sr);
      System.out.println("    "+bneg+" ± " + sqroot);
      System.out.println("x = ------------------- ");
      System.out.println("           "+ atwo);
      
      System.out.println("");
      System.out.println("");
      
      double numerpos = bneg + sqroot;
      double numerneg = bneg - sqroot;
      System.out.println("    "+ numerpos+" OR "+ numerneg+"");
      System.out.println("x = ------------------- ");
      System.out.println("           "+ atwo);
      
      System.out.println("");
      System.out.println("");
      
      double posans = numerpos / atwo;
      double negans = numerneg / atwo;
      System.out.println("x = "+posans+" and " +negans+".");
      
    }}
    public static void neginsideradical(double sr, double atwo, double bneg){
      System.out.println("\nYour roots are imaginary");
      
      double srimag = sr * -1;
      double sqrootimag = Math.sqrt(srimag);
      round(sqrootimag,bneg,srimag,atwo);
      
    }
    public static void round(double sqrootimag,double bneg,double srimag,double atwo){
        
      int ix = (int)(sqrootimag * 100.0);
      double bi = ((double)ix)/100.0; 
      double fabi = bneg/atwo;
      double sabi = bi/atwo;
      
      int in = (int)(sabi * 100.0);  
      double fans = ((double)in)/100.0;
      
      System.out.println(" ");
      System.out.println(" ");
      System.out.println("ans is "+  fabi+ " ± SQRT(-"
      +(srimag)+") /"+atwo+" \n \n or  "+fabi+" ± "+fans+ "i");
      if ((fabi== 0 )){
          System.out.println("\nYou may have entered the equation wrong!");}
     
    }
    public static void nowork(double a, double b, double c){
       double bsq = b*b;
      double forac = 4 * a * c;
      double atwo = a * 2;
      
      double sr = bsq - forac;
      double bneg = b * -1;
       if (sr < 0){neginsideradical(sr,atwo,bneg);}
      else{
      double sqroot = Math.sqrt(sr);
      double numerpos = bneg + sqroot;
      double numerneg = bneg - sqroot;
      double posans = numerpos / atwo;
      double negans = numerneg / atwo;
      
      int reg = (int)(posans * 100.0);  
      double preg = ((double)reg)/100.0;
      
        int negreg = (int)(negans * 100.0);  
      double nreg = ((double)negreg)/100.0;
      
      System.out.println("x = "+preg+" and " +nreg+".");
    }
}  
}
