abstract class Employee {
    protected String name;
    protected double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract double calculateBonus();
}

interface Payable {
    void generatePaySlip();
}

class Manager extends Employee implements Payable {
    private String department;

    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    double calculateBonus() {
        return salary * 0.2; // 20% bonus
    }

    public void generatePaySlip() {
        System.out.println("Manager Pay Slip");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + calculateBonus());
    }
}

public class LabProblem4_EmployeePayable {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 75000, "HR");
        manager.generatePaySlip();
    }
}
