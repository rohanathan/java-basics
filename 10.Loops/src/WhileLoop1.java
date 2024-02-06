public class WhileLoop1 {
    public static void checkEvenOdd(int num){
        if (num % 2 == 0){
            System.out.println(num + " Number is Even.");
        }
        else{
            System.out.println(num + " Number is Odd.");
        }
    }

    public static void main(String[] args) {
        int start = 5, end = 11;
        while (start <= end){
            checkEvenOdd(start);
            start++;
        }

    }
}
