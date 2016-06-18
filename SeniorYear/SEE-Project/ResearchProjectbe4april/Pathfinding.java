import java.awt.*;
import java.awt.image.*;
import java.applet.*;
import java.util.*;
import java.awt.event.*;

public class Pathfinding extends APPLET
{
    public boolean up,left,right,down;
    public int mx = 0,my = 0,tickCount;
    Grid grid;
    Location player,enemy;
    
   
    public void tick()
    {
        
    }
    
    public void initializeGame()
    {
        grid = new Grid(WIDTH/10,WIDTH/10,WIDTH,HEIGHT);
        player = Location.player;
        enemy = Location.enemy;
    }
    public void menu(){menu = false;}
    public void gameOver(){}
    
    public void mousePressed(MouseEvent e)
    {
        mx = e.getX();
        my = e.getY();
        
        if(e.getButton() == 1)
            grid.getSector(mx,my).toString();
            //balls.add(new BallAI(mx,my));
        if(e.getButton() == 3)
        {
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