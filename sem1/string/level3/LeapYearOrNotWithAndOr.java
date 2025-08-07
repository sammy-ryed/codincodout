import java.util.Scanner;
class LeapYearOrNotWithAndOr{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the year to be checked for leap year");
		int year=sc.nextInt();
		
		while(year<=1582){
			System.out.println("Invaild year! Try Again!");
			year=sc.nextInt();}
		
		if(year%4==0 && (year%100!=0 || year%400==0))
			
			System.out.println("Year is a leap year!");
			
		
		else
			System.out.println("Year is not a leap year!");
			
		
		sc.close();
	}
}