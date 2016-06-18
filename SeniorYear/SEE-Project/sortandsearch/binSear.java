
/**
 * Write a description of class binSear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class binSear
{
    
 public static customer Name(ArrayList sN,String c)
 {
    int first = 0;
    int upto = sN.size();
    
    while(first<upto)
    {
        int mid = (first + upto) /2;
        customer temp = (customer)sN.get(mid);
        if(c.compareTo(temp.getName()) > 0)
            upto = mid;
        else if(c.compareTo(temp.getName()) < 0)
            first = mid +1;
        else
            return temp;
    }
    return null;
 }

 public static customer ID(ArrayList sID,int c)
 {
        customer temp;
        int first = 0, upto=sID.size();
        while(first<upto)
        {
            int mid = (first+upto)/2;
            temp = (customer)sID.get(mid);
            if(c > temp.getNumber())
                upto = mid;
            else if(c <temp.getNumber())
                first = mid +1;
            else
                return temp;
        }
        return null;
    }
     public static customer Bal(ArrayList sB,int c)
    {
        customer temp;
        int first = 0, upto=sB.size();
        while(first<upto)
        {
            int mid = (first+upto)/2;
             temp = (customer)sB.get(mid);
            if(c > temp.getBalance())
                upto = mid;
            else if(c <temp.getBalance())
                first = mid +1;
            else
                return temp;
        }
        return null;
    }
/*public static customer getCust(int c) throws Exception
{
customer temp;
    for(int i = 0; i<sortID.size();i++)
    {
       temp = (customer) sortID.get(i);
        if(temp.getNumber() == c)
            return temp;
    }
    return null;
}
public static customer getCustBal(int c) throws Exception
{
customer temp;
    for(int i = 0; i<sortBalance.size();i++)
    {
       temp = (customer) sortBalance.get(i);
        if(temp.getBalance() == c)
            return temp;
    }
    return null;
}
public static customer getCustName(String c) throws Exception
{
customer temp;
    for(int i = 0; i<sortName.size();i++)
    {
       temp = (customer) sortName.get(i);
        if(temp.getName().equalsIgnoreCase(c))
            return temp;
    }
    return null;
}

*/
}
