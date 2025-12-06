
/**
 * Write a description of class Number20 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Number20
{
    public static void main(String[] args) {
        int[] numbers = {5, 12, 22, 30, 17, 44, 21, 100};

        for (int num : numbers) {
            if (num > 20 && num % 2 == 0) {
                System.out.println(num);
            }
    }
   } 
}