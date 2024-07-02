abstract class Vehicle
{
	abstract void drive();
	void applyBrake()
	{
		System.out.println("Applying Brakes!");
	}
}

class Car extends Vehicle
{
	void changeGear()
	{
		System.out.println("Changing Gear");
	}

	@Override
	void drive() {
		System.out.println("Driving a Car!");	
	}
}
public class AbstactDemo {
	public static void main(String[] args) {
		//Vehicle v = new Vehicle(); error only reference of base in abstract
		Vehicle v = new Car();
		v.drive();
		v.applyBrake();
		//v.changeGear(); error only overridden method and base class method is accessible
		Car c = new Car();
		c.changeGear();
		
	}
	
}
