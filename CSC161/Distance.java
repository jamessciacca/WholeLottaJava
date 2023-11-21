// Write a program that prompts the user to enter two points (x1, y1) and (x2, y2) and displays their distance between them.
// The formula for computing the distance is :
// sqrt((x2 - x1)^2 + (y2 - y1)^2)

//importing scanner and math
import java.util.Scanner;
import java.lang.Math;

public class Distance {
    public static void main(String[] args){

        //initializing scanner
        Scanner myObj = new Scanner(System.in);

        //Asking user for all points
        System.out.print("Enter x1: ");
        double x1 = myObj.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = myObj.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = myObj.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = myObj.nextDouble();

        //logic
        double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));

        //printing distance to user
        System.out.println("The distance between the two points is: " + distance);
    }
}
