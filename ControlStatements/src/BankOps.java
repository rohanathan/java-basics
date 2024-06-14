import java.util.Scanner;

public class BankOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int bal,amt,ch;
		System.out.println("Enter the Current Balance");
		bal = s.nextInt();
		do
		{
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Display Balance");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
			ch = s.nextInt();	
			switch (ch)
			{
			case 1: System.out.println("Enter the amount to Deposit");
					amt = s.nextInt();
					bal = bal + amt; break;
			case 2: System.out.println("Enter the amount to Withdraw");
					amt = s.nextInt();
					if (amt > bal)
						System.out.println("Insufficient Funds");
					else
						bal = bal + amt; 
					break;
			case 3: System.out.println("Current Balance = "+ bal); break;
			case 4: System.out.println("Thank you for banking with us!"); break;
			default: System.out.println("Invalid Choice, please review the options.");
			}
		}while (ch != 4);
		s.close();
	}

}
