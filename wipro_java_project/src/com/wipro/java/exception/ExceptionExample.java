package com.wipro.java.exception;

public class ExceptionExample {
	static int i=2;

	public static void main(String args[]) {
		int num1=50,num2=0;
		try {
			int c=num1/num2;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		finally {
			System.out.println("I am always executed");
		}
		System.out.println("rest of the code");
	}
}
