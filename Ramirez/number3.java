
/**
 * Write a description of class number3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class number3
{
  public static void main(String [] args) {
      int maxRows = 5;
      
      for (int i = 0; i <= maxRows; i++) {
          for (int j = 1; j <= i; j++) {
          System.out.print("*");
        }
           System.out.println();
     } 
  }
}