
/**
 * Write a description of class SATCLASS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SATCLASS
{
    public static void RunSat(){
       String string;
        System.out.println("Enter your SAT grade: ");
       int SAT = ei.i();
            if(SAT>200 && SAT<300){
                string = "your score is in the low range";
                SOP(string);}
            else {if(SAT>300 && SAT<400){
                string = "Your score is in the medium low range";
                SOP(string);}
            else {if(SAT>400 && SAT<500){
                string = "Your score is in the medium range";
                SOP(string);}
            else{ if(SAT>500 && SAT<600){
                string = "Your score is in the medium high range";
                SOP(string);}
            else {if(SAT>600 && SAT<700){
                string = "Your score is in the high range";
                SOP(string); }
            else{
                string = "Your score is not in any range";
                SOP(string); }
            }
        }
    }
} 
}  

  public static void SOP(String string){
        
        System.out.println(string);
    }
    }

