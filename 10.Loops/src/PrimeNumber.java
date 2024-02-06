public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("1 is"+(isPrime(1) ? "": " Not")+" a prime number");
        System.out.println("16 is"+(isPrime(16) ? "": " Not")+" a prime number");
        System.out.println("17 is"+(isPrime(17) ? "": " Not")+" a prime number");
        System.out.println("21 is"+(isPrime(21) ? "": " Not")+" a prime number");
        System.out.println("9 is"+(isPrime(9) ? "": " Not")+" a prime number");
    }
    public static boolean isPrime(int wholeNumber){
        if (wholeNumber <= 2){
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor < wholeNumber; divisor++){
            if (wholeNumber %  divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
