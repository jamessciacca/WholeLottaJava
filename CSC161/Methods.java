import java.util.Scanner;

public class Methods {
    public static void main(String [] args){

        //calling other methods in the main method will invoke the program to run whatever
        //code is within that method
        welcome();
        multiply();
        between1And100();
        
    }

    //method to welcome user
    public static void welcome(){
        System.out.println("Welcome to the Method Practice Program!");
    }

    public static void multiply(){
        //creating scanner obj
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st Number: ");
        int a = input.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = input.nextInt();

        System.out.println("Product: " + (a * b));
    }

    public static void between1And100(){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 100: ");
        double a = input.nextDouble();

        if (a < 1 || a > 100){
            System.out.println("Invalid Input!");
        } else {
            System.out.println("Awesome Choice!");
        }
    
    }
}
