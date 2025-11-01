package org.example.models;

import org.example.enums.VehicleEnum;

public class Car extends Vehicle {
  public Car(String number){
    this.number = number;
    this.type = VehicleEnum.CAR;
  }
}
