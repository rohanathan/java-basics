package interactive;

public class Volume {
public static void main(String[] args)
{
double ouncesPerLiter = 28.35;
double litersInBottle = 2;
double ouncesInBottle = litersInBottle * ouncesPerLiter;
double totalOunces = ouncesInBottle;
double ouncesInCan = 12;
totalOunces = totalOunces + ouncesInCan;
System.out.println("Total ounces: " + totalOunces);
}
}