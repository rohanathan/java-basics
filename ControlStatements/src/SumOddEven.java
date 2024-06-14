public class SumOddEven {
    public static void main(String[] args) {
        int sumEven = 0;
        int sumOdd = 0;

        // Loop through numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sumEven += i; // Add to sumEven if the number is even
            } else {
                sumOdd += i; // Add to sumOdd if the number is odd
            }
        }

        // Print the results
        System.out.println("Sum of even numbers from 1 to 100: " + sumEven);
        System.out.println("Sum of odd numbers from 1 to 100: " + sumOdd);
    }
}

