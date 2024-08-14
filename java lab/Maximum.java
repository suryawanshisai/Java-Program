import java.util.*;
public class Maximum 
{
    public static void main(String[] args) 
    {

     int no1=0;
     int no2=0;
     Scanner S=new Scanner(System.in);
     System.out.println("Enter 1st number: ");
     no1= S.nextInt();
     System.out.println("Enter 2nd number:");
     no2= S.nextInt();
   
     if(no1>no2)
     {
        System.out.println("no1 is Maximun");
     }   
     else if(no1<no2)
     {
        System.out.println("no2 is Maximum");
     }
     else
     {
        System.out.println("Both nos are equal");
     }
     
    }
    
}
