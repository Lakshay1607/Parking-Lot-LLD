package org.example.models;

import java.time.LocalDateTime;

import org.example.enums.GateTypeEnum;
import org.example.enums.PaymentStatusEnum;

public class EntryGate extends Gate {
  public EntryGate(String id) {
    this.id = id;
    this.type = GateTypeEnum.ENTRY;
  }

  public GateTypeEnum getType() {
    return this.type;
  }

  public Ticket parkVehicle(Vehicle vehicle, LocalDateTime entryTime) {
    Ticket ticket= new Ticket();
    ParkingLot parkingLot = ParkingLot.getInstance();

    for (ParkingFloor floor : parkingLot.getFloors().values()) {
      ParkingSpot spot = floor.findSpot(vehicle.getType());
      if (spot != null){
        ticket.setTicketId("Ticket For " + vehicle.getNumber());
        ticket.setEntryTime(entryTime);
        ticket.setVehicle(vehicle);
        ticket.setSpotId(spot.getId());
        ticket.setFloorId(floor.getId());
        ticket.setPaymentStatus(PaymentStatusEnum.PENDING);
        parkingLot.getParkingTickets().put(ticket.getTicketId(), ticket);
        return ticket;
      }
    }
    throw new IllegalStateException("No parking space left for this vehicle type.");
  }
}
