//you need to always import arraylist
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    
    public static void main(String []args){

        //Setting up ArrayList
        //creating a list of animals, this needs to be type String
        ArrayList<String> animals = new ArrayList<>();
        //adding elements to the arraylist using the add() method

        animals.add("Capybara");
        animals.add("Snake");
        animals.add("Duck");

        //printing the ArrayList
        System.out.println(animals);

        //calling my method
        myArrayList();


    }

    static void myArrayList(){
        //creating a method that will print an array list of Ints
        //in this arraylist I intialized the values inside the declaration of the ArrayList itself!
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        //removing 5 from the array
        numbers.remove(4);

        //getting the value of index 3
        //numbers.get(3);
        System.out.println("Index 3 is: " + numbers.get(3));

        //getting the index of a certain value
        //it should print 2 because 3 is in index 2!
        int position3 = numbers.indexOf(3);
        System.out.println(position3);
        

        //printing out the ArrayList
        System.out.println(numbers);
    }
}
