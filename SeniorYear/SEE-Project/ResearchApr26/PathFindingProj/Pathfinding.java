import java.awt.*;
import java.awt.image.*;
import java.applet.*;
import java.util.*;
import java.awt.event.*;

public class Pathfinding extends APPLET
{
    public boolean up,left,right,down;
    public int mx,my,tickCount;
    
    Sector[][] grid = new Sector[50][50];
    ArrayList<Sector> walls = new ArrayList<Sector>();
    Sector player;
    Sector enemy;
    public void initializeGame(){
        mx = my = 0;
        setUpSectors();
    }
    public void tick()
    {
        checkSectors();
        drawSectors();
        showStatus(""+mx);
    }
    public Sector getSector(Sector a)
    {
       for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[i].length;j++)
            if(grid[i][j].x == a.x && grid[i][j].y == a.y)
                return grid[i][j];
                return grid[0][0];
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
                    if(grid[i][j].x == player.x && grid[i][j].y == player.y)
                        grid[i][j].setC(Color.red);
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
            
        player.setC(Color.red);
        player.paint(gBuffer);
            
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
      
      player = grid[2][2];
    }
    
    public void menu(){menu = false;}
    public void gameOver(){}
    
    public void mousePressed(MouseEvent e)
    {
        mx = e.getX();
        my = e.getY();
        
        if(e.getButton() == 1)
            //balls.add(new BallAI(mx,my));
        if(e.getButton() == 3)
        {
            player.x = mx;
            player.y = my;
            player = getSector(player);
        }
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
}