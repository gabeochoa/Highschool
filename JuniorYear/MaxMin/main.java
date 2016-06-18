
/**
 * @author Gabriel Ochoa
 * @version 1.0

 *  - Create a class called MaxMin
                        - create three integer variables (num1, num2, num3)
                        - have the user input three values
                        - using if else statements find the maximum value out 
                          of the three numbers (store in max)
                        - find the minimum value (store in min)
                        - output the maximum and minimum value
 * */
public class main
{ 
    public static void main(){
       System.out.println("Enter 3 numbers:");
       int a = ei.i();
       int b = ei.i();
       int c = ei.i();
        Min(a,b,c);
        Max(a,b,c);
    }
    public static void Min(int a,int b,int c){
       
       if(a<b && a<c)
            System.out.println(a +" is the min");
       else if (b<a && b<c)
            System.out.println(b + " is the min");
       else if (c<a && c<b)
            System.out.println(c + " is the min");
       else
            System.out.println("");
  }    
  public static void Max(int a,int b,int c){
       
       if(a>b && a>c)
            System.out.println(a +" is the max");
       else if (b>a && b>c)
            System.out.println(b + " is the max");
       else if (c>a && c>b)
            System.out.println(c + " is the max");
       else
            System.out.println("");
  } 
}
