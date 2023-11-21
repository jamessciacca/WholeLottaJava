import java.util.Scanner;
import java.lang.Math;

public class PolygonArea {
    public static void main(String[] args){

        //setting up scanner object 
        Scanner myObj = new Scanner(System.in);

        //Asking user for sides and length of sides
        System.out.print("Enter the number of sides: ");
        double sides = myObj.nextDouble();

        System.out.print("Enter the length of the side: ");
        double sideLength = myObj.nextDouble();

        //setting up logic 
        double area = ((sides * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI/sides)));

        //outputting area to user
        System.out.println("The area of the polygon is: " + area);
    }
}
