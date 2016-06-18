import java.awt.*;
import java.applet.*;
import java.util.*;
public class Sector
{

int x,y,w,h,p;
Graphics g;
Color C;
Random D = new Random();

public Sector()
{
    x = 10;
    y = 10;
    w = 10;
    h = 10;
    C = new Color(D.nextInt(225)+1,D.nextInt(225)+1,D.nextInt(225)+1,85);
    p = 0;
}
public Sector(int c, int v, int b, int n)
{
    x = c;
    y = v;
    w = b;
    h = n;
    //C = new Color(D.nextInt(225)+1,D.nextInt(225)+1,D.nextInt(225)+1,85);
     C = Color.black;//new Color(150,150,150+D.nextInt(105)+1,85);
     p = 0;
}
/////////////////////////////////////////////////////////////////////////
//===========================Methods===================================\\
/////////////////////////////////////////////////////////////////////////
public void paint(Graphics gr)
{
g = gr;
drawSector();
}
public void drawSector()
{
    g.setColor(C); 
    g.fillRect(x,y,w,h);
}
public void setOpacity(int o)
{
    C = new Color(C.getRed(),C.getGreen(),C.getBlue(),o);
}
public void resetp()
{
    p = 0;
}
public void altpop(int k)
{
    p += k;
}
public void setC(Color c)
{
    C = c;
}
public void resetC()
{
    C = new Color(D.nextInt(225)+1,D.nextInt(225)+1,D.nextInt(225)+1);
    C = Color.white;
}
public int getx()
{return x;}
public int gety()
{return y;}
public int getw()
{return w;}
public int geth()
{return h;}
public int getp()
{return p;}

public void ifInSector(Point B, int tc)
{
    Rectangle r = new Rectangle(x,y,w,h);
    if(r.contains(B))
    {C = Color.gray;}
    else if(tc % 10 == 0)
        {
            C = Color.black;
        }
        
}
}