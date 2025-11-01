package org.example.models;

import org.example.enums.VehicleEnum;

public class Truck extends Vehicle {
  public Truck(String number){
    this.number = number;
    this.type = VehicleEnum.TRUCK;
  }
}
