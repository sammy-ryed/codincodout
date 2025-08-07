import java.util.*;
class Coverstion {
public static void main(String[] args){
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter weight in pounds");
	double weightInPounds=sc.nextDouble();
	
	double weightInKg= weightInPounds*2.2;
		
	System.out.println("The weight of the person in pound is "+weightInPounds+" and in kg is "+weightInKg);
	
	sc.close();
}}