import java.util.*;
public class EvenorOdd 
{
 public static void main(String[]args)
 {
    
    int no=0;
    System.out.println("Enter a Number: ");
    Scanner S = new Scanner(System.in);
    no= S.nextInt();
    
    if(no % 2 ==0)
    {
        System.out.println("Number is Even");
    }
    else
    {
        System.out.println("Number is odd");
    }
     
 }   
}
