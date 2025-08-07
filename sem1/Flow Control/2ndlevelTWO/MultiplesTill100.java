import java.util.Scanner;

class MultiplesTill100{
	public static void main(String [] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number you want the multiples of");
		int number=sc.nextInt();
		
		for(int x=100;x>=1;x--){
			
			if(x%number==0)
			System.out.println(x+"\tis a multiple of\t"+number);
		
		}
		
	
sc.close();}}