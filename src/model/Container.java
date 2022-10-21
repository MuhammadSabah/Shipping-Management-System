package model;

import java.util.ArrayList;

public record Container(int containerId,
                        ArrayList<Order> orders,
                        double containerMaxWeight,
                        boolean shippingStatus,
                        String containerBasePort,
                        String containerDestinationPort) {


    public Container {

    }
}


