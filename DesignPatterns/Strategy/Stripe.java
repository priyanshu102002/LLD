package DesignPatterns.Strategy;

public class Stripe implements Payment {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Stripe Credit Card");
    }
}
