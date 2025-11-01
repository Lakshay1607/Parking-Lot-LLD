package org.example.models;

import java.util.concurrent.atomic.AtomicBoolean;

import lombok.Getter;
import org.example.enums.VehicleEnum;
@Getter
public class ParkingSpot {
  public String id;
  public VehicleEnum allowedType;
  private AtomicBoolean occupied = new AtomicBoolean(false);

  public ParkingSpot (String id, VehicleEnum allowedType) {
    this.id = id;
    this.allowedType = allowedType;
  }

  public boolean tryOccupy() {
    return occupied.compareAndSet(false, true);
  }

  public void vacate() {
    occupied.set(false);
  }

  public boolean isOccupied() {
    return occupied.get();
  }
}
