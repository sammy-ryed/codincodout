class PersonalAccount {
    private static int counter=0, totalAccounts=0;
    private static String bankName;
    private String accountHolderName, accountNumber;
    private double currentBalance, totalIncome, totalExpenses;

    public PersonalAccount(String name,double balance){
        this.accountHolderName=name; this.currentBalance=balance;
        this.accountNumber=generateAccountNumber(); totalAccounts++;
    }
    public static void setBankName(String name){ bankName=name; }
    public static int getTotalAccounts(){ return totalAccounts; }
    private static String generateAccountNumber(){ return "ACC"+(++counter); }
    public void addIncome(double amount,String desc){ currentBalance+=amount; totalIncome+=amount; }
    public void addExpense(double amount,String desc){ if(currentBalance>=amount){ currentBalance-=amount; totalExpenses+=amount; } }
    public double calculateSavings(){ return totalIncome-totalExpenses; }
    public void displayAccountSummary(){ System.out.println(accountHolderName+" "+accountNumber+" Balance:"+currentBalance+" Income:"+totalIncome+" Expense:"+totalExpenses+" Bank:"+bankName); }

    public static void main(String[] args){
        setBankName("OOP Bank");
        PersonalAccount a1=new PersonalAccount("Alice",1000);
        a1.addIncome(500,"Salary"); a1.addExpense(200,"Food");
        a1.displayAccountSummary();
        PersonalAccount a2=new PersonalAccount("Bob",2000);
        a2.addExpense(300,"Travel"); a2.displayAccountSummary();
        System.out.println("Total Accounts:"+getTotalAccounts());
    }
}