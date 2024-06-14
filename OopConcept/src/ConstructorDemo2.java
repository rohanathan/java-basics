class Product{
	int pid;
	String pname;
	
	Product(int pid, String pname)
	{
		this.pid = pid;
		this.pname = pname;
	}
	Product(){
		
	}
	
	void display(){
		System.out.println("Product ID: "+ pid +"; Product Name: "+ pname);
	}
	
}
public class ConstructorDemo2 {

	public static void main(String[] args) {
		Product mp1 = new Product(145,"Rin");
		mp1.display();
		
		Product mp2 = new Product();
		mp2.display();
	}

}
