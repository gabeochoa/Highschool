package main.entity;

import java.awt.*;
import java.util.Random;

import main.Art;
import main.RPG;
import main.Level.Level;

/**
 * Write a description of class regZombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class regZombie extends enemy
{
    double xStep, yStep;
    Random random = new Random();
    Level level;
    int height = 100, y = 30;
    //////////////////////////////////////////range is currently a placeholder.
    private int range = 20; 
    
    public regZombie()
    {
 	   super(100,5,(int)(-Math.random()*5)-2,0,null);
 	   xStep = 4;
 	   yStep = 0;
 	   animCount = 1;
 	   who = "zombie1";
 	   y = RPG.HEIGHT-height;
 	   attacking = false;
    }
    public regZombie(int h, int d, int X, int Y, Image im, double xS)
    {
       super(h,d,X,Y,im); 
       xStep = xS; 
       yStep = 0;
       animCount = 1;
       who = "zombie1";
       y = RPG.HEIGHT-height;
       attacking = false;
    }
    ////////////////////////////////////simple move method, zombies should not need to move up
    public void move()
    {
        x += xStep;
        y += yStep;
        
        l = false;
        r = true;
    }
    /////////////////////////////////////modifier methods
    public void changeXS(int a)
    {
        xStep = a;
    }
    public void changeYS(int a)
    {
        yStep = a;
    }
    public void tick()
    {
    	
    }
    public int getRange()
    {
    	return range;
    }
    public void paint(Graphics gr)
    {
	    g = gr;
 	    drawEntity();
    }
    public void drawEntity()
    {	 
    	
			if(animCount < 40)
				animCount++;
			else
				animCount = 10;
    	
			Image im = Art.getImageFromFile("./images/entities/"+who+"/swing/Frame"+animCount/10+".png");
			//Image flip = horizontalflip(im);
			if(!side)
				g.drawImage(im, x, y, height-2 , height-2, height-2, x, y, height-2, null);  //g.drawImage (flip,x,y,height-2,height-2,null);
			else 
				g.drawImage(im, x, y,height-2,height-2, null);
    
    }
    
}
    

