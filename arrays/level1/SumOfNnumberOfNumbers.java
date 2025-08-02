import java.util.Scanner;

class SumOfNnumberOfNumbers{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 10 numbers. Enter the 0 or negative numbers to terminate before");
		
		int numbers[] = new int [10];
		
		int sum=0, x;
		for(x=0; x<numbers.length; x++){
			
			numbers[x]=sc.nextInt();
			if(numbers[x]<=0)
				break;
		}
		
		for(int y=0; y<x; y++){
			
			sum+=numbers[y];
			System.out.println("Number "+(y+1)+" you entered was "+numbers[y]);	
		
		}
		
		System.out.println("Sum of all the numbers is "+sum);
		
		sc.close();
	}
}