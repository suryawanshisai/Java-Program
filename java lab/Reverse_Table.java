import java.util.*;
public class Reverse_Table 
{
    public static void main(String[] args) 
    {
        int i= 10;
        int Num= 0;
        Scanner S= new Scanner(System.in);
        System.out.print("\nEnter a Number: ");
        Num= S.nextInt();

        for(i=10;i>=1;i--)
        {
            System.out.println( Num + "*" + i + "=" + Num*i );

        }
        
    }
    
}
