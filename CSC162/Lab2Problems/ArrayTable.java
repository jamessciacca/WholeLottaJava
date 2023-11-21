package Lab2Problems;

//importing needed libraries
import java.util.Arrays;
import java.util.Random;

public class ArrayTable{
    //declaring randNumArray variable outside of arrayMaker method
    //static so it never changes
    static int[][] randNumArray = new int[20][20];

    //creating main method
    public static void main(String [] args){
        arrayMaker();

        //calling the methods and passing it the array created in array maker!
        highestRowSum(randNumArray);
        lowestRowSum(randNumArray);
        highestSumColumn(randNumArray);
        lowestSumColumn(randNumArray);
    }

    public static void arrayMaker(){
        //method that will populate randNumArray with ints from 1-100
        //creating random object
        Random randNums = new Random();
        //creating a loop to fill array with random numbers
        //loops through the rows
        for (int i = 0; i < randNumArray.length; i++){
            //loops through the columns
            for(int j = 0; j < randNumArray.length; j++){
                randNumArray[i][j] = randNums.nextInt(100) + 1;
            }
        }
        //using Arrays.deepToString because it allows you to print the array and not the reference address!
          System.out.println("Here is your 2D array - \n" + Arrays.deepToString(randNumArray));
    }

    public static void highestRowSum(int[][] array){
        //method that will find the highest sum of a row in randNumArray
        int highestSum = 0;
        int currentSum = 0;
        int highestRowIndex = 0;
        //loops through the rows
        for (int i = 0; i < array.length; i++){
            //loops through the columns
            for(int j = 0; j < array.length; j++){
                currentSum += array[i][j];
            }
            if (currentSum > highestSum){
                highestSum = currentSum;
                highestRowIndex = i;
            }
            currentSum = 0;
        }
        System.out.println("The row with the highest sum is row " + highestRowIndex + " with a sum of " + highestSum);
    }
    
    public static void lowestRowSum(int [][] array){
        //method that will find the lowest sum of a row in the randNumArray
        //int to hold current and lowest sum
        //using Integer.MAX_VALUE because intially any sum of a row will be less than the lowest sum
        //you will always get zero and the loop will not work properly
        int lowestSum = Integer.MAX_VALUE;
        int currentSum = 0;
        //in to hold the index number
        int lowestRowIndex = 0;
        //loop through the rows 
        for(int i = 0; i < randNumArray.length; i++){
            //loop through the columns
            for(int j =0; j < randNumArray.length; j++){
                //setting current sum to the value of each row in the array
                currentSum += array[i][j];
            }
            //if statement to compare the currentSum with the lowest sum
            if(currentSum < lowestSum){
                lowestSum = currentSum;
                //setting the lowestRowIndex = to the index of the currentSum(with the lowest value)
                lowestRowIndex = i;
            }
            //setting currentSum back to 0 
            currentSum = 0;
        }
        //printing the result
         System.out.println("The row with the lowest sum is row " + lowestRowIndex + " with a sum of " + lowestSum);
    }

    public static void highestSumColumn(int [][]  array){
        //method to find the column with the highest sum
        //initializing variable for the current sum, the highest sum, and the highestcolumnindex!
        int currentSum = 0;
        int highestSum = 0;
        int highestColumnIndex = 0;
        //looping through the columns of the array!
         for(int i = 0; i < randNumArray[0].length; i++){
            //loop through the rows
            //using array[i].length to loop through the values in the colum because i = the row!
            for(int j =0; j < randNumArray.length; j++){
                //setting current sum to the value of each row in the array
                currentSum += randNumArray[j][i];
            }
            //comparing the current sum to the highest sum
            if(currentSum > highestSum){
                highestSum =  currentSum;
                //setting the HCI to the index of the current sum that holds the highest sum
                highestColumnIndex = i;
            }
            //setting current sum back to zero so the loop can iterate again
            currentSum = 0;
         }
         //printing the data
          System.out.println("The column with the highest sum is column " + highestColumnIndex + " with a sum of " + highestSum);
    }

    public static void lowestSumColumn(int [][]  array){
        //method to find the column with the lowest sum
        //initializing variable for the current sum, the lowest sum, and the lowestcolumnindex!
        int currentSum = 0;
        int lowestSum = Integer.MAX_VALUE;
        int lowestColumnIndex = 0;
        //looping through the columns of the array!
         for(int i = 0; i < randNumArray[0].length; i++){
            //loop through the rows
            //using array[i].length to loop through the values in the colum because i = the row!
            for(int j =0; j < randNumArray.length; j++){
                //setting current sum to the value of each row in the array
                currentSum += randNumArray[j][i];
            }
            //comparing the current sum to the lowest sum
            if(currentSum < lowestSum){
                lowestSum =  currentSum;
                //setting the HCI to the index of the current sum that holds the lowest sum
                lowestColumnIndex = i;
            }
            //setting current sum back to zero so the loop can iterate again
            currentSum = 0;
         }
         //printing the data
          System.out.println("The column with the lowest sum is column " + lowestColumnIndex + " with a sum of " + lowestSum);
    }
}