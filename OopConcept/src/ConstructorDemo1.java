class MyClass
{
	int m;
	int n;
	MyClass(int m, int n){ //constructor
		this.m = m;
		this.n = n; 
	}
	void display()
	{
		System.out.println("m = "+ m +"; n = "+ n);
	}
	
	
}

public class ConstructorDemo1 {
	public static void main(String[] args) {
		MyClass mc = new MyClass(10,20);
		mc.display();

	}

}
