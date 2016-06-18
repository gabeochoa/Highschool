/**
 * StringClass demonstrates the following methods
 * that we will be working with from the String Class
 * (Note: There are many more methods that can be 
 *  used with Strings.  Feel free to explore those 
 *  methods)
 *  String1.equals(String2)      -->Return type: boolean
 *  String1.indexOf(String2)     -->Return type: int
 *  String1.compareTo(String2)   -->Return type: int
 *  String1.length()             -->Return type: int
 *  String1.substring(int1)      -->Return type: String
 *  String1.substring(int1, int2)-->Return type: String
 
 * Mr. Cleary 
 * November 4, 2010
 */
public class StringClass
{

    public static int location;
    public static int i2;
    public static String s1 = "apple";
    public static String s2 = "Apple";
    public static String s3 = "Banana";
    public static String s4 = "Avocado";
    public static String s5 = "it is raining outside today";
    public static String s6 = "Soon it will be snowing";
    public static boolean BOOL;
    public static void main()
    {
        //Creating String objects 
      
       // System.out.println("\nString one is '"+s1+" '");
       //System.out.println("String two is '"+s2+" '");     
       
      //check to see if the Strings are equal
       //(String1.equals(String2))
       //parameter received: String Object
       //return type: boolean
     /* 
       BOOL = (s1.equals(s2));
       System.out.println("(s1.equals(s2)) is "+BOOL);    
       System.out.println("("+s1+" is the same word as ("+s2+")) is "+BOOL); 
       System.out.println("\n          BUT              \n "); 
      BOOL = (s1.equalsIgnoreCase(s2));
       System.out.println("(s1.equalsIgnoreCase(s2)) is "+BOOL);    
       System.out.println("("+s1+" is the same word (ignore any uppercase letters) as ("+s2+")) is "+BOOL);
      */
      //check where the first occurence of String s2 is in String1
      //String1.indexOf(s2)
      //parameter received: String Object
      //return type: int (the index of the first occurence of s2)
      
      /*  String let = "p";
       
        int location = s1.indexOf(let);
        System.out.println(let+" is at location "+location+" in "+s1);
        location = s3.indexOf(let);
        System.out.println(let+" is at location "+location+" in "+s3);
        
        let = "rain";
        location = s5.indexOf(let);
        System.out.println(let+" is at location "+location+" in '"+s5+"'");
      */ 
     
     //Length of a String or number of characters including spaces
     
        int length = s6.length();
        System.out.println(s6+" is "+length+" characters long.");
       
        length = s4.length();
        System.out.println(s4+" is "+length+" characters long.");
       
     //check to see which word comes first alphabetically String1 or String2
     //String1.compareTo(String2)
     //parameter received: String Object
     //return type: int 
     //(subtracts the value of the first letters that are different) 
     //(String1 minus String2)
    
   
     int x = s1.compareTo(s2);
     System.out.println(s1+" minus "+s2+" = "+x);
      x = s4.compareTo(s6);
      if (x<0)
      {
           System.out.println(s4+" comes before "+s6+" in the alphabet");
        }
     else{
         System.out.println(s6+" comes before "+s4+" in the alphabet");
       
        }
   
   //There are TWO substring Methods that return a piece
   //of the original String
   //substring(int i) 
   //parameter received: int i
   //return type: String Object (from index i to the end) 
   
   
   
   
   
   
   
   //substring(int i, int j)
   //parameter received: int i , int j
   //return type: String object 
   //(from index i(inclusive) to index j(excusive))
   //***THIS ONE IS USED TO TRAVERSE THE STRING OBJECT*****
   //Lets see how they work
   
      String subs;
      int i = s2.length();
      for (x=0;x<(i);x++){
      subs = s2.substring(x,x+1);
      System.out.println("The substring of "+s2+" is "+subs);
    }
                     
   //Test to see how many vowels are in a given String
       
       String temp = "";
       int vowel=0;
      i = s5.length();
      for (x=0;x<(i);x++){
      temp = s5.substring(x,x+1);
      if(
            (temp.equalsIgnoreCase("a"))
                        ||
            (temp.equalsIgnoreCase("e"))
                        ||
            (temp.equalsIgnoreCase("i"))
                        ||
            (temp.equalsIgnoreCase("o"))
                        ||
            (temp.equalsIgnoreCase("u"))
        ){vowel++;}
        else{}
      System.out.println("The substring of "+s5+" is "+temp);
    }
        System.out.println("There are "+vowel+" many vowels in "+s5+".");
    
      
      
   }//end main
}//end class