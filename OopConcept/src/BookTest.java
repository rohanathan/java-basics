class Book {
	int bno;
	String bname;
	double price;

	Book(int bno, String bname, double price)// Constructor to initialize data members
	{
		this.bno = bno;
		this.bname = bname;
		this.price = price;
	}

	Book() {}// default constructor

	void display() // Method to display book details
	{
		System.out.println("Book Number: " + bno);
		System.out.println("Book Name: " + bname);
		System.out.println("Price: " + "$" + price);
	}
}

class SpecialEditionBook extends Book {
	double discount;
	// Constructor to initialize data members including the discount
	SpecialEditionBook(int bno, String bname, double price, double discount) {
		super(bno, bname, price);
		this.discount = discount;
	}
	// Overridden method to display book details including the discount
	@Override
	void display() {
		super.display();
		System.out.println("Discount price: " + "$" + discount);
	}
}

public class BookTest {
	public static void main(String[] args) {
		// Creating an instance of Book and displaying its details
		Book b1 = new Book(10245, "Harry Potter And The Goblet Of Fire", 34.99);
		b1.display();
		// Creating an instance of SpecialEditionBook and displaying its details
		SpecialEditionBook b2 = new SpecialEditionBook(10246, "Harry Potter And The Goblet Of Fire", 34.99, 29.99);
		b2.display();
	}
}
