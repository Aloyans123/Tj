
/**
 * Write a description of class Number6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Number6
{
    public static void main(String [] args) { 
        int[] arr6 = {1,2,3,4,5,6};
        double sumOdd = 0;
        int countOdd = 0;
        
        for(int num : arr6) {
            if(num % 2 != 0) { //Check if odd
                sumOdd += num;
                countOdd ++;
            }
        }
         if(countOdd >0) {
             System.out.println("Average of odds: " + (sumOdd / countOdd));
            }else{ 
                System.out.println("No odd numbers found.");
         }
    }
}