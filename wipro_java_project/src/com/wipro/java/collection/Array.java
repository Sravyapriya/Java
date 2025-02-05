package com.wipro.java.collection;

class Array {
	public static void main(String[] args) {
		int[] arr;
	
	arr = new int[5];
	
	//initializing the 1st elements of array
	arr[0] = 10;
	
	arr[1] = 20;
	
	arr[2] = 30;
	arr[3] = 40;
	arr[5] = 50;
	
	//accessing the elements of a specified array
	for(int i=0;i<arr.length;i++)
		System.out.println("Element at index " + i + " : " + arr[i]);
 	}
	

}
