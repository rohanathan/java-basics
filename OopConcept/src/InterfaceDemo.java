interface Shape
{
	void draw();
}

class Circle implements Shape
{
	public void draw()
	{
		System.out.println("Drawing a circle!");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.draw();
	}

}
