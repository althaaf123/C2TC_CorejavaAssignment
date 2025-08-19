package assignment1.employee;

/**
 * Base class representing a generic Employee.
 */
public class Employee {
    // Private attributes
    private String name;
    private int employeeId;
    private double salary;

    // Constructor
    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }
    protected void setSalary(double salary) { // Protected: accessible in subclasses
        this.salary = salary;
    }

    // Display method
    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + employeeId + ", Salary: " + salary);
    }
}

