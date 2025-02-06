package com.wipro.java.collection;
import java.util.*;


//Movie class implements comparable
//interface to define default sorting

public class Movie implements Comparable<Movie> {
	private String n; //movie name
	private double r; //movie rating
	private int y; //release year of the movie

	public Movie(String n, double r, int y) {
		super();
		this.n = n;
		this.r = r;
		this.y = y;
	}
	
	//Implementation of the compareTO method
	//for default sorting by year
	public int compareTo(Movie m) {
		
		//Sort movies in ascending order of year
		
		return this.y - m.y;
	}
	/**
	 * Getter and setter Methods
	 */
	public String getN() {
		return n;
	}
	public void setN(String n) {
		this.n = n;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
