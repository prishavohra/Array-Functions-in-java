// ArrayFunctions.java

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayFunctions {

    // Function to separate even and odd numbers into respective arrays
    public static void separateEvenOdd(int[] numbers) {
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenList.add(num);
            } else {
                oddList.add(num);
            }
        }

        System.out.println("Even Numbers: " + evenList);
        System.out.println("Odd Numbers: " + oddList);
    }

    // Function to find two neighboring numbers with the smallest difference
    public static int findSmallestDistanceIndex(int[] numbers) {
        if (numbers.length < 2) return -1;  // No pairs exist

        int minIndex = 0;
        int minDiff = Math.abs(numbers[1] - numbers[0]);

        for (int i = 1; i < numbers.length - 1; i++) {
            int diff = Math.abs(numbers[i + 1] - numbers[i]);
            if (diff < minDiff) {
                minDiff = diff;
                minIndex = i;
            }
        }

        return minIndex;
    }

    // Function to convert an array to an ArrayList and vice versa
    public static void convertArrayAndArrayList(int[] numbers) {
        // Convert array to ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : numbers) {
            arrayList.add(num);
        }
        System.out.println("Array converted to ArrayList: " + arrayList);

        // Convert ArrayList back to array
        Integer[] newArray = arrayList.toArray(new Integer[0]);
        System.out.println("ArrayList converted back to array: " + Arrays.toString(newArray));
    }
}
