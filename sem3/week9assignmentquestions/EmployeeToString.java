
// Topic 1: Using toString() and getClass()
// File: EmployeeToString.java

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Salary: $" + salary;
    }
}

public class EmployeeToString {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Ravi", 55000);
        Employee e2 = new Employee(102, "Sneha", 60000);

        System.out.println(e1.toString());
        System.out.println("Class: " + e1.getClass().getName());

        System.out.println(e2.toString());
        System.out.println("Class: " + e2.getClass().getName());
    }
}
