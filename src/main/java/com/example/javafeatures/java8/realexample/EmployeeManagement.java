package com.example.javafeatures.java8.realexample;

import java.util.*;
import java.util.stream.Collectors; // Import for Stream and Collectors

public class EmployeeManagement {
    private List<Employee> employees = new ArrayList<>(); // Collection to store employees

    // Add employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Get all employees
    public List<Employee> getAllEmployees() {
        return employees;
    }

    // Search for an employee by name
    public Optional<Employee> findEmployeeByName(String name) {
        return employees.stream() // Java 8 Stream API
                .filter(emp -> emp.getName().equalsIgnoreCase(name)) // Lambda expression for filtering
                .findFirst(); // Returns an Optional<Employee>
    }

    // Calculate average salary
    public double calculateAverageSalary() {
        return employees.stream() // Java 8 Stream API
                .mapToDouble(Employee::getSalary) // Method references as a lambda expression
                .average() // Returns an OptionalDouble
                .orElse(0.0); // Provide a default value if no employees
    }

    // Filter employees by salary range
    public List<Employee> filterBySalaryRange(double min, double max) {
        return employees.stream() // Java 8 Stream API
                .filter(emp -> emp.getSalary() >= min && emp.getSalary() <= max) // Lambda expression for filtering
                .collect(Collectors.toList()); // Collect results into a list
    }
}