import java.util.Scanner;

class FizzBuzzUsingWhileLoop{
	public static void main(String [] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number you want the FizzBuzz for");
		int number=sc.nextInt();
		
		int temp=0;
		
		while(temp<=number){
			
			if(temp%3==0 && temp%5!=0)
			System.out.println("Fizz ("+temp+")");
		
			else if(temp%3!=0 && temp%5==0)
			System.out.println("Buzz("+temp+")");
		
			else if(temp%3==0 && temp%5==0)
			System.out.println("FizzBuzz");
			
			else
			System.out.println(temp);
			
			temp++;
		}
		
	
sc.close();}}