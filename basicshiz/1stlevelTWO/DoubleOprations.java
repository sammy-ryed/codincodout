import java.util.*;
class DoubleOprations {
public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter a");
	double a=sc.nextDouble();
	
	System.out.println("Enter b");
	double b=sc.nextDouble();
	
	System.out.println("Enter c");
	double c=sc.nextDouble();
	
	double Opration1=a+b*c;
	double Opration2=a*b+c;
	double Opration3=c+a/b;
	double Opration4=a%b+c;
	
	System.out.println("The results of double Operations are "+Opration1+", "+Opration2+", "+Opration3+" and "+Opration4);
}}