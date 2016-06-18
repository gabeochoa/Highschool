import java.awt.*;
import java.awt.image.*;
import java.applet.*;
import java.util.*;
import java.awt.event.*;

public class Pathfinding extends APPLET
{
    public boolean up,left,right,down;
    public int mx,my;
    Point player;
    Point enemy;
    
    Sector[][] grid = new Sector[50][50];
    
    public void initializeGame(){
        mx = my = 0;
        player = new Point(2,2);
        enemy = new Point(2,2);
        setUpSectors();
    }
    public void tick()
    {
        drawSectors();
        drawPlayers();
    }
    public void drawPlayers()
    {
      Sector playerS = getSector(player);
      Sector enemyS = getSector(enemy);
      
      playerS.setC(Color.red);
      playerS.paint(gBuffer);
      
      
      enemyS.setC(Color.blue);
      enemyS.paint(gBuffer);
      
    }
    public Sector getSector(Point p)
    {
        return grid[(int)p.getX()][(int)p.getY()];
    }
    public void drawSectors()
    {
         for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[i].length;j++)
            {
               break; 
            }
        
        
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[i].length;j++)
            {
                grid[i][j].paint(gBuffer);
            }
    }
    public void menu(){menu = false;}
    public void gameOver(){}
    
    public void mousePressed(MouseEvent e)
    {
        mx = e.getX();
        my = e.getY();
        
        if(e.getButton() == 1)
        
        if(e.getButton() == 3)
        {
            player.x = mx;
            player.y = my;
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