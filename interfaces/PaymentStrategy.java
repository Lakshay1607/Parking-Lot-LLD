package org.example.interfaces;

import org.example.models.Ticket;

public interface PaymentStrategy {
  boolean pay(Ticket ticket, double amount);
}
