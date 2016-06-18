package main.entity;
import java.awt.*;
import java.awt.image.BufferedImage;

import main.Art;
import main.Level.Level;

/**
 * Write a description of class entity here.
 * Abstract Class for both the player and enemies
 * @author Justin Maguire
 * @version Alpha 5/22/12
 */
 public abstract class entity
{   
    /////////player stats
    int health;
    int damage;
    /////////coords
    public int x;
	public int y;
	public int height;
    //////////////////image
    Graphics g;
    Image pic; 
    String who;
    ///////////////Level
    public Level level;
    ///////////////Animation Variables
    public int frame;
    public int frames;
    public int animCount;
    
    boolean side;
	boolean u;
	boolean d;
	boolean l;
	boolean r;
	public boolean attacking;
    
    public entity(int h, int d, int X, int Y, Image im)
    {
        health = h;
        damage = d;
        x = X;
        y = Y;
        pic = im;
    }

    //////////////////////////to lose health when player is attacked
    public void getHurt(int dam)
    {
        health -= dam;
    }
    /////////////////////////to gain health when player is healed
    public void getHealed(int heal)
    {
        health += heal;
    }
    
    public abstract void move(); 
    
    ////////////////////////////////////get methods\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    public void drawEntity()
    {
    	if(!attacking)
    	{
    		if(l||r)
    		{
    			if(animCount < 60)
    				animCount++;
    			else
    				animCount = 10;
	    	
    			if(l)
    				g.drawImage(Art.getImageFromFile("./images/entities/"+who+"/b/Frame"+animCount/10+".png"), x, y,height-2,height-2, null);
    			else if(r)
    				g.drawImage(Art.getImageFromFile("./images/entities/"+who+"/Frame"+animCount/10+".png"), x, y,height-2,height-2, null);

    		}
    		if(!l && !r)
    		{
    			if(!side)
    				g.drawImage(Art.getImageFromFile("./images/entities/"+who+"/b/Frame0.png"), x, y,height-2,height-2, null);
    			else
    				g.drawImage(Art.getImageFromFile("./images/entities/"+who+"/Frame0.png"), x, y,height-2,height-2, null);	
    		}  
    	}
    	else
    	{
    			if(animCount < 40)
    				animCount++;
    			else
    				animCount = 10;
	    	
    			Image im = Art.getImageFromFile("./images/entities/"+who+"/swing/Frame"+animCount/10+".png");
    			Image flip = horizontalflip(im);
    			if(!side)
    				g.drawImage (flip,x,y,height-2,height-2,null);
    			else 
    				g.drawImage(im, x, y,height-2,height-2, null);
    	}
    }
    
    public static Image horizontalflip(Image img) {  
        int w = img.getWidth(null);  
        int h = img.getHeight(null);  
        Image dimg = new BufferedImage(w, h, ((BufferedImage) img).getType());  
        Graphics2D g = (Graphics2D) dimg.getGraphics();  
        g.drawImage(img, 0, 0, w, h, w, 0, 0, h, null);  
        g.dispose();  
        return dimg;  
    }  
    
    public int getHealth()
    {
        return health;
    }
    
    public int getDamage()
    {
        return damage;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public Image getImage()
    {
        return pic;
    }
    
    public void paint(Graphics gr)
    {
    	g = gr;
    	drawEntity();
    }

	public void sendKeys(boolean[] keys){}
}