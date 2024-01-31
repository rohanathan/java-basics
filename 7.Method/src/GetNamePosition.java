public class GetNamePosition {
    public static void main(String[] args) {
        int getPosition;
        getPosition = PositionMethod(70);
        printPosition("James", getPosition);
    }
    public static int PositionMethod(int num){
        if (num < 50){
            return 0;
        }
        else if (num >= 60 && num <= 70) {
            return 5;
        }
        else if (num >= 70 && num <= 80) {
            return 4;
        }
        else if (num >= 80 && num <= 90) {
            return 3;
        }
        else if (num >= 90 && num <= 95) {
            return 2;
        }
        else {
            return 1;
        }
    }
    public static void printPosition (String stdName, int position){
        System.out.println("Student Name is : " + stdName + " Position is : " + position);
    }
}
