import java.util.Scanner;

class reverseDigits{
	public static void main(String [] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number=sc.nextInt();
		
		int count=0;	
		int temp=number;
		
		while(temp!=0){
			
			temp=(int)(temp/10);
			
			count++;
			
		}
		
		int digitArray[]=new int[count];
		
		int x=0;
		while(x!=count){
			
			digitArray[x]=number%10;
			
			x++;
			number=(int)(number/10);
			
		}
		
		for(int y=0; y<count;y++){
			
			System.out.println(digitArray[y]);
			
		}
		
		
	sc.close();
	
	}}