package assignment1;

import assignment1.employees.*;
import assignment1.utilities.EmployeeUtilities;
public class assignmentMain {
    public static void main(String[] args) {
        // Create Manager
        Manager manager = new Manager("althaaf", 101, 75000, "IT");
        
        // Create Developer
        Developer developer = new Developer("Bob", 102, 55000, "Java");

        // Use utilities
        EmployeeUtilities.showEmployeeDetails(manager);
        EmployeeUtilities.showEmployeeDetails(developer);

        EmployeeUtilities.increaseSalary(manager, 5000);
        EmployeeUtilities.increaseSalary(developer, 3000);
    }
}

