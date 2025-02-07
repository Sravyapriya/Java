package com.wipro.java.java8;

public class StringApi {

	public StringApi() {
		// TODO Auto-generated constructor stub
	}
    public static void main(String[] args) {
    	String str = "Smru";
    	System.out.println(str.length());
    	System.out.println(str.charAt(2));
    	System.out.println(str.substring(1,3));
    	System.out.println(str.contains("u"));
        String[] u=str.split(" ");
        for(String str1:u) {
        	System.out.println(str1);
        }
    }
}
