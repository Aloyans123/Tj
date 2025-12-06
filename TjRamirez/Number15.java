
/**
 * Write a description of class Number15 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Number15
{
    public static void main(String [] args) { 
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) +": ");
            numbers[i] = input.nextInt();
        }
        System.out.println("Numbers greater than 50:");
        for(int num : numbers) {
            if(num > 50 ) {
                System.out.println(num);
            }
        }
    }
}