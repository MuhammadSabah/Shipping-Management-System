package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public record Shipment(AtomicInteger id,
                       ArrayList<Order> orders,
                       double maxWeight,
                       boolean shippingStatus,
                       String basePort,
                       String destinationPort) implements Serializable{

    public Shipment {

    }
}


