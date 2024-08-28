import java.util.*;
public class Area_Rectangle 
{
   public static void main(String[] args) 
    {
        double Height=0,Width=0,area=0;
        Scanner S = new Scanner(System.in);

        System.out.print("Enter Height: ");
        Height = S.nextDouble();

        System.out.print("Enter Width: ");
        Width = S.nextDouble();

        area = Height * Width;

        System.out.println("Area of Rectangle "+ area);
        
    }
    
}
