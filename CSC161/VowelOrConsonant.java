//importing scanner
import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in); // scanner input //
	    
	    System.out.print("Enter a letter grade: ");
        char ch1 = input.next().charAt(0); // take input character //
	    
	    int x = ch1; // Type casting //
	    
	    if ((x>=65 && x<=90)||(x>=97 && x<=122)) // Check whether input is valid or not //
	    {
	        
	        switch(x) // When input is valid, check vowel or consonant //
	        {
	            case 65:
	            case 69:
	            case 73:
	            case 79:
	            case 85:
	            case 97:
	            case 101:
	            case 105:
	            case 111:
	            case 117: System.out.println(ch1 + " is a vowel ");
	                      break ;
	                      
	           default: System.out.println(ch1 + " is a consonant ");
	                      break ;
	        }
	        
	    }
	    else // print when character is not letter //
	    {
	        System.out.println(ch1 + " is an invalid input ");
	    }
	    
		
	}
}
