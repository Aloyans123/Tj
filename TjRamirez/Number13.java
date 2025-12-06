
/**
 * Write a description of class Number13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Number13
{
    public static void main(String [] args ) {
        int[] scores = {88,74,92,67,75,81,59,100};
        int passCount = 0;
        int failCount = 0; 
        
        for(int score : scores) { 
            if(score >=75) {
                passCount++; 
            }else{ 
                 failCount++;
        
        
            }
        }
        System.out.println("Number of student passing (>=75): " + passCount);
        System.out.println("Number of student failing (<=75): " + failCount);
    }
}
