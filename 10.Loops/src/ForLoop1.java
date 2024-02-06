public class ForLoop1 {
    public static void main(String[] args) {
        for(int i = 0; i <=10; i++){
            if (i == 5 || i == 7){
                continue;
            }
            else if (i == 8 || i == 4) {
                break;
            }
            System.out.println(i);
        }
    }
}
