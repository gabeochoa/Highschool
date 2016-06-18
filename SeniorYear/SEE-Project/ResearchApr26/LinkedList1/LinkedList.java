public class LinkedList
{
private int nodeCount;
private ListNode head;

public LinkedList()
{
head = null;
nodeCount = 0;
}

public void outputList()
 { 
 ListNode current;
 current = head;
 
 while( current != null) 
          {  System.out.println (current.getValue());
             current = current.getNext(); // this is the way you traverse this linked list  
            } 
  }
     
public void add(int N)//adds a new ListNode to end
   {
    ListNode node = new ListNode(N,null);
    ListNode current;
 
 if (nodeCount == 0)
      head = node;
 else
    {  current = head;
       int i;
       
        for (i = 1; i < nodeCount; i++) 
          { current = current.getNext();  }
         current.setNext(node);
    }   
    nodeCount++;  
    }
        
    
    public int size()
    {
    //returns the number of nodes in the list
    }
    
    
    public void add(int N, int index )
    {
    
    // inserts node with value N at index
    // if index is out of bounds through an error
    
    }
     
        
     public void set(int N, int index )
    {
    
    // sets node at index to N
    // if index is out of bounds through an error
    }   
    
    public void remove( int index )
    {
    // remove node at index
    // if index is out of bounds through an error
    } 
        
    public void removeRange( int indexA, int indexB )
    {
    // remove all nodes starting at, and including, indexA 
    // thru but not including indexB.
    } 
       
   public int max()
    {
    // return the largest value in this list
    }    
        }