package org.example.models;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import org.example.enums.VehicleEnum;

@Getter
@Setter
public class ParkingFloor {
  public String id;
  public Map<String, ParkingSpot> parkingSpots = new HashMap<>();

  public ParkingSpot findSpot(VehicleEnum vehicleType) {
    for (ParkingSpot spot : parkingSpots.values()) {
      if (spot.allowedType == vehicleType && spot.tryOccupy()) {
        return spot;
      }
    }
    return null;
  }

  public void addSpot(ParkingSpot spot) {
    parkingSpots.put(spot.id, spot);
  }
  public ParkingFloor (String id) {
    this.id = id;
  }

}
