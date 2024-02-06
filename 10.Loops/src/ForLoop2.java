public class ForLoop2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 1500; i++){
            if (i % 7 == 0 && i % 11 == 0){
                System.out.println("Number divisible by 7 & 11 is: " + i);
                count++;
            }
            if(count == 5){
                break;
            }
        }

    }
}
