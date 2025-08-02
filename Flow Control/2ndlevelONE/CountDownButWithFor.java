import java.util.Scanner;
class CountDownButWithFor {
public static void main(String[] args){
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter number to be counted down from");
	int number=sc.nextInt();
	
	for(int x=number;x>=1;x--)
		System.out.println("\n\n"+x+"\n\n");
			
	sc.close();
}}