import java.util.*;
class HeightcmToInchesAndFeet{
	public static void main(String[] args){
		double heightIncm, heightInInch, heightInFeet;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your height in cm:\n");
		heightIncm=(double)sc.nextDouble();
		heightInFeet=heightIncm/(12*2.54);
		heightInInch=heightIncm/2.54;
		System.out.println("Height in cm is "+heightIncm+" while in feet is "+heightInFeet+" and in inches is "+heightInInch);
		sc.close();
}
}