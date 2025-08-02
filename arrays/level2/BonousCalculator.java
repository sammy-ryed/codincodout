import java.util.Scanner;

class BonousCalculator{
	
	public static void main(String [] args){
		
		Scanner sc=new Scanner (System.in);
		
		int rows=10;
		int columns=2;
		double old_salary[][]= new double [rows][columns];
		double new_salary[][]= new double[rows][(columns+1)];
		double bonous=0.0;
		
		System.out.println("Enter the salary and term of service of 10 employers:\n");
		
		for(int x=0;x<rows;x++){
			
			for(int y=(columns-1);y>=0;y--){
				
				if(y==1){
				System.out.println("Enter salary of employee "+(x+1));
				old_salary[x][y]=sc.nextDouble();}
				
				else{
				System.out.println("Enter term of service of employee "+(x+1));
				old_salary[x][y]=sc.nextDouble();
				}	
			}
		}
		
		for(int x=0;x<rows;x++){
			
			for(int y=0;y<(columns-1);y++){
				
				if(old_salary[x][y]>5){
					
					bonous=((old_salary[x][(y+1)]*5)/100);
					
				}
				
				else {
					
						bonous=((old_salary[x][(y+1)]*2)/100);
				}
				new_salary[x][(y+2)]=bonous;
				
				}
					
			for(int y=(columns-1); y>=0; y--){
				
				if(y==0)
				new_salary[x][y]=old_salary[x][y];
				
				else if(y==1)
					new_salary[x][y]=old_salary[x][y]+new_salary[x][(y+1)];
				
				else
					continue;
					
			}
			
			}
			
			for(int x=0; x<rows;x++){
				
				for(int y=0; y<(columns+1); y++){
					
					if(y==0)
						System.out.print("Time of service = "+new_salary[x][y]);
					
					else if(y==1)
						System.out.print(" Of employee with salary = "+new_salary[x][y]+". ");
					
					else
						System.out.println("Their bonous amount = "+new_salary[x][y]);
						
				}
			}
		
		
		
		sc.close();
	}
}