// UserInput.java

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    // Method to accept user input and return an integer array
    public static int[] getUserNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }
}
