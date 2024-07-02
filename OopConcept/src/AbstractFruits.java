abstract class Fruit {
	String name;
	double weight;
	Fruit(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	abstract double cost();
}

class Apple extends Fruit {
	double pricePerKg;

	Apple(double weight, double pricePerKg) {
		super("Apple", weight);
		this.pricePerKg = pricePerKg;
	}
	
	@Override
	double cost() {
		return weight * pricePerKg;
	}
}

class Mango extends Fruit {
	double pricePerKg;

	Mango(double weight, double pricePerKg) {
		super("Mango", weight);
		this.pricePerKg = pricePerKg;
	}

	double cost() {
		return weight * pricePerKg;
	}
}

public class AbstractFruits {
	public static void main(String[] args) {
		Apple apple = new Apple(3.0, 190);
		Mango mango = new Mango(4.5, 180);

		System.out.println("Cost of Apple :" + apple.cost());
		System.out.println("Cost of Mango :" + mango.cost());
	}
}
