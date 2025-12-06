
/**
 * Write a description of class Number1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Number1
{
    public static void main(String [] args) { 
        Scanner scanner = new Scanner(System.in);
        int number;
        
        while (true) {
            System.out.print("Enter a number between 1 and 100: ");
            if(scanner.hasNextInt()) { 
                number = scanner.nextInt ();
                
                if(number >= 1 && number <= 100) {
                   System.out.println("You entered a valid number: " + number);
                    
        

            }
    }
        }
    }
}