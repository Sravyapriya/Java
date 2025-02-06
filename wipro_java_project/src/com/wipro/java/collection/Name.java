package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Name implements Comparator<Movie1> {
	public int compare(Movie1 m1, Movie1 m2) {
		return m1.getN().compareTo(m2.getN());
	}
	
	public static void main(String[] args) {
		
		ArrayList<Movie1> m1 = new ArrayList<>();
		m1.add(new Movie1("Force Awakens" , 8.3, 2017));
		m1.add(new Movie1("Hi Naana" , 8.5, 2022));
		m1.add(new Movie1("Khushi" , 8.7, 2024));
		
		Collections.sort(m1, new Name());
		System.out.println("\nMovies sorted by name: ");
		for(Movie1 m : m1) {
			System.out.println(m.getN() + " " + m.getR() + " " + m.getY());
		}
	}
}
