import java.util.*;
public class DaysOfWeek 
{
    public static void main(String[] args) 
    {

       int Day=0;
       Scanner S=new Scanner(System.in);
       System.out.println("Enter the Number(1-7): ");
       Day= S.nextInt();
       
       switch(Day)
       {
        case 1:
        System.out.println("Monday");
        break;
        case 2:
        System.out.println("Tueday");
        break;
        case 3:
        System.out.println("Wednesday");
        break;
        case 4:
        System.out.println("Thursday");
        break;
        case 5:
        System.out.println("Friday");
        break;
        case 6:
        System.out.println("Saturday");
        break;
        case 7:
        System.out.println("Sunday");
        break;
        default:
        System.out.println("Invalid day Number");
        
       }        
    }
    
}
