import java.util.Scanner;
class largest {
public static void main(String[] args){
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter number1");
	int number1=sc.nextInt();
	
	System.out.println("Enter number2");
	int number2=sc.nextInt();
	
	System.out.println("Enter number3");
	int number3=sc.nextInt();
	
	if(number1>number2 && number1>number3)
		System.out.println("Is the first number the largest? Yes!\nIs the second number the largest? No!\nIs the third number the largest? No!");
	
	else if (number2>number1 && number2>number3)
		System.out.println("Is the first number the largest? No!\nIs the second number the largest? Yes!\nIs the third number the largest? No!");
	
	else
		System.out.println("Is the first number the largest? Yes!\nIs the second number the largest? No!\nIs the third number the largest? No!");

	sc.close();
}}