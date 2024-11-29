import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private double balance;
    private String ownerName;
    private List<String> transactionLog=new ArrayList<String>();

    public BankAccount() {}

    public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance <= 0) {
            System.out.println("Invalid balance");
            return;
        }
        this.balance = balance;

    }

    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void deposit(double amount) {
        if(amount<=0)
        {
            System.out.println("You can't deposit negative amount");
            return;
        }
        balance += amount;
        transactionLog.add("Deposit " + amount + " to " + ownerName);
    }
    public void withdraw(double amount) {
        if (amount>0 && amount < balance) {
            balance -= amount;
        }
        transactionLog.add("Amount withdrawn: " + amount);
    }

    public void printTransactions() {
        for(String transaction: transactionLog) {
            System.out.println(transaction);
        }
    }
}
