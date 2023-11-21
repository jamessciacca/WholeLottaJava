//importing scanner
import java.util.Scanner;

public class Lab02_Rectangle {
    public static void main(String[] args){

        //creating scanner object 
        Scanner myObj = new Scanner(System.in);

        //asking user for a length and width
        System.out.print("Please enter a length: ");
        double length = myObj.nextDouble();

        System.out.print("Please enter a width: ");
        double width = myObj.nextDouble();

        //setting up logic
        double perimeter = (2 * length) + (2 * width);
        double area = length * width;

        //outputting both the area and perimeter
        System.out.println("Given a length of " + length + " and a width of " + width + " the perimeter of the rectangle is " + perimeter + " and the area is " + area + ".");


    }
}
