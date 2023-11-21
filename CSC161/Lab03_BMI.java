//importing packages
import java.util.Scanner;
import java.lang.Math;

public class Lab03_BMI {
    public static void main(String[] args){

      //creating scanner object 
      Scanner myObj = new Scanner(System.in);

      //Prompting the user to enter height and weight
      System.out.print("Enter your height (in inches): ");
      double userHeight = myObj.nextDouble();

      System.out.print("Enter your weight (in pounds): ");
      double userWeight = myObj.nextDouble();

      //logic 
        double kilogram = userWeight / 2.205;

        double meters = userHeight / 39.37;

        double BMI = Math.round(kilogram / Math.pow(meters, 2));

        //outputting results to the user 

        System.out.println("Your BMI is " + BMI);

    }
}
