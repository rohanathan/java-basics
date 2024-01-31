public class TimeConvertor {
    public static String timeConvertor(int seconds){
        int calculateMinutes = seconds / 60;
        int calculateHours = calculateMinutes / 60;
        int remainingMinutes = calculateMinutes % 60;
        int remainingSeconds = seconds % 60;
        return calculateHours + "H " + remainingMinutes + "M " + remainingSeconds + "sec";
    }
    public static String timeConvertor(){
        return timeConvertor(1234567);
    }

    public static void main(String[] args) {
        String result = timeConvertor();
        System.out.println(result);

    }
}
