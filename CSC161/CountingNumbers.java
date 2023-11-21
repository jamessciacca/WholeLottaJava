import java.util.Scanner;

public class CountingNumbers {
    public static void main(String [] args){

        //creating scanner object 
        Scanner input = new Scanner(System.in);

        //creating variable to hold user input
        int userNumber = input.nextInt();

        //Asking user for numbers
        while(userNumber < 0){
            System.out.print("Enter an integer, the input ends if 0 is entered: ");

        }
    }
}