
/**
 * Write a description of class TestNodes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestNodes
{
    public static void main()
    {
        Node n;
        Node anotherNode = null;
        n = new Node("Hello",anotherNode);
        System.out.println(n.getData());
    }
    
    //precond: list contains atleast 3 data values
    public static String getThird(Node list)
    {
        list.getData();//to get First data value
        list.getNext().getData();//second data value
        return list.getNext().getNext().getData();//third data value
    }
    
    //precond list is not empty
    public static void insertSecond(Node list, String s)
    {
        //first step make a new node to be inserted
        Node newNode = new Node(s,null);
        //set new nodes next to the second node
        newNode.setNext(list.getNext());
        //set first 'next' to the new node
        list.setNext(newNode);
        
       
       //Shortened to one line
        list.setNext(
                new Node(
                    s,list.getNext()
                        )
                    );     
    }
    
    public static int size(Node list)
    {
        int count = 0;
        
        while(list != null)
        {
            count++;
            list = list.getNext();
        }
        return count;
    }
    
    public static void addLast(Node list, String s)
    {
        //find the last node
        while(list.getNext() != null)
            list = list.getNext();
            //list is now the last node
         list.setNext(new Node(s,null));
     }
    //another solution
    public static void addLastTwo(Node list, String s)
    {
        Node prev = null;
        Node curr = list;
        
        while(curr != null)
        {
          prev = curr;  
          curr = curr.getNext();
        }
        
        prev.setNext(new Node(s,null));
    }
    
    //return the resulting list
    public static Node addLastThree(Node list,String s)
    {
       //to call Node myList = addListThree(myList, "meow");
       if(list == null)
            return new Node(s,null);
       Node temp = list; 
        
       while(temp.getNext() != null)
            temp = temp.getNext();
      
       temp.setNext(new Node(s,null));  
       
       return list;
    }
    
}
