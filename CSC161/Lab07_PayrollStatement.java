//importing scanner and math
import java.util.Scanner;
import java.lang.Math;


public class Lab07_PayrollStatement{
    public static void main(String[] args){
        
        //setting up scanner object
        Scanner input = new Scanner(System.in);

        //Asking User to Enter Info
        System.out.print("Enter your name: ");
        String employeeName = input.nextLine();

        System.out.print("Enter hours worked in the past week: ");
        double hoursWorked = input.nextDouble();

        System.out.print("Enter your hourly pay rate: ");
        double payRate = input.nextDouble();

        System.out.print("Enter Federal Tax withholding rate: ");
        double taxWithholding = input.nextDouble();

        System.out.print("Enter state withholding tax: ");
        double stateTax = input.nextDouble();

        double finalFederal = (hoursWorked * payRate) * taxWithholding;
        double finalState = (hoursWorked * payRate) * stateTax;
        double totalDeduction = (finalFederal + finalState);
        double grossPay = hoursWorked * payRate;
        double finalPay = grossPay - totalDeduction;

        System.out.println("Employee Name: " + employeeName);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Pay Rate: " + payRate);
        System.out.println("Gross Pay : $" + grossPay);
        System.out.println("Deductions: ");
        System.out.println("   Federal Withholding " + (taxWithholding) + " : " + finalFederal);
        System.out.println("   State Withholdiing " + (stateTax) + " : " + finalState);
        System.out.println("   Total Deduction: " + totalDeduction);
        System.out.println("Net Pay: " + finalPay);

    }
}