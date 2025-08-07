import java.util.Scanner;
class SumOfNnaturalNumber {
public static void main(String[] args){
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter number to get the sum till that number");
	
	int number=sc.nextInt(), sum=0;
	
	double BeforeResult= number*(number+1);
	double result= BeforeResult/2;
	
	while(number!=0){
	
	sum+=number;
	
	number--;
	
	}
	
	System.out.println("Total nth sum is using while loop is "+sum+" and using formula is "+result);
	
	sc.close();
}}