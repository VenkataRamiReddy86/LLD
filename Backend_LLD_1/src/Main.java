//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }

    public class BankAccount {
        private double balance;
        private String ownerName;

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            if (balance <= 0) {
                System.out.println("Invalid balance");
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
            }
            balance += amount;
        }
        public void withdraw(double amount) {
            if (amount > balance) {
                balance -= amount;
            }
        }
    }
}