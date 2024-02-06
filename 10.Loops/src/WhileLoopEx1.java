public class WhileLoopEx1 {
    public static void main(String[] args) {
        int num = 12321;
        if (CheckPalindrome(num)){
            System.out.println(num + " is a Palindrome number.");
        }
        else{
            System.out.println(num + " is Not a Palindrome number.");
        }

    }
    public static boolean CheckPalindrome(int number){
        int palindrome = number;
        int reverse = 0;
        while (palindrome != 0){
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        return (number == reverse);
    }
}
