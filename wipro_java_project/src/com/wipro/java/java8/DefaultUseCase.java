package com.wipro.java.java8;

interface TestInterface1 {
	
	//default method
	default void show() {
		System.out.println("Default TestInterface1");
	}
}

interface TestInterface2 {
	
	//default method
	default void show() {
		System.out.println("Default TestInterface2");
	}
}

 class DefaultUseCase implements  TestInterface1,  TestInterface2 {

	@Override
	public void show() {
		
		// Super keyword is used to call the show method of TestInterface1
		TestInterface1.super.show();
		
		// Super keyword is used to call the show method of TestInterface2
		
		TestInterface2.super.show();
	}

	public static void main(String [] args) {
		
		DefaultUseCase d = new DefaultUseCase();
		d.show();
		
	}

}
