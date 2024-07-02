//Using Constructor for inheritance
package mypack2;

class Base {
	int i;
	int j;

	Base(int i, int j) {
		this.i = i;
		this.j = j;
	}

	Base() {}// default constructor without this we get an error in d.display

	void display() {
		System.out.println("Values of I & J : " + i + " " + j);
	}
}

class Derived extends Base {
	int k;

	Derived(int k) {
		// super();//SUPER keyword is added implicitly -Invoke base class default
		// constructor
		super(100,200);// hard coded
		this.k = k;
	}

	Derived(int i, int j, int k) //Best practice for a CONSTRUCTOR
	{
		super(i, j);
		this.k = k;
	}

	void display() {// method overridden
		super.display();// invokes base class display() method
		System.out.println("Values of K : " + k);
	}
}

public class InheritanceDemo3 {

	public static void main(String[] args) {
		Base b = new Base(10, 20);// b.i =10 b.j =20
		b.display();// i =10 j = 20
		Derived d = new Derived(30);
		d.display();// i=100 j =200 k=30
		Derived d1 = new Derived(400);
		d1.display();
		Derived d2 = new Derived(500, 600, 700);
		d2.display();
	}
}
