package model;

import java.util.ArrayList;

public record Shipment(int id,
                       ArrayList<Order> orders,
                       double maxWeight,
                       boolean shippingStatus,
                       String basePort,
                       String destinationPort) {

    public Shipment {

    }
}


