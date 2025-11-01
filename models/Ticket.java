package org.example.models;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import org.example.enums.PaymentStatusEnum;

@Setter
@Getter
public class Ticket {
  public String ticketId;
  public LocalDateTime entryTime;
  public LocalDateTime exitTime;
  public PaymentStatusEnum paymentStatus;
  public Vehicle vehicle;
  public String spotId;
  public String floorId;
}
