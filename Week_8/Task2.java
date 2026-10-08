package Week_8;

interface PaymentStrategy {
    void pay(double amount);
}

class CreditCardPayment implements PaymentStrategy {

    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

class UPIPayment implements PaymentStrategy {

    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

class Payment {

    private PaymentStrategy strategy;

    Payment(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    void makePayment(double amount) {
        strategy.pay(amount);
    }
}

public class Task2 {

    public static void main(String[] args) {

        Payment payment;

        payment = new Payment(new CreditCardPayment());
        payment.makePayment(1000);

        payment = new Payment(new UPIPayment());
        payment.makePayment(500);
    }
}