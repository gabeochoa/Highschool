
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
    
    public Sector(int x, int y, int w, int h)
    {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        col = Color.black;
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
}
