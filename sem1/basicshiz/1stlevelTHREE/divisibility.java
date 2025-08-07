import java.util.*;
class divisibility {
public static void main(String[] args){
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter number to be checked for divisibility");
	int number=sc.nextInt();
	
	if(number%5==0)
		System.out.println("Is the number "+number+" divisible by 5? Yes!");
	
	else
		System.out.println("Is the number "+number+" divisible by 5? No!");
			
	sc.close();
}}