import java.util.Scanner;
class HarshadNumber{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the number to be checked for Harshad number type");
		int number=sc.nextInt();
		
		int sum=0, originalNumber=number, digit=0;
		
		while(originalNumber!=0){
			
			digit=originalNumber%10;
			
			sum+=digit;
			
			originalNumber=(int)(originalNumber/10);
			
		}
		
		if(number%sum==0)
			System.out.println("The number is an Harshad number!");
		
		else
			System.out.println("The number is an NOT Harshad number!");			
		
		sc.close();
	}
}