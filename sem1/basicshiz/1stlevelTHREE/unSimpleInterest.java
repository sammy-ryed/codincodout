import java.util.*;
class unSimpleInterest {
public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter principal amount");
	double principal=sc.nextDouble();
	
	System.out.println("Enter rate of interst");
	double rate=sc.nextDouble();
	
	System.out.println("Enter the time perriod in days");
	double time=sc.nextDouble()*24;
	
	double SimpleInterest=(principal*rate*time);
	SimpleInterest/=100;
	
	System.out.println("The Simple Interest is "+SimpleInterest+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);
	
	sc.close();
}}