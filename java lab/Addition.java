
import java.util.*;
public class Addition 
{
    public static void main(String[]args)
    {

        int no1= 0;
        int no2= 0;
        int sum= 0;
        Scanner S = new Scanner(System.in);
        System.out.print("\nEnter 1st no: ");
        no1= S.nextInt();
        System.out.print("\nEnter 2nd no: ");
        no2= S.nextInt();
        sum= no1+no2;
        System.out.print("\nAddition is :" +sum);

    }
}