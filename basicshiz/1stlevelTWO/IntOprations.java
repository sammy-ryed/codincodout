import java.util.*;
class IntOprations {
public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter a");
	int a=sc.nextInt();
	
	System.out.println("Enter b");
	int b=sc.nextInt();
	
	System.out.println("Enter c");
	int c=sc.nextInt();
	
	int Opration1=a+b*c;
	int Opration2=a*b+c;
	int Opration3=c+a/b;
	int Opration4=a%b+c;
	
	System.out.println("The results of Int Operations are "+Opration1+", "+Opration2+", "+Opration3+" and "+Opration4);
}}