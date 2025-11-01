package org.example.models;

import lombok.Getter;
import org.example.enums.VehicleEnum;

@Getter
public abstract class Vehicle {
  public String number;
  public VehicleEnum type;
}
