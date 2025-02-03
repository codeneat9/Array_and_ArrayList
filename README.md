# Array Manipulation and Number Separation in Java

This Java project demonstrates array manipulation techniques, including user input for creating an array, separating even and odd numbers, finding the smallest distance pair in an array, and converting between arrays and ArrayLists. The project showcases basic Java programming concepts such as loops, conditional statements, and working with collections like arrays and ArrayLists.

## Project Description

The project is structured around four main classes:
- **Main**: The entry point of the application, which drives the logic by calling other classes and methods.
- **UserInput**: Handles user interaction to receive array input.
- **ArrayFunctions**: Contains functions that manipulate arrays, such as finding the smallest distance pair and converting between arrays and ArrayLists.
- **EvenOddSeparator**: Separates even and odd numbers from the given array and prints them.

## Code Explanation

### 1. **Main Class**

The `Main` class serves as the central controller. It manages the flow of the application by:
- Creating instances of `UserInput`, `ArrayFunctions`, and `EvenOddSeparator`.
- Calling methods from these classes to perform actions such as getting user input, separating even and odd numbers, finding the smallest distance pair in the array, and converting between arrays and ArrayLists.

#### Key Operations in the Main Class:
- `userInput.arrayInput()` is called to take the user's array input.
- The array is then passed to `EvenOddSeparator` for even/odd separation using `separator.separateEvenOdd()`.
- `arrayFunctions.findMinDistanceIndex()` finds the index of the smallest distance pair in the array.
- The array is then passed to `arrayFunctions.convertArrayAndBack()` to demonstrate converting between arrays and ArrayLists.

### 2. **UserInput Class**

The `UserInput` class is responsible for interacting with the user to gather input for the array.

#### Key Operations:
- `arrayInput()` prompts the user to enter the size of the array and then each element of the array.
- The user input is captured and returned as an integer array.

### 3. **ArrayFunctions Class**

The `ArrayFunctions` class performs various array manipulations.

#### Key Operations:
- `findMinDistanceIndex(int[] array)` calculates the smallest distance between consecutive numbers in the array and returns the index of the first number in the pair with the smallest difference.
- `convertArrayAndBack(int[] array)` converts the given array into an ArrayList and then converts the ArrayList back into an array, printing both representations.

### 4. **EvenOddSeparator Class**

The `EvenOddSeparator` class is tasked with separating even and odd numbers from the provided array.

#### Key Operations:
- `separateEvenOdd(int[] array)` loops through the array and classifies each number as even or odd. It stores even numbers in an `ArrayList` called `even` and odd numbers in an `ArrayList` called `odd`.
- The method then prints out the lists of even and odd numbers.

## How the Project Works

1. The program starts by asking the user to input the size of the array and the elements of the array.
2. The array is then processed:
   - Even and odd numbers are separated and printed.
   - The index of the first number in the pair with the smallest distance between two consecutive numbers is found and displayed.
   - The array is converted to an ArrayList and then back to an array, with both conversions being displayed.

## Conclusion

This project is an excellent way to practice basic array manipulations and user input handling in Java. It also provides a clear example of separating and processing even and odd numbers, as well as working with Java's built-in data structures like arrays and ArrayLists.

## BY:
 Yashwith Behara

