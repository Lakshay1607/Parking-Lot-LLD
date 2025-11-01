package org.example;

import java.time.LocalDateTime;

import org.example.enums.PricingStrategyEnum;
import org.example.enums.VehicleEnum;
import org.example.factory.PricingStrategyFactory;
import org.example.factory.VehicleFactory;
import org.example.models.EntryGate;
import org.example.models.ExitGate;
import org.example.models.ParkingFloor;
import org.example.models.ParkingLot;
import org.example.models.ParkingSpot;
import org.example.models.Ticket;
import org.example.models.Vehicle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Vehicle car1 = VehicleFactory.create("Car1Number", VehicleEnum.CAR);
    Vehicle car2 = VehicleFactory.create("Car2Number", VehicleEnum.CAR);
    Vehicle car3 = VehicleFactory.create("Car3Number", VehicleEnum.CAR);
    Vehicle bike1 = VehicleFactory.create("Bike1Number", VehicleEnum.BIKE);
    Vehicle bike2 = VehicleFactory.create("Bike2Number", VehicleEnum.BIKE);
    ParkingLot parkingLot = ParkingLot.getInstance();
    parkingLot.setPricingStrategy(PricingStrategyFactory.createPaymentStrategy(PricingStrategyEnum.TIME_BASED));
    EntryGate entryGate = new EntryGate("EG1");
    ExitGate exitGate = new ExitGate("XG1");
    ParkingSpot carSpot1 = new ParkingSpot("PS1", VehicleEnum.CAR);
    ParkingSpot bikeSpot1 = new ParkingSpot("PS2", VehicleEnum.BIKE);
    ParkingSpot carSpot2 = new ParkingSpot("PS3", VehicleEnum.CAR);
    ParkingFloor floor1 = new ParkingFloor("F1");
    floor1.addSpot(carSpot1);
    floor1.addSpot(bikeSpot1);
    floor1.addSpot(carSpot2);

    parkingLot.addFloor(floor1);
    Ticket ticket = entryGate.parkVehicle(car1, LocalDateTime.of(2024, 5, 21, 7, 0));
    Ticket ticket2 = entryGate.parkVehicle(bike1, LocalDateTime.of(2024, 5, 21, 7, 0));
    Ticket ticket3 = entryGate.parkVehicle(car2, LocalDateTime.of(2024, 5, 21, 7, 0));

    exitGate.unparkVehicle(ticket, LocalDateTime.of(2024, 6, 21, 7, 0));

    Ticket ticket4 = entryGate.parkVehicle(car3, LocalDateTime.of(2024, 7, 21, 7, 0));

    for (Ticket tickets : parkingLot.getParkingTickets().values()){
      if (tickets != null) {
        System.out.println("Ticket Details:");
        System.out.println("ID: " + tickets.getTicketId());
        System.out.println("Vehicle Number: " + tickets.getVehicle().getNumber());
        System.out.println("Entry Time: " + tickets.getEntryTime());
        System.out.println("Parking Spot: " + tickets.getSpotId());
        System.out.println("Parking Floor: " + tickets.getFloorId());
      }
      System.out.println();
    }

  }
}