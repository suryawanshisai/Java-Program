import java.util.*;
public class Range_of_Table 
{
    public static void main(String[] args) 
    {
        int Num, Start = 0, End = 0;
        Scanner S = new Scanner(System.in);
        System.out.print("Enter Starting Range: ");
        Start = S.nextInt();
        System.out.print("Enter Ending Range: ");
        End = S.nextInt();
         System.out.print("Enter a Number: ");
         Num = S.nextInt();
          for(int i=Start; i<=End; i++)
          {
            System.out.println(Num + "*" + i + "=" + Num*i);
          }
        
    }
    
}
