
/**
 * Write a description of class Number17 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Number17
{
    public static void main(String [] args) { 
        int[] arr = {10, 5, 20, 8, 20, 3};

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > highest) {
                secondHighest = highest;  // update second highest
                highest = num;            // update highest
            } else if (num > secondHighest && num != highest) {
                secondHighest = num;
            }
        }

        if (secondHighest == Integer.MIN_VALUE) {
            System.out.println("No second highest value found.");
        } else {
            System.out.println("Second highest number: " + secondHighest);
        }
    }
}