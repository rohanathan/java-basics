package collections;


	import java.util.Scanner;

	public class ScannerDemo {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter an integer: ");
	        int number = scanner.nextInt();
	        // Consume the leftover newline character
	        scanner.nextLine();

	        System.out.print("Enter a string: ");
	        String text = scanner.nextLine();

	        System.out.println("You entered the integer: " + number);
	        System.out.println("You entered the string: " + text);

	        scanner.close();
	    }
	}

