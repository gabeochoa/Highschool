import java.awt.*;
import java.awt.image.*;
import java.applet.*;
import java.util.*;
import java.awt.event.*;

public class Pathfinding extends APPLET
{
    public boolean up,left,right,down;
    public int mx = 0,my = 0,tickCount,buttonPressed=1,frames = 0;
    Grid grid;
    Location player,enemy;
    
   
    public void tick()
    {
       grid.draw(gBuffer); 
       
        frames++;
    }
    
    public void initializeGame()
    {
        grid = new Grid(WIDTH/10,WIDTH/10,WIDTH,HEIGHT);
        createGrid();
        player = Location.player;
        enemy = Location.enemy;
        
        Sector[][] g = grid.getGrid();
        
        g[1][1].toggleWall();
        g[0][0].toggleStart();
        g[3][3].toggleEnd();
    }
    public void menu(){menu = false;}
    public void gameOver(){}
    public void createGrid()
    {
        int a = (WIDTH/10);
        int b = (HEIGHT/10);
        Sector[][] grid = new Sector[a][b];
       int  w = WIDTH / a;
       int  h = (HEIGHT)/ b;
      
        for(int i=0; i<grid.length;i++){
          for(int j=0; j<grid[i].length;j++){
             grid[i][j] = new Sector(i*w,j*h,w,h);
          }
      }  
    }
    public void mousePressed(MouseEvent e)
    {
        mx = e.getX();
        my = e.getY();
        buttonPressed = e.getButton();
        Location mouseP = new Location(mx/10,my/10);
        Sector select = grid.getSector(mouseP);
        if(e.getButton() == 1)
            showStatus(""+select.toString());
        if(e.getButton() == 3)
            select.toggleWall();
    }
    public void getSectorAtMouse()
    {
        Location mouseP = new Location(mx/10,my/10);
        Sector select = grid.getSector(mouseP);
        
        if(buttonPressed == 1)
            showStatus(""+select.toString());
        if(buttonPressed == 3)
            select.toggleWall(); 
    }
    public void keyPressed(KeyEvent e)
    {
        switch(e.getKeyCode())
        {
            case KeyEvent.VK_W:
                up = true;
                getSectorAtMouse();
                break;
            case KeyEvent.VK_S:
                down = true;
                break;
            case KeyEvent.VK_A:
                left = true;
                break;
            case KeyEvent.VK_D:
                right = true;
                break;
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