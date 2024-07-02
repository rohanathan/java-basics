import java.util.Scanner;

public class StringAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String input = scanner.nextLine().toLowerCase(); // Convert input to lowercase for case insensitivity

        // Variables to store counts
        int vowelCount = 0;
        int consonantCount = 0;
        int wordCount = 0;
        boolean insideWord = false;

        // Loop through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            // Check if the character is a letter
            if (Character.isLetter(c)) {
                // Check if it's a vowel
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }

                // Check if we are inside a word
                if (insideWord == false) {
                    insideWord = true;
                    wordCount++;
                }
            } else {
                // If it's not a letter, consider it as a separator between words
                insideWord = false;
            }
        }

        // Output the results
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        System.out.println("Number of words: " + wordCount);

        // Close the scanner
        scanner.close();
    }
}
