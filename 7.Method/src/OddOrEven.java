public class OddOrEven {
    public static void main(String[] args) {
        int myNum = 21;
        boolean result = isEven(myNum);
        if (result){
            System.out.println("The number is Even : " + myNum);
        }
        else{
        System.out.println("The number is Even : " + myNum);
        }

    }
    public static boolean isEven (int number){
        if (number % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
