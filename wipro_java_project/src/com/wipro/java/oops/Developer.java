package com.wipro.java.oops;

public class Developer extends Employee {

	public Developer() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a[])
	{
		Employee employee=new Projectlead();
		employee.setId(345);
		employee.setName("priya");
		employee.setDepartment("def");
		employee.setSalary(34000f);
		
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getDepartment());
		System.out.println(employee.getSalary());
	}

}
