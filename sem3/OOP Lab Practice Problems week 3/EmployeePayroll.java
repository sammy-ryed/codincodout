class Employee {
    private static int counter=0;
    private String empId, empName, department, empType;
    private double baseSalary;

    public Employee(String name,String dept,double salary,String type){
        this.empId="E"+(++counter); this.empName=name; this.department=dept;
        this.baseSalary=salary; this.empType=type;
    }
    public double calculateSalary(){
        if(empType.equals("FullTime")) return baseSalary+2000;
        else if(empType.equals("PartTime")) return baseSalary*20;
        else if(empType.equals("Contract")) return baseSalary;
        return baseSalary;
    }
    public void generatePaySlip(){
        System.out.println(empId+" "+empName+" "+empType+" Salary:"+calculateSalary());
    }

    public static void main(String[] args){
        Employee e1=new Employee("John","IT",30000,"FullTime");
        Employee e2=new Employee("Emma","HR",500,"PartTime");
        Employee e3=new Employee("Mike","Finance",40000,"Contract");
        e1.generatePaySlip(); e2.generatePaySlip(); e3.generatePaySlip();
    }
}