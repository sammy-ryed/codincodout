import java.util.Scanner;

class LargestAndSecondLargestDigitOfANumber{
	public static void main(String [] args){
		
		Scanner sc=new Scanner(System.in);
		
		int maxTerm =10;
		int digitArray []= new int[maxTerm];
		
		System.out.print("Enter a number: ");
		int number=sc.nextInt();
		
		int max=0, secondMax=0, count=0;
		
		while(number!=0){
			
			digitArray[count]=number%10;
			
			number=(int)(number/10);
			
			count++;
			
			if(count>=10){
				
				System.out.println("Digit limit reaches!");
				break;
				
			}
			
		}
		
		for(int x=0; x<maxTerm;x++){
			
			if(digitArray[x]>max)
				max=digitArray[x];
			
			if(digitArray[x]>secondMax && digitArray[x]<max)
				secondMax=digitArray[x];
			
		}
		
	System.out.println("The maximum is "+max+" and the second maximum is "+secondMax);
		
	sc.close();
	
	}}