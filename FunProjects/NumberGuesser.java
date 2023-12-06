package VSCode.transfer.FunProjects;

import java.util.Scanner;
import java.util.Random;

public class NumberGuesser {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        
        //prompting the user to play
        System.out.println("Welcome to Random Number Guesser!");

        System.out.print("To Play Enter 1: ");
        int play = kb.nextInt();

        if(play == 1){
            Random randomNum = new Random();
            int number = randomNum.nextInt(100)+1;
            Game(number);
        }
        else{
            System.out.println("See you soon!");
        }
    }

    public static void Game(int number){
        Scanner kb = new Scanner(System.in);
        System.out.println("Lets Play! Im thinking of a number between 1 and 100. Take your best guess!");
        System.out.print("Enter your guess: ");
        int userGuess = kb.nextInt();

        if(userGuess == number){
            System.out.println("You got it!");
        }
        else{
            System.out.println("Wrong! I was thinking of: " + number + ". Better luck next time!");
        }
    }
}
