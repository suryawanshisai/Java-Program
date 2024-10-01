import java.util.*;
public class Kilometer 
{
    public static void main(String[] args) 
    {
        double Kilometer = 0, Meter = 0;
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the distance in kilometer: ");
        Kilometer = S.nextInt();

        Meter = Kilometer * 1000;
        System.out.print("Distance in meter is: " + Meter);

        
    }
    
}
