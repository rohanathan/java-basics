import java.util.Scanner;

public class SmallTen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, i = 1, small = Integer.MAX_VALUE; // Initialize 'small' to the largest possible integer value

        while (i <= 10) {
            System.out.println("Enter a number: ");
            n = s.nextInt();
            if (n < small)
                small = n;
            i++;
        }
        System.out.println("Smallest number is: " + small);
        s.close(); // Ensure the scanner is closed to prevent resource leak
        
    }
}
