import java.util.*;
public class bank
{
  public static boolean menu = true;
  public static customer[] cust;
  public static customer[] ArrayThing;
  public static ArrayList A,sortID,sortName,sortBalance;
  public static Scanner s = new Scanner(System.in);
    public static void main()
    { 
        menu = true;
    // create an arraylist populate it with 10 customers
    A = new ArrayList();
    // public customer(double startbal, String cname, int cnumber)
    //
    A.add( new customer(400,"bob",23));
    A.add( new customer(4340,"tob",26));
    A.add( new customer(540,"lob",22));
    A.add( new customer(600,"gob",23));
    A.add( new customer(800,"mob",29));
    A.add( new customer(200,"sob",23));
    A.add( new customer(403,"hob",27));
    A.add( new customer(500,"zob",238));
    A.add( new customer(39900,"rob",233));
    A.add( new customer(544567,"kob",253));
    A.add( new customer(5405,"pob",273));
    A.add( new customer(40450,"fob",283));
    A.add( new customer(402340,"gob",233));
    A.add( new customer(540650,"job",223));
    A.add( new customer(240870,"dob",273));
    A.add( new customer(46500,"wob",283));
    
    for(int i=0; i<1000;i++)
    { 
      A.add( new customer(basic.getBal(),""+basic.getLet()+"ob",basic.getBal()));  
    }
    
    
    // use a binary search to search for a particluar ID or Last Name don't forget to sort first
    //                    Search Menu
    //                    1) ID Number
    //                    2) Last Name
    while(menu)
    {
        System.out.println("SEARCH MENU\n1) Balance\n2) ID Number\n3) Last Name\n4)List Customers\n5) Quit");
        System.out.println("\nEnter Your Choice:");
        String choice = s.nextLine();
        
        if(choice.equalsIgnoreCase("bal") || choice.equals("1"))
        {
            menu = false;
            searchBalance();
        }
        if(choice.equalsIgnoreCase("ID") || choice.equals("2"))
        {
            menu = false;
            searchID();
        }
        if(choice.equalsIgnoreCase("last") || choice.equals("3"))
        {
            menu = false;
            searchLastName();
        }
        if(choice.equalsIgnoreCase("cust") || choice.equals("4"))
        {
            System.out.println("----------------");
            printCust();
            System.out.println("----------------");
        }
        if(choice.equalsIgnoreCase("quit") || choice.equals("5"))
        {
        }
    }
    
    
}
static void printCust()
{
customer temp;
  for(int i=0; i<A.size();i++)
   {
       temp = (customer) A.get(i);
        System.out.println("Your Customer is:\n"+temp.toString());
   }  
}
public static customer[] getArray(ArrayList A)
{
   customer[] s = new customer[A.size()];
   customer temp;
   for(int i=0; i<A.size();i++)
   {
       temp = (customer) A.get(i);
        s[i] = temp; 
   }
   return s;
}
public static void searchID()
{
    menu = true;
    sortID = basic.bubbleALID(A);
    
    while(menu)
    {
    
       System.out.println("Enter the customers id nuumber:");
       String choice = s.nextLine();
       int c;
       try
       {
            c = Integer.parseInt(choice);
            //customer cust = getCust(c);
            customer cust = binSear.ID(sortID,c);
            if(cust != null)
            {System.out.println("Your Customer is:\n"+cust.toString());
            
            menu = false;
            }else{System.out.println("Not a valid ID, try again");}
        }
       catch(Exception e)
       {
            //e.printStackTrace();
            System.out.println("Number didnt work, try again");
        }
    }

}
public static void searchLastName()
{
  menu = true;
    sortName = basic.bubbleALName(A);
   //printCust();
    
    while(menu)
    {
    
       System.out.println("Enter the customers name:");
       String choice = s.nextLine();
       int c;
       try
       {
            //customer cust = getCustName(choice);
            customer cust = binSear.Name(sortName,choice);
            if(cust != null)
            {System.out.println("Your Customer is:\n"+cust.toString());
            
            menu = false;
            }else{System.out.println("Not a valid Name, try again");}
        }
       catch(Exception e)
       {
           // e.printStackTrace();
            System.out.println("Name didnt work, try again");
        }
    }
}
public static void searchBalance()
{
     menu = true;
    sortBalance = basic.bubbleALBal(A);
    
    while(menu)
    {
    
       System.out.println("Enter the customers balance:");
       String choice = s.nextLine();
       int c;
       try
       {
            c = Integer.parseInt(choice);
            //customer cust = getCustBal(c);
            customer cust = binSear.Bal(sortBalance,c);
            if(cust != null)
            {System.out.println("Your Customer is:\n"+cust.toString());
            
            menu = false;
            }else{System.out.println("Not a valid balance, try again");}
        }
       catch(Exception e)
       {
            //e.printStackTrace();
            System.out.println("Number didnt work, try again");
        }
    }
}
    }
	