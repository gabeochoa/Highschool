import java.util.*;

public class Deck
{
    // precondition  2 <= value <= 12
	// postcondition returns a card and a suit
	 Random A = new Random();
	
	public String deal(int value)
	{
	int holdSuit;
	String[] numbers = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
	String[] suit = {"Harts","Dimonds","Spades","Clubs"};
    holdSuit = A.nextInt(4);
    return(numbers[value -2 ]+" of "+suit[holdSuit]);
   	
   	}
}