package FinalReview;

import java.util.Scanner;

public class Parsing {
    //ask a user to enter a number
    //then turn the string entered into and int and times it by 5
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
    
        System.out.print("Enter a number: ");
        String num = kb.nextLine();

        System.out.println(5 * Integer.parseInt(num));

        kb.close();
        
    }


}
