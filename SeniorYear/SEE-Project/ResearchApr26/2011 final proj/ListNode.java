
public class ListNode
{
    private int value;
    private ListNode next;

    // ListNode constructor  links an object to this node and sets a pointer to tne
    //next node in the chain
    public ListNode (int initValue, ListNode initNext)
    {
	value = initValue;
	next = initNext;
    } 


    // getValue method returns a pointer to the object linked to this node.
    public int getValue ()
    {
	return value;
    } 


    // getNext method  returns a pointer to the next list node in the chain
    public ListNode getNext ()
    {
	return next;
    } 


    // setValue method links an object to this node
    public void setValue (int theNewValue)
    {
	value = theNewValue;
    } 


    // setNext method sets a pointer to tne
    //next node in the chain
    public void setNext (ListNode theNewNext)
    {
	next = theNewNext;
    } 
} // ListNode class


