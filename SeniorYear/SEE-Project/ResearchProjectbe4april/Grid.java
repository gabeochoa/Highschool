
/**
 * Write a description of class Grid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
public class Grid
{
    int numRow,numCol,screenW,screenH;
    Sector[][] grid;
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
    
}
