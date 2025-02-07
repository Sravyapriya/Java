package com.wipro.java.java8;

interface TestInterface {
	// Abstract method (mandatory in a functional interface)
	public void area();

	// Default method 1: Display message
	default void display() {
		System.out.println("This is a shape.");
	}

	// Default method 2: Calculate and print square area
	default void printSquareArea(double side) {
		double area = side * side;
		System.out.println("Square Area: " + area);
	}

	// Static method 1: Calculate rectangle area
	static double calculateRectangleArea(double length, double width) {
		return length * width;
	}

	// Static method 2: Print a general message
	static void printMessage() {
		System.out.println("Shapes are important in geometry.");
	}
}
//Main Class implementing TestInterface
public class Shapes implements TestInterface {
	@Override
	public void area() {
		System.out.println("Calculating Area:");
	}

	public static void main(String[] args) {
		Shapes shape = new Shapes(); // Creating an instance of the main class

		shape.area(); // Calling default method
		shape.display();
		shape.printSquareArea(8); // Calling default method
		// Calling static methods directly from the interface
				double rectangleArea = TestInterface.calculateRectangleArea(12, 4);
				System.out.println("Rectangle Area: " + rectangleArea);

				TestInterface.printMessage(); // Calling static method
			}
		}
