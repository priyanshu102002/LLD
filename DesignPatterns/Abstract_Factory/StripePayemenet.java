package DesignPatterns.Abstract_Factory;

class StripePayment implements Payment {
    public void pay(double amount) {
        System.out.println("Processing Stripe payment of ₹" + amount);
    }
}
