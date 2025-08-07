import java.util.Scanner;
class CountDown {
public static void main(String[] args){
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter number to be counted down from");
	int number=sc.nextInt();
	
	while(number!=0){
		System.out.println("\n\n"+number+"\n\n");
	number--;}
			
	sc.close();
}}