/**
 * 
 */
package com.wipro.java;

/**
 * 
 */
public class MyClass {
	int num = 5;
	 
    public void changeValue(int num) {
        this.num = num;
    }


	/**
	 * 
	 */
	public MyClass() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        MyClass obj = new MyClass();//creating an object 
	        obj.changeValue(10);//calling the function that changes the value
	        System.out.println(obj.num);//Printing the object value 
	}

}
