package org.example.models;

import org.example.interfaces.PaymentStrategy;

public class PaymentProcessor {
  private PaymentStrategy paymentStrategy;

  public PaymentProcessor(PaymentStrategy paymentStrategy) {
    this.paymentStrategy = paymentStrategy;
  }

  public boolean processPayment(Ticket ticket, double amount) {
    return paymentStrategy.pay(ticket, amount);
  }
}
