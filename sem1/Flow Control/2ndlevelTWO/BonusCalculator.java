import java.util.Scanner;

class BonusCalculator{
	public static void main(String [] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your salary");
		double salary=sc.nextDouble();
		
		System.out.println("Enter your term of service in years");
		double TermOfService=sc.nextDouble();
		
		double bonus=0.0;
		
		if(TermOfService>5)
			bonus=(salary*5)/100;
		
		double NewSalary=salary+bonus;
		
		System.out.println("The new salary is "+NewSalary+" and bonus amount is "+bonus);
		
sc.close();}}