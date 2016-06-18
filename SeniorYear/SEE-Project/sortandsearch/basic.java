import java.util.*;
public class basic
{

public static void quickSortNumber(customer numbers[])
{
    q_sort(numbers,0,numbers.length-1);
}


public static void q_sort(customer numbers[], int left, int right)
{
    int pivot, lhold, rhold;
    
    lhold = left;
    rhold = right;
    pivot = numbers[right].getNumber();
    
    while(left < right)
    {
        while( (numbers[right].getNumber() >= pivot) && (left < right))
           right--;
        if(left!=right)
        {
            numbers[left] = numbers[right];
            left++;
        }   
        while( (numbers[left].getNumber() <= pivot)&&(left < right))
        left++;
        if(left != right)
        {
            numbers[right] = numbers[left];
            right--;
        }
    }
      numbers[left] = numbers[pivot];
      pivot = left;
      left = lhold;
      right = rhold;
      if(left < pivot)
       q_sort(numbers,left,pivot-1);
      if(right > pivot)
       q_sort(numbers,pivot+1,right);
    
}

public void bubble(int numbers[])
{
int temp;
   for(int i = 0; i< numbers.length; i++)
    for(int j = 1; j<= i; j++)
        if(numbers[j-1] > numbers[j])
           {
                temp = numbers[j-1];
                numbers[j-1] = numbers[j];
                numbers[j] = temp;
            }
}


public static void bubbleA(customer a[])
{
customer temp;
   for(int i = 0; i< a.length; i++)
    for(int j = 1; j<= i; j++)
        if(a[j-1].getNumber() > a[j].getNumber())
           {
                temp = a[j-1];
                a[j-1] = a[j];
                a[j] = temp;
            }
}
public static ArrayList bubbleALID(ArrayList a)
{
    ArrayList arr = a;
    customer temp,temp2;
   for(int i = 0; i< arr.size(); i++)
    for(int j = 1; j<= i; j++)
        {
           temp = (customer) arr.get(j-1); 
           temp2 = (customer) arr.get(j);
           if(temp.getNumber() > temp2.getNumber())
           {
                temp = (customer) a.get(j-1);
                a.set(j-1,a.get(j));
                a.set(j,temp);
            }
        }   
            return arr;
}

public static ArrayList bubbleALBal(ArrayList a)
{
    ArrayList arr = a;
    customer temp,temp2;
   for(int i = 0; i< arr.size(); i++)
    for(int j = 1; j<= i; j++)
        {
           temp = (customer) arr.get(j-1); 
           temp2 = (customer) arr.get(j);
           if(temp.getBalance() > temp2.getBalance())
           {
                temp = (customer) a.get(j-1);
                a.set(j-1,a.get(j));
                a.set(j,temp);
                //System.out.println(temp.toString());
            }
        }   
            return arr;
}
public static ArrayList bubbleALName(ArrayList a)
{
    ArrayList arr = a;
    customer temp,temp2;
    int count = 0;
    String progress ="";
    System.out.println("Sorting, Please Wait....");
    
   for(int i = 0; i< arr.size(); i++)
    for(int j = 1; j<= i; j++)
        {
           temp = (customer) arr.get(j-1); 
           temp2 = (customer) arr.get(j);
           if(temp.getName().compareTo(temp2.getName()) < 0)
           {
                temp = (customer) a.get(j-1);
                a.set(j-1,a.get(j));
                a.set(j,temp);
            }
        }   
            return arr;
}

public static String getLet()
{
    Random andom = new Random();
    String abc[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    int rand = (int) andom.nextInt(25);
    String str = abc[rand+1];
    return str;
}


public static int getBal()
{
    Random andom = new Random();
    return andom.nextInt(600);
}

}