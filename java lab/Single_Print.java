import java.util.*;
public class Single_Print 
{
    public static void main(String[] args) 
    {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter Student Name:\t");
        String Name = S.nextLine();

        System.out.print("Enter Roll No:\t");
        int Num = S.nextInt();

        System.out.print("Enter Course: \t");
        String Course = System.console().readLine();

        System.out.print("Enter City: \t");
        String City = System.console().readLine();

        System.err.println("\nStudent Name: " +Name+ "\nRoll No: " +Num+ "\nCourse: " +Course+ " \nCity: " +City);

    }
    
}
