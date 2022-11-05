package model;

import java.io.Serializable;
import java.util.ArrayList;

public record Shipment(int id,
                       ArrayList<Order> orders,
                       double maxWeight,
                       boolean shippingStatus,
                       String basePort,
                       String destinationPort) implements Serializable{

    public Shipment {

    }
}


