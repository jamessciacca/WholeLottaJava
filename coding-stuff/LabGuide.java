import java.util.Scanner;

public class Numbers {  // class Numbers
    int num[] = new int[40];    // array of 40 integers
    int count = 0;  // number of elements in array

    void readNumbers() {    // method readNumbers
        Scanner sc = new Scanner(System.in);    // scanner object
        System.out.print("Enter the number: "); // prompt
        int n = sc.nextInt();   // read number
        while (n != -999 && count < 40) {   // loop until -999 or array full
            num[count] = n; // store number in array
            count++;    // increment count
            System.out.print("Enter the number: "); // prompt
            n = sc.nextInt();   // read number
        }
    }

    double average() {  // method average
        double sum = 0;     // sum of numbers
        for (int i = 0; i < count; i++) {   // loop through array
            sum += num[i];  // add number to sum
        }
        return sum / count; // return average
    }

    void printLessThanAverage() {   // method printLessThanAverage
        double avg = average(); // get average
        System.out.println("Numbers less than average are: ");  // prompt
        for (int i = 0; i < count; i++) {   // loop through array
            if (num[i] < avg) { // if number is less than average
                System.out.println(num[i]); // print number
            }
        }
    }

    void print(int side) {  // method print
        if (side == 1) {    // if side is 1
            System.out.println("Print from start: ");   // prompt
            for (int i = 0; i < count; i++) {   // loop through array
                System.out.println(num[i]); // print number
            }
        } else if (side == -1) {    // if side is -1
            System.out.println("Print from end: "); // prompt
            for (int i = count - 1; i >= 0; i--) {  // loop through array
                System.out.println(num[i]); // print number
            }
        }
    }

    boolean isAllPositive() {   // method isAllPositive
        for (int i = 0; i < count; i++) {   // loop through array
            if (num[i] < 0) {   // if number is negative
                return false;   // return false
            }
        }
        return true;    // return true
    }

    public static void main(String[] args) {    // main method
        Numbers n = new Numbers();  // object of class Numbers
        n.readNumbers();    // call method readNumbers
        n.printLessThanAverage();   // call method printLessThanAverage
        n.print(1); // call method print with side 1
        n.print(-1);    // call method print with side -1
        if (n.isAllPositive()) {    // if all numbers are positive
            System.out.println("All numbers are positive"); // print message
        } else {    // if not
            System.out.println("Not all numbers are positive"); // print message
        }
    }
}