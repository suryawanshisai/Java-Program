import java.util.*;
public class Temperature 
{
    public static void main(String[] args) 
    {
        double Fahrenheit = 0,Celcius = 0;
        Scanner S = new Scanner(System.in);

        System.out.print("Enter Temperature in Fahrenheit: ");
        Fahrenheit = S.nextDouble();

        Celcius = ((Fahrenheit-32)*5)/9;

        System.out.println("Temperature is " + Celcius);        
    }
    
}
