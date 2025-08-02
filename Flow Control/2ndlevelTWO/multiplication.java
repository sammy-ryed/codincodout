import java.util.Scanner;

class multiplication{
	public static void main(String [] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number you wanted the multiplication");
		int number=sc.nextInt();
		
		for(int x=6;x<=9;x++){
			System.out.println(number+" X "+x+" = "+(x*number)+"\n");
		}
		
	
sc.close();}}