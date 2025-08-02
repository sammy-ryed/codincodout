import java.util.Scanner;

class GreatestFactor{
	public static void main(String [] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number you want the greatest factor of");
		int number=sc.nextInt();
		int greatestFactor=0;
		
		for(int x=1;x<=(number-1);x++){
			
			if(number%x==0)
			
			greatestFactor=x;
			
		}
		
		System.out.println(greatestFactor+" is a GreatestFactor of "+number);
	
		sc.close();}}