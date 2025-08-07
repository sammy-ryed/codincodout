import java.util.*;
class TemperaturConversionFToC {
public static void main(String[] args){
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter Temperatur in fahrenheit");
	double TempInFahrenheit=sc.nextDouble();
	
	double TempInCelsius = (TempInFahrenheit-32)*0.5555555555555555;
		
	System.out.println("The "+TempInFahrenheit+" fahrenheit is "+TempInCelsius+" celsius ");
	sc.close();
}}