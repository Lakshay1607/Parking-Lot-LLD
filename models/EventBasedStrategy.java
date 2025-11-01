package org.example.models;

import java.time.LocalDateTime;

import org.example.enums.VehicleEnum;
import org.example.interfaces.PricingStrategy;

public class EventBasedStrategy implements PricingStrategy {

  @Override
  public double calculateFee(VehicleEnum type, LocalDateTime entryTime, LocalDateTime exitTime) {
    long minutes = java.time.Duration.between(entryTime, exitTime).toMinutes();
    long hours = (long) Math.ceil(minutes / 60.0);
    System.out.println("Total hours vehicle was parked was " + hours);
    return switch (type) {
      case CAR -> hours * 40;
      case BIKE -> hours * 20;
      case TRUCK -> hours * 100;
    };
  }
}
