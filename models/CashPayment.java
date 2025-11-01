package org.example.models;

import org.example.enums.PaymentStatusEnum;
import org.example.interfaces.PaymentStrategy;

public class CashPayment implements PaymentStrategy {
  @Override
  public boolean pay(Ticket ticket, double amount) {
    System.out.println("Paid " + amount + " using Cash Payment.");
    ticket.setPaymentStatus(PaymentStatusEnum.SUCCESS);
    return true;
  }
}
