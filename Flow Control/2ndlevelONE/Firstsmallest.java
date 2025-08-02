import java.util.*;
class Firstsmallest {
public static void main(String[] args){
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter number1");
	int number1=sc.nextInt();
	
	System.out.println("Enter number2");
	int number2=sc.nextInt();
	
	System.out.println("Enter number3");
	int number3=sc.nextInt();
	
	if(number1<number2 && number1<number3)
		System.out.println("Is the first number the smallest? Yes!");
	else
		System.out.println("Is the first number the smallest? No!");
	
	sc.close();
}}