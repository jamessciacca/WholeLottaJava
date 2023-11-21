
//setting up my main class 
//importing the scanner, arraylist, and file classes, as well as the io exception, and the file not found exception.
import java.io.File;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    // making an array of cargo objects
    Cargo cargoList[];
    // creating a variable to hold the number of cargo objects
    int n;
    int totalWeight;
    int totalTareWeight;
    int totalGrossWeight;
    static Scanner sc;
    static FileWriter fileWriter;
    static PrintWriter writer;

    public Main() throws Exception {
        // creating a new array of cargo objects
        cargoList = new Cargo[100];
        // setting the number of objects to 0
        n = 0;
        totalWeight = 0;
        totalTareWeight = 0;
        totalGrossWeight = 0;
        // calling the readFile method
        readFile();
        fileWriter = new FileWriter("output.txt");
        writer = new PrintWriter(fileWriter);
    }

    public void readFile() throws Exception {
        int num, tare, gross;
        String name;

        File file = new File("containerdata.txt.");
        sc = new Scanner(file);

        // Reading from the file till end of file
        while (sc.hasNext()) {
            num = sc.nextInt();
            sc.nextLine(); // Ignoring all leftover new line characters
            name = sc.nextLine();
            tare = sc.nextInt();
            gross = sc.nextInt();
            cargoList[n] = new Cargo(num, name, tare, gross); // Assigning an Cargo object
            totalWeight += cargoList[n].getCargoWeight();
            totalTareWeight += cargoList[n].getTareWeight();
            totalGrossWeight += cargoList[n].getGrossWeight();
            n++;
        }
        // closing the scanner
        sc.close();
    }

    public void sortByContainer() {
        // sorting by container number
        Arrays.sort(cargoList, 0, n, (Cargo a, Cargo b) -> a.getContNum() - b.getContNum());
    }

    public void sortByShipName() {
        // sorting by ship name
        Arrays.sort(cargoList, 0, n, (Cargo a, Cargo b) -> a.getShipName().compareTo(b.getShipName()));
    }

    // setting up method to display data
    private void printToScreen() {
        System.out.printf("%-10s %-25s %-7s %-8s %-8s %-7s %-10s\n", "Container", "Ship", "Tare", "Gross", "Cargo",
                "% Cargo", "% of Total");
        System.out.printf("%-10s %-25s %-7s %-8s %-8s %-7s %-10s\n", "Number", "Name", "Weight", "Weight", "Weight",
                "Weight", "Cargo Wgt");
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.printf("%10d %-25s %7d %8d %8d %7s %10s\n", cargoList[i].getContNum(),
                    cargoList[i].getShipName(), cargoList[i].getTareWeight(),
                    cargoList[i].getGrossWeight(), cargoList[i].getCargoWeight(),
                    String.format("%.2f", cargoList[i].getCargoWeightPer()) + "%",
                    String.format("%.2f", cargoList[i].getCargoWeight() * 100.0 / totalWeight) + "%");
        }
        System.out.println();
        System.out.printf("%-10s %-25s %7d %8d %8d", " ", "Total", totalTareWeight, totalGrossWeight, totalWeight);
        System.out.println("\n");
    }

    // setting up method to write data to file
    private void printToFile() {
        writer.printf("%-10s %-25s %-7s %-8s %-8s %-7s %-10s\n", "Container", "Ship", "Tare", "Gross", "Cargo",
                "% Cargo", "% of Total");
        writer.printf("%-10s %-25s %-7s %-8s %-8s %-7s %-10s\n", "Number", "Name", "Weight", "Weight", "Weight",
                "Weight", "Cargo Wgt");
        writer.println();
        for (int i = 0; i < n; i++) {
            writer.printf("%10d %-25s %7d %8d %8d %7s %10s\n", cargoList[i].getContNum(), cargoList[i].getShipName(),
                    cargoList[i].getTareWeight(),
                    cargoList[i].getGrossWeight(), cargoList[i].getCargoWeight(),
                    String.format("%.2f", cargoList[i].getCargoWeightPer()) + "%",
                    String.format("%.2f", cargoList[i].getCargoWeight() * 100.0 / totalWeight) + "%");
        }
        writer.println();
        writer.printf("%-10s %-25s %7d %8d %8d", " ", "Total", totalTareWeight, totalGrossWeight, totalWeight);
        writer.println("\n");
    }

    // setting up a method to search for containers
    public void displayData() {
        System.out.println("\nEnter where the report is to be sent: ");
        System.out.println(" 1. Screen");
        System.out.println(" 2. File");
        System.out.println(" 3. Both");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                printToScreen();
                break;
            case 2:
                printToFile();
                break;
            case 3:
                printToScreen();
                printToFile();
                break;
            default:
                System.out.println("Invalid Input.");
        }
    }

    // Method to search for a container
    void searchCargo(int num) {
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (num == cargoList[i].getContNum()) {
                found = true;
                System.out.println("Container Number: " + cargoList[i].getContNum());
                System.out.println("Ship Name: " + cargoList[i].getShipName());
                System.out.println("Tare Weight: " + cargoList[i].getTareWeight());
                System.out.println("Gross Weight: " + cargoList[i].getGrossWeight());
                System.out.println("Cargo Weight: " + cargoList[i].getCargoWeight());
                System.out.println("% Cargo Weight: " + String.format("%.2f", cargoList[i].getCargoWeightPer()) + "%");
                System.out.println("% of Total Cargo Weight: "
                        + String.format("%.2f", cargoList[i].getCargoWeight() * 100.0 / totalWeight) + "%");
                break;
            }
        }

        if (!found) {
            System.out.println("Container not found");
        }
        System.out.println();
    }

    // setting up the main method
    public static void main(String[] args) {
        try {
            Main run = new Main();

            int num;
            int choice = -1;
            sc = new Scanner(System.in);
            // creating terminal menu for user
            while (choice != 4) {
                System.out.println("Menu\n");
                System.out.println(" 1. Report by Container");
                System.out.println(" 2. Report by Ship Name");
                System.out.println(" 3. Query by Container");
                System.out.println(" 4. Exit");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        run.sortByContainer();
                        run.displayData();
                        break;
                    case 2:
                        run.sortByShipName();
                        run.displayData();
                        break;
                    case 3:
                        System.out.print("Enter the Container Number: ");
                        num = sc.nextInt();
                        run.searchCargo(num);
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Invalid input. Try again!!");
                }
            }

            // closing the scanner
            sc.close();
            writer.close();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
