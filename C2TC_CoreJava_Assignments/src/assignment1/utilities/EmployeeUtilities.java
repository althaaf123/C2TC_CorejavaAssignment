package assignment1.utilities;

import assignment1.employees.Employee;

/**
 * Utility class for performing operations on employees.
 */
public class EmployeeUtilities {

    // Public method to increase salary
    public static void increaseSalary(Employee emp, double amount) {
        double newSalary = emp.getSalary() + amount;
        emp.displayInfo();
        System.out.println("Salary increased by " + amount + ". New Salary: " + newSalary);
    }

    // Public method to display employee details
    public static void showEmployeeDetails(Employee emp) {
        emp.displayInfo();
        System.out.println("-----------------------------");
    }
}