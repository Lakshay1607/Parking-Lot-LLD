package org.example.interfaces;

import java.time.LocalDateTime;

import org.example.enums.VehicleEnum;

public interface PricingStrategy {
  double calculateFee(VehicleEnum type, LocalDateTime entryTime, LocalDateTime exitTime);
}
