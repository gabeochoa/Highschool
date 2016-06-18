
/**
 * Write a description of class Grid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.util.*;
public class Grid
{
    int numRow,numCol,screenW,screenH;
    Sector[][] grid;
    Graphics g;
    public Grid(int r, int c, int w, int h)
    {
      numRow = r;
      numCol = c;
      screenW = w;
      screenH = h;
      
      grid = new Sector[numRow][numCol];
    }
    public void createGrid()
    {
       int  w = screenW/ numRow;
       int  h = screenH/ numCol;
      
        for(int i=0; i<grid.length;i++){
          for(int j=0; j<grid[i].length;j++){
             grid[i][j] = new Sector(i*w,j*h,w,h);
          }
      }  
    }
    public void setGrid(Sector[][] g){grid = g;}
    public Sector getSector(int mx,int my)
    {
        Point mouse = new Point(mx,my);
         for(int i=0; i<grid.length;i++)
          for(int j=0; j<grid[i].length;j++)
            if(grid[i][j].contains(mouse))
                return grid[i][j];
        return null;
    }
    public Sector getSector(Location loc){return grid[loc.getRow()][loc.getCol()];}
    
    public ArrayList<Sector> getPath()
    {
        return showPath(getStart(),getEnd());
    }
    public ArrayList<Sector> showPath(Sector cameFrom, Sector currentSpot)
    {
        if(cameFrom.n.isSameAs(getLocation(currentSpot) ) )
        {
            ArrayList<Sector> p = showPath(cameFrom, getSectorWithLocation(cameFrom) );
            p.add(currentSpot);
            return p;
        }
        return new ArrayList<Sector>();
    }
    public Sector getStart()
    {
        for(int i=0; i<grid.length;i++)
          for(int j=0; j<grid[i].length;j++)
            if(grid[i][j].start)
                return grid[i][j];
                return grid[0][0];
    }
    public Sector getEnd()
    {
        for(int i=0; i<grid.length;i++)
          for(int j=0; j<grid[i].length;j++)
            if(grid[i][j].end)
                return grid[i][j];  
                return grid[0][0];
    }
    public Location getLocation(Sector s)
    {
      for(int i=0; i<grid.length;i++)
          for(int j=0; j<grid[i].length;j++)
            if(grid[i][j] == s)
                return new Location(i,j); 
                return new Location(0,0);
    }
    public Sector getSectorWithLocation(Sector s)
    {
        for(int i=0; i<grid.length;i++)
          for(int j=0; j<grid[i].length;j++)
            if(grid[i][j].n.isSameAs(getLocation(s)))
                return grid[i][j]; 
                return grid[0][0];
    }
    public void draw(Graphics gr)
    {
        g = gr;
        
        for(int i=0; i<grid.length;i++)
          for(int j=0; j<grid[i].length;j++)
                grid[i][j].paint(g);
    }
    public Sector[][] getGrid(){return grid;}
}
