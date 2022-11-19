package model;

import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public record Invoice(AtomicInteger id,
                      int shipmentId,
                      Date invoiceDate,
                      Date shipmentDate,
                      String shipmentType,
                      String note,
                      int boxesQuantity,
                      double price,
                      double totalAmount,
                      double discount,
                      double finalAmount,
                      String payedIn,
                      // Cubic Meter = length * width * height
                      double CBM) implements Serializable{

}
