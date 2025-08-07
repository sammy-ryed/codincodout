import java.util.*;
class CharlieKindaChocolate {
public static void main(String[] args){
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter  number of chocolates and number of Children");
	int  numberOfchocolates=sc.nextInt();
	int  numberOfChildren=sc.nextInt();
	
	int chocolatesPerPerson=numberOfchocolates/numberOfChildren;
	int chocolatesLeft=numberOfchocolates%numberOfChildren;
		
	System.out.println("The number of chocolates each child gets is "+chocolatesPerPerson+" and the number of remaining chocolates are "+chocolatesLeft);
	
	sc.close();
}}