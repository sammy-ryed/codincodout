
// Topic 6: Local and Anonymous Inner Classes
// File: PaymentInnerClass.java

interface Discount {
    double apply(double amount);
}

public class Payment {
    public void processTransaction(double amount) {
        class Validator {
            boolean validate(double amt) {
                return amt > 0;
            }
        }

        Validator validator = new Validator();
        if (validator.validate(amount)) {
            Discount discount = new Discount() {
                public double apply(double amt) {
                    return amt * 0.9; // 10% discount
                }
            };

            double finalAmount = discount.apply(amount);
            System.out.println("Transaction successful. Final amount: " + finalAmount);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public static void main(String[] args) {
        new Payment().processTransaction(1000);
        new Payment().processTransaction(-500);
    }
}
