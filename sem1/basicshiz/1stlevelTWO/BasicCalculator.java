import java.util.*;
class BasicCalculator {
public static void main(String[] args){
	int number1, number2;
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter number 1");
	number1=sc.nextInt();
	
	System.out.println("Enter number 2");
	number2=sc.nextInt();
	
		int add=number1+number2, sub=number1-number2, multi=number1*number2;
		double divide=number1/number2;
		
		System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "+number1+" and "+number2+" is "+add+", "+sub+", "+multi+", and "+divide);
}}