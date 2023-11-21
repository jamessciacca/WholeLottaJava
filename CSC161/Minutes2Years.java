// Write a program that prompts the user to enter the minutes (e.g., 1 billion), and displays the number of years and days for the minutes.
// For simplicity, assume a year has 365 days.

//importing scanner
import java.util.Scanner;

public class Minutes2Years {
    public static void main(String[] args){
        
        //setting up scanner
        Scanner myObj = new Scanner(System.in);

        //asking user for number of minutes
        System.out.print("Enter the number of minutes: ");
        long minutes = myObj.nextLong();

        //setting up the logic
        long year = minutes/525600;
        long remainingMinutes = minutes%525600;
        long day = remainingMinutes/1440;

        //printing output to user 
        System.out.println(minutes + " minutes is approximately " + year + " years and " + day + " days");

    }
}
