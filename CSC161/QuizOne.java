//importing the scanner and random classes
import java.util.Random;
import java.util.Scanner;

public class QuizOne {
    public static void main(String[] args) {

        //creating scanner object
        Scanner input = new Scanner(System.in);

        //Prompting the User To Enter MIN and MAX Values for the Cost and Price
        System.out.print("Please enter the minimum cost amount: ");
        double minCost = input.nextDouble();
        System.out.print("Please enter the maximum cost amount: ");
        double maxCost = input.nextDouble();
        System.out.print("Please enter the minimum price amount: ");
        double minPrice = input.nextDouble();
        System.out.print("Please enter the maximum price amount: ");
        double maxPrice = input.nextDouble();

        //calling tableHeader method
        tableHeader();
        //calling reportMaker method
        reportMaker(minCost, maxCost, minPrice, maxPrice);
        
    }

        //method that prints table header
        public static void tableHeader(){
        System.out.println("Part                                Quantity");
        }


        //method the prints and creates the report 
        public static void reportMaker(double minCost, double maxCost, double minPrice, double maxPrice){
            //creating random object
            Random random = new Random();
            System.out.println("Widget  Cost      Price     In Stock    Profit  Reorder");
            //looping through the report and printing out the values for each widget 
            for (int i = 1; i <= 10; i++) {
                double cost = minCost + (maxCost - minCost) * random.nextDouble();
                double price = minPrice + (maxPrice - minPrice) * random.nextDouble();
                if (price < cost) {
                    price = cost + 1;
                }
                //setting up inStock variable
                //random.nextInt(9999) will generate a random number between 0 and 9999
                int inStock = random.nextInt(9999);
                //setting up profit variable
                double profit = ((price - cost) * inStock); 
                //making sure that the inStock value is not less than 0
                String reorder = (inStock < 25) ? "Yes" : "No";
                System.out.printf("%d      %.1f    %.1f    %d        %.1f    %.6s\n",
                i, cost, price, inStock, profit, reorder);
        }

    }
}
