import java.util.Scanner;

public class CheckAge {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = s.nextInt();
		if (age < 0)
			System.out.println("Invalid input");
		else if (age >= 18) {
			System.out.println("Thank you. Proceed to visit the website");
		} else {
			System.out.println("Sorry. Not allowed to enter the site.");
		}
		s.close();
	}
}
