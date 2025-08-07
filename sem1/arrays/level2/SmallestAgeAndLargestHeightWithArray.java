import java.util.Scanner;

class SmallestAgeAndLargestHeightWithArray{
	public static void main(String [] args){
		
		Scanner sc=new Scanner(System.in);
		
		int age []= new int[3];
		double height []= new double[3];
		
		System.out.println("Enter Amar's age, Akbar's age, Anthony's age:");
		
		int youngest=0;
		double tallest=0;
		for(int x=0; x<3;x++){
			
			age[x]=sc.nextInt();
			
			if(x==0)
				youngest=age[0];
			
			if(youngest>age[x])
				youngest=age[x];
		
		}
		
		System.out.println("Enter Amar's height, Akbar's height, Anthony's height:");
		
		for(int x=0; x<3;x++){
			
			height[x]=sc.nextDouble();
			
			if(tallest<height[x])
				tallest=height[x];
		
		}
		
		for(int x=0; x<3; x++){
			
			if(tallest==height[x])
				System.out.println("Friend "+(x+1)+" is the tallest");
			
			if(youngest==age[x])
				System.out.println("Friend "+(x+1)+" is the youngest");
		}
		
			
	sc.close();
	
	}}