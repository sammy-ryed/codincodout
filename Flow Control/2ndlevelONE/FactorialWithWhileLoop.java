import java.util.Scanner;
class FactorialWithWhileLoop {
public static void main(String[] args){
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter number to get the factorial");
	
	int number=sc.nextInt(), multiply=1;
	
	while(number!=0){
	
	multiply*=number;
	
	number--;
	
	}
	
	System.out.println("The factorial is "+multiply);
	
	sc.close();
}}