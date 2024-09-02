import java.util.*;
public class User_Number 
{
    public static void main(String[] args) 
    {
        int N = 0;
        Scanner S = new Scanner(System.in);
         System.out.print("Enter a Number: ");
         N = S.nextInt();
          
         if(N < 10)
         {
            System.out.print("Hello");
         }
         else 
         {
            System.out.print("World");
         }
        
    }
    
}
