import java.util.Scanner;
class SumTillZero {
public static void main(String[] args){
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter number to have the sum; Enter zero to terminate sum");
	
	int number=sc.nextInt(), sum=0;
	while(number!=0){
	sum+=number;
	number=sc.nextInt();
	}
	
	System.out.println("Total sum is "+sum);
	
	sc.close();
}}