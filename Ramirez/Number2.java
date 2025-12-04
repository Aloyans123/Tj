
/**
 * Write a description of class Number2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Number2
{
    public static void main(String [] args) {
        int[] arr = { 17, 7,27,3,7,42,5,7,6,7};
        int target = 7;
        int count = 0; 
        
        int count7 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 7) {
                count7++;
      }
     }   
      System.out.println(" The number " + " appears " + count + " times. "); 
        
    }  
}
