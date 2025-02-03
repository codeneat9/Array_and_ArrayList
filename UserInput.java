import java.util.*;

public class UserInput {
    
    public int[] arrayInput() {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the given size
        int[] array = new int[size];

        // Prompt the user to enter the array elements
        System.out.println("Enter " + size + " numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array; // Return the dynamically sized array
    }
}