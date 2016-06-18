
import java.awt.*;
import java.awt.image.*;
import java.applet.*;
import java.util.*;
import java.awt.event.*;

public abstract class APPLET extends Applet implements Runnable,KeyListener,MouseListener,MouseMotionListener
{
    Thread runner;
    Image Buffer;
    Graphics gBuffer;
    int width,height;
    Random D = new Random();
    boolean menu = true,gameover = false;
    
    long startTime,elapsedTimeMillis;
    int  elapsedTimeSec = 0;
    Date d = new Date();
    
    //public  InputHandler inputHandler;
    private Cursor emptyCursor, defaultCursor;
  public void init()
    {
        Buffer=createImage(size().width,size().height);
        gBuffer=Buffer.getGraphics();
        
        width = size().width;
        height = size().height;
        initializeGame();

        addKeyListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
    
        emptyCursor = Toolkit.getDefaultToolkit().createCustomCursor(new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB), new Point(0, 0), "empty");
        defaultCursor = getCursor();
    } 
  
  public void start()
    { if (runner == null)
        {   runner = new Thread (this);
            runner.start();
        } }
   
   public void stop()
    {  if (runner != null)
        {   runner.stop();
            runner = null;
        }  
    }
   
  
   public void run()
    { while(true)
       {    
       try {runner.sleep(20);}
            catch (Exception e) { }
      
            gBuffer.setColor(Color.black);
            gBuffer.fillRect(0,0,size().width,size().height);          
            tick();   
          repaint();  
        }
    }     
    //public abstract void handleKeys(boolean[] keys);
    public abstract void menu();
    public abstract void tick();
    public abstract void gameOver();
    public abstract void initializeGame();
   
   public int getTimePassed()
   {
     elapsedTimeMillis = System.currentTimeMillis()-startTime;
     elapsedTimeSec =  (int)elapsedTimeMillis/1000;      
     showStatus(""+startTime+" End Time  "+elapsedTimeMillis +" Seconds: "+ elapsedTimeSec  );
         return elapsedTimeSec;
   }
    public void update(Graphics g)
    {        paint(g);    }
   
   public void paint(Graphics g)
    { g.drawImage (Buffer,0,0, this); }

    public void keyPressed( KeyEvent e ){}
    public void keyReleased( KeyEvent e ){}
    
    public void keyTyped( KeyEvent e ) {
      char c = e.getKeyChar();
      if ( c != KeyEvent.CHAR_UNDEFINED ) {
         //repaint();
         e.consume();
      }
     
    }     
    public void mouseClicked(MouseEvent me){}
    public abstract void mousePressed(MouseEvent e );
    public void mouseReleased(MouseEvent me){}
    public void mouseEntered(MouseEvent me){}
    public void mouseExited(MouseEvent me){}
    public void mouseMoved(MouseEvent me){}
    public void mouseDragged(MouseEvent me){}
}