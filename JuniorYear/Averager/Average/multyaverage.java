
/**
 * Gabe Ochoa 
 * @version 1.2
 */

public class multyaverage
{

public static void main(){

System.out.println("Please enter your name");
String name = ei.s();

System.out.println("Please enter your class' name");
String genre = ei.s();

System.out.println("Please enter 5 grades");
int g1,g2,g3,g4,g5;
double average;

g1= ei.i();
g2= ei.i();
g3= ei.i();
g4= ei.i();
g5= ei.i();

average = (g1 + g2 + g3 + g4 + g5) /5.0;

System.out.println(name + " has an average of " + average);
if(average>= 64.5){
    if(average == 100.0){
           System.out.println("Perfect!");
    }
    else{
 System.out.println(" You have passed " + genre);
}
}
else{
System.out.println("You have failed " + genre);

}
}
}