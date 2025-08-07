import java.util.Scanner;

class CheckNumbers{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter five numbers and see the magic(it's boring imma kms)");
		int numbers[] = new int [5];
		
		for(int x=0; x<numbers.length; x++){
			
			System.out.println("Enter number "+(x+1));
			numbers[x]=sc.nextInt();
		
		}
		
		for(int x=0; x<numbers.length; x++){
						
			if(numbers[x]>0)
				System.out.println("number "+(x+1)+" that was entered is positive\nThe number is "+numbers[x]+"\n");
		
			else if(numbers[x]<0)
				System.out.println("number "+(x+1)+" that was entered is negative\nThe number is "+numbers[x]+"\n");
			
			else
				System.out.println("number "+(x+1)+" that was entered is zero\nThe number is "+numbers[x]+"\n");
		}
		
		if(numbers[0]>numbers[(numbers.length-1)])
			System.out.println("The first element is greater than the last one");
		
		else
			System.out.println("The last element is greater than the first one");

		
		sc.close();
	}
}