import java.util.Scanner;
class FactorialWithForLoop {
public static void main(String[] args){
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter number to get the factorial");
	
	int number=sc.nextInt(), multiply=1;
	
	for(int x=1;x<=number;x++){
	
	multiply*=x;
	
	}
	
	System.out.println("The factorial is "+multiply);
	
	sc.close();
}}