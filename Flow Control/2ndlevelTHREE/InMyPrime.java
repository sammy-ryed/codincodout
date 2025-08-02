import java.util.Scanner;
class InMyPrime{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the number to be checked for prime");
		int number=sc.nextInt();
		
		Boolean b=true;
		
		for(int x=2; x<=(Math.sqrt(number)+1);x++){
			if(number%x==0){
				System.out.println("Number not prime");
				b=false;
				break;
			}
		}
		if(b)
			System.out.println("Number prime");
		
		sc.close();
	}
}