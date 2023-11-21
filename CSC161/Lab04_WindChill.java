//importing packages 
import java.util.Scanner;
import java.lang.Math;

public class Lab04_WindChill{
    public static void main(String[] args){

        //creating scanner obj 
        Scanner myObj = new Scanner(System.in);

        //Prompting the user for temperature 
        System.out.print("Please enter a temperature between -58 and 41 degrees fahrenheit: ");
        double userTemp = myObj.nextDouble();

        //checking to make sure the users entry is between -58 and 41
        if (userTemp < -58 || userTemp > 41){
            System.out.print("Please enter a temperature between -58 and 41 degrees fahrenheit: ");
            userTemp = myObj.nextDouble();
        }

        //prompting user for wind speed
        System.out.print("Please enter a wind speed greater than or equal to 2mph: ");
        double userWindSpeed = myObj.nextDouble();

        //checking to make sure users entry is greater than or equal to 2
        if(userWindSpeed < 2){
            System.out.print("Please enter a wind speed greater than or equal to 2mph: ");
            userWindSpeed = myObj.nextDouble();
        }

        //setting up the logic
        double windChill = Math.round(35.74 + 0.6215 * userTemp - 35.75 * Math.pow(userWindSpeed, 0.16) + 0.4275 * userTemp * Math.pow(userWindSpeed, 0.16));

        //outputting result to the user 
        System.out.println("Given the temperature and wind speed you provided, the Wind Chill Factor is: " + windChill + " degrees fahrenheit.");
    }
}