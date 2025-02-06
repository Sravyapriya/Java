package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Age implements Comparator<Animal> {
	public int compare(Animal a1, Animal a2) {
		return Integer.compare(a2.getAge(), a1.getAge());
	}
	
	public static void main(String[] args) {
		
		ArrayList<Animal> a1 = new ArrayList<>();
		a1.add(new Animal("Tiger" , 17));
		a1.add(new Animal("Lion" ,22));
		a1.add(new Animal("Elephant" ,21));
		
		Collections.sort(a1, new Age());
		System.out.println("\nAnimals sorted by age: ");
		for(Animal a : a1) {
			System.out.println(a.getN() + " " + a.getAge());
		}
	}
}
