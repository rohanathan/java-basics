package selfcheck;

import java.util.Scanner;

public class BalloonInflation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Initial diameter: ");
        double diameter = in.nextDouble();
        
        // Calculate the initial radius and volume
        double radius1 = diameter / 2;
        double volume1 = (4.0 / 3) * Math.PI * Math.pow(radius1, 3);
        
        // Increase diameter by 1 inch and calculate new volume
        double radius2 = (diameter + 1) / 2;
        double volume2 = (4.0 / 3) * Math.PI * Math.pow(radius2, 3);
        double growth1 = volume2 - volume1;
        
        // Increase diameter by another inch and calculate new volume
        double radius3 = (diameter + 2) / 2;
        double volume3 = (4.0 / 3) * Math.PI * Math.pow(radius3, 3);
        double growth2 = volume3 - volume2;
        
        // Display the results
        System.out.printf("Volume growth after increasing diameter to %d inches: %.0f cubic inches\n", (int)(diameter + 1), growth1);
        System.out.printf("Volume growth after increasing diameter to %d inches: %.0f cubic inches\n", (int)(diameter + 2), growth2);
        
        in.close();
    }
}
