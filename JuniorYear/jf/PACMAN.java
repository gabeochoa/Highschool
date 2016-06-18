
/**
 * Write a description of the applet class PACMAN here.
 *
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.applet.*;
import java.util.*;
import java.awt.event.*;
public class PACMAN extends Applet implements Runnable
{
 
    Random D = new Random();
    Graphics g;
    int counter, rx,rl,count;
    Ball [] B = new Ball [ 195];
    Image board, ball ;
    Ball P, P1;
    Thread runner;
    Image Buffer;
    Graphics gBuffer;
    boolean leftKey = false;
    boolean rightKey = false;
    boolean upKey = false;
    boolean downKey = false; 
    public void init()
    {
        for(int i = 0; i <B.length;i++)
        {
        B[i] = new Ball();
    }        
        rx=10;
    rl= 10;
   count=0;
    for(int i = 0; i <B.length;i++)
      {
        B[i] = new Ball(rx,rl,9,1,1,1);
        rx=rx+35;
        count++;
        if(count == 13)
        {
            rl = rl + 20;
            rx= 10;
            count = 0;
        }
        
         
    }
        P1= new Ball(4,4, 19,1,1,1);
        // provide any initialisation necessary for your Applet
        Buffer=createImage(size().width,size().height);
        gBuffer=Buffer.getGraphics();
          addKeyListener(new MyKeyListener()); 
      board=getImage(getCodeBase(),"pacman board.GIF");
      // ball=getImage(getCodeBase(),"balls.JPG"); 
      counter = 0;
    }
  private class MyKeyListener extends KeyAdapter{ 
        public void keyPressed(KeyEvent e){ 
            switch (e.getKeyCode()){
                case KeyEvent.VK_LEFT:
                leftKey = true; 
                break;
                case KeyEvent.VK_RIGHT:
                rightKey = true;
                break; 
                case KeyEvent.VK_UP:
                upKey = true; 
                break;
                case KeyEvent.VK_DOWN:
                downKey = true;
                break;
            } 
        }
    
     public void keyReleased(KeyEvent e){
            switch (e.getKeyCode()){
                case KeyEvent.VK_LEFT:
                leftKey = false; 
                break;
                case KeyEvent.VK_RIGHT:
                rightKey = false;
                break; 
                case KeyEvent.VK_UP:
                upKey = false;
                break;
                case KeyEvent.VK_DOWN:
                downKey = false;
                break;
            } 
        }
    }
    public void start()
    {
       if (runner == null)
        {
            runner = new Thread (this);
            runner.start();
        } 

    }


    
 public void run()
    { while(true)
       {    try {runner.sleep(15);}
            catch (Exception e) { } 
            
            
          gBuffer.drawImage(board, 5, 0, this);  
            gBuffer.drawImage(ball, 10,10, this);
            
                if(upKey){ P1.moveUp(); }
                if(downKey){  P1.moveDown(); }
                if(leftKey){ P1.moveLeft();}
                if(rightKey){ P1.moveRight();} 
          
              for(int i = 0; i <B.length;i++)
      {
       B[i].paint(gBuffer);
    }            
            
        P1.paint(gBuffer);    
         repaint();     
            
            
        }   
            
            
            
            
        }
    public void stop()
    {
       if (runner != null)
        {
            runner.stop();
            runner = null;
        } // provide any code that needs to be run when page
        // is replaced by another page or before Applet is destroyed 
    }


    


    

    public void update(Graphics g)
    {        paint(g);   
    }
  
  public void paint(Graphics g)
    {        g.drawImage (Buffer,0,0, this);    }
}
//}