package Behavioral_Patterns.StrategyPattern;

public class PaymentGateway {
    PaymentService paymentService;

    public PaymentGateway(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void pay(double amount) {
        paymentService.pay(amount);
    }
}
