
import java.awt.*;
import java.applet.*;
import java.util.*;

public class Sector
{
  
    int x,y,w,h;
    Graphics g;
    Color col;
    Rectangle r;
    Random D = new Random();
    boolean wall,start,end;
    Location n;
    public Sector(int x, int y, int w, int h)
    {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        
        this.wall = false;
        this.start = false;
        this.end = false;
        
        n = new Location(x,y);
        col = Color.black;
    }
    public Sector(int x, int y, int w, int h, boolean wall, boolean start, boolean end)
    {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        
        this.wall = wall;
        this.start = start;
        this.end = end;
        
        n = new Location(x,y);
        col = Color.black;
    }
    public Sector(Sector s)
    {
      this.x = s.x;
	  this.y = s.y;
	  this.w = s.w;
	  this.h = s.h;
	  this.wall = s.wall;
	  this.start = s.start;
	  this.end = s.end;
	  this.col = s.col;
	  this.n = s.n;
    }
    public void setNextLocation(int r,int c)
    {
        n = new Location(r,c);
    }
    public void setNextLocation(Location loc)
    {
        n = loc;
    }
    public void paint(Graphics gr)
    {
        g = gr;
        drawSector();
    }
    public void drawSector()
    {
        g.setColor(col);
        g.fillRect(x,y,w,h);
    }
    public boolean contains(Point p)
    {
        r = new Rectangle(x,y,w,h);
        if(r.contains(p))
        return true;
        return false;
    }
    public boolean equals( Object o ) {
		if ( o == null || o.getClass() != getClass() )
			return false;
		else {
			Sector temp = (Sector) o;
			return ( x == temp.x && y == temp.y );
		}
	}
	
	public void toggleWall()
	{
	       if(!wall)
	       {
	           wall = true;
	           start = false;
	           end = false;
           }else
           {
               wall = false;
	           start = false;
	           end = false; 
            }
	}
	public void toggleStart()
	{
	       if(!start)
	       {
	           wall = false;
	           start = false;
	           end = true;
           }else
           {
               wall = false;
	           start = false;
	           end = false; 
            }
	}
	public void toggleEnd()
	{
	       if(!end)
	       {
	           wall = true;
	           start = false;
	           end = false;
           }else
           {
               wall = false;
	           start = false;
	           end = false; 
            }
	}
    public String toString() {
		return ( x + " " + y );
	}
}
