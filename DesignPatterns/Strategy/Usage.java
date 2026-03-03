package DesignPatterns.Strategy;

public class Usage {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext(new Stripe());
        context.executePayment(1000);

        context.setStrategy(new Razorpay());
        context.executePayment(2000);
    }
}
