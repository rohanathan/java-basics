package mypack2;

import mypack1.Calculator;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println("Sum = " + c.add(12, 11));
		System.out.println("Product = " + c.mul(12, 11));
	}
}
