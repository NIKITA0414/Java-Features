package com.example.javafeatures.java8.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 70000),
                new Employee("Bob", 50000),
                new Employee("Charlie", 60000),
                new Employee("David", 75000),
                new Employee("Eve", 45000)
        );

        // 1. Filter employees with salary greater than 55000
        List<Employee> highEarners = employees.stream()
                .filter(e -> e.getSalary() > 55000) // Lambda Expression
                .collect(Collectors.toList());

        // 2. Sort employees by name
        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparing(Employee::getName)) // Using Comparator
                .collect(Collectors.toList());

        // 3. Collect names of employees into a new list
        List<String> employeeNames = employees.stream()
                .map(Employee::getName) // Mapping to names
                .collect(Collectors.toList());

        // Output results
        System.out.println("Employees with salary > 55000: " + highEarners);
        System.out.println("Sorted Employees by Name: " + sortedEmployees);
        System.out.println("Employee Names: " + employeeNames);
    }
}