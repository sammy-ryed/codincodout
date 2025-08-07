import java.util.Scanner;

class FizzBuzzz{
	
	public static void main(String [] args){
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the limit");
		
		int limit=sc.nextInt();
		
		if(limit<0){
			System.err.println("Wrong");
			System.exit(0);
		}
		
		String[] fizzBuzz= new String[limit];
		
		for(int x=0;x<limit;x++){
		
		if((x+1)%3==0 && (x+1)%5==0)
			fizzBuzz[x]="FizzBuzz";
		
		else if((x+1)%5==0)
			fizzBuzz[x]="Buzz";
		
		else if((x+1)%3==0)
			fizzBuzz[x]="Fizz";
		
		else
			fizzBuzz[x]=String.valueOf((x+1));
		
		}
		
		for(int x=0;x<fizzBuzz.length;x++){
			
			System.out.println("Position "+(x+1)+" = "+fizzBuzz[x]);
			
		}
		
		sc.close();
	}
}