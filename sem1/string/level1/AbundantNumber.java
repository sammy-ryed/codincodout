import java.util.Scanner;
class AbundantNumber{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the number to be checked for Abundant number type");
		int number=sc.nextInt();
		
		int sum=0;
		
		for(int x=1; x<number; x++){
			
			if(number%x==0)
				
				sum+=x;
		
		}
		
		if(sum>number)
			System.out.println("The number is an Abundant number!");
		
		else
			System.out.println("The number is an NOT Abundant number!");			
		
		sc.close();
	}
}