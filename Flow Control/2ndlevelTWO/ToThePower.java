import java.util.Scanner;

class ToThePower{
	public static void main(String [] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the base");
		int base=sc.nextInt();
		
		System.out.println("Enter the power");
		int power=sc.nextInt();
		
		int result=1;
		
		for(int x=1;x<=power;x++){
			
			result*=base;
		}
		
		System.out.println(base+" to the power "+power+" is "+result);
	
sc.close();}}