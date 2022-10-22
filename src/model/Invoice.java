package model;

import java.util.Date;

public record Invoice(int id,
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
                      double CBM) {

    public Invoice {
    }
}
