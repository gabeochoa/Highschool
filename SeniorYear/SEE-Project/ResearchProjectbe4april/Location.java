
/**
 * Write a description of class Location here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Location
{
    int row,col;
    public static final int LEFT = -90;
    public static final int RIGHT = 90;
    public static final int NORTH = 0;
    public static final int EAST = 90;
    public static final int SOUTH = 180;
    public static final int WEST = 270;
    
    public static final int HALF_LEFT = -45;
    public static final int HALF_RIGHT = 45;
    public static final int FULL_CIRCLE = 360;
    public static final int HALF_CIRCLE = 180;
    
    public static final int NORTHEAST = 45;
    public static final int SOUTHEAST = 135;
    public static final int SOUTHWEST = 225;
    public static final int NORTHWEST = 315;

    public static final Location player = new Location(2,2);
    public static final Location enemy = new Location(4,4);
    
    public Location(int r, int c)
    {
        row = r;
        col = c;
    }
    public int getRow(){return row;}
    public int getCol(){return col;}
    
    public Location getLocation(int direction)
    {
       // reduce mod 360 and round to closest multiple of 45
        int adjustedDirection = (direction + HALF_RIGHT / 2) % FULL_CIRCLE;
        if (adjustedDirection < 0)
            adjustedDirection += FULL_CIRCLE;

        adjustedDirection = (adjustedDirection / HALF_RIGHT) * HALF_RIGHT;
        int dc = 0;
        int dr = 0;
        if (adjustedDirection == EAST)
            dc = 1;
        else if (adjustedDirection == SOUTHEAST)
        {
            dc = 1;
            dr = 1;
        }
        else if (adjustedDirection == SOUTH)
            dr = 1;
        else if (adjustedDirection == SOUTHWEST)
        {
            dc = -1;
            dr = 1;
        }
        else if (adjustedDirection == WEST)
            dc = -1;
        else if (adjustedDirection == NORTHWEST)
        {
            dc = -1;
            dr = -1;
        }
        else if (adjustedDirection == NORTH)
            dr = -1;
        else if (adjustedDirection == NORTHEAST)
        {
            dc = 1;
            dr = -1;
        }
        return new Location(getRow() + dr, getCol() + dc);  
    }
    
    public int getDirectionToward(Location target)
    {
       int dx = target.getCol() - getCol();
       int dy = target.getRow() - getRow();
        // y axis points opposite to mathematical orientation
        int angle = (int) Math.toDegrees(Math.atan2(-dy, dx));

        // mathematical angle is counterclockwise from x-axis,
        // compass angle is clockwise from y-axis
        int compassAngle = RIGHT - angle;
        // prepare for truncating division by 45 degrees
        compassAngle += HALF_RIGHT / 2;
        // wrap negative angles
        if (compassAngle < 0)
            compassAngle += FULL_CIRCLE;
        // round to nearest multiple of 45
        return (compassAngle / HALF_RIGHT) * HALF_RIGHT;  
    }
    
    public String toString()
    {
        return "(" + getRow() + ", " + getCol() + ")";
    }
}
