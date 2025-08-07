import java.util.Scanner;

class multiplicationTable6to9{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the number of which you want the multiplication table of between 6 to 9:");
		int number=sc.nextInt();
		
		while(number<=5 && number>=10){
			System.out.println("You entered wrong number try asgain!");
			System.out.println("Enter the number of which you want the multiplication table of between 6 to 9:");
		 number=sc.nextInt();
		}
		int multiplicatonResult[] = new int [10];
		
		for(int x=0; x<multiplicatonResult.length; x++){
			
			multiplicatonResult[x]=(x+1)*number;
		
		}
		
		for(int x=0; x<multiplicatonResult.length; x++){
						
			System.out.println(number+" X "+(x+1)+" = "+multiplicatonResult[x]);	
		
		}
		
		sc.close();
	}
}