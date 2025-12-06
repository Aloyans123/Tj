
/**
 * Write a description of class Number18 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class Number18
{
    public static void main(String[] args) {
        int[] arr = {4, 1, 9, 3, 1, 7};

        Arrays.sort(arr);  // Sort the array first

        boolean hasDuplicate = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {  // Adjacent elements equal → duplicate
                hasDuplicate = true;
                break;
            }
        }

        if (hasDuplicate) {
            System.out.println("The array contains duplicates.");
        } else {
            System.out.println("The array has no duplicates.");
        }
    }
}




    
