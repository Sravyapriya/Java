/**
 * 
 */
package com.wipro.java;

/**
 * 
 */
public class Flower {

	String name;
	String color;
	int price;
	
	Flower(String name, String color, int price) {
		this.name=name;
		this.color=color;
		this.price=price;
	}
    void display() {
System.out.println("Flower name:"+name+"Color:"+color+"Price:"+price);
    }
    
	public static void main(String[] args) {
		Flower flower = new Flower("Sunflower","Yellow",45);
		flower.display();

	}
}
