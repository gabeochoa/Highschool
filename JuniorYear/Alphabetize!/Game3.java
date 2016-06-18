
/**
 * Read the in game 'How To'
 * 
 * @author Gabriel Ochoa 
 * @version 6.0.1
 */
public class Game3{
    public static String menu;
    public static int money = 1000,frand,srand,trand,bet,l=1;
    public static void main()
    {
         System.out.println("\nWhat Would You Like To Do?");
         menu = "yes";
        while(menu.equalsIgnoreCase("yes")){
          System.out.println("\n1.Start Game\n2.How to Play\n3.About\n4.Quit\n");
          String cont = ei.s();
         if(cont.equalsIgnoreCase("1")||cont.equalsIgnoreCase("Start")){menu="exit"; Start();}
        else if(cont.equalsIgnoreCase("2")||cont.equalsIgnoreCase("how to play")){ menu="exit";HowToPlay();}
        else if(cont.equalsIgnoreCase("3")||cont.equalsIgnoreCase("about")){ menu="exit";About();}
        else if(cont.equalsIgnoreCase("3")||cont.equalsIgnoreCase("Quit")){ menu="exit";Quit();}
        else {System.out.println("\nYou didn't Choose an item on the menu.\n");}
       }
    }
    public static void Start()
    {
       System.out.println("\nYou have $"+money);
       menu = "yes";
       
      while(menu.equalsIgnoreCase("yes")){
          System.out.println("\n1.Bet/Play\n2.Clear Screen\n3.Quit\n");
          String cont = ei.s();
         if(cont.equalsIgnoreCase("1")||cont.equalsIgnoreCase("bet")){menu="exit"; Bet();}
        else if(cont.equalsIgnoreCase("2")||cont.equalsIgnoreCase("Clear")){ menu="exit";clearScreen("yes");}
        else if(cont.equalsIgnoreCase("3")||cont.equalsIgnoreCase("Quit")){ menu="exit";Quit();}
        else {System.out.println("\nYou didn't Choose an item on the menu.\n");}
       }  
    }
     public static void Bet()
    {
      if(money<10){YouLose();}
      else
      {
          while(l==1){ randgen rg = new randgen();
           frand = rg.main();
           srand = rg.main();
           l=0;
        }
           System.out.println("The Two numbers are "+frand+" and "+srand);
           System.out.println("Place bet of how much?");
           bet = ei.i(); 
           if(bet >= 10 && bet<=money)
           {
               randgen rg = new randgen();
               trand = rg.main();
               check();
           }
           else
           {
              System.out.println("\nYour bet was too low.");
              l=0;
              Bet();
           }
      }
    
     }
    public static void check()
    {
        if(
                (trand <= frand && trand >= srand)
                            ||
                (trand<=srand && trand>=frand)
             )
            {
                System.out.println("You Win!");
                System.out.println("Your number was "+trand);
                money = bet + money;
                l=1;
                Start();
            }
            else
            {
                System.out.println("You Lose $"+bet);
                System.out.println("Your number was "+trand);
                money = money - bet;
                l=1;
                Start();
            }
    }
    public static void HowToPlay()
    {
      System.out.println("\n                Steps to play this game."); 
      System.out.println("---------------------------------------------------------");  
      System.out.println("\nFirst select 'Start'. The computer will then select two");
      System.out.println("random numbers, (for ex. 1 and 15) then you have to enter"); 
      System.out.println("a bet greater than $10, A third random number will then be"); 
      System.out.println("chosen (for ex. 9) You will win if your number is between");
      System.out.println("the first two (ours is) and your bet will be added onto ");
      System.out.println("your money but if your number is not between the first two");
      System.out.println("you will lose the money that you bet."); 
      menu = "yes";
       
      while(menu.equalsIgnoreCase("yes")){
          System.out.println("\n1.Return\n2.Quit\n");
          String cont = ei.s();
         if(cont.equalsIgnoreCase("1")||cont.equalsIgnoreCase("return")){menu="exit"; main();}
        else if(cont.equalsIgnoreCase("2")||cont.equalsIgnoreCase("Quit")){ menu="exit";Quit();}
        else {System.out.println("\nYou didn't Choose an item on the menu.\n");}
       }  
    }
    public static void About()
    {
      System.out.println("\n©Gabriel Ochoa 2010");
      System.out.println("\nMade for Mr.Cleary's Java Class"); 
      menu = "yes";
       
      while(menu.equalsIgnoreCase("yes")){
          System.out.println("\n1.Return\n2.Quit\n");
          String cont = ei.s();
         if(cont.equalsIgnoreCase("1")||cont.equalsIgnoreCase("return")){menu="exit"; main();}
        else if(cont.equalsIgnoreCase("2")||cont.equalsIgnoreCase("Quit")){ menu="exit";Quit();}
        else {System.out.println("\nYou didn't Choose an item on the menu.\n");}
       } 
    }
    public static void Quit(){ clearScreen("no");}
      //Clears BlueJ's Terminal window
    private static void clearScreen(String y) {
      System.out.print("\u000C");
      if(y == "yes")
      {
            Start();
        }
        else{}
    }
    public static void YouLose()
    {
        System.out.print("\nYou have less than $10 you lose.");
    }
}