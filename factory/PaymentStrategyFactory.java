package org.example.factory;

import org.example.enums.PaymentStrategyEnum;
import org.example.interfaces.PaymentStrategy;
import org.example.models.CardPayment;
import org.example.models.CashPayment;

public class PaymentStrategyFactory {
  public static PaymentStrategy getPaymentStrategy(PaymentStrategyEnum paymentStrategy) {
    if (PaymentStrategyEnum.CARD.equals(paymentStrategy)){
      return new CardPayment();
    } else if (PaymentStrategyEnum.CASH.equals(paymentStrategy)){
      return new CashPayment();
    }
    return null;
  }
}
