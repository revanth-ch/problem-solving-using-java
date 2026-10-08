package Week_9;

import java.util.*;

interface Payment {

    void pay(double amount);
}

class CreditCardPayment implements Payment {

    public void pay(double amount) {
        System.out.println("Payment through Credit Card");
    }
}

class UPIPayment implements Payment {

    public void pay(double amount) {
        System.out.println("Payment through UPI");
    }
}

class NetBankingPayment implements Payment {

    public void pay(double amount) {
        System.out.println("Payment through Net Banking");
    }
}

abstract class PaymentProcessor {

    abstract double processPayment(Payment payment, double amount);
}

class OnlinePaymentProcessor extends PaymentProcessor {

    @Override
    double processPayment(Payment payment, double amount) {

        if (payment instanceof CreditCardPayment) {

            return amount + (amount * 0.02);

        } else if (payment instanceof UPIPayment) {

            return amount + (amount * 0.01);

        } else if (payment instanceof NetBankingPayment) {

            return amount + (amount * 0.015);
        }

        return amount;
    }
}

public class Task6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        PaymentProcessor processor =
                new OnlinePaymentProcessor();

        for (int i = 0; i < N; i++) {

            int paymentType = sc.nextInt();
            double amount = sc.nextDouble();

            Payment payment;

            if (paymentType == 1) {

                payment = new CreditCardPayment();

            } else if (paymentType == 2) {

                payment = new UPIPayment();

            } else {

                payment = new NetBankingPayment();
            }

            double finalAmount =
                    processor.processPayment(payment, amount);

            String paymentName;

            if (paymentType == 1) {

                paymentName = "CreditCard";

            } else if (paymentType == 2) {

                paymentName = "UPI";

            } else {

                paymentName = "NetBanking";
            }

            System.out.printf(
                "%s %.2f%n",
                paymentName,
                finalAmount
            );
        }

        sc.close();
    }
}