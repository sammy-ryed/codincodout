import java.util.Random;

public class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    public BankAccount() {
        this("Unknown", new Random().nextInt(100000), 0.0);
    }

    public BankAccount(String accountHolder) {
        this(accountHolder, new Random().nextInt(100000), 0.0);
    }

    public BankAccount(String accountHolder, double balance) {
        this(accountHolder, new Random().nextInt(100000), balance);
    }

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
    }

    public void displayAccount() {
        System.out.println("Holder: " + accountHolder + ", Account: " + accountNumber + ", Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount();
        BankAccount a2 = new BankAccount("Alice");
        BankAccount a3 = new BankAccount("Bob", 5000.0);
        a1.deposit(1000);
        a2.deposit(2000);
        a2.withdraw(500);
        a3.withdraw(1000);
        a1.displayAccount();
        a2.displayAccount();
        a3.displayAccount();
    }
}