
/**
 * Write a description of class Number7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class Number7
{
    public static void main(String [] args ) {
        int[] arr7 = {-5,10,-2,20};
        for(int i = 0; i <arr7.length; i++) {
            if(arr7[i] < 0) {
                arr7[i] = Math.abs(arr7[i]);
            }
        }
        System.out.println("Positives:" + Arrays.toString(arr7));
    }
    }
