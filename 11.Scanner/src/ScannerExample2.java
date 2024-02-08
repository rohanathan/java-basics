import java.util.Scanner;

public class ScannerExample2 {
    public static boolean sharedDigit(int num1, int num2){
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99 )){
            return false;
        }
        int digit1 = num1 % 10;
        int digit2 = num1 / 10;
        int digit3 = num2 % 10;
        int digit4 = num2 / 10;
        return (digit1 == digit3 || digit1 ==digit4
                || digit2 == digit3 || digit2 == digit4);
    }

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Enter the first number between 10 - 99 : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number between 10 - 99 : ");
        int num2 = scanner.nextInt();
        scanner.close();
        if (sharedDigit(num1,num2)){
            System.out.println("There is a shared a digit between " + num1 + " and " + num2 );
        }
        else{
            System.out.println("There is no shared digit between " + num1 + " and "+ num2);
        }

    }
}
