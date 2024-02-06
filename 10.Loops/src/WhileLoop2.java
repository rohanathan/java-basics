public class WhileLoop2 {
    public static int SumOfDigits(int number){
        if(number < 0){
            return -1;
        }
        int lastDigit = number % 10;
        int firstDigit = number;
        while (firstDigit >= 10){
            firstDigit /= 10;
        }
        return firstDigit + lastDigit;
    }
    public static void main(String[] args) {
        int number = 47904108;
        int sum = SumOfDigits(number);
        System.out.println("Sum of first and last digit of : " + number + " is " + sum);

    }
}
