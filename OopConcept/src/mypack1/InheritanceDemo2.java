//polymorphism - method overloading and method overriding
package mypack1;

class Base {
	int i;
	int j;

	void input(int i, int j) {
		this.i = i;
		this.j = j;

	}

	void display() {
		System.out.println("Values of I & J : " + i + " " + j);
	}
}

class Derived extends Base {
	int k;

	void input(int k) {//method overloading
		this.k = k;

	}

	void display() {//method overridden
		super.display();//invokes base class display() method
		System.out.println("Values of K : " + k);
	}
}

public class InheritanceDemo2 {

	public static void main(String[] args) {
		Base b = new Base();// b.i =0 b.j =0
		b.input(10, 20);// b.i=10 b.j=20
		b.display();// i =10 j = 20
		Derived d = new Derived();//i=0 j=0 k=0
		d.input(30, 40);//compile time -- overloading
		d.display();//think of it as OVERRIDING base class method k=0 IT IS TRUE BEFORE SUPER KEYWORD
		d.input(50);//compile time --overloading
		d.display();
		d.input(300);
		d.input(100, 200);
		d.display();
	}

}
