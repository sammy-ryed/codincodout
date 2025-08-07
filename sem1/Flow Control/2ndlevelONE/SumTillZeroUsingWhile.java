import java.util.Scanner;
class SumTillZeroUsingWhile {
public static void main(String[] args){
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter number to have the sum; Enter zero to terminate sum");
	
	int number=sc.nextInt(), sum=0;
	
	while(true){
	
	sum+=number;
	
	number=sc.nextInt();
	
	if(number==0)
		break;
	}
	
	System.out.println("Total sum is "+sum);
	
	sc.close();
}}