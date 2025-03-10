package com.wipro.java.oops;

//Inheritance: PublicLibrary extends Library

public class PublicLibrary extends Library {
	private String location;

	// Constructor (Encapsulation: Private field location)
	public PublicLibrary(String name, int booksAvailable, String location) {
		
		super(name, booksAvailable); // Calls the parent class (Library) constructor
		this.location = location;
	}

	// Getter for location
	public String getLocation() {
		return location;
	}

	// Polymorphism: Overriding abstract method
	@Override
	public void libraryServices() {
		System.out.println(getName() + " offers physical books, reading rooms, and community events.");
	}
	//Polymorphism: Overriding showdetails method
		@Override
		public void showdetails() {
			super.showdetails(); // Calls displayInfo() from Library
			System.out.println("Location: " + location);
		}

		// Main method inside the child class
		public static void main(String[] args) {
			// Creating instances using Polymorphism
			Library lib1 = new PublicLibrary("Central Library", 7500, "Downtown");
			

			// Method calls (Runtime Polymorphism)
			lib1.showdetails();
			lib1.libraryServices();
			
		}
}
