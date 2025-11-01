package org.example.factory;

import org.example.enums.PricingStrategyEnum;
import org.example.interfaces.PricingStrategy;
import org.example.models.EventBasedStrategy;
import org.example.models.TimeBasedStrategy;

public class PricingStrategyFactory {
  public static PricingStrategy createPaymentStrategy(PricingStrategyEnum strategyEnum) {
    if (PricingStrategyEnum.TIME_BASED.equals(strategyEnum)) {
      return new TimeBasedStrategy();
    } else if (PricingStrategyEnum.EVENT_BASED.equals(strategyEnum)) {
      return new EventBasedStrategy();
    }
    return null;
  }
}
