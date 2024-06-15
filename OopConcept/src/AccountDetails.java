class Account {
    int accountNo;
    String accountType;
    int accountBalance;

    // Constructor to initialize account details
    Account(int accountNo, String accountType, int accountBalance) {
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
    }

    // Method to deposit amount to account balance
    void deposit(int amount) {
        accountBalance += amount;
        System.out.println("Deposit successful. Current balance: " + accountBalance);
    }

    // Method to display account details
    void dispAccountDetails() {
        System.out.println("Account Number: " + accountNo);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + accountBalance);
    }
}

public class AccountDetails {
    public static void main(String[] args) {
        Account acc1 = new Account(101, "Savings", 5000);
        acc1.dispAccountDetails();
        acc1.deposit(1500);
        acc1.withdraw(2000);
        acc1.withdraw(6000); 
        acc1.dispAccountDetails();

        System.out.println(); // For better readability in output

        Account acc2 = new Account(110, "Current", 15000);
        acc2.dispAccountDetails();
        acc2.deposit(1500);
        acc2.withdraw(200000); // This should show insufficient balance
        acc2.withdraw(6000); 
        acc2.dispAccountDetails();
    }
}
