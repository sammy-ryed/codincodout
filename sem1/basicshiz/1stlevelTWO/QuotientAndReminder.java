import java.util.*;
class QuotientAndReminder {
public static void main(String[] args){
	int number1, number2;
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter number 1");
	number1=sc.nextInt();
	
	System.out.println("Enter number 2");
	number2=sc.nextInt();
	
		int quotien=number1/number2, reminder=number1%number2;
		
		System.out.println("The Quotient is "+quotien+" and Reminder is "+reminder+" of two number "+number1+" and "+number2);
}}