import java.util.Scanner;
class ArmstrongsideeyeNumber{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the number to be checked for armstrong number type");
		int number=sc.nextInt();
		
		int sum=0, originalNumber=number, digit=0;
		
		while(originalNumber!=0){
			
			digit=originalNumber%10;
			
			sum+=Math.pow(digit,3);
			
			originalNumber=(int)(originalNumber/10);
			
		}
		
		if(sum==number)
			System.out.println("The number is an armstrong number!");
		
		else
			System.out.println("The number is an NOT armstrong number!");			
		
		sc.close();
	}
}