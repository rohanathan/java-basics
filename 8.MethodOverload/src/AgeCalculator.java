public class AgeCalculator {
    public static int findAge(int birth_year, int birth_month, int birth_day, int current_year, int current_month, int current_day){
        int years = birth_year - current_year;
        int months = birth_month - current_month;
        int days = birth_day - current_day;
        int ageInDays = (years * 365) + (months * 31) + days;
        ageInDays = findAge(ageInDays);
        return ageInDays;
    }

    public static int findAge(int ageValue, int y, int m, char ch){
        if (ch == 'y'){
            ageValue = ageValue / 365;
        }

        else if (ch == 'm') {
            ageValue = (ageValue - y * 365) / 30;
        }

        else {
            ageValue = (ageValue - y * 365 - m * 30);
        }
        return ageValue;
    }
    public static int findAge(int checkNegative){
        if (checkNegative < 0){
            checkNegative = checkNegative * -1;
        }
        return checkNegative;

    }
    public static void main(String[] args) {
        int totalDays = findAge(1996,12,14,2024,1,31);
        int getYears = findAge(totalDays,0,0,'y');
        int getMonths = findAge(totalDays,getYears,0,'m');
        int getDays = findAge(totalDays,getYears,getMonths,'d');
        System.out.println(getYears +" Years " + getMonths+" Months "+ getDays+" Days ");

    }
}
