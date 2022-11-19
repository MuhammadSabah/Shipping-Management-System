package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public record Order(int id,
                    int shipmentId,
                    double orderWeight,
                    Invoice shippingInvoice,
                    ArrayList<Item> itemsList,
                    String orderSender,
                    String orderReceiver,
                    String receiverAddress,
                    Date deliveredDate,
                    Date shippingDate,
                    String status) implements Serializable {

    public Order {
    }
}