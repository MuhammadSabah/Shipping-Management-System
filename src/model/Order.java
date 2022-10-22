package model;

import java.util.ArrayList;

public record Order(int orderId,
                    int shipmentId,
                    double orderWeight,
                    Invoice shippingInvoice,
                    ArrayList<Item> itemsList,
                    String orderSender,
                    String orderReceiver,
                    String receiverAddress,
                    String deliveredDate,
                    String shippingDate) {

    public Order {
    }
}