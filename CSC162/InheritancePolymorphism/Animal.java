package InheritancePolymorphism;

import java.util.Scanner;

public class Animal {

    Scanner input = new Scanner(System.in);
    
    public void Eat(){
        System.out.print("Enter the sound a Capybara makes when it eats: ");
        String eatingSound = input.nextLine();
        for(int i = 0; i <= 5; i++ ){
            System.out.print(eatingSound + " ");
        }
    }

    
    public void color(){
        System.out.println("Color");
    }




}
