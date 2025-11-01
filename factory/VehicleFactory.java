package org.example.factory;

import org.example.enums.VehicleEnum;
import org.example.models.Bike;
import org.example.models.Car;

public class VehicleFactory {
  public static org.example.models.Vehicle create(String number, VehicleEnum vehicleEnum) {
    if (VehicleEnum.CAR.equals(vehicleEnum)) {
      return new Car(number);
    } else if (VehicleEnum.BIKE.equals(vehicleEnum)) {
      return new Bike(number);
    } else if (VehicleEnum.TRUCK.equals(vehicleEnum)) {
      return new Bike(number);
    }
    return null;
  }
}
