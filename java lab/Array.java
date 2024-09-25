import java.util.*;
public class Array 
{
    public static void main(String[] args) 
    {
        int[] numbers = {10,20,30,40,50};

        System.out.println("\nArray length: " + numbers.length + "\n");

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("\t Element at index " + i + ": " + numbers[i]);
        }        
    }
    
}
