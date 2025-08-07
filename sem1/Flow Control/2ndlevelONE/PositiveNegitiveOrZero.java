import java.util.Scanner;
class PositiveNegitiveOrZero {
public static void main(String[] args){
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter number to be checked for being negitive, positive or zero");
	int number=sc.nextInt();
	
	if(number==0)
		System.out.println("Zero");
	
	else if (number>0)
		System.out.println("Positive");
	else
		System.out.println("Negitive");
			
	sc.close();
}}