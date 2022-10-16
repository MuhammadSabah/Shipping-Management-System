package model;

public record Order(int orderId,
                    int containerId,
                    double orderWeight,
                    double shippingBill,
                    String[] orderItems,
                    String orderSender,
                    String orderReceiver,
                    String receiverAddress,
                    String deliveredDate,
                    String shippingDate) {

    public int orderId() {
        return orderId;
    }

    public int containerId() {
        return containerId;
    }

    public double orderWeight() {
        return orderWeight;
    }

    public double shippingBill() {
        return shippingBill;
    }

    public String[] orderItems() {
        return orderItems;
    }

    public String orderSender() {
        return orderSender;
    }

    public String orderReceiver() {
        return orderReceiver;
    }

    public String receiverAddress() {
        return receiverAddress;
    }

    public String deliveredDate() {
        return deliveredDate;
    }

    public String shippingDate() {
        return shippingDate;
    }
}