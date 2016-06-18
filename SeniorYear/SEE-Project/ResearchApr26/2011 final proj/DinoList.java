

public class DinoList
{
    
    private int x;
    ListNode V;
    int listSize;
   
    public DinoList()
    {
       V = null;
       listSize = 0;
    }

    
    
    public void AddFirstNode(int k)
    {
       V = new ListNode(k,null);
       listSize = 1;
    }

  // on any of these sop a message if the index chosen 
  // causes index out of bounds errors 
  
  
// return the list size.
   public int size()
   {
       
     return x;  
   }  
   
    
    // traverse the list and print the int values
   public void printAll()

   {
           
       
   }  

 // return the value in the nth node 
 public int getValue(int n)
 {
     
     return x;
    }   

     
   
   
   // add a list node with int value k to the end of Dinolist, if listSize = 0 call
     // addFirstNode
    public void add(int k)
    {
        
    
    }   
 // insert a list node with int value k into the nth position of Dinolist
 public void add(int k, int n)
    {
        
    }   

// remove the nth node of DinoList.
public void delete(int n)
{

}


}
