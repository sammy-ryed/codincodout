import java.util.Scanner;

class FizzBuzz{
	public static void main(String [] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number you want the FizzBuzz for");
		int number=sc.nextInt();
		
		for(int x=0;x<=number;x++){
			
			if(x%3==0 && x%5!=0)
			System.out.println("Fizz ("+x+")");
		
			else if(x%3!=0 && x%5==0)
			System.out.println("Buzz("+x+")");
		
			else if(x%3==0 && x%5==0)
			System.out.println("FizzBuzz");
			
			else
			System.out.println(x);
		}
		
	
sc.close();}}