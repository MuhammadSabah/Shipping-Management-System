package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public record Order(int orderId,
                    int shipmentId,
                    double orderWeight,
                    Invoice shippingInvoice,
                    ArrayList<Item> itemsList,
                    String orderSender,
                    String orderReceiver,
                    String receiverAddress,
                    Date deliveredDate,
                    Date shippingDate) implements Serializable {

    public Order {
    }
}