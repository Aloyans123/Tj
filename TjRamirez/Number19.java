
/**
 * Write a description of class Number19 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Number19
{
    public static void main(String[] args) {

        String[] students = {"Alice", "Bob", "Charlie", "Diana"};
        int[] grades = {90, 85, 78, 92};

        // Make sure both arrays have the same length
        if (students.length != grades.length) {
            System.out.println("Error: Arrays are not the same size.");
            return;
        }

        // Match by index
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + " has a grade of " + grades[i]);
        }
    }
}