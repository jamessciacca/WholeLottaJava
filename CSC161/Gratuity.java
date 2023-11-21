// Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total.
// For example, if the user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5 as gratuity and $11.5 as total.

//importing scanner
import java.util.Scanner;

public class Gratuity {
    public static void main(String[] args){
        //setting up scanner object
        Scanner myObj = new Scanner(System.in);

        //Asking user for subtotal and gratuity amount
        System.out.print("Please enter the subtotal: ");
        double subtotal = myObj.nextDouble();

        System.out.print("Please enter the gratuity rate: ");
        double gratuityRate = myObj.nextDouble();

        //setting up the logic for the problem
        double totalGratuity = subtotal*(gratuityRate/100);

        double total = totalGratuity + subtotal;

        //printing the total
        System.out.print("The gratuity is $" + totalGratuity + " and total is $" + total);
    }
}
