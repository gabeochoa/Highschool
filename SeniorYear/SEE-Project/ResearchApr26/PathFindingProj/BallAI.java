import java.util.*;
import java.awt.*;

public class BallAI extends Ball
{
    int ex,ey;
    int absx,absy;
    public BallAI(int a, int b)
    {
        super(a,b,10,Color.blue);
        absx = x;
        absy = y;
    }
    
    public void moveBall(Sector player)
    {
        ex = player.x;
        ey = player.y;
        
       // attack();//moves toward player in anyway possible and swarms
        moveAlongGrid();//moves toward player using grid
    }
    
    public void attack()
    {
        if(x < ex)
            x++;
        else if(x> ex)
            x--;
        else if(y < ey)
            y++;
        else if(y>ey)
            y--;
    }
    public void moveAlongGrid()
    {
       if(absx < ex)
            absx+=10;
        if(absx> ex)
            absx-=10;
        if(absy < ey)
            absy+=10;
        if(absy>ey)
            absy-=10;  
    }
    public Point getPoint()
    {
        return new Point(absx,absy);
    }
}
