package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class NameA implements Comparator<Animal> {
	public int compare(Animal a1, Animal a2) {
		return a1.getN().compareTo(a2.getN());
	}
	
	public static void main(String[] args) {
		
		ArrayList<Animal> a1 = new ArrayList<>();
		a1.add(new Animal("Tiger" ,  17));
		a1.add(new Animal("Lion" ,  22));
		a1.add(new Animal("Elephant" ,24));
		
		Collections.sort(a1, new NameA());
		System.out.println("\nAnimals sorted by name: ");
		for(Animal a : a1) {
			System.out.println(a.getN() + " " + a.getAge());
		}
	}
}
