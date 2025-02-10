package com.wipro.java.java8.usecase2;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

// Abstract class representing a person
abstract class Person {
    protected int id;
    protected String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void displayInfo();
}

// Employee class extending Person
class Employee extends Person {
    private String department;
    private double salary;
    private LocalDate joiningDate;

    public Employee(int id, String name, String department, double salary, LocalDate joiningDate) {
        super(id, name);
        this.department = department;
        this.salary = salary;
        this.joiningDate = joiningDate;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary + ", Joining Date: " + joiningDate);
    }
}

// Service class to manage employees using Collections
class EmployeeService {
    private List<Employee> employees = new ArrayList<>();

    // Add an Employee
    public void addEmployee(Employee emp) {
        employees.add(emp);
        System.out.println("Employee added: " + emp.name);
    }

    // Remove an Employee by ID
    public void removeEmployee(int id) {
        employees.removeIf(emp -> emp.getId() == id);
        System.out.println("Employee with ID " + id + " removed.");
    }

    // Search Employee by ID
    public Optional<Employee> searchEmployee(int id) {
        return employees.stream().filter(emp -> emp.getId() == id).findFirst();
    }

    // Update Employee Salary
    public void updateSalary(int id, double newSalary) {
        employees.stream().filter(emp -> emp.getId() == id).findFirst().ifPresent(emp -> emp.setSalary(newSalary));
    }

    // Display All Employees
    public void displayEmployees() {
        employees.forEach(Employee::displayInfo);
    }

    // Filter Employees by Department
    public List<Employee> filterByDepartment(String department) {
        return employees.stream()
                .filter(emp -> emp.getDepartment().equalsIgnoreCase(department))
                .collect(Collectors.toList());
    }

    // Get Average Salary
    public double getAverageSalary() {
        return employees.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
    }
}

// Main class to demonstrate functionality
public class EmployeeManagement {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();

        // Adding employees
        service.addEmployee(new Employee(1, "Alice", "IT", 50000, LocalDate.of(2020, 5, 10)));
        service.addEmployee(new Employee(2, "Bob", "HR", 45000, LocalDate.of(2019, 3, 15)));
        service.addEmployee(new Employee(3, "Charlie", "Finance", 60000, LocalDate.of(2021, 8, 22)));

        // Display all employees
        System.out.println("\nAll Employees:");
        service.displayEmployees();

        // Search Employee
        System.out.println("\nSearching Employee with ID 2:");
        service.searchEmployee(2).ifPresent(Employee::displayInfo);

        // Update Salary
        System.out.println("\nUpdating salary of Employee ID 1:");
        service.updateSalary(1, 55000);
        service.searchEmployee(1).ifPresent(Employee::displayInfo);

        // Filter Employees by Department
        System.out.println("\nEmployees in IT Department:");
        service.filterByDepartment("IT").forEach(Employee::displayInfo);

        // Get Average Salary
        System.out.println("\nAverage Salary: " + service.getAverageSalary());

        // Remove Employee
        System.out.println("\nRemoving Employee with ID 3:");
        service.removeEmployee(3);
        service.displayEmployees();
    }
}