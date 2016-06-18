import java.awt.*;
import java.applet.*;
import java.util.*;
public class Ball
{
 int x,y,ystep,xstep,diameter,cX,cY,radius;
 Graphics g;
 Random D = new Random();
 Color col; 
public Ball(int c, int r, int d, int xs, int ys)
{
x = c;
y = r;
ystep = ys;
xstep = xs;
diameter = d;
radius=diameter/2;
cX = c + radius;
cY = r + radius;
col = Color.red;
}

public Ball(int c, int r,int d, Color color)
{
    x = c;
    y = r;
    ystep = 0;
    xstep = 0;
    diameter = d;
    radius=diameter/2;
    cX = c + radius;
    cY = r + radius;
    col = color;      
}

public void drawBall()
{
g.setColor(col);
//g.fillOval(x,y,diameter,diameter);
g.fillRect(x,y,diameter,diameter);
}

public void moveBall()
{
 x = x + xstep;
 y = y + ystep;
 cX = x + radius;
 cY = y + radius;

if (( cX >(490-diameter/2))||( cX < ( 4 + diameter/2) ))
    {
      if (xstep >= 0)
      {   x -= 5;
          xstep = -1*(D.nextInt(3)+1);
       }
      else
       {    x += 5;
           xstep =  1*(D.nextInt(3)+1);
       }
    }   

if (( cY >(499-diameter/2))||( cY < ( 1 + diameter/2) ))
  {
   ystep *= -1;
 }

}



public int getDiameter()          
{
return 2*radius;
}


public int getRadius()          
{
return radius;
}
public int getX()
{
return x;
}

public int getY()
{
return y;
}


public int getXstep()
{
return xstep;
}

public int getYstep()
{
return ystep;
}

public int getCenterX()
{
return cX;
}

public int getCenterY()
{
return cY;
}





public void paint(Graphics gr)
{
g = gr;
drawBall();
}

}// class Ball

