import java.util.Scanner;

class factors{
	public static void main(String [] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number you want the factors of");
		int number=sc.nextInt();
		
		for(int x=1;x<=number;x++){
			
			if(number%x==0)
			
			System.out.println(x+" is a factor of "+number);
		
		}
		
	
sc.close();}}