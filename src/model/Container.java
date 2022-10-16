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

    public int containerId() {
        return containerId;
    }

    public ArrayList<Order> orders() {
        return orders;
    }

    public double containerMaxWeight() {
        return containerMaxWeight;
    }

    public boolean shippingStatus() {
        return shippingStatus;
    }

    public String containerBasePort() {
        return containerBasePort;
    }

    public String containerDestinationPort() {
        return containerDestinationPort;
    }

}


