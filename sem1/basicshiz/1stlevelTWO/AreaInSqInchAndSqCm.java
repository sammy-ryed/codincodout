import java.util.*;
class AreaInSqInchAndSqCm {
public static void main(String[] args){
	
	double base, height;
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter base of the triangle ");
	base=sc.nextDouble();
	
	System.out.println("Enter height of the triangle ");
	height=sc.nextDouble();
	
	double areaInCm= 0.5*(base*height);
	double	areaInInches=areaInCm/2.54;
	
	System.out.println("The Area of the triangle in sq in is "+areaInInches+" and sq cm is "+areaInCm);
}}