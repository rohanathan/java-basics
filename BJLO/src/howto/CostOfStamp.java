package howto;

import java.util.Scanner;

public class CostOfStamp {

	public static void main(String[] args) {
		final int FIRST_CLASS_STAMP_PRICE = 47; // price in pennies
		int dollars;
		int firstClassStamps;
		int change;
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the dollar value: ");
		dollars = s.nextInt();
		firstClassStamps = (100 * dollars) / FIRST_CLASS_STAMP_PRICE;
		change = (100 * dollars) % FIRST_CLASS_STAMP_PRICE;
		
		System.out.printf("Number of First Class Stamps :    %6d%n", firstClassStamps);
		System.out.printf("Number of Penny Stamps :          %6d%n", change);
		s.close();
	}

}
