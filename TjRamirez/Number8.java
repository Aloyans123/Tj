
/**
 * Write a description of class Number8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class Number8
{
        public static void main(String [] args ) {
        int [] arrayA = {10,20,30};
        int [] arrayB = new int[arrayA.length];
        
        for(int i = 0; i <arrayA.length; i++) { 
            arrayB[i] = arrayA[i];
    }
    System.out.println("Array B copied:" + Arrays.toString(arrayB));
    }
}