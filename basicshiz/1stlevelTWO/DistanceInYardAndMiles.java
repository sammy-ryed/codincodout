import java.util.*;
class DistanceInYardAndMiles {
public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter distance in feet");
	int distanceInFeet=sc.nextInt();
	
	double distanceInYards=distanceInFeet/3, distanceInMiles=distanceInYards/1760;
	
	System.out.println("The distance in yards is  "+distanceInYards+" while the distance in miles is "+distanceInMiles);
}}