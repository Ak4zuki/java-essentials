package concepts.oop.principles.abstraction;

public class CreditCardPayment extends Payment{

    private String creditCardNumb;

    public CreditCardPayment(Double amount, String creditCardNumb) {
        super(amount);
        this.creditCardNumb = creditCardNumb;
    }

    @Override
    void processPayment() {
        System.out.println("Charged From Credit");
    }

    public String getCreditCardNumb() {
        return creditCardNumb;
    }

    public void setCreditCardNumb(String creditCardNumb) {
        this.creditCardNumb = creditCardNumb;
    }
}
