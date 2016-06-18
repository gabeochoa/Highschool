/*
 * BALL OBJECT CLASS
 * THIS CLASS WILL BE USED TO CREATE BALL OBJECTS
 * THAT WILL BE USED IN AN APPLET
 */

import java.awt.*;
import java.applet.*;
import java.util.*;
public class Ball
{
    int x,y,moveX,moveY,diameter,centerX,centerY,radius;
    int c;
    Graphics g;
    Random D = new Random();

    //default constructor
    public Ball()
    {
        x = D.nextInt(20) ;
        y = D.nextInt(30) ;
        moveX =  D.nextInt(3) + 1;
        moveY = D.nextInt(3) + 1;
        diameter = 10;
        radius=diameter/2;
        centerX = x + radius;
        centerY = y + radius;
        c =D.nextInt(3000000) + 1;
    }
    public Ball(int X, int Y, int d, int xs, int ys,int C)
    {
        x = X;
        y = Y;
        moveX = xs;
        moveY = ys;
        diameter = d;
        radius=diameter/2;
        centerX = x + radius;
        centerY = y + radius;
        c = C;
    }
    public void changeDirection()//************************
    {
        moveX = moveX*-1;
        moveY = moveY*-1;
    }
    public void changeXDir()//************************
    {
        moveX = moveX*-1;          
    }
      
    public void changeYDir()//************************
    {
        moveY = moveY*-1;
   }
   public int getX()
   {
       return x;
    } 
    public int getY()
    {
        return y;
    }  
    public int getRadius()
    {
        return radius;
    }
    public int getDiameter()
    {
        return diameter;
    }
    public int getCenterX()
    {
        return centerX;
    }
    public int getCenterY()
    {
        return centerY;
    }
    public void drawBall()
    {
        if(c%4 == 0)
           g.setColor(Color.white);
        else
        if( c == 33)
         g.setColor(Color.white);
        else
       g.setColor(Color.blue);
        g.fillOval(x,y,diameter,diameter);
    }
    public void moveBall()
    {
        x = x + moveX;
        y = y + moveY;
        centerX = x + radius;
        centerY = y + radius;
// this part is to get the ball to bounce off the walls notice
// when it get to a boundary the sign of xstep or ystep is reversed (+ to -)
// to (- to +) this reverses the horizontal or vertical movement.
// there is a random change as well to alter the path of the ball

    if (( centerX >(490-diameter/2))||( centerX < ( 4 + diameter/2) ))
    {
      moveX = moveX*-1;
    }  
       
    if (( centerY >(490-diameter/2))||( centerY < ( 1 + diameter/2) ))
    {
        moveY =  moveY*-1;
    }
  }
  public void moveUp()
    {
        boolean colide = false;
        //x = x + moveX;
        if(moveY > 0)
           moveY = moveY * -1;
        y = y + moveY;
        //centerX = x + radius;
        centerY = y + radius;

  }
  
  
  public void moveDown()
    {
   boolean colide = false;
        //x = x + moveX;
        if(moveY < 0)
           moveY = moveY * -1;
        y = y + moveY;
        //centerX = x + radius;
        centerY = y + radius;
// this part 
}

public void moveRight()
    {
        boolean colide = false;
        //x = x + moveX;
        if(moveX < 0)
           moveX = moveX * -1;
        x = x + moveX;
        //centerX = x + radius;
        centerX = x + radius;

  }
  
  
  public void moveLeft()
    {
   boolean colide = false;
        //x = x + moveX;
        if(moveX > 0)
           moveX = moveX * -1;
        x = x + moveX;
        //centerX = x + radius;
        centerX = x + radius;
// this part 
}
public void setX(Ball P1)
{
    x = P1.getX();    


} 
public void setY(Ball P1)
{
     y = P1.getY();    
}
public void setXL(Ball P1)
{
    x = P1.getX() + 15;    


} 
public void setYD(Ball P1)
{
     y = P1.getY() - 15;    
}

public void setXR(Ball P1)
{
   x = P1.getX() - 15;    


} 
public void setYU(Ball P1)
{
     y = P1.getY()+15;    
}



/*
  public boolean collision(Ball A)
   { 
        int centXA = A.getCenterX();
        int centYA = A.getCenterY();
        int xSq = (centXA - centerX)*(centXA - centerX);
        int ySq = (centYA - centerY)*(centYA - centerY);
        
        double dist = Math.sqrt((xSq + ySq));
        
        int radA = A.getRadius();
        
        
        if((radA + radius) >= dist)
        {
            return true;
        }
        else{
            return false;
        }
   }*/
   
   //Collision Method that checks for collision
   //with a Rectangel Object
  /* public boolean collision(Rectangle R)
   {
       boolean hit = false;
       
       int rX = R.getX();
       int rY = R.getY();
       int xEdge = R.getXEdge();
       int yEdge = R.getYEdge();
       double dist = 0; 
        
         int xSq = (centerX - xEdge)*(centerX - xEdge);
         int ySq = 0;
         //Check right side of rectangle
         for(int i = rY; i <= yEdge; i++)
         {
             ySq = (centerY - i)*(centerY - i);
             dist = Math.sqrt((xSq + ySq));
            if((radius + 2 >= dist))
           {
                
                changeXDir();
                hit = true;
                break;
           }
         
        }//end check right
          xSq = (centerX - rX)*(centerX - rX);
          //check left side of rectangle
         for(int i = rY; i <= yEdge; i++)
         {
            
             ySq = (centerY - i)*(centerY - i);
             dist = Math.sqrt((xSq + ySq));
            if((radius + 2  >= dist))
           {
                
            changeXDir();
             hit = true;
            break;
           } 
           }
           
            ySq = (centerY - rY)*(centerY - rY);
          
         for(int i = rX; i <= xEdge; i++)
         {
             xSq = (centerX - i)*(centerX - i);
             dist = Math.sqrt((xSq + ySq));
            if((radius+2>= dist))
           {
                
            changeYDir();
              hit = true;
            break;
           } 
           }
           
           ySq = (centerY - yEdge)*(centerY - yEdge);
          
         for(int i = rX; i <= xEdge; i++)
         {
             xSq = (centerX - i)*(centerX - i);
             dist = Math.sqrt((xSq + ySq));
            if((radius + 2 >= dist - 2))
           {
              
            changeYDir();
             hit = true;
            break;
           } 
           }
                
        return hit;
        
    }*/
    
  public void paint(Graphics gr)
  {
      g = gr;
      drawBall();}
  }// class Ball