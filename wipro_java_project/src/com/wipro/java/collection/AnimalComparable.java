package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;


class AnimalComparable implements Comparable<AnimalComparable> {
	
	private String name;
	private int age;
	
	public AnimalComparable(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public int compareTo1(AnimalComparable o) {
		// TODO Auto-generated method stub
		return this.age - o.age;
	}
	
	
	public String getName() {
		return name;
	}

	
	public int getAge() {
		return age;
	}
	@Override
	public int compareTo(AnimalComparable o) {
		// TODO Auto-generated method stub
		ArrayList<AnimalComparable> l = new ArrayList<>();
		l.add(new AnimalComparable("Dog", 15));
		l.add(new AnimalComparable("Cat", 8));
		l.add(new AnimalComparable("Rabbit", 4));
		
		Collections.sort(l);
		System.out.println("Movies after sorting by year:");
		for(AnimalComparable o1 : l) {
			System.out.println(o1.getName()+" "+o1.getAge());
	}
    return age;
	}
}	
	