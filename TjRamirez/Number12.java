
/**
 * Write a description of class Number12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Number12
{
    public static void main(String [] args ) {
        int[] arr12 = {2,5,2,8,2,9};
        int target = 2; 
        int occurences = 0;
        boolean appearsThrice = false; 
        
        for(int num : arr12) {
            if(num == target) //occurences ++;
            if(occurences>= 3) { 
                appearsThrice = true; 
                break;
        }
    }
    System.out.println("Appears atleast 3 times " + appearsThrice);
    }
}