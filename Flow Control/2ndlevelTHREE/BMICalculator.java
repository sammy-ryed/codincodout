import java.util.Scanner;
class BMICalculator{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter your in weight ");
		double weight =sc.nextDouble();
		
		System.out.println("Enter your in height");
		double height=sc.nextDouble();
		
		double heightsquare=(height*height);
		double BMIIncm=weight/heightsquare;
		
		double BMIInm=(BMIIncm)/(0.01*0.01);
		
		if(BMIInm<=18.4){

			System.out.println("You're underweight - womp womm");
		
		}
		
		else if(18.5<=BMIInm && BMIInm<=24.9){
			System.out.println("You're normal - based");
		}
		
		else if(25<=BMIInm && BMIInm<=39.9){
			System.out.println("You're overweight - you and i brodah");
		}
		
		else{
			System.out.println("You're obese - my 600 pound life much");
		}
		
		sc.close();
	}
}