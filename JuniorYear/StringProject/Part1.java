
/**
 * Write a description of class Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part1
{
    public static String menu,s1,s2,s3;
    public static int x = 1,numt,numg,place=0;
    public static void main()
    {
      System.out.println("Enter First word");
        s1 = ei.s();
      System.out.println("Enter Second word");
        s2= ei.s();
      System.out.println("Enter Third word");
        s3 = ei.s();
        System.out.println("\nWhat Would You Like To Do?");
         menu = "yes";
        while(menu.equalsIgnoreCase("yes")){
          System.out.println("1) output the names lengths.");
          System.out.println("2) output the string with the longest length");
          System.out.println("3) output the string which comes first alphabetically");
          System.out.println("4) split string of choice"); 
          System.out.println("5) Number of g's in string of choice");
          System.out.println("6) count the number of t's in your string.");
          System.out.println("7) output the three strings in alphabetical order.");
          System.out.println("8)input three new strings");
          System.out.println("9) Quit\n");
          String cont = ei.s();
         if(cont.equalsIgnoreCase("1")||cont.equalsIgnoreCase("all")){menu="exit"; all();}
        else if(cont.equalsIgnoreCase("2")||cont.equalsIgnoreCase("longest")){ menu="exit";longest();}
        else if(cont.equalsIgnoreCase("3")||cont.equalsIgnoreCase("first")){ menu="exit";first();}
        else if(cont.equalsIgnoreCase("4")||cont.equalsIgnoreCase("split")){ menu="exit";split();}
        else if(cont.equalsIgnoreCase("5")||cont.equalsIgnoreCase("numg")){ menu="exit";numg();}
        else if(cont.equalsIgnoreCase("6")||cont.equalsIgnoreCase("numt")){ menu="exit";numt();}
        else if(cont.equalsIgnoreCase("7")||cont.equalsIgnoreCase("alpha")){ menu="exit";alpha();}
        else if(cont.equalsIgnoreCase("8")||cont.equalsIgnoreCase("new")){ menu="exit";input();}
        else if(cont.equalsIgnoreCase("9")||cont.equalsIgnoreCase("quit")){ menu="exit";Quit();}
        else if(cont.equalsIgnoreCase("10")||cont.equalsIgnoreCase("clear")){ menu="exit";clearScreen();}
        else {System.out.println("\nYou didn't Choose an item on the menu.\n");}
        }
    }
       
       public static void all()
       {
           int len1 = s1.length();
           int len2 = s2.length();
           int len3 = s3.length();
            System.out.println("Your strings:\n"+s1+" is "+len1+" letters long."); 
            System.out.println(s2+" is "+len2+" letters long.\n"+s3+" is "+len3+" letters long"); 
            menu();
       }
       public static void longest()
       {
           int pos;
           int len1 = s1.length();
           int len2 = s2.length();
           int len3 = s3.length();
           if ((len1>len2))
           {
                if(len1>len3){System.out.println(s1+" is the longest at "+len1+" letters");}
                else{ if(len3>len2){System.out.println(s3+" is the longest at "+len3+" letters");}
                      else{System.out.println(s2+" is the longest at "+len2+" letters");}
                    }
            }
           else
           {
              if(len2>len3){System.out.println(s2+" is the longest at "+len2+" letters");}  
              else{System.out.println(s3+" is the longest at "+len3+" letters");}
            }
            menu();
        }
       public static void first()
       {
          String temp = returnfirst();
          System.out.println("The string that comes first alphabeticaly is "+temp);
          menu();
       }
       public static String returnfirst()
       {
             if((s1.compareToIgnoreCase(s2))<0)
          {
            if((s1.compareToIgnoreCase(s3))<0){return s1;}
            else{if((s2.compareToIgnoreCase(s3)>0)){return s3;}
                 else{return s2;}}
           }
            else
           {
            if((s2.compareToIgnoreCase(s3))<0){return s2;}
            else{return s3;}   
           }
        }
       public static void split(){
            System.out.println("Which string? "+s1+", "+s2+" or "+s3);
            String choice = ei.s();
            if((choice.equalsIgnoreCase(s1)))
                {
                    int split = s1.length();
                    if(split % 2 != 0){split++;}
                    else{}
                    int halfpoint = (split/2);
                    String sub1 = s1.substring(0,halfpoint);
                    if(split % 2 != 0){split--;}
                    else{}
                    String sub2 = s1.substring(halfpoint,split);
                    System.out.println("the string "+s1+" has been split into:");
                    System.out.println("    "+sub1);
                    System.out.println("    "+sub2+"\n");
                    
                    menu();
                }
            else if((choice.equalsIgnoreCase(s2)))
                {
                    int split = s2.length();
                    int sdiv2 = (split/2);
                    
                    String sub1 = s2.substring(0,sdiv2);
                    String sub2 = s2.substring(sdiv2,split);
                    System.out.println("the string "+s2+" has been split into:");
                    System.out.println("    "+sub1);
                    System.out.println("    "+sub2+"\n");
                    choice = ei.s();
                    menu();
                }
            else if((choice.equalsIgnoreCase(s3)))
                {
                    int split = s3.length();
                    int sdiv2 = split/2;
                    String sub1 = s3.substring(0,sdiv2);
                    String sub2 = s3.substring(sdiv2,split);
                    System.out.println("the string "+s3+" has been split into:");
                    System.out.println("    "+sub1);
                    System.out.println("    "+sub2+"\n");
                    choice = ei.s();
                    menu();
                }
        }
       public static void numg()
       {
            place = 0;
            x = 0;
          System.out.println("Which string? "+s1+", "+s2+" or "+s3);
            String str = ei.s();
            int len = str.length();
            String uplet = str.toUpperCase();
          while(x<len)
            {
              char letteru = uplet.charAt(place);
              int letter = countg(letteru);
              place++;
              x++;
            }
          System.out.println("the number of g's is "+numg);
          menu(); 
        } 
       public static int countg(char h1)
       {
           int l=0;
           int loop = 1;
           while(loop == 1){
             if(h1 == 'G'){numg++;loop=0;}
             else {numg+=0;loop=0;}
           } 
      
         return l;
       }
       public static void numt()
       {
           place=0;
           x=0;
        System.out.println("Which string? "+s1+", "+s2+" or "+s3);
            String str = ei.s();
          int len = str.length();
          String uplet = str.toUpperCase();
            while(x<len)
            {
              char letteru = uplet.charAt(place);
              int letter = countt(letteru);
              place++;
              x++;
            }
          System.out.println("the number of t's is "+numt+"\n");
          menu(); 
        }
       public static int countt(char h1)
       {
           int l=0;
           int loop = 1;
           while(loop == 1){
             if(h1 == 'T'){numt++;loop=0;}
             else {numt+=0;loop=0;}
           } 
      
         return l;
       }
       public static void alpha()
       {
             if((s1.compareToIgnoreCase(s2))<0)
         {
            if((s1.compareToIgnoreCase(s3))<0){s1first();}
            else{s1second();}
         }
         else
         {
            if((s1.compareToIgnoreCase(s3))>0){s1last();}
            else{s1second();}   
         }
        }
       public static void s1first()
       {
        if((s2.compareToIgnoreCase(s3))<0)
        {
           System.out.println("In Alphabetical Order:");
            System.out.println("1. "+s1);
             System.out.println("2. "+s2);
              System.out.println("3. "+s3);
        }
        else
        {
           System.out.println("In Alphabetical Order:");
            System.out.println("1. "+s1);
             System.out.println("2. "+s3);
              System.out.println("3. "+s2);
        }  
       }
       public static void s1second()
       {
        if((s2.compareToIgnoreCase(s3))<0)
        {
           System.out.println("In Alphabetical Order:");
            System.out.println("1. "+s2);
             System.out.println("2. "+s1);
              System.out.println("3. "+s3);
                menu();
        }
        else
        {
           System.out.println("In Alphabetical Order:");
            System.out.println("1. "+s3);
             System.out.println("2. "+s1);
              System.out.println("3. "+s2);
                menu();
        }     
       }
       public static void s1last()
       {
         if((s2.compareToIgnoreCase(s3))<0)
         {
           System.out.println("In Alphabetical Order:");
            System.out.println("1. "+s2);
             System.out.println("2. "+s3);
              System.out.println("3. "+s1);
                menu();
         }
         else
         {
           System.out.println("In Alphabetical Order:");
            System.out.println("1. "+s3);
             System.out.println("2. "+s2);
              System.out.println("3. "+s1);
                menu();
         }   
        }
       public static void input()
       {
         System.out.println("Enter First word");
           s1 = ei.s();
         System.out.println("Enter Second word");
           s2= ei.s();
         System.out.println("Enter Third word");
           s3 = ei.s();
         menu();
       }
       public static void Quit(){clearScreen();}
       public static void menu()
       {
         System.out.println("\nWhat Would You Like To Do?");
         menu = "yes";
        while(menu.equalsIgnoreCase("yes")){
          System.out.println("1) output the names lengths.");
          System.out.println("2) output the string with the longest length");
          System.out.println("3) output the string which comes first alphabetically");
          System.out.println("4) split string of choice"); 
          System.out.println("5) Number of g's in string of choice");
          System.out.println("6) count the number of t's in your string.");
          System.out.println("7) output the three strings in alphabetical order.");
          System.out.println("8)input three new strings");
          System.out.println("9) Quit (will clear screen when quitting)");
          System.out.println("10) Clear Screen\n");
          String cont = ei.s();
         if(cont.equalsIgnoreCase("1")||cont.equalsIgnoreCase("all")){menu="exit"; all();}
        else if(cont.equalsIgnoreCase("2")||cont.equalsIgnoreCase("longest")){ menu="exit";longest();}
        else if(cont.equalsIgnoreCase("3")||cont.equalsIgnoreCase("first")){ menu="exit";first();}
        else if(cont.equalsIgnoreCase("4")||cont.equalsIgnoreCase("split")){ menu="exit";split();}
        else if(cont.equalsIgnoreCase("5")||cont.equalsIgnoreCase("numg")){ menu="exit";numg();}
        else if(cont.equalsIgnoreCase("6")||cont.equalsIgnoreCase("numt")){ menu="exit";numt();}
        else if(cont.equalsIgnoreCase("7")||cont.equalsIgnoreCase("alpha")){ menu="exit";alpha();}
        else if(cont.equalsIgnoreCase("8")||cont.equalsIgnoreCase("new")){ menu="exit";input();}
        else if(cont.equalsIgnoreCase("9")||cont.equalsIgnoreCase("quit")){ x = 0; menu="exit";Quit();}
        else if(cont.equalsIgnoreCase("10")||cont.equalsIgnoreCase("clear")){ x = 1; menu="exit";clearScreen();}
        else {System.out.println("\nYou didn't Choose an item on the menu.\n");}
        }}
       public static void clearScreen()
       {
                System.out.println("\u000c");
                if(x == 1){menu();}
                 else{}
       }
    }
