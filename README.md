# Overview

This project demonstrates various array operations in Java, including:

- Separating even and odd numbers into separate arrays.

- Finding two neighboring numbers in an array with the smallest difference.

- Converting an array to an ArrayList and vice versa.

The project follows Java coding best practices, ensures modularity with separate classes, and is committed systematically to GitHub with proper version control practices.

# Classes and Functions

## 1. UserInput.java

This class is responsible for handling user input. It provides a method to accept an array of numbers from the user.

- **getUserNumbers():** Uses a Scanner object to take user input, stores values in an integer array, and returns it. The method ensures input validation to prevent errors due to incorrect data types.

## 2. ArrayFunctions.java

This class contains methods that perform different operations on arrays, such as categorization, searching, and conversion.

- **separateEvenOdd(int[] numbers):** Iterates through the given array, classifies numbers as even or odd, and stores them in separate lists. Finally, the method prints the categorized values.

- **findSmallestDistanceIndex(int[] numbers):** Scans the array to identify two neighboring elements with the smallest absolute difference. The method returns the index of the first of these two numbers, which helps in further processing.

- **convertArrayAndArrayList(int[] numbers):** Converts an array into an ArrayList, demonstrating Java’s collection framework usage. It then converts the ArrayList back to an array and prints both representations to highlight flexibility in data structures.

## 3. Main.java

This is the entry point of the program. It coordinates method calls and manages user interactions.

- Calls methods from UserInput to receive user input.

- Invokes functions from ArrayFunctions to process data.

- Displays results to the console in a user-friendly format.

# Usage Instructions

1. Clone the repositary
2. Compile the program: javac Main.java ArrayFunctions.java UserInput.java
3. Run the program: java Main
4. Follow the Menu:
   - Enter the number of elements in the array
   - Enter the elements of the array
   - View output after the program has run

# Repository Structure

Array_and_ArrayList/  
├── UserInput.java            # Handles User Input

├── ArrayFunctions.java       # Contains logic for array operations

├── Main.java                 # Runs the program

└── README.md                 # Program documentation
