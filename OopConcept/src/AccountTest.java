class Customer {
    int custId;
    String custName;
    String custAddress;

    // Constructor to initialize customer details
    Customer(int custId, String custName, String custAddress) {
        this.custId = custId;
        this.custName = custName;
        this.custAddress = custAddress;
    }

    // Method to display customer details
    void display() {
        System.out.println("Customer ID: " + custId);
        System.out.println("Customer Name: " + custName);
        System.out.println("Customer Address: " + custAddress);
    }
}

class CustomerAccount {
    int acctId;
    String acctType;
    Customer customer;
    double acctBalance;

    // Constructor to initialize account details
    CustomerAccount(int acctId, String acctType, Customer customer, double acctBalance) {
        this.acctId = acctId;
        this.acctType = acctType;
        this.customer = customer;
        this.acctBalance = acctBalance;
    }

    // Method to display account details
    void display() {
        System.out.println("Account ID: " + acctId);
        System.out.println("Account Type: " + acctType);
        System.out.println();
        System.out.println("Customer Details:");
        customer.display(); // Delegate display of customer details to Customer class
        System.out.println("Account Balance: " + acctBalance);
        System.out.println();
    }
}

public class AccountTest {
    public static void main(String[] args) {
        // Create a Customer object
        Customer customer1 = new Customer(101, "John Doe", "123 Main St, Anytown");

        // Create an Account object associated with the customer
        CustomerAccount account1 = new CustomerAccount(1001, "Savings", customer1, 5000.0);

        // Display Account details
        System.out.println("Account Details:");
        account1.display();

        // Create another Customer object
        Customer customer2 = new Customer(102, "Jane Smith", "456 Oak Ave, Sometown");

        // Create another Account object associated with the second customer
        CustomerAccount account2 = new CustomerAccount(1002, "Checking", customer2, 8000.0);

        // Display Account details
        System.out.println("Account Details:");
        account2.display();
    }
}
