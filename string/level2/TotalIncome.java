import java.util.*;
class TotalIncome {
public static void main(String[] args){
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter Salary");
	double salary=sc.nextDouble();
	
	System.out.println("Enter bonous");
	double bonous=sc.nextDouble();
	
	double TotalIncome=salary+bonous;
		
	System.out.println("The salary is INR "+salary+" and bonus is INR "+bonous+". Hence Total Income is INR "+TotalIncome);
	
	sc.close();
}}