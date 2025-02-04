package com.wipro.java.oops.polymorphism;

public class Audi extends Car{
	
	public void showdetails() {
		System.out.println("Name of the car: "+getName()+"  Color of the car: "+getColor()+"  Speed of the car: "+getSpeed());
	}
	
	public static void main(String [] args) {
		
		Car AudiCar = new Audi();
		AudiCar.setName("Audi");
		AudiCar.setColor("Purple");
		AudiCar.setSpeed(200);
		AudiCar.showdetails();
		
	}


	public Audi() {
		// TODO Auto-generated constructor stub
	}

}
