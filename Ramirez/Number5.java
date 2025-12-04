
/**
 * Write a description of class Number5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Number5
{
    public static void main(String [] args) {
        int [] arr5 = {10,20,99,40,50};
        for(int num : arr5) {
            if(num == 99) {
                System.out.print("Value 99 found! Stopping loop.");
                break;//Exits the loop immeadiately
            }
            System.out.println("Processing: " + num); 
            }
        }
    }
    
