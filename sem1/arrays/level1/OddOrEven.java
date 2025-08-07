import java.util.Scanner;

class OddOrEven{	
	
	public static void main(String [] args){
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the number till which you want the evem and odd number");
		
		int limit=sc.nextInt();
	
		int EvenAndOddNumbers[]=new int[((int)(limit/2)+1)];
		
		for(int x=0;x<EvenAndOddNumbers.length;x++){
			
			if((x+1)%2==0)
				EvenAndOddNumbers[x]=x+1;
			
			else
				EvenAndOddNumbers[x]=x+1;
		}
		
		for(int x=0;x<EvenAndOddNumbers.length;x++){
			
			System.out.println(EvenAndOddNumbers[x]);
			
		}

		
		sc.close();
	}
}