package com.wipro.java.oops.inheritance;

/*
 *Parent class=Employee
 *Child class=ProjectLead
 *Extends is a Keyword 
 */

public class Projectlead extends Employee {

	public Projectlead() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String a[])
	{
		Employee employee=new Projectlead();
		employee.setId(1234);
		employee.setName("priya");
		employee.setDepartment("abc");
		employee.setSalary(34000f);
		
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getDepartment());
		System.out.println(employee.getSalary());
	}

}
