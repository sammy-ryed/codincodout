import java.util.Scanner;

class MeanHeight{
	
	public static void main(String [] args){
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the height of 11 players");
		
		double heights[]=new double[11];
		
		double sum=0.0, avarage=0.0;
		for(int x=0;x<heights.length;x++){
			
			heights[x]=sc.nextDouble();
			
			if(heights[x]<=0){
				
				System.err.println("You've entered an illeagel value. Go to jail now");
				
				System.exit(0);
			}
		}
		
		for(int x=0;x<heights.length;x++){
			
			sum+=heights[x];
			
		}
		
		avarage=sum/11;
		
		System.out.println("The avarage height of eleven players is "+avarage);
		
		sc.close();
	}
}