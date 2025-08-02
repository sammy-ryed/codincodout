import java.util.Scanner;
class BMICalculatorUsing2DArray{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter the number of ppl you want the BMI of: ");
		int number =sc.nextInt();
		
		double personData[][]= new double[number][3];
		String weight_status[]={"Underweight","Normal","Overweight","Obese"};
		
		
		for(int x=0; x<number; x++){
		for(int y=0; y<3;y++){
			if(y==0){
				System.out.print("Enter the height of person "+(x+1)+" in cm: ");
			personData[x][y]=sc.nextDouble();
			}
			
			else if(y==1){
				System.out.print("Enter the weight of person "+(x+1)+" in kg: ");
			personData[x][y]=sc.nextDouble();
			}
			else
				personData[x][y]=personData[x][1]/(personData[x][0]*personData[x][0]*0.01*0.01);
		}
		}
		
		for(int x=0; x<number;x++){	
			for(int y=2; y!=3;y++){
				
			
			if(personData[x][y]<=18.4)
				{

			System.out.println(weight_status[0]);
		
			}
			else if(18.5<=personData[x][y] && personData[x][y]<=24.9){
			System.out.println(weight_status[1]);
		}
		else if(25<=personData[x][y] && personData[x][y]<=39.9){
			System.out.println(weight_status[2]);
		}
		
		else{
			System.out.println(weight_status[3]);
		}
			
	}}
		sc.close();
	}
}