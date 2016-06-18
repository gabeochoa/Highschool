package main.entity;
import java.awt.*;

/**
 * Write a description of class enemy here.
 * Basic shell for enemies in the game
 * @author Justin Maguire
 * @version Alpha 5/22/2012
 */
abstract class enemy extends entity
{
    public enemy(int h, int d, int X, int Y, Image im)
    {
        super(h, d, X, Y, im);
    }
    public void moveToX(int px)
    {
    	if(x < px)
    		x++;
    	if(x > px)
    		x--;
    }
}
