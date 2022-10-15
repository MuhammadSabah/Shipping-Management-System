package model;

import java.util.Arrays;
import java.util.Objects;

public class Order {
    private int orderId;
    private int containerId;
    private double orderWeight;
    private double shippingBill;
    private String[] orderItems;
    private String orderSender;
    private String orderReceiver;
    private String receiverAddress;
    private String deliveredDate;
    private String shippingDate;

    public Order() {

    }

    public Order(int orderId, int containerId, double orderWeight, double shippingBill, String[] orderItems, String orderSender, String orderReceiver, String receiverAddress, String deliveredDate, String shippingDate) {
        this.orderId = orderId;
        this.containerId = containerId;
        this.orderWeight = orderWeight;
        this.shippingBill = shippingBill;
        this.orderItems = orderItems;
        this.orderSender = orderSender;
        this.orderReceiver = orderReceiver;
        this.receiverAddress = receiverAddress;
        this.deliveredDate = deliveredDate;
        this.shippingDate = shippingDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getContainerId() {
        return containerId;
    }

    public void setContainerId(int containerId) {
        this.containerId = containerId;
    }

    public double getOrderWeight() {
        return orderWeight;
    }

    public void setOrderWeight(double orderWeight) {
        this.orderWeight = orderWeight;
    }

    public double getShippingBill() {
        return shippingBill;
    }

    public void setShippingBill(double shippingBill) {
        this.shippingBill = shippingBill;
    }

    public String[] getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(String[] orderItems) {
        this.orderItems = orderItems;
    }

    public String getOrderSender() {
        return orderSender;
    }

    public void setOrderSender(String orderSender) {
        this.orderSender = orderSender;
    }

    public String getOrderReceiver() {
        return orderReceiver;
    }

    public void setOrderReceiver(String orderReceiver) {
        this.orderReceiver = orderReceiver;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getDeliveredDate() {
        return deliveredDate;
    }

    public void setDeliveredDate(String deliveredDate) {
        this.deliveredDate = deliveredDate;
    }

    public String getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(String shippingDate) {
        this.shippingDate = shippingDate;
    }

    // Used for comparing instance members.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return getOrderId() == order.getOrderId() && getContainerId() == order.getContainerId() && Double.compare(order.getOrderWeight(), getOrderWeight()) == 0 && Double.compare(order.getShippingBill(), getShippingBill()) == 0 && Arrays.equals(getOrderItems(), order.getOrderItems()) && Objects.equals(getOrderSender(), order.getOrderSender()) && Objects.equals(getOrderReceiver(), order.getOrderReceiver()) && Objects.equals(getReceiverAddress(), order.getReceiverAddress()) && Objects.equals(getDeliveredDate(), order.getDeliveredDate()) && Objects.equals(getShippingDate(), order.getShippingDate());
    }

    // A hashcode is a number generated from any object. This is what allows objects to be stored/retrieved quickly in a Hashtable.
    @Override
    public int hashCode() {
        int result = Objects.hash(getOrderId(), getContainerId(), getOrderWeight(), getShippingBill(), getOrderSender(), getOrderReceiver(), getReceiverAddress(), getDeliveredDate(), getShippingDate());
        result = 31 * result + Arrays.hashCode(getOrderItems());
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", containerId=" + containerId +
                ", orderWeight=" + orderWeight +
                ", shippingBill=" + shippingBill +
                ", orderItems=" + Arrays.toString(orderItems) +
                ", orderSender='" + orderSender + '\'' +
                ", orderReceiver='" + orderReceiver + '\'' +
                ", receiverAddress='" + receiverAddress + '\'' +
                ", deliveredDate='" + deliveredDate + '\'' +
                ", shippingDate='" + shippingDate + '\'' +
                '}';
    }
}