package DesignPatterns.Strategy;

public class PaymentContext {
    private Payment strategy;

    public PaymentContext(Payment strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Payment strategy) {
        this.strategy = strategy;
    }

    public void executePayment(int amount) {
        strategy.pay(amount);
    }
}
