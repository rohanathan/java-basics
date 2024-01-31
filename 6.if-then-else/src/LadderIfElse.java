public class LadderIfElse {
    public static void main(String[] args) {
        int creditScore = 700;
        if(creditScore >= 800){
            System.out.println("Excellent");
        }

        else if (creditScore >= 700 && creditScore <= 800) {
            System.out.println("Good");
        }

        else if (creditScore >=600 && creditScore <= 700) {
            System.out.println("Bad");
            
        }
        else {
            System.out.println("Poor");
        }

    }
}
