//Name: Yashwith Behara
//PRN: 23070126151
//Batch: AIML B3
 

public class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput(); // Create UserInput object
        ArrayFunctions arrayFunctions = new ArrayFunctions(); // Create ArrayFunctions object

        // Getting user input
        int[] numbers = userInput.arrayInput(); 

        // Separating even and odd numbers
        EvenOddSeparator separator = new EvenOddSeparator(); 
        separator.separateEvenOdd(numbers); 

        // Finding index of first number in the smallest distance pair
        int minIndex = arrayFunctions.findMinDistanceIndex(numbers); 
        System.out.println("Index of first number in the pair with the smallest distance: " + minIndex);

        // Convert array to ArrayList and back to array
        System.out.println("Converting array to ArrayList and back to array:");
        arrayFunctions.convertArrayAndBack(numbers); 
    }
}