
import java.awt.*;
import java.applet.*;
import java.util.*;
public class Rectangle
{

    private int x, y, length, width,xEdge, yEdge,color,moveX,moveY ;
    private Graphics g;
    Random D = new Random();
  
 public Rectangle()
{
    x = D.nextInt(400) + 50;
    y = D.nextInt(400) + 50;
    length = D.nextInt(25) + 25;
    width = D.nextInt(25) + 25;
    xEdge = x + length;
    yEdge = y + width;
    color = D.nextInt(100000) + 1;
    moveX = 3;
    moveY = 3;
}
public Rectangle(int X, int Y, int l, int w )
{
    x = X;
    y = Y;
    length = l;
    width = w;
    xEdge = x + length;
    yEdge = y + width;
    color = D.nextInt(100000) + 1;
    moveX = 3;
    moveY = 3;
}
public int getX()
{
    return x;
} 
public int getY()
{
    return y;
}
public int getLength()
{
    return length;
}

public int getWidth()
{
    return width;
}

public int getXEdge()
{
    return xEdge;
}

public int getYEdge()
{
    return yEdge;
}

//////////////////////////////
public void setX(Rectangle R)
{
    x = R.getX();    


} 
public void setY(Rectangle R)
{
     y = R.getY();    
}
public void setXL(Rectangle R)
{
    x = R.getX() + 15;    


} 
public void setYD(Rectangle R)
{
     y = R.getY() - 15;    
}

public void setXR(Rectangle R)
{
   x = R.getX() - 15;    


} 
public void setYU(Rectangle R)
{
     y = R.getY()+15;    
}


public void drawRect()
{
    if(color%4 == 0 )
        g.setColor(Color.blue);
    else
    if(color%7 == 0)
        g.setColor(Color.red);
    else
    if(color % 11 == 0)
        g.setColor(Color.white);
    else
    if(color % 3 == 0)
       g.setColor(Color.yellow);
    else
    if(color % 2 == 0)
      g.setColor(Color.green);
    else
    g.setColor(Color.gray);
    
g.fillRect(x,y,length,width);
}

public void moveRectangle()
    {
        x = x + moveX;
        xEdge = x + length;
        

    if (( xEdge >(495))||( x < ( 5 )))
    {
      moveX = moveX*-1;
    }  
       
   
        
  }
  public void movePaddle(int s)
    {
        
        x = s;
        xEdge = x + length;
    }
    public void moveRight()
    {
        if(moveX < 0)
            moveX = moveX *-1;
        x = x + moveX;
        xEdge = x + length;
    }
    public void moveLeft()
    {
        if(moveX > 0)
            moveX = moveX *-1;
        x = x + moveX;
        xEdge = x + length;
    }
    
     public void moveDown()
    {
        if(moveY < 0)
            moveY = moveY *-1;
        y = y + moveY;
        yEdge = y + width;
    }
    public void moveUp()
    {
        if(moveY > 0)
            moveY = moveY *-1;
        y = y + moveY;
        yEdge = y + width;
    }
     public void moveBrick()
    {
        int mY = D.nextInt(25) + 1;
        y = y + mY;
       
    }
public void paint(Graphics gr)
{
g = gr;
drawRect();
}












 }   