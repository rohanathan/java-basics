import java.util.Scanner;

class Rectangle {
	int length;
	int breadth;
	double area;

	// Constructor to initialize rectangle dimensions and calculate area
	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
		area();
		displayArea();
	}

	// Method to calculate area
	void area() {
		area = length * breadth;
	}

	// Method to display area
	void displayArea() {
		System.out.println("Area of rectangle: " + area);
	}
}

public class AreaRect {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		while (true) {
			// Prompt user for length
			System.out.print("Enter the length of the rectangle (or 0 to exit): ");
			int length = s.nextInt();
			if (length == 0) {
				break;
			}

			// Prompt user for breadth
			System.out.print("Enter the breadth of the rectangle (or 0 to exit): ");
			int breadth = s.nextInt();
			if (breadth == 0) {
				break;
			}

			// Create a Rectangle object with user input
			Rectangle r1 = new Rectangle(length, breadth);
		}
		// Display completion message after the loop ends
		System.out.println("Program completed. Thank you for using the service!");

		// Close the scanner to avoid resource leaks
		s.close();
	}
}
