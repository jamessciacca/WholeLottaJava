import java.util.Scanner;

public class Decimal2Hex{
	public static void main(String[] args){
		// creating scanner object for reading input from user
		Scanner stdIn = new Scanner(System.in);

		// prompting and reading input from user
		System.out.print("Enter a decimal value (0 to 15): ");
		int decimal = stdIn.nextInt();

		// if decimal is invalid
		if (decimal < 0 || decimal > 15)
			System.out.println(decimal + " is an invalid input");

		// if decimal is greater than 9, using ascii value to get Characters (A, B, C, D, E, F)
		else if (decimal > 9)
			System.out.println("The hex value is " + Character.toString((char)(decimal + 55)));

		//under decimal-9 hex values are same as decimal
		else
			System.out.println("The hex value is " + decimal);
	}
}