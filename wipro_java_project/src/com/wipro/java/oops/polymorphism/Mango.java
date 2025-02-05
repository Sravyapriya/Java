package com.wipro.java.oops.polymorphism;

public class Mango extends Fruit {
	
	public void showdetails() {
		System.out.println("Name of the Fruit: "+getName()+"  Color of the Fruit: "+getColor()+"  Price of the Fruit: "+getPrice());
	}
	
	public static void main(String [] args) {
		
		Fruit MangoFruit = new Mango();
		MangoFruit.setName("Mango");
		MangoFruit.setColor("Yellow");
		MangoFruit.setPrice(85);
		MangoFruit.showdetails();
		
	}

	public Mango() {
		// TODO Auto-generated constructor stub
	}


}
