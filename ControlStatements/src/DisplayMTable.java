public class DisplayMTable {

	    public static void main(String[] args) {
	        // Display multiplication tables from 1 to 10
	        for (int n = 1; n <= 10; n++) {
	            table(n);
	            System.out.println(); // Add a blank line between tables for readability
	        }
	    }

	    static void table(int n) {
	        System.out.println("Multiplication table for " + n + ":");
	        for (int i = 1; i <= 10; i++) {
	            int p = n * i;
	            System.out.println(n + " * " + i + " = " + p);
	        }
	    }
	}
