import java.util.*;
public class Convert_case {
    public static void main(String[] args) {
        
        char ch;

        Scanner S = new Scanner(System.in);
        System.out.print("Enter the Character:");
        ch = S.nextLine().charAt(0);

        if(ch>='A' && ch<='Z')
        {
            char ch2 = Character.toLowerCase(ch);
            System.out.print(ch2);
        }

        else
        {
            char ch2 = Character.toUpperCase(ch);
            System.out.print(ch2);
        }
    }
    
}
