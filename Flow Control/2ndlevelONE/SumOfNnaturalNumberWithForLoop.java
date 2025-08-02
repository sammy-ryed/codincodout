import java.util.Scanner;
class SumOfNnaturalNumberWithForLoop {
public static void main(String[] args){
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter number to get the sum till that number");
	
	int number=sc.nextInt(), sum=0;
	
	for(int x=1; x<=number; x++){
	
	sum+=x;
	
	}
	
	System.out.println("Total nth sum is using for loop is "+sum);
	
	sc.close();
}}