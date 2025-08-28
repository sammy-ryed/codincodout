class BankAccount {
    private static int counter = 0;
    private static int totalAccounts = 0;
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, double initialDeposit) {
        this.accountHolderName = accountHolderName;
        this.balance = initialDeposit;
        this.accountNumber = generateAccountNumber();
        totalAccounts++;
    }
    private static String generateAccountNumber() {
        counter++;
        return "ACC" + String.format("%03d", counter);
    }
    public void deposit(double amount) {
        if(amount > 0) balance += amount;
    }
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) balance -= amount;
    }
    public double checkBalance() { return balance; }
    public static int getTotalAccounts() { return totalAccounts; }
    public void displayAccountInfo() {
        System.out.println(accountNumber+" "+accountHolderName+" Balance:"+balance);
    }

    public static void main(String[] args) {
        BankAccount a1=new BankAccount("John",1000);
        BankAccount a2=new BankAccount("Emma",2000);
        a1.deposit(500); a1.displayAccountInfo();
        a2.withdraw(300); a2.displayAccountInfo();
        System.out.println("Total Accounts:"+BankAccount.getTotalAccounts());
    }
}