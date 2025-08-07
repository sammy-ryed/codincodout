import java.util.Scanner;

class OddOrEven{
	public static void main(String [] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number till checked if numbers are odd or even");
		int number=sc.nextInt();
		
		if(number>0){
			
			for(int x=1; x<=number;x++){
				
				if(x%2==0)
				System.out.println(x+" is even");
				
				else
				System.out.println(x+" is odd");
			}
		}
		
		else
			System.out.println("You entered a number that is not natrual");
	
sc.close();}}