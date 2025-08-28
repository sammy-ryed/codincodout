class Employee {
    static int totalEmployees=0; String empId,empName,department; double baseSalary; boolean[] attendance=new boolean[30];
    public Employee(String id,String name,String dept,double sal){ this.empId=id; this.empName=name; this.department=dept; this.baseSalary=sal; totalEmployees++; }
    public void markAttendance(int day,boolean present){ attendance[day]=present; }
    public double calculateSalary(){ return baseSalary; }
}

public class Assignment6_EmployeeSystem {
    public static void main(String[] args){
        Employee e1=new Employee("E1","Alice","IT",30000);
        e1.markAttendance(1,true);
        System.out.println(e1.empName+" Salary:"+e1.calculateSalary());
        System.out.println("Total Employees:"+Employee.totalEmployees);
    }
}