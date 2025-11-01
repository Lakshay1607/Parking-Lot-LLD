package org.example.models;

import org.example.enums.PaymentStatusEnum;
import org.example.interfaces.PaymentStrategy;

public class CardPayment implements PaymentStrategy {
  @Override
  public boolean pay(Ticket ticket, double amount) {
    System.out.println("Paid " + amount + " using Card Payment.");
    ticket.setPaymentStatus(PaymentStatusEnum.SUCCESS);
    return true;
  }
}
