package com.wipro.java.oops.polymorphism;

public class Fruit {
	
	private String name;
	private String color;
	private float price;
    
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
    
	//return the price
	public float getPrice() {
		return price;
	}
    //set the price
	public void setPrice(float price) {
		this.price = price;
	}
	
	public void showdetails() {
		System.out.println("Name of the Fruit: "+name+"Color of the Fruit: "+color+"Price of the Fruit: "+price);
	}
	public Fruit() {
		// TODO Auto-generated constructor stub
	}

}

