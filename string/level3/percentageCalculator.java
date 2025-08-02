import java.util.Scanner;
class percentageCalculator{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter marks in Chemistry ");
		double chemMarks =sc.nextDouble();
		
		System.out.println("Enter marks in Physics");
		double phyMarks=sc.nextDouble();
		
		System.out.println("Enter marks in Maths");
		double mathMarks=sc.nextDouble();
		
		double averageMarks=(chemMarks+phyMarks+mathMarks)/3;
		double percentage=((chemMarks+phyMarks+mathMarks)*100)/300;
		
		if(percentage>=80){
			System.out.println("Marks in Chemistry are\t"+chemMarks+"\nMarks in Physics are\t"+phyMarks+"\nMarks in math are\t"+mathMarks+"\n\nAverage Marks are\t"+averageMarks);
			System.out.println("Remarks are:\nAbove agency-normalized standards");
		}
		
		else if(70<=percentage && percentage<=79){
			System.out.println("Marks in Chemistry are\t"+chemMarks+"\nMarks in Physics are\t"+phyMarks+"\nMarks in math are\t"+mathMarks+"\n\nAverage Marks are\t"+averageMarks);
			System.out.println("Remarks are:\nAt agency-normalized standards");
		}
		
		else if(60<=percentage && percentage<=69){
			System.out.println("Marks in Chemistry are\t"+chemMarks+"\nMarks in Physics are\t"+phyMarks+"\nMarks in math are\t"+mathMarks+"\n\nAverage Marks are\t"+averageMarks);
			System.out.println("Remarks are:\nBelow, but approaching agency-normalized standards");
		}
		
		else if(40<=percentage && percentage<=59){
			System.out.println("Marks in Chemistry are\t"+chemMarks+"\nMarks in Physics are\t"+phyMarks+"\nMarks in math are\t"+mathMarks+"\n\nAverage Marks are\t"+averageMarks);
			System.out.println("Remarks are:\nWell below agency-normalized standards");
		}
		
		else{
			System.out.println("Marks in Chemistry are\t"+chemMarks+"\nMarks in Physics are\t"+phyMarks+"\nMarks in math are\t"+mathMarks+"\n\nAverage Marks are\t"+averageMarks);
			System.out.println("Remarks are:\nRemedial standards");
		}
		
		sc.close();
	}
}