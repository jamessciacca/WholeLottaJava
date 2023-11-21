//importing scanner and math class
import java.util.Scanner;
import java.lang.Math;

public class Lab01_Area {
    public static void main(String[] args){
        
        //creating scanner object 
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter the Radius Of Your Circle: ");
         //setting the users input to a double named radius
        double radius = myObj.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);

        //Printing the output for the user
        System.out.println("Given a radius of: " + radius + " the area of the circle is: " + area);  
    }
}