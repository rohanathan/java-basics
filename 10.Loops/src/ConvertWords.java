public class ConvertWords {
    public static void main(String[] args) {
        printWords(12345);
        printWords(72548);

    }

    public static void printWords(int number) {
        if (number < 0){
            System.out.println("INVALID VALUE");
            return;
        }
        if (number == 0){
            System.out.println("Zero");
            return;
        }
        String result = "";
        int digit, temp;
        for (int i = 1, j = 10; number > 0; i *= 10, j *= 10){
            temp = number % j;
            digit = temp / i;
            for (int k = 0; k < 10; k++){
                if (digit == k){
                    String word = "";
                    switch (digit) {
                        case 0 -> word = "Zero";
                        case 1 -> word = "One";
                        case 2 -> word = "Two";
                        case 3 -> word = "Three";
                        case 4 -> word = "Four";
                        case 5 -> word = "Five";
                        case 6 -> word = "Six";
                        case 7 -> word = "Seven";
                        case 8 -> word = "Eight";
                        case 9 -> word = "Nine";
                        default -> word = "Number out of range";
                    }
                    result = word + " " + result;
                    break;
                    }
                }
            number -= temp;
            }
        System.out.println(result.trim());
    }

}
