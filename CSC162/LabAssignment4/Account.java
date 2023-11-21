import java.util.Date;

public class Account {
    
    //declaring variables
    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;
    private Date dateCreated;

    //creating a no arg constructor
    public Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        //creating Date object
        dateCreated = new Date();
    }

    //creating a constructor that only changes the id and annualInterestRate and balance
    public Account(int id, double annualInterestRate, double balance){
        this.id = id;
        this.annualInterestRate = annualInterestRate;
        this.balance = balance;
        dateCreated = new Date();
    }

    //creating accesors for id, balance, and annualInterestRate
    public int getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    //creating an accesor method for the dateCreated
    public Date getDateCreated() {
        return dateCreated;
    }

    //creating a getMonthlyInterest method
    public double getMonthlyInterest(){
        return annualInterestRate/12;
    }

    //creating a withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    //creating a deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }


}
