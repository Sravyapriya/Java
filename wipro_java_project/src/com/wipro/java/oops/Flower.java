/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */
public class Flower {

	String name;
	String color;
	int price;
	
	public Flower(String name,String color,int price) {
		this.name=name;
		this.color=color;
		this.price=price;
		// TODO Auto-generated constructor stub
	}
	void display() {
		System.out.println("Flower name:"+name+"Color:"+color+"Price:"+price);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Flower flower1=new Flower("Sunflower","Yellow",5);
		// TODO Auto-generated method stub

	}

}
