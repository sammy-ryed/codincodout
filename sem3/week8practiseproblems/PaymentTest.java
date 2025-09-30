public class PaymentTest {
    public static void main(String[] args) {
        PaymentGateway p1 = new CreditCardPayment();
        p1.pay(5000);
        p1.refund(1000);

        PaymentGateway p2 = new UPIPayment();
        p2.pay(2000);
        p2.refund(500);
    }
}