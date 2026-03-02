package DesignPatterns.Factory;

public class StripePayment implements Payment {
    public int pay() {
        System.out.println("Stripe Payment Done");
        return 500;
    }
}
