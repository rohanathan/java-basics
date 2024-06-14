import java.util.Scanner;

public class SumOfDigites {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = s.nextInt();

        int sum = 0;
        while (number != 0) {
            sum += number % 10; // Add the last digit to the sum
            number /= 10; // Remove the last digit from the number
        }

        System.out.print("Sum of the digits is: " + sum);
        s.close(); // Ensure the scanner is closed to prevent resource leak
    }
}
