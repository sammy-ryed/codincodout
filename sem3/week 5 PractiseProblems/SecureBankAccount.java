public class SecureBankAccount {
    private final String accountNumber;
    private double balance;
    private int pin;
    private boolean isLocked;
    private int failedAttempts;

    private static final int MAX_FAILED_ATTEMPTS = 3;
    private static final double MIN_BALANCE = 0.0;

    public SecureBankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance >= MIN_BALANCE ? initialBalance : MIN_BALANCE;
        this.pin = 0;
        this.isLocked = false;
        this.failedAttempts = 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return isLocked ? -1 : balance;
    }

    public boolean isAccountLocked() {
        return isLocked;
    }

    public boolean setPin(int oldPin, int newPin) {
        if (this.pin == oldPin) {
            this.pin = newPin;
            return true;
        }
        return false;
    }

    public boolean validatePin(int enteredPin) {
        if (isLocked) return false;
        if (this.pin == enteredPin) {
            resetFailedAttempts();
            return true;
        } else {
            incrementFailedAttempts();
            return false;
        }
    }

    public void unlockAccount(int correctPin) {
        if (this.pin == correctPin) {
            this.isLocked = false;
            resetFailedAttempts();
        }
    }

    public boolean deposit(double amount, int pin) {
        if (validatePin(pin) && amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount, int pin) {
        if (validatePin(pin) && amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public boolean transfer(SecureBankAccount target, double amount, int pin) {
        if (withdraw(amount, pin)) {
            target.deposit(amount, pin);
            return true;
        }
        return false;
    }

    private void lockAccount() {
        isLocked = true;
    }

    private void resetFailedAttempts() {
        failedAttempts = 0;
    }

    private void incrementFailedAttempts() {
        failedAttempts++;
        if (failedAttempts >= MAX_FAILED_ATTEMPTS) {
            lockAccount();
        }
    }

    public static void main(String[] args) {
        SecureBankAccount acc1 = new SecureBankAccount("12345", 1000);
        SecureBankAccount acc2 = new SecureBankAccount("67890", 500);

        acc1.setPin(0, 1111);
        acc2.setPin(0, 2222);

        acc1.deposit(200, 1111);
        System.out.println("Acc1 Balance: " + acc1.getBalance());

        acc1.withdraw(100, 1111);
        System.out.println("Acc1 Balance after withdraw: " + acc1.getBalance());

        acc1.transfer(acc2, 300, 1111);
        System.out.println("Acc1 Balance: " + acc1.getBalance());
        System.out.println("Acc2 Balance: " + acc2.getBalance());
    }
}
