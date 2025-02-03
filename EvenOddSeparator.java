import java.util.*; // Importing ArrayList class

public class EvenOddSeparator {
    
    public void separateEvenOdd(int[] array) {
        ArrayList<Integer> even = new ArrayList<>(); // List for even numbers
        ArrayList<Integer> odd = new ArrayList<>();  // List for odd numbers

        // Loop through the array to classify numbers
        for (int num : array) {
            if (num % 2 == 0) {
                even.add(num); // Add to even list
            } else {
                odd.add(num);  // Add to odd list
            }
        }

        // Print even and odd numbers
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}