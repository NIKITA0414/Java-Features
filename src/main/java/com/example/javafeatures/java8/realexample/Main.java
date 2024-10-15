package com.example.javafeatures.java8.realexample;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        EmployeeManagement em = new EmployeeManagement();

        // Adding employees
        em.addEmployee(new Employee("Alice", 70000));
        em.addEmployee(new Employee("Bob", 50000));
        em.addEmployee(new Employee("Charlie", 60000));

        // Get all employees
        System.out.println("All Employees:");
        em.getAllEmployees().forEach(emp -> System.out.println(emp.getName())); // Method references for printing

        // Find an employee by name
        Optional<Employee> employee = em.findEmployeeByName("Alice");
        employee.ifPresent(emp -> System.out.println("Found: " + emp.getName())); // Safe access using Optional

        // Calculate average salary
        double averageSalary = em.calculateAverageSalary();
        System.out.println("Average Salary: " + averageSalary);

        // Filter employees by salary range
        List<Employee> filteredEmployees = em.filterBySalaryRange(55000, 75000);
        System.out.println("Filtered Employees (Salary between 55000 and 75000):");
        filteredEmployees.forEach(emp -> System.out.println(emp.getName())); // Method references for printing
    }
}