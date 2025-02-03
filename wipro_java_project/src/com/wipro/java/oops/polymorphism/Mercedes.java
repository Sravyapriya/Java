package com.wipro.java.oops.polymorphism;

public class Mercedes extends Car{
	
	public void showdetails() {
		System.out.println("Name of the car: "+getName()+"  Color of the car: "+getColor()+"  Speed of the car: "+getSpeed());
	}
	
	public static void main(String [] args) {
		
		Car ferrariCar = new Mercedes();
		ferrariCar.setName("Mercedes");
		ferrariCar.setColor("Black");
		ferrariCar.setSpeed(200);
		ferrariCar.showdetails();
		
	}


	public Mercedes() {
		// TODO Auto-generated constructor stub
	}

}
