/**
 * 
 */
package com.wipro.java.oops;

/**No constructor
 * Getters have a returned value
 *Setters have no returned value
 *properties are determined using private fields
 *values are behaviors are determined through setters
 *toString will convert the entire animal class with properties and behaviors
 */
 
public class Animal {
	
	//private properties
	private int age;
	private String name;
	private float height;
	private float weight;
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	/**
	 * 
	 */
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
