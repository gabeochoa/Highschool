public class customer
{   
    private double balance;
    private String name;     
    public int accountNumber;//public data is not advised
    
 
 public customer(double startbal, String cname, int cnumber)
    {
        balance = startbal;
        name = cname;   
        accountNumber = cnumber;
    }
   
 
   public double getBalance()
    {
    return balance;  
    }
 
 
    String getName()
    {
    return name;  
    }
    
    
    public int getNumber()
    {
    return accountNumber;  
    }
    
  
   public static double interestAccrued(double amt, double rate)
     {
      double interest;
      interest = amt * rate;
      return interest;
     }    
     
  
  public String toString()
     {
       String result;
       result = "Name: "+ name + "\n Balance: " + balance;
       return result;     } }
