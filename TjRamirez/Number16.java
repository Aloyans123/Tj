
/**
 * Write a description of class Number16 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Number16
{
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int count = 0;
        int temp = Math.abs(num);  // handle negative numbers

        if (temp == 0) {
            count = 1; // 0 has one digit
        } else {
            while (temp > 0) {
                temp /= 10;
                count++;
            }
        }

        System.out.println("Number of digits: " + count);
    }
}

    
    
