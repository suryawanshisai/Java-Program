import java.util.*;
public class Student_Mark_Average 
{
    public static void main(String[] args) 
    {
        Scanner S = new Scanner(System.in);

        System.out.print("Enter Marks in Subject 1: ");
        int Num1 = S.nextInt();

        System.out.print("Enter Marks in Subject 2: ");
        int Num2 = S.nextInt();

        System.out.print("Enter Marks in Subject 3: ");
        int Num3 = S.nextInt();

        int Total = Num1 + Num2 + Num3;
        float Percentage = (float)Total /3;

        System.out.println("Total Marks: " +Total+"\nPercentage: "+Percentage+" % ");
   
    }
    
}
