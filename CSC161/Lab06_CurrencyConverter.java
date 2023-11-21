//importing scanner and math
import java.util.Scanner;
import java.lang.Math;

public class Lab06_CurrencyConverter {
    public static void main(String[] args){

        //creating scanner object 
        Scanner input = new Scanner(System.in);

        //asking user to enter a zero or one
        System.out.print("Enter 0 to convert USD to RMB or enter 1 to convert RMB to USD: ");
        int choice = input.nextInt();

        //using an if statement to run the logic
        if(choice == 0){
            System.out.print("Enter amount in USD: ");
            double usd = input.nextDouble();

            double conversionTotal = (usd * 7.19);

            //outputting conversion to user
            System.out.print(usd + " USD is equal to " + conversionTotal + " RMB");
        }
        else if(choice == 1){
            System.out.print("Enter amount in RMB: ");
            double rmb = input.nextDouble();

            double conversionTotal = (rmb * 0.143645);

            //outputting conversion to user
            System.out.print(rmb + " RMB is equal to " + conversionTotal + " USD");
        }
        else{
            System.out.print("Invalid Input");
        }
    }
}
