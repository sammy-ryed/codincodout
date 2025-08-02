import java.util.Scanner;
class BMICalculator{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter the number of ppl you want the BMI of: ");
		int number =sc.nextInt();
		
		double height[]= new double[number];
		double weight[]= new double[number];
		double BMI[]= new double[number];
		String weight_status[]={"Underweight","Normal","Overweight","Obese"};
		
		
		for(int x=0; x<number; x++){
			
			System.out.print("Enter the height of person "+(x+1)+" in cm: ");
			height[x]=sc.nextDouble();
			
			System.out.print("Enter the weight of person "+(x+1)+" in kg: ");
			weight[x]=sc.nextDouble();
			
			BMI[x]=weight[x]/(height[x]*height[x]*0.01*0.01);
			
			if(BMI[x]<=18.4)
				{

			System.out.println(weight_status[0]);
		
			}
			else if(18.5<=BMI[x] && BMI[x]<=24.9){
			System.out.println(weight_status[1]);
		}
		else if(25<=BMI[x] && BMI[x]<=39.9){
			System.out.println(weight_status[2]);
		}
		
		else{
			System.out.println(weight_status[3]);
		}
			
		}
		
		sc.close();
	}
}