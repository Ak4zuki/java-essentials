package concepts.oop.principles.abstraction;

public class PaymentsMain {
    public static void main(String[] args) {

        CreditCardPayment creditCardPayment = new CreditCardPayment(777.51, "1234");
        creditCardPayment.processPayment();
        creditCardPayment.printReceipt();
    }
}
