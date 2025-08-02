import java.util.Scanner;

class multiplicationTable{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the number of which you want the multiplication table of:");
		int number=sc.nextInt();
		
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