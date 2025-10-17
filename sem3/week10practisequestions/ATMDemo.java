public class ATMDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("1234567890", 10000, 1234);
        ATM atm = new ATM(acc);
        Customer cust = new Customer("Rahul", atm);

        cust.performWithdrawal(1234, 2000);
        cust.performWithdrawal(1111, 500);
    }
}
