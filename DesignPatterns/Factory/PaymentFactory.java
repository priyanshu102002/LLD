package DesignPatterns.Factory;

public class PaymentFactory {
    public static Payment getPayment(String paymentType) {
        if(paymentType.trim().equals("Razorpay")) {
            return new RazorpayPayment();
        } else if(paymentType.trim().equals("Stripe")) {
            return new StripePayment();
        } else {
            return null;
        }
    }
}
