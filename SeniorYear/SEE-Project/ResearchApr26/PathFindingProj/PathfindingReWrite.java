import java.awt.*;
import java.awt.image.*;
import java.applet.*;
import java.util.*;
import java.awt.event.*;

public class PathfindingReWrite extends APPLET
{
    public boolean up,left,right,down;
    public int mx,my,tickCount;
    Point p,player;
    Sector[][] grid = new Sector[50][50];
    ArrayList<Sector> walls = new ArrayList<Sector>();
    public void initializeGame(){
        mx = my = 0;
        setUpSectors();
        player = new Point(1,1);
    }
    public void tick()
    {
        checkSectors();
       //drawPlayer();
        drawSectors();
        showStatus(""+(int)player.getX()+"   "+(int)player.getY());
    }
    public void checkSectors()
    {
         for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[i].length;j++)
            {
                for(int k= 0; k< walls.size();k++)
                {
                    //Point p = balls.get(k).getPoint();
                    //grid[i][j].ifInSector(p,2);//tickCount);
                    //grid[i][j].playerSector(player,2);//tickCount);
                    //if(grid[i][j].x == player.x && grid[i][j].y == player.y)
                    //    grid[i][j].setC(Color.red);
                }
            }
    }
    public void drawSectors()
    {
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[i].length;j++)
            {
                grid[i][j].paint(gBuffer);
            }  
    }
    public void setUpSectors()
    {
       int  w = width/ grid.length;
       int  h = height/ grid[0].length;
      
        for(int i=0; i<grid.length;i++){
          for(int j=0; j<grid[i].length;j++){
             grid[i][j] = new Sector(i*w,j*h,w,h);
          }
      }  
      
      walls.add(new Sector(w,w,w,w));
      walls.add(new Sector(w,w,w,w));
      walls.add(new Sector(w,w,w,w));
    }
    
    public void mousePressed(MouseEvent e)
    {
        mx = e.getX();
        my = e.getY();
        p = new Point(mx,my);
        
        if(e.getButton() == 1)
            {
           
        }//add wall at position
        if(e.getButton() == 2)
            //change npc position
        if(e.getButton() == 3)
        {
            //to put player at that pos
            player = getSector(p);
        showStatus("NEW");
        }
    }
    public Point getSector(Point p)
    {
           for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[i].length;j++)
            {
               if(grid[i][j].playerSector(p))
               {
                grid[i][j].setC(Color.red);
                 return new Point(i,j);
                }else{ grid[i][j].setC(Color.black);} 
            }
         return player;
         // grid[(int)player.getX()][(int)player.getY()].setC(Color.red);
    }
    public Sector getSector(Sector a)
    {
       for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[i].length;j++)
            if(grid[i][j].x == a.x && grid[i][j].y == a.y)
                return grid[i][j];
                return grid[0][0];
    }
    public void keyPressed(KeyEvent e)
    {
        switch(e.getKeyCode())
        {
            case KeyEvent.VK_W:
                up = true;
            case KeyEvent.VK_S:
                down = true;
            case KeyEvent.VK_A:
                left = true;
            case KeyEvent.VK_D:
                right = true;
            case KeyEvent.VK_SPACE:   
                player = getSector(p);
         }       
    }/*up = keys[KeyEvent.VK_W] || keys[KeyEvent.VK_UP] || keys[KeyEvent.VK_NUMPAD8];
       down = keys[KeyEvent.VK_S] || keys[KeyEvent.VK_DOWN] || keys[KeyEvent.VK_NUMPAD2];
       left = keys[KeyEvent.VK_A] || keys[KeyEvent.VK_LEFT];
       right = keys[KeyEvent.VK_D] || keys[KeyEvent.VK_RIGHT];
       use = keys[KeyEvent.VK_SPACE];*/
    public void keyReleased(KeyEvent e)
    {
        switch(e.getKeyCode())
        {
            case KeyEvent.VK_W:
                up = false;
            case KeyEvent.VK_S:
                down = false;
            case KeyEvent.VK_A:
                left = false;
            case KeyEvent.VK_D:
                right = false;
         }  
    }
    
    public void menu(){menu = false;}
    public void gameOver(){}
}