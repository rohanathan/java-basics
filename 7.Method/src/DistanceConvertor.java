public class DistanceConvertor {
    public static double milesToKms (double miles){
        return miles * 1.609344;
    }
    public static double meterToKms (double meter){
        return meter / 1000;
    }
    public static double kmsToMiles (double kms){
        return kms / 1.609344;
    }
    public static void PrintDistance (double firstValue, String firstUnit, double conValue, String conUnit){
        System.out.println(firstValue + " " + firstUnit + " = " + conValue + " " + conUnit);
    }

    public static void main(String[] args) {
        double miles = 400;
        double kilometers = milesToKms(miles);
        PrintDistance(miles,"Miles",kilometers,"KMs");

        double meter = 2898;
        double km = meterToKms(meter);
        PrintDistance(meter,"meter",km,"KMs");

        double kms = 12.7;
        double mile = kmsToMiles(kms);
        PrintDistance(kms,"KMs",mile,"Miles");

    }
}
