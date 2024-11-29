import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BankAccount ba=new BankAccount("v",1000);
        ba.deposit(100);
        ba.withdraw(10);

        ba.printTransactions();
    }
}


