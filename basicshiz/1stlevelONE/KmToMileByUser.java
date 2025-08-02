import java.util.*;
class KmToMileByUser{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Distance in Km");
		double km=sc.nextDouble();
		double mile=km/1.6;
		System.out.println("The total miles is "+mile+" mile for the given "+km+" km");
		sc.close();
}}