public class ListNode
{
	private int value;
	private ListNode next;
	
	
	public ListNode(int V, ListNode N)
	{
	value = V;
	next = N;
	}
	
	public int getValue()
	{
	return value;
	}
	
	public ListNode getNext()
	{
	return next;
	}
	
    public void setValue(int V)
    {
    value = V;
    }
 
    public void setNext(ListNode N)
    {
     next = N;
    }


}
