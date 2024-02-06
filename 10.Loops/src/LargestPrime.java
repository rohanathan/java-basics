public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(LargestPrime.findLargestPrime(10));
        System.out.println(LargestPrime.findLargestPrime(5658));
        System.out.println(LargestPrime.findLargestPrime(0));
    }
    public static int findLargestPrime(int number){
        if (number < 2){
            return -1;
        }
        int largestPrime = -1;
        for (int i = 2; i <= number; i++){
            while (number % i == 0) {
                largestPrime = i;
                number /= i;
            }
        }
        return largestPrime;
    }
}
