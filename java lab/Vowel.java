import java.util.*;
public class Vowel {
    public static void main(String[] args) 
    {
        char ch;
        char letter;
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a Letter:");
        ch = S.nextLine().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
        System.out.println("TRUE");
        else {
            System.out.println("FALSE");
        }        
    }
    
}
