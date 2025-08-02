import java.util.Scanner;
class CountingStars{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number tand get the number of digits");
		int number=sc.nextInt();
		
		int count=0, originalNumber=number, digit=0;
		
		while(originalNumber!=0){
			
			digit=originalNumber%10;
			
			count++;
			
			originalNumber=(int)(originalNumber/10);
			
		}
		
		System.out.println("The number in the given number are/is "+count);
		
		sc.close();
	}
}