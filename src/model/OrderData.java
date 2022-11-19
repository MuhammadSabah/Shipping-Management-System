package model;

import controller.client.ClientController;
import model.Order;
import model.Packet;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class OrderData {
    private static AtomicInteger ID_GENERATOR;
    private static List<Order> orders = new ArrayList<>();
    private static ClientController<Order> orderClientController = new ClientController<>();

    public void fetchAndSetOrdersList() {
        Packet<Order> orderPacket = new Packet<>(6);
        try {
            orders = orderClientController.get(orderPacket).getItems();
        } catch (NullPointerException e) {
            System.err.println("Items List is null");
        }
        fetchId();
    }

    public void fetchId() {
        ID_GENERATOR = new AtomicInteger(orders.size());
    }

    public boolean addOrder(Order ord) {
        Order order = new Order(ID_GENERATOR, ord.shipmentId(), ord.orderWeight(), ord.shippingInvoice(), ord.itemsList(), ord.orderSender(), ord.orderReceiver(), ord.receiverAddress(), ord.deliveredDate(), ord.shippingDate(), ord.status());
        orders.add(order);
        Packet<Order> orderPacket = new Packet<>(5);
        orderPacket.setItems(orders);
        return orderClientController.post(orderPacket);
    }
}


