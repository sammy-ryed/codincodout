import java.util.Scanner;

class SmallestAgeAndLargestHeight{
	public static void main(String [] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Amar's age ");
		int AmarsAge=sc.nextInt();
		
		System.out.println("Enter Akbar's age ");
		int AkbarsAge=sc.nextInt();
		
		System.out.println("Enter Anthony's age ");
		int AnthonysAge=sc.nextInt();
		
		
		System.out.println("Enter Amar's height ");
		int AmarsHeight=sc.nextInt();
		
		System.out.println("Enter Akbar's height ");
		int AkbarsHeight=sc.nextInt();
		
		System.out.println("Enter Anthony's height ");
		int AnthonysHeight=sc.nextInt();
		
		
		if(AmarsAge<AkbarsAge && AmarsAge<AnthonysAge)
		System.out.println("Amar is the youngest with an age of "+AmarsAge);
	
		else if (AkbarsAge<AmarsAge && AkbarsAge<AnthonysAge)
		System.out.println("Akbar is the youngest with an age of "+AkbarsAge);
	
		else
		System.out.println("Anthony is the youngest with an age of "+AnthonysAge);
		
		
		
		if(AmarsHeight>AkbarsHeight && AmarsHeight>AnthonysHeight)
		System.out.println("Amar is the tallest with an age of "+AmarsHeight);
	
		else if (AkbarsHeight>AmarsHeight && AkbarsHeight>AnthonysHeight)
		System.out.println("Akbar is the tallest with an age of "+AkbarsHeight);
	
		else
		System.out.println("Anthony is the tallest with an age of "+AnthonysHeight);
		
			
	sc.close();}}