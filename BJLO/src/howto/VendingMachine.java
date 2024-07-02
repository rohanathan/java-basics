package howto;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		final int PENNIES_PER_DOLLAR = 100;
		final int PENNIES_PER_QUARTER = 25;
		
		System.out.println("Enter bill value (1 = $1 bill, 5 = $5 bill, etc.): ");
		int billValue = s.nextInt();
		System.out.println("Enter item price in pennies: ");
		int itemPrice = s.nextInt();
		
		//compute change due
		
		int changeDue = (billValue * PENNIES_PER_DOLLAR) - itemPrice;
		int dollarCoins = changeDue / PENNIES_PER_DOLLAR;
		changeDue = changeDue % PENNIES_PER_DOLLAR;
		int quarters = changeDue / PENNIES_PER_QUARTER;
		
		//Print Change Due
		
		System.out.printf("Dollar coins: %6d%n", dollarCoins);
		System.out.printf("Quarters:     %6d%n", quarters);
		
	}

}
