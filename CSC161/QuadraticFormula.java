//importing scanner and math
import java.util.Scanner;
import java.lang.Math;

public class QuadraticFormula {
    public static void main(String[] args){

        //creating scanner object 
        Scanner myObj = new Scanner(System.in);

        //prompting the user for an a, b, and c
        System.out.print("Enter a value for a: ");
        double a = myObj.nextDouble();

        System.out.print("Enter a value for b: ");
        double b = myObj.nextDouble();

        System.out.print("Enter a value for c: ");
        double c = myObj.nextDouble();

        //logic
        double quadDiscriminant = Math.pow(b, 0.5)-4*a*c;

        



    }
}
