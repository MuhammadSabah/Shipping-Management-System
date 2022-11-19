package controller;

import model.Order;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class OrderController {
    private final ArrayList<Order> ordersList = new ArrayList<>();

    public Order getOrder(AtomicInteger id) {
        for (Order order : ordersList) {
            if (order.id() == id) {
                return order;
            }
        }
        return null;
    }

    public ArrayList<Order> getAllOrders() {
        return ordersList;
    }

    public ArrayList<Order> getAllPendingOrder() {
        return (ArrayList<Order>) ordersList.stream()
                .filter((Order order) -> order.status().equals("pending"))
                .collect(Collectors.toList());
    }

    public void addOrder(Order order) {
        if (!ordersList.contains(order)) {
            ordersList.add(order);
        }
    }

    public void removeOrder(AtomicInteger id) {
        ordersList.removeIf((Order order) -> order.id() == id);
    }

    public void updateOrder(Order order) {
        // Nothing for now
    }

    public ArrayList<Order> searchSenderOrder(String orderSender) {
        return (ArrayList<Order>) ordersList.stream()
                .filter((Order order) -> order.orderSender().contains(orderSender))
                .collect(Collectors.toList());
    }

    public ArrayList<Order> searchReceiverOrder(String orderReceiver) {
        return (ArrayList<Order>) ordersList.stream()
                .filter((Order order) -> order.orderSender().contains(orderReceiver))
                .collect(Collectors.toList());
    }
}


