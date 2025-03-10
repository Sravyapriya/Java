package com.wipro.java.oops.encapsulation;

public class Animal {

	public Animal(String name, int weight) {
		super();//calls the root parent class=object
		this.name = name;
		this.weight = weight;
	}
	
	private String name;
	private int weight;
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		
		if(weight>8 && weight<80) {
			this.weight=weight;
		}
		else
		System.out.println("Weight must be appropriate");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
 
	
	public static void main(String a[]) {
		Animal a1=new Animal("Monkey", 50);
		System.out.println(a1.getWeight());
		System.out.println(a1.getName());
		
		a1.setWeight(30);
		System.out.println(a1.getWeight());
		System.out.println(a1.getName());
		
		a1.setWeight(5);
		
		
	}

}
	
