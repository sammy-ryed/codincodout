import java.util.*;
class TotalPrice {
public static void main(String[] args){
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter unit price ");
	double unitPrice=sc.nextDouble();
	
	System.out.println("Enter quantity of item ");
	int quantity=sc.nextInt();
	
	double TotalPrice=quantity*unitPrice;
System.out.println("The total purchase price is INR "+TotalPrice+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
}}
