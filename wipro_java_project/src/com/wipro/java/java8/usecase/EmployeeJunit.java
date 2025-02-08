package com.wipro.java.java8.usecase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.junit.Test;

public class EmployeeJunit {

    private EmployeeService service;

    void setUp() {
        // Initialize a new EmployeeService instance before each test case
        service = new EmployeeService();
        service.addEmployee(new Employee(1, "Prakhar", "IT", 60000, LocalDate.of(2022, 5, 10)));
        service.addEmployee(new Employee(2, "Hriday", "HR", 50000, LocalDate.of(2021, 3, 15)));
    }

    @Test
    //adding emp details
    void testAddEmployee() {
        int initialSize = service.getEmployees().size();
        service.addEmployee(new Employee(3, "Alina", "Finance", 55000, LocalDate.of(2023, 6, 1)));
        assertEquals(initialSize + 1, service.getEmployees().size());
    }

    @Test
    //removing emp details
    void testRemoveEmployee() {
        service.removeEmployee(1);
        assertEquals(1, service.getEmployees().size());
    }

    @Test
    //searching emp by name
    void testSearchEmployee() {
        Optional<Employee> emp = service.searchEmployee(1);
        assertTrue(emp.isPresent());
        assertEquals("Prakhar", emp.get().getEmpName());
    }

    @Test
    //updating salary for an emp
    public void testUpdateSalary() {
        EmployeeService service = new EmployeeService();
        Employee emp = new Employee(1, "Alice", "IT", 50000, LocalDate.of(2020, 5, 10));
        service.addEmployee(emp);
        service.updateSalary(1, 60000);
        Optional<Employee> result = service.searchEmployee(1);
        assertEquals(60000, result.get().getSalary(),0.01);
    }

    @Test
    //filtering on the basis of dept
    void testFilterByDepartment() {
        List<Employee> hrEmployees = service.filterByDepartment("HR");
        assertEquals(1, hrEmployees.size());
        assertEquals("Hriday", hrEmployees.get(0).getEmpName());
    }

    @Test
    //sorting employees by their name
    void testSortByName() {
        List<Employee> sortedEmployees = service.sortByName();
        assertEquals("Hriday", sortedEmployees.get(0).getEmpName());
        assertEquals("Prakhar", sortedEmployees.get(1).getEmpName());
    }
}