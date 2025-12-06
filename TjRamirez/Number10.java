
/**
 * Write a description of class Number10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Number10
{
    public static void main(String [] args) { 
        int[] arr10 = {1,3,5,8,9,10};
        int index = -1;
        
        for(int i = 0; i <arr10.length; i++) { 
            if(arr10[i] % 2 == 0 ) { 
                index = i; 
                break;
    }
  }
  System.out.println("Index of first even number:" + index);
    }
}