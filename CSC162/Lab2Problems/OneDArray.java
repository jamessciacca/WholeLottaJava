package Lab2Problems;

//importing need libraries
import java.util.Random;
import java.util.Arrays;
import java.io.*;

public class OneDArray {

    public static void main(String[] args){
        try {
        //creating a PrintWriter object to write to the output file
        PrintWriter writer = new PrintWriter("output.txt");
        //setting randomArray = to the array made in arrayMaker!
        int[] randomArray = arrayMaker();
        //printing out the unsorted array
        writer.println("Here is your unsorted array: " + Arrays.toString(randomArray));
        //calling the sort and printing out the sorted array
        selectionSortDescending(randomArray);
        writer.println("Here is your sorted array: " + Arrays.toString(randomArray));
        //printing out the 10 random ints
        int[] randomInts = randomIntegers();
        writer.println("Here are the 10 random integers: " + Arrays.toString(randomInts));
        //looping through the randomInt array to see if the index wanted is in the array
        for(int i = 0; i < randomInts.length; i++){
            int index = binarySearch(randomArray, randomInts[i]);
            if(index != -1){
                writer.println(randomInts[i] + " is in the sorted array at index " + index + ".");
                writer.println("Number of comparisons to find " + randomInts[i] + " in the list: " + (index + 1));
            } else {
                writer.println(randomInts[i] + " is not in the sorted array.");
                writer.println("Number of comparisons to not find " + randomInts[i] + " in the list: " + (randomArray.length));
            }
        }
        //closing the PrintWriter object
        writer.close();
        System.out.println("Output written to file.");
    } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
}
    

    public static int[] arrayMaker(){
        //creating a one dimensional array of 50 random ints (1-100)
        int [] randomArray = new int[50];
        //creating a new random object
        Random random = new Random();
    
        //creating a for loop to add random values to the array
        for(int i = 0; i < randomArray.length; i++){
            //setting each index of the array to a random number from 1-100
            //you need the +1 because it makes it 1-100 and not 0-99
            randomArray[i] = random.nextInt(100) + 1;
        }
        //returning the array 
        return randomArray;
    }

    //passing in an array argument!
    public static void selectionSortDescending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = temp;
        }
    }
    

    public static int[] randomIntegers(){
        int[] randomInts = new int[10];

        //creating random object
        Random random = new Random();
        //for looping to add random numbers to the array
        for(int i = 0; i < randomInts.length; i++){
            randomInts[i] = random.nextInt(10) + 1;
        }

        return randomInts;
    }

    //creating a binary search method!
    //passing in an array and the target
    //the target is the value we are searching for in the array
    public static int binarySearch(int[] array, int target){
        //using binary search to find the target value in the array
        int left = 0;
        int right = array.length - 1;
        int comparisons = 0;
        while(left <= right){
            int mid = (left + right) / 2;
            comparisons++;
            if(array[mid] == target){
                System.out.println("Found " + target + " in " + comparisons + " comparisons.");
                return mid;
            } else if(array[mid] < target){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("Did not find " + target + " in " + comparisons + " comparisons.");
        return -1;
    }
}