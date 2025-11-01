package org.example.models;

import java.time.LocalDateTime;

import org.example.enums.GateTypeEnum;
import org.example.enums.PaymentStrategyEnum;
import org.example.factory.PaymentStrategyFactory;

public class ExitGate extends Gate{
  public ExitGate(String id) {
    this.id = id;
    this.type = GateTypeEnum.EXIT;
  }

  public void unparkVehicle(Ticket ticket, LocalDateTime exitDateTime) {
    ticket.setExitTime(exitDateTime);
    double amountToBePaid = ParkingLot.getInstance().getPricingStrategy().calculateFee(ticket.getVehicle().getType(), ticket.getEntryTime(), exitDateTime);
    PaymentProcessor paymentProcessor = new PaymentProcessor(PaymentStrategyFactory.getPaymentStrategy(PaymentStrategyEnum.CARD));
    boolean paymentStatus = paymentProcessor.processPayment(ticket, amountToBePaid);
    if (paymentStatus) {
      ParkingSpot spot = ParkingLot.getInstance().getFloors().get(ticket.getFloorId()).getParkingSpots().get(ticket.spotId);
      ParkingLot.getInstance().getParkingTickets().remove(ticket.getTicketId());
      spot.vacate();
      System.out.println("Payment successful. Vehicle exited.");
    } else {
      System.out.println("Payment failed. Please try again.");
    }
  }
}
