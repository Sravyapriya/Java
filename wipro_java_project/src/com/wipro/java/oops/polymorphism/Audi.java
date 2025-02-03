package com.wipro.java.oops.polymorphism;

public class Audi extends Car{
	
	public void showdetails() {
		System.out.println("Name of the car: "+getName()+"  Color of the car: "+getColor()+"  Speed of the car: "+getSpeed());
	}
	
	public static void main(String [] args) {
		
		Car ferrariCar = new Audi();
		ferrariCar.setName("Audi");
		ferrariCar.setColor("Purple");
		ferrariCar.setSpeed(200);
		ferrariCar.showdetails();
		
	}


	public Audi() {
		// TODO Auto-generated constructor stub
	}

}
