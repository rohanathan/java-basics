import java.util.Scanner;

public class PrimeCheck {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
        s.close();
    }

    static boolean isPrime(int n) {
        // Handle edge cases
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        // Check divisibility from 2 to the square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
