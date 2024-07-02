import java.util.Scanner;

public class ReverseLine {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a line: ");
    String line = scanner.nextLine();

    String reversedLine = reverseString(line);

    System.out.println("The reversed line is: " + reversedLine);

    scanner.close();
  }

  public static String reverseString(String str) {
    // Split the string into an array of characters
    char[] chars = str.toCharArray();

    // Create a StringBuilder object to efficiently build the reversed string
    StringBuilder reversed = new StringBuilder();

    // Iterate through the characters array in reverse order and append them to StringBuilder
    for (int i = chars.length - 1; i >= 0; i--) {
      reversed.append(chars[i]);
    }

    return reversed.toString();
  }
}
