
/**
 * Write a description of class Number4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Number4
{
    public static void main(String [] args) {
        int [] arr4 = {12,5,89,2,45};
        int min = arr4[0];
        int max = arr4[0];
        
        for(int i = 1; i<arr4.length; i++) {
            if(arr4[i] < min)  min= arr4[i];
            if(arr4[i] > max)  max =arr4[i];
        }
        System.out.println("Smallest: " + min + "Largest: " + max);
    
            
            
        
    }
    }
