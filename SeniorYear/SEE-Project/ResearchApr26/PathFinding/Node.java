
/**
 * Write a description of class Node here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Node
{
    private String data;
    private Node previous,next;
    
    public Node( String data,Node previous, Node next)
    {
        this.data = data;
        this.previous = previous;
        this.next = next;
    }
    
    public String getData(){return data;}
    public Node getPrevious(){return previous;}
    public Node getNext(){return next;}
    
    public void setData(String d){data = d;}
    public void setPrevious(Node p){previous = p;}
    public void setNext(Node n){next = n;}
}
/*
   Node list = new Node
   (
        "A", new Node
        (
            "B", new Node
            (
                "C",null
            )
        )
   );
   
   
   
   */