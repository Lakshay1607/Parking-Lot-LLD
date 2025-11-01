package org.example.models;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import org.example.interfaces.PricingStrategy;

@Getter
@Setter
public class ParkingLot {
  public Map<String, ParkingFloor> floors = new HashMap<>();
  public Map<String, Ticket> parkingTickets = new HashMap<>();
  public PricingStrategy pricingStrategy;

  private static ParkingLot instance;

  public static synchronized ParkingLot getInstance() {
    if (instance == null) {
      instance = new ParkingLot();
    }
    return instance;
  }

  public void addFloor(ParkingFloor floor) {
    floors.put(floor.id, floor);
  }

}
