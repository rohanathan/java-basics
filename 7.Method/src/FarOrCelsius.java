public class FarOrCelsius {
    public static void main(String[] args) {
        char tempName = 'C';
        double tempValue = 80.2;
        double calculatedResult = DegreeConverter(tempName, tempValue);
        printsResult(tempName,calculatedResult);
    }
    public static double DegreeConverter(char tempChar, double temp) {
        double result;
        if (tempChar == 'F'){
            result = (temp - 32) * 5 / 9;
        }
        else if (tempChar == 'C') {
            result = (temp * 9 / 5) + 32;
        }
        else{
            result = 0;
        }
        return result;
    }
    public static void printsResult(char temp_name,double result) {
        System.out.println("Temperature is : " + result + " " + temp_name);

    }
}
