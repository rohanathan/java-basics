public class WhileLoopEx2 {
    public static int CheckGCD(int first, int second){
        if (first < 10 || second < 10){
            return -1;
        }
        while (second != 0){
            int temp = second;
            second = first % second;
            first = temp;
        }
        return first;
    }
    public static void main(String[] args) {
        int a = 24;
        int b = 36;
        int resut = CheckGCD(a,b);
        System.out.println("GCD of:" + " " + a + " and " + b + " is " +  resut);

    }
}
