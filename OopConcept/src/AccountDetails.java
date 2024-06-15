class Account {
	int accountNo;
	String accountType;
	int accountBalance;

	void setAccountDetails(int accountNo, String accountType, int accountBalance) {
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}

	// Method to withdraw amount from account balance
	void withdraw(int amount) {
		if (amount > accountBalance) {
			System.out.println("Insufficient balance. Withdrawal not possible.");
		} else {
			accountBalance -= amount;
			System.out.println("Withdrawal successful. Current balance: " + accountBalance);
		}
		System.out.println(); // For better readability in output
	}

	// Method to deposit amount to account balance
	void deposit(int amount) {
		accountBalance += amount;
		System.out.println("Deposit successful. Current balance: " + accountBalance);
		System.out.println(); // For better readability in output
	}

	// Method to display account details
	void dispAccountDetails() {
		System.out.println("Account Number: " + accountNo);
		System.out.println("Account Type: " + accountType);
		System.out.println("Account Balance: " + accountBalance);
		System.out.println(); // For better readability in output
	}
}

public class AccountDetails {
	public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.setAccountDetails(101, "Savings", 5000);
        acc1.dispAccountDetails();
        acc1.deposit(1500);
        acc1.withdraw(2000);
        acc1.withdraw(6000); 
        acc1.dispAccountDetails();
        
        Account acc2 = new Account();
        acc2.setAccountDetails(110, "Current", 15000);
        acc2.dispAccountDetails();
        acc2.deposit(1500);
        acc2.withdraw(200000);
        acc2.withdraw(6000); 
        acc2.dispAccountDetails();
    }
}


