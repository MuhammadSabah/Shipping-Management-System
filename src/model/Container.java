package model;

import java.util.ArrayList;
import java.util.Objects;

public class Container {
    private int containerId;
    private ArrayList<Order> orders;
    private double containerMaxWeight;
    private boolean shippingStatus;
    private String containerBasePort;
    private String containerDestinationPort;

    public Container() {

    }

    public Container(int containerId, ArrayList<Order> orders, double containerMaxWeight, boolean shippingStatus, String containerBasePort, String containerDestinationPort) {
        this.containerId = containerId;
        this.orders = orders;
        this.containerMaxWeight = containerMaxWeight;
        this.shippingStatus = shippingStatus;
        this.containerBasePort = containerBasePort;
        this.containerDestinationPort = containerDestinationPort;
    }

    public void setContainerId(int containerId) {
        this.containerId = containerId;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public void setContainerMaxWeight(double containerMaxWeight) {
        this.containerMaxWeight = containerMaxWeight;
    }

    public void setShippingStatus(boolean shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    public void setContainerBasePort(String containerBasePort) {
        this.containerBasePort = containerBasePort;
    }

    public void setContainerDestinationPort(String containerDestinationPort) {
        this.containerDestinationPort = containerDestinationPort;
    }

    public int getContainerId() {
        return containerId;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public double getContainerMaxWeight() {
        return containerMaxWeight;
    }

    public boolean isShippingStatus() {
        return shippingStatus;
    }

    public String getContainerBasePort() {
        return containerBasePort;
    }

    public String getContainerDestinationPort() {
        return containerDestinationPort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Container)) return false;
        Container container = (Container) o;
        return containerId == container.containerId && Double.compare(container.containerMaxWeight, containerMaxWeight) == 0 && shippingStatus == container.shippingStatus && orders.equals(container.orders) && containerBasePort.equals(container.containerBasePort) && containerDestinationPort.equals(container.containerDestinationPort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(containerId, orders, containerMaxWeight, shippingStatus, containerBasePort, containerDestinationPort);
    }

    @Override
    public String toString() {
        return "Container{" +
                "containerId=" + containerId +
                ", orders=" + orders +
                ", containerMaxWeight=" + containerMaxWeight +
                ", shippingStatus=" + shippingStatus +
                ", containerBasePort='" + containerBasePort + '\'' +
                ", containerDestinationPort='" + containerDestinationPort + '\'' +
                '}';
    }
}


