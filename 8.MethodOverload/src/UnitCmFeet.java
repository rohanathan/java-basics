public class UnitCmFeet {
    public static double convert (double length){
        return length / 30.48;
    }
    public static double convert (double length, char unit){
        if (unit=='f'){
            return length * 12;
        }
        else if (unit=='i') {
            return length * 2.54;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println("168 cm is equal to : " + convert(168) + " feet");
        System.out.println("10 feet is equal to : " + convert(10,'f') + " inchs");
        System.out.println("6 inch is equal to : " + convert(6,'i') + " cms");

    }
}
