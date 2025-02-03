package com.wipro.java.oops.abstraction;

public class BMW extends Car{

	//Class implementing the abstract methods
	
		@Override
		void color() {
			// Determines the color of the car
			System.out.println("The color is Grey");
		}
		@Override
		void model() {
			// Determines the model of the car
			System.out.println("The model is FA567");
			
			
		}


}
