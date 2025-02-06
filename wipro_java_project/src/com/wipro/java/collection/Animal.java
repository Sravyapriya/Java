package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Animal {
	private String n;
	private int age;
	
	public Animal(String n, int age) {
		this.n = n;
		this.age = age;
	}
	
	//Getter methods
	public String getN() {
		return n;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
