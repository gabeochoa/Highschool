public class Grid
{
    
    Sector[][] locations = new Sector[50][50];
    int width,height;
    public Grid(int w, int h)
    {
      this.width = w;
      this.height = h;
      setUpSectors();  
    }
    
    public void setUpSectors()
    {
       int  w = width/ locations.length;
       int  h = height/ locations[0].length;
      
        for(int i=0; i<locations.length;i++){
          for(int j=0; j<locations[i].length;j++){
             locations[i][j] = new Sector(i*w,j*h,w,h);
          }
      }    
      
    }
    
    
}