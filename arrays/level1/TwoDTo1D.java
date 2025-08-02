import java.util.Scanner;

class BonousCalcula{
	
	public static void main(String [] args){
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the rows and columns of 2D array");
		
		int rows=sc.nextInt();
		int columns=sc.nextInt();
		
		int twoDArray[][]= new int [rows][columns];
		
		int oneDArray[]= new int[(rows*columns)];
		int count=0;
		
		for(int x=0;x<rows;x++){
			
			for(int y=0;y<columns;y++){
				
				System.out.println("Enter twoDArray["+x+"]["+y+"] element");
				twoDArray[x][y]=sc.nextInt();
			}
		}
		
		for(int x=0;x<rows;x++){
			
			for(int y=0;y<columns;y++){
				
				oneDArray[count]=twoDArray[x][y];
				count++;
			}
		}
		
		for(int x=0;x<oneDArray.length;x++){
			
			System.out.println("oneDArray["+x+"] = "+oneDArray[x]);
			
		}
		
		sc.close();
	}
}