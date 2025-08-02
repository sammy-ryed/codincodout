import java.util.*;
class ShakeMyHand{
	

	static int fap(int n){
		
		Scanner sc = new Scanner(System.in);
		
		int multiplier=1;
		
		if(n==0)
			return (1);
		
		if (n<=0 || n>16){
			System.out.println("Invalid Enter! try Again!!!!!\nEnter number of students:");
		fap(sc.nextInt());}
		
		while(n!=0){
			
		multiplier*=n;
		n--;
		
		}
		
		sc.close();
		
		return (multiplier);
	
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of students:");
		int n = sc.nextInt();
		
		int numberOfHandshakes = fap(n);
		
		System.out.println("Number of Handshakes is "+numberOfHandshakes);
		
		sc.close();
		}
}
		
		
		