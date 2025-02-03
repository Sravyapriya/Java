/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Car {

	/**
	 * 
	 */
	private String name;
	private String color;
	private int speed;
	
	//return the name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//return the color
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * return the speed
	 */
	public int getSpeed() {
		return speed;
	}

	//speed to set
	 
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void showdetails() {
		System.out.println("Name of the car: "+name+"Color of the car: "+color+"Speed of the car: "+speed);
	}
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
}
