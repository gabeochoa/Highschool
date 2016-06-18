
/**
 * Write a description of class m here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class m
{
    String toConvert = "656667";
    byte[] returnVal = String2byteArr (toConvert );
    String FinalStr = new String(returnVal);

    public static byte[] String2byteArr(String Result)
    {
    byte[] byteRet = new byte[Result.length()/2];
    int k=0;
    for (int j=0; j<(Result.length()); j+=2)
    {
        try
            {
        Integer I = new Integer (0);

        I = I.decode ("0x",Result.substring(j, j+2));
        int i = I.intValue ();
        if (i > 127)
        i = i - 256;
        byteRet[k+] = new Integer(i).byteValue();
    }
    catch(Exception e)
    {
    System.err.println(e);
    }
    }

    return byteRet;
    }// String2byteArr
