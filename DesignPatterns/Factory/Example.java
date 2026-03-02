package DesignPatterns.Factory;

public class Example {
    public static void main(String[] args) {
        Payment razorpayPayment = PaymentFactory.getPayment("Razorpay");
        int pay = razorpayPayment.pay();
        System.out.println(pay);
    }
}
