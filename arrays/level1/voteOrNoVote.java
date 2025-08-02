import java.util.Scanner;

class voteOrNoVote{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter age of 10 students");
		int age[] = new int [10];
		
		for(int x=0; x<age.length; x++){
			
			System.out.println("Enter age of student "+(x+1));
			age[x]=sc.nextInt();
			
			if(age[x]<0){
				
				System.err.println("Invalid options! Your age can't be negative!");
				System.exit(0);
				
			}
		
		}
		
		for(int x=0; x<age.length; x++){
						
			if(age[x]>=18)
				System.out.println("Student "+(x+1)+" can vote!\nTheir age is "+age[x]+"\n");
		
			else
				System.out.println("Student "+(x+1)+" can not vote!\nTheir age is "+age[x]+"\n");			
		
		}
		
		sc.close();
	}
}