package FinalReview2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        
        //creating array 
        Person[] myArray = new Person[3];
        File file = new File("/Users/jamessciacca/Downloads/Cloud Desktop/VSCode/transfer/CSC162/FinalReview2/Demo.txt");

        try{
            Scanner fileReader = new Scanner(file);
            int index = 0;
            while(fileReader.hasNext() ){
                String name = fileReader.next();
                char type = fileReader.next().charAt(0);

                if(type == 'S'){
                     long sID = fileReader.nextLong();
                     myArray[index] = new Student(name, type, sID);
                }
                else if(type == 'F'){
                    int fID = fileReader.nextInt();
                    myArray[index] = new Faculty(name, type, fID);
                }
                else{
                    String aID = fileReader.nextLine();
                    myArray[index] = new Admin(name, type, aID);
                }

                System.out.println(myArray[index]);
                
                index++;
            }
            fileReader.close();
        } catch (FileNotFoundException e){
            System.out.println("Error Finding File!");
        }
    }
}
