
/**
 * Write a description of class main here.
 * 
 * @author Gabriel Ochoa 
 * @version 1.3
 */
public class main
{
    public static void main(){
    double avg;
    
    System.out.println("How many numbers are you averaging? ");
    int hm = input.i();
    
     
    if(hm==1){avg1();}
  else{
    if(hm==2){avg2();}
  else{
    if(hm==3){avg3();}
  else{
    if(hm==4){avg4();}
  else{
    if(hm==5){avg5();}}
    }
    } 
}
}
    public static void avg1(){
    double avg;
    System.out.println("Enter number 1: ");
    int g1 = input.i();
    avg = (g1)/1.0;
    System.out.println("Your average is an "+ avg);
    lgrade(avg);
    }
    public static void avg2(){
    double avg;
    System.out.println("Enter number 1: ");
    int g1 = input.i();
    System.out.println("Enter number 2: ");
    int g2 = input.i();
    avg = (g1 + g2)/2.0;
    System.out.println("Your average is an "+ avg);
    lgrade(avg);
    }
    public static void avg3(){
    double avg;
    System.out.println("Enter number 1: ");
    int g1 = input.i();
    System.out.println("Enter number 2: ");
    int g2 = input.i();
    System.out.println("Enter number 3: ");
    int g3 = input.i();
    avg = (g1 + g2 + g3)/3.0;
    System.out.println("Your average is an "+ avg);
    lgrade(avg);
    }
    
    
     public static void avg4(){
    double avg;
    System.out.println("Enter number 1: ");
    int g1 = input.i();
    System.out.println("Enter number 2: ");
    int g2 = input.i();
    System.out.println("Enter number 3: ");
    int g3 = input.i();
    System.out.println("Enter number 4: ");
    int g4 = input.i();
    avg = (g1 + g2 + g3 + g4)/4.0;
    System.out.println("Your average is an "+ avg);
    lgrade(avg);
    }
    
    
     public static void avg5(){
    double avg;
    System.out.println("Enter number 1: ");
    int g1 = input.i();
    System.out.println("Enter number 2: ");
    int g2 = input.i();
    System.out.println("Enter number 3: ");
    int g3 = input.i();
    System.out.println("Enter number 4: ");
    int g4 = input.i();
    System.out.println("Enter number 5: ");
    int g5 = input.i();
    avg = (g1 + g2 + g3 + g4 + g5)/5.0;
    System.out.println("Your average is an "+ avg);
    lgrade(avg);
    }
    
    
    public static void lgrade(double avg){
    String letgrade;
    
        if(avg<=55){ System.out.println("or an F");  }
else{
      if(avg<72 && avg>55){ System.out.println("or a D");}
else{ 
      if(avg<82 && avg>71){ System.out.println("or a C");  }
else{
      if(avg<92 && avg>81){ System.out.println("or a B");}
else{ 
      if(avg<100 && avg>91){ System.out.println("or an A");  }
else{
      if(avg>=100){ System.out.println("or an A+");  }
    }
    }
    }      
    }  
    }
}
}



//120 lines of code
