import java.util.*;
class TravelComputation {
   
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
	System.out.println("Enter your name, from which city you're going, via which city and to which city");
      String name = sc.nextLine();
      String fromCity = sc.nextLine();
	  String viaCity = sc.nextLine();
	  String toCity = sc.nextLine();

      System.out.println("Enter the distance from your city to via city then your destination city, in miles and the time taken to reach via city then your destation city");
      
	  double distanceFromToVia = sc.nextDouble();
	double distanceViaToFinalCity = sc.nextDouble();
      
      int timeFromToVia = sc.nextInt()* 60;
      int timeViaToFinalCity = sc.nextInt()* 60;

      
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;

      
      int totalTime = timeFromToVia + timeViaToFinalCity;


      
      System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");
						 
	sc.close();
   }
}
