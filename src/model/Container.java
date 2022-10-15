package model;

public class Container {
    private int containerId;
    private Order[] orders;
    private double containerMaxWeight;
    private boolean shippingStatus;
    private String containerBasePort;
    private String containerDestinationPort;

    public Container() {

    }

    public Container(int id, Order[] orders, double containerMaxWeight, boolean shippingStatus, String containerBasePort, String containerDestinationPort) {
        this.containerId = id;
        this.orders = orders;
        this.containerMaxWeight = containerMaxWeight;
        this.shippingStatus = shippingStatus;
        this.containerBasePort = containerBasePort;
        this.containerDestinationPort = containerDestinationPort;

    }

    public String getContainerBasePort() {
        return containerBasePort;
    }

    public double getContainerMaxWeight() {
        return containerMaxWeight;
    }

    public boolean isShippingStatus() {
        return shippingStatus;
    }

    public String getContainerDestinationPort() {
        return containerDestinationPort;
    }

    public Order[] getOrders() {
        return orders;
    }

    public int getContainerId() {
        return containerId;
    }
}


