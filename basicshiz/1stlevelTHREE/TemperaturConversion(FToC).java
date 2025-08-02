import java.util.*;
class TemperaturConversionFToC {
public static void main(String[] args){
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter Temperatur in fahrenheit");
	double TempInFahrenheit=sc.nextDouble();
	
	double TempInCelsius = (TempInFahrenheit-32)*0.625	;
		
	System.out.println("The "+TempInCelsius+" fahrenheit is "+TempInFahrenheit+" celsius ");
}}