package model;


import java.util.ArrayList;

public class Container {
    private int containerId;
    private ArrayList<Order> orders;
    private double containerMaxWeight;
    private boolean shippingStatus;
    private String containerBasePort;
    private String containerDestinationPort;

    public Container() {

    }

    public Container(int id, ArrayList<Order> orders, double containerMaxWeight, boolean shippingStatus, String containerBasePort, String containerDestinationPort) {
        this.containerId = id;
        this.orders = orders;
        this.containerMaxWeight = containerMaxWeight;
        this.shippingStatus = shippingStatus;
        this.containerBasePort = containerBasePort;
        this.containerDestinationPort = containerDestinationPort;

    }

    public void AddOrder(Order order) {
        this.orders.add(order);
    }

    public void removeOrder(int orderId) {
        this.orders.removeIf(o -> o.id == orderId);
    }

    public void setShippingStatus(boolean status) {
        this.shippingStatus = status;
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

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public int getContainerId() {
        return containerId;
    }
}


