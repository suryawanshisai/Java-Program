import java.util.*;
public class Table 
{
    public static void main(String[] args) 
    {

        int i=1;
        int Num=0;
        Scanner S= new Scanner(System.in);
        System.out.print("\nEnter the Number: ");
        Num=S.nextInt();
        
        for(i=1;i<=10;i++)
        {
            System.out.println( Num + "*" + i + "=" + Num*i );
        } 

    }
    
}
