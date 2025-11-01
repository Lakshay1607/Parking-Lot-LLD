package org.example.models;

import org.example.enums.VehicleEnum;

public class Bike extends Vehicle {
  public Bike(String number){
    this.number = number;
    this.type = VehicleEnum.BIKE;
  }
}
