import java.util.*;
public class Maximum_Three 
{
    public static void main(String[] args) 
    {
        int No1= 0;
        int No2= 0;
        int No3= 0;
        Scanner S= new Scanner(System.in);
        System.out.print("\nEnter 1st Number: ");
        No1= S.nextInt();
        System.out.print("\nEnter 2nd Number: ");
        No2= S.nextInt();
        System.out.print("\nEnter 3rd Number: ");
        No3= S.nextInt();
        
        if(No1>No2 && No1>No3) 
        {
            System.out.print("\nNo1 is Maximum");
        }    
        else if(No2>No1 && No2>No3)
        {
            System.out.print("\nNo2 is Maximum");
        }
        else if(No3>No2 && No3>No2)
        {
            System.out.print("\nNo3 is Maximum");
        }
        else
        {
            System.out.print("\nAll Numbers are Equal");
        }

    }
    
}
