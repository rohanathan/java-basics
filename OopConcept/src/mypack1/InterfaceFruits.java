//Interface Fruit
package mypack1;

interface Fruit {
double cost();
}

//Class Apple implementing the Fruit interface
class Apple implements Fruit {
double weight; // weight in kilograms
double pricePerKg;

Apple(double weight, double pricePerKg) {
   this.weight = weight;
   this.pricePerKg = pricePerKg;
}

@Override
public double cost() {
   return weight * pricePerKg;
}
}

//Class Mango implementing the Fruit interface
class Mango implements Fruit {
double weight; // weight in kilograms
double pricePerKg;

Mango(double weight, double pricePerKg) {
   this.weight = weight;
   this.pricePerKg = pricePerKg;
}

@Override
public double cost() {
   return weight * pricePerKg;
}
}

//Class to test the functionalities
public class InterfaceFruits {
public static void main(String[] args) {
   Apple apple = new Apple(1.5, 3.0); // 1.5 kg of apple at $3.0 per kg
   Mango mango = new Mango(2.0, 2.5); // 2.0 kg of mango at $2.5 per kg

   System.out.println("Cost of apples: $" + apple.cost());
   System.out.println("Cost of mangos: $" + mango.cost());
}
}
