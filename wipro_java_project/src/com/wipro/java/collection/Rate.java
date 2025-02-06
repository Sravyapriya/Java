package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Rate implements Comparator<Movie1> {
	public int compare(Movie1 m1, Movie1 m2) {
		return Double.compare(m2.getR(), m1.getR());
	}
	
	public static void main(String[] args) {
		
		ArrayList<Movie1> m1 = new ArrayList<>();
		m1.add(new Movie1("Force Awakens" , 8.3, 2017));
		m1.add(new Movie1("Hi Naana" , 8.5, 2022));
		m1.add(new Movie1("Khushi" , 8.7, 2024));
		
		Collections.sort(m1, new Rate());
		System.out.println("\nMovies sorted by rating: ");
		for(Movie1 m : m1) {
			System.out.println(m.getR() + " " + m.getN() + " " + m.getY());
		}
	}
}
