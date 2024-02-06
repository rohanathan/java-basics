public class SumOddNumber {
    public static boolean CheckOdd(int number){
        if (number <= 0){
            return false;
        }
        return (number % 2 == 1);
    }
    public static int sumOdd(int startNumber, int endNumber){
        if (startNumber <= 0 || endNumber <= 0 || endNumber < startNumber){
            return -1;
        }
        int sum = 0;
        for (int i = startNumber; i <= endNumber; i++){
            if (CheckOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int startNumber = 1;
        int endNumber = 100;
        int sum = sumOdd(startNumber,endNumber);

        if ( sum == -1){
            System.out.println("invalid input");
        }
        else {
            System.out.println("The sum of odd number between " + startNumber + " and " + endNumber + " is " + sum);
        }

    }
}
