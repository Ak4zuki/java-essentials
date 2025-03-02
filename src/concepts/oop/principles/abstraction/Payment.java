package concepts.oop.principles.abstraction;

abstract public class Payment {
    private Double amount;

    public Payment(Double amount) {
        this.amount = amount;
    }
    abstract void processPayment();
    void printReceipt(){
        System.out.println("Payment Of R" + amount + " Completed");
    }
}
