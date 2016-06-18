
/**
 * Read README file first
 * @author Gabriel Ochoa
 * @version (a version number or a date)
 */
public class CircleHelp
{
    public static String menu = "yes";
    final static double pi = 3.14159;
    public static String ftime = "yes";
  
    public static void CircleHelp(){
        while(ftime.equalsIgnoreCase("yes")){
            System.out.println("This Program can do these operations:");
            System.out.println("Area, Circumference, Volume");
            System.out.println("With a sub menu that does the volume of: Cylinder, Cone, Sphere");
            System.out.println("And a Quit feature"+"\n\n");
            ftime = "no";
        }
        
        System.out.println("\nWhat Would You Like To Do?");
         menu = "yes";
        while(menu.equalsIgnoreCase("yes")){
          System.out.println("\n1.Area\n2.Circumfrence\n3.Volume\n4.Quit\n");
          String cont = ei.s();
         if(cont.equalsIgnoreCase("1")||cont.equalsIgnoreCase("Area")){menu="exit"; Area();}
        else if(cont.equalsIgnoreCase("2")||cont.equalsIgnoreCase("Circumfrence")){ menu="exit";Circumfrence();}
        else if(cont.equalsIgnoreCase("3")||cont.equalsIgnoreCase("Volume")){ menu="exit";Volume();}
        else if(cont.equalsIgnoreCase("3")||cont.equalsIgnoreCase("Quit")){ menu="exit";Quit();}
        else {System.out.println("\nYou didn't Choose an item on the menu.\n");}
       }
    }
    public static void Area(){
       System.out.println("Enter the radius:");
       double radius = ei.d();
       double rsq = radius * radius;
       double area = pi * (radius *radius);
       System.out.println("Your area was "+area+" or "+rsq+"pi");
       menu= "yes";
       while(menu.equalsIgnoreCase("yes")){
          System.out.println("\n1.Go Back\n2.Quit\n");
          String cont = ei.s();
         if(cont.equalsIgnoreCase("1")||cont.equalsIgnoreCase("Go Back")){menu="exit"; CircleHelp();}
        else if(cont.equalsIgnoreCase("2")||cont.equalsIgnoreCase("Quit")){ menu="exit";Quit();}
        else {System.out.println("\nYou didn't Choose an item on the menu.\n");}
    }   
    }
    public static void Circumfrence(){
        System.out.println("Computes Circumfrence using 2(pi)radius");
        System.out.println("Enter your radius:");
        double radius = ei.d();
        double twor = 2 * radius;
        double circ = 2 *(pi)* radius;
        System.out.println("Your circumfrence is "+circ+" or "+twor+"pi");
         menu= "yes";
       while(menu.equalsIgnoreCase("yes")){
          System.out.println("\n1.Go Back\n2.Quit\n");
          String cont = ei.s();
         if(cont.equalsIgnoreCase("1")||cont.equalsIgnoreCase("Go Back")){menu="exit"; CircleHelp();}
        else if(cont.equalsIgnoreCase("2")||cont.equalsIgnoreCase("Quit")){ menu="exit";Quit();}
        else {System.out.println("\nYou didn't Choose an item on the menu.\n");}
    }
    }
    public static void Volume(){
        menu = "yes";
     System.out.println("Volume of Which shape?");
        while(menu.equalsIgnoreCase("yes")){
          System.out.println("\n1.Cylinder\n2.Cone\n3.Sphere\n");
          String cont = ei.s();
         if(cont.equalsIgnoreCase("1")||cont.equalsIgnoreCase("Cylinder")){menu="exit"; Cylinder();}
        else if(cont.equalsIgnoreCase("2")||cont.equalsIgnoreCase("Cone")){ menu="exit";Cone();}
        else if(cont.equalsIgnoreCase("3")||cont.equalsIgnoreCase("Sphere")){ menu="exit";Sphere();}
        else {System.out.println("\nYou didn't Choose an item on the menu.\n");}
    } 
}
    public static void Cylinder(){
        System.out.println("Computes Volume using (pi * r * r * h) ");
        System.out.println("Enter your radius:");
        double r = ei.d();
        System.out.println("Enter your height:");
        double h = ei.d();
        double volu = (pi * r * r * h);
        double rsq = r*r*h;
        System.out.println("Your volume is "+volu+" or "+rsq+"pi");
         menu= "yes";
       while(menu.equalsIgnoreCase("yes")){
          System.out.println("\n1.Go Back\n2.Quit\n");
          String cont = ei.s();
         if(cont.equalsIgnoreCase("1")||cont.equalsIgnoreCase("Go Back")){menu="exit"; CircleHelp();}
        else if(cont.equalsIgnoreCase("2")||cont.equalsIgnoreCase("Quit")){ menu="exit";Quit();}
        else {System.out.println("\nYou didn't Choose an item on the menu.\n");}
    }
    }
    public static void Cone(){
         System.out.println("Computes Volume using (pi * r * r*h)/3 ");
        System.out.println("Enter your radius:");
        double r = ei.d();
        System.out.println("Enter your height:");
        double h = ei.d();
        double volu = (pi * r * r * h)/3.0;
        System.out.println("Your volume is "+volu);
         menu= "yes";
       while(menu.equalsIgnoreCase("yes")){
          System.out.println("\n1.Go Back\n2.Quit\n");
          String cont = ei.s();
         if(cont.equalsIgnoreCase("1")||cont.equalsIgnoreCase("Go Back")){menu="exit"; CircleHelp();}
        else if(cont.equalsIgnoreCase("2")||cont.equalsIgnoreCase("Quit")){ menu="exit";Quit();}
        else {System.out.println("\nYou didn't Choose an item on the menu.\n");}
    }
    }
    public static void Sphere(){
        System.out.println("Computes Volume using (4/3) * pi * r^2");
        System.out.println("Enter your radius:");
        double radius = ei.d();
        double volu = (4/3)*pi*(radius*radius*radius);
        System.out.println("Your volume is "+volu);
         menu= "yes";
       while(menu.equalsIgnoreCase("yes")){
          System.out.println("\n1.Go Back\n2.Quit\n");
          String cont = ei.s();
         if(cont.equalsIgnoreCase("1")||cont.equalsIgnoreCase("Go Back")){menu="exit"; CircleHelp();}
        else if(cont.equalsIgnoreCase("2")||cont.equalsIgnoreCase("Quit")){ menu="exit";Quit();}
        else {System.out.println("\nYou didn't Choose an item on the menu.\n");}
    }
    }
    public static void Quit(){ftime = "yes"; clearScreen();}
      //Clears BlueJ's Terminal window
    private static void clearScreen() {
      System.out.print("\u000C");
    }
}
    

