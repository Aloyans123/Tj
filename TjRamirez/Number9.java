
/**
 * Write a description of class Number9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;   
public class Number9
{
     public static void main(String [] args) {
        Scanner console = new Scanner(System.in);
        int sum9 = 0;
        int input9;
        System.out.println("Enter numbers to add (enter 0 to stop):");
        while(true) {
            input9  = console.nextInt();
            if(input9 == 0 ) {
            sum9 +=input9;
            break;
        }
        System.out.println("Total Sum:" + sum9);
    }
 }
}
