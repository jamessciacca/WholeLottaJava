//importing the scanner and math
import java.util.Scanner;
import java.lang.Math;

public class Lab01_Perimeter{
   public static void main(String[] args){
      
      //Creating Scanner Object 
      Scanner myObj = new Scanner(System.in);
      //I am creating a variable for the Radius, so the user can enter it in.
      System.out.print("Enter the Radius Of Your Circle: ");
      //setting the users input to a double named radius
      double radius = myObj.nextDouble();

      //setting up the brains of the program, setting up the perimeter formula
      //p=2pir
      double perimeter = 2 * Math.PI * radius;
      
      //outputting perimeter to the user
      System.out.println("Given a radius of: " + radius + " the perimeter of the circle is: " + perimeter);      
   }
}