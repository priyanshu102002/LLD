package DesignPatterns.Abstract_Factory;

class RazorpayPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Processing Razorpay payment of ₹" + amount);
    }
}
