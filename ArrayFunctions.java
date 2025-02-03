import java.util.ArrayList; // Import ArrayList class
import java.util.Arrays; // Import Arrays class for easy conversion

public class ArrayFunctions {

    // Method for finding the index of the first number in the smallest distance pair
    public int findMinDistanceIndex(int[] array) {
        if (array.length < 2) {
            System.out.println("Array should have at least two elements.");
            return -1; // Return -1 if array has fewer than two elements
        }

        int minIndex = 0;
        int minDistance = Math.abs(array[1] - array[0]);

        // Loop through the array to find the smallest distance pair
        for (int i = 1; i < array.length - 1; i++) {
            int distance = Math.abs(array[i + 1] - array[i]);
            if (distance < minDistance) {
                minDistance = distance;
                minIndex = i;
            }
        }

        return minIndex; // Return the index of the smallest distance pair
    }

    // Method for converting array to ArrayList and back to array
    public void convertArrayAndBack(int[] array) {
        // Convert array to ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : array) {
            arrayList.add(num); // Add each element to ArrayList
        }
        System.out.println("Converted ArrayList: " + arrayList);

        // Convert ArrayList back to array
        int[] newArray = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            newArray[i] = arrayList.get(i); // Add elements back to array
        }
        System.out.println("Converted back to array: " + Arrays.toString(newArray)); // Print the new array
    }
}
