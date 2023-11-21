import java.util.Date;

public class AccountTest {
    public static void main(String[] args){

        //creating account object
        Account account = new Account(1122, 4.5, 20000);

        account.withdraw(2500);
        account.deposit(3000);

        double balance = account.getBalance();
        double interestRate = account. getAnnualInterestRate();
        Date date = account.getDateCreated();

        System.out.println("Balance: " + balance + " Interest Rate: " + interestRate + " Date Created: " + date);
        
    }
}
