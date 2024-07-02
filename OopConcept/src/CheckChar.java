import java.util.Scanner;

public class CheckChar {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char c;

        while (true) {
            System.out.println("Enter a character (enter '0' to exit):");
            String input = s.next();

            // Check if the input is '0' to exit the loop
            if (input.equals("0")) {
                System.out.println("Exiting the program...");
                break;
            }

            // Convert the input to lowercase and take the first character
            c = input.toLowerCase().charAt(0);

            // Check if the character is alphabetic
            if (Character.isAlphabetic(c)) {
                switch (c) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        System.out.println("Given character is a vowel");
                        break;
                    default:
                        System.out.println("Given character is a consonant");
                }
            } else {
                System.out.println("Given character is not an alphabet");
            }
        }
        s.close(); // Close the scanner after the loop ends
    }
}
