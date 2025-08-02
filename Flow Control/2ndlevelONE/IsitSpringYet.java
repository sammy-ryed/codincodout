import java.util.Scanner;

class IsitSpringYet {
public static void main(String[] args){
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter month");
	int month=sc.nextInt();

	System.out.println("Enter day");
	int day = sc.nextInt();
	
	if(month>=3 && month<=6){
			if(month==3 || month==6){
				if(day>=20 && day<32){
					System.out.println("Its a Spring Season");
				}
				else
					System.out.println("Its a not Spring Season");
			}
			
			else
				System.out.println("Its a Spring Season");	
	}
	
	else
		System.out.println("Its a not Spring Season");
			
	sc.close();
}}