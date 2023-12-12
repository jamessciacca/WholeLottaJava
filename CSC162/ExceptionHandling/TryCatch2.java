package ExceptionHandling;

import java.util.Scanner;

public class TryCatch2{
    public static void main(String[] args) {
        
        //creating a scanner 
        Scanner input = new Scanner(System.in);
        //System.out.print("Enter favorite number: ");
        //int favnum = input.nextInt();
        //System.out.println(favnum);

        try{
            System.out.print("Enter favorite number: ");
            int favnum = input.nextInt();
            System.out.println(favnum);
        } catch(Exception e){
            System.out.println("Enter a valid number!");
        }

        input.close();
    }
}