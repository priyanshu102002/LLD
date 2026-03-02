package DesignPatterns.Factory;

public class RazorpayPayment implements Payment {
    public int pay() {
        System.out.println("RazorPay Payment Done");
        return 100;
    }
}
