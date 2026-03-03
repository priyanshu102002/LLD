package DesignPatterns.Strategy;

public class Razorpay implements Payment {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Razorpay Credit Card");
    }
}
