package com.lausan.store;

public class OrderService {
    public void placeOrder() {
        PaymentService paymentService = new StripePaymentService();
        paymentService.processPayment(10);
    }

}
