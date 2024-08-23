import java.util.*;
public class Calculator 
{
    public static void main(String[] args) 
    {
        int Num1 = 0, Num2 = 0, Res = 0, Choice = 0;
        Scanner S = new Scanner(System.in);

        while(true)
        {
            System.out.println("Calculator");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Module");
            System.out.println("6.Exit");
            
            System.out.print("Select the Choice: ");
            Choice = S.nextInt();

            if((Choice > 0) && (Choice < 6))
            {
                System.out.println("Enter First Number: ");
                Num1 = S.nextInt();
                System.out.println("Enter Second Number: ");
                Num2 = S.nextInt();
            }

            switch(Choice)
            {
                case 1:
                        Res = Num1 + Num2;
                        System.out.println("\n Addition of " + Num1 +" & "+Num2 +" is = " + Res + ".");
                        break;

                case 2:
                        Res = Num1 - Num2;
                        System.out.println("\n Subtraction of " + Num1 +" & "+ Num2 + " is = " + Res +".");
                        break;
                
                case 3:
                        Res = Num1 * Num2;
                        System.out.println("\n Multiplication of " + Num1 + " & " +Num2 + " is = " + Res +".");
                        break;

                case 4:
                        Res = Num1 / Num2;
                        System.out.println("\n Division of " + Num1 +" & " + Num2 + " is = "+ Res +".");
                        break;

                case 5:
                        Res = Num1 % Num2;
                        System.out.println("\n Module of  " + Num1 + "  &  " + Num2 + " is = " + Res +".");
                        break;

                default:
                        System.out.println("Invalid!!!");

                     }

                     if(Choice ==6)
                     {
                        break;
                     }
        }
        System.out.println("Thank you for using a Calculator");
    
    }
    
}
