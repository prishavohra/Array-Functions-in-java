// Name: Prisha Vohra
// PRN: 23070126096
// Batch: AIML B1

public class Main {
    public static void main(String[] args) {
        int[] numbers = UserInput.getUserNumbers();

        System.out.println("\n--- Separating Even and Odd Numbers ---");
        ArrayFunctions.separateEvenOdd(numbers);

        System.out.println("\n--- Finding Smallest Distance in Array ---");
        int index = ArrayFunctions.findSmallestDistanceIndex(numbers);
        if (index != -1) {
            System.out.println("Smallest distance found at index: " + index);
            System.out.println("Numbers: " + numbers[index] + " and " + numbers[index + 1]);
        } else {
            System.out.println("Not enough elements to find a neighboring pair.");
        }

        System.out.println("\n--- Converting Array to ArrayList and Vice Versa ---");
        ArrayFunctions.convertArrayAndArrayList(numbers);
    }
}
