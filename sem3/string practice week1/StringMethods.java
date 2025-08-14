import java.util.Scanner; 
 
public class StringMethods{ 

 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
         
        // TODO: Ask user for their full name (first and last name) 
        // TODO: Ask user for their favorite programming language 
        // TODO: Ask user for a sentence about their programming experience 
         
        // TODO: Process the input: 
        // 1. Extract first and last name separately 
        // 2. Count total characters in the sentence (excluding spaces) 
        // 3. Convert programming language to uppercase 
        // 4. Display a formatted summary 



        System.out.println("Enter your full name: ");
        String s=new String(sc.nextLine());
        System.out.println("Enter your fav programming lang: ");
        String s1=new String(sc.nextLine());
        System.out.println("Talk to me about your fav programming language: ");
        String s2=new String(sc.nextLine());
        
        String firstName=" ", lastName=" ";

        firstName=s.substring(0,s.indexOf(' '));
        lastName=s.substring((s.lastIndexOf(' '))+1, s.length());
        int Count=0;
        for(int x=0; x<s2.length();x++){
            if(s.charAt(x)!=' ')
                Count++;
        }

        System.out.printf("First name: %s\nLast name: %s\nTotal count of character: %d\nYour fav programming language: %s", firstName,lastName,Count,s1.toUpperCase());
sc.close(); 
        
        }
         
        
    } 
