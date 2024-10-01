import java.util.*;
public class Factorial 
{
    public static void main(String[] args) 
    {
        int Num, Fact = 1;
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        Num = S.nextInt();

        for(int i = 1; i <= Num; i++)
        {
            Fact = Fact * i;
        }        
        System.out.println("Factorial of " + Num + " is " + Fact);
    }
    
}
