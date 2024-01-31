public class LeapYear {
    public static void main(String[] args) {
        int CheckYear = 2020;
        CheckLeapYear(CheckYear);
    }
    public static void CheckLeapYear(int year) {

        if ((year % 400 == 0) || ((year % 4 == 0) && year % 100 !=0)) {
        System.out.println(year + " is a Leap Year.");
        }
        else{
            System.out.println(year + " is not a Leap Year.");
        }
    }
}
