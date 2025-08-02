import java.util.*;
class SideAndPerimeterOfTriangle {
public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter length of side of triangle");
	
	int side=sc.nextInt();
	int perimeter=4*side;
	
		System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter);
}}