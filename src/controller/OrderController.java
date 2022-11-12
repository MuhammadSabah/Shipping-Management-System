package controller;

import model.Order;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class OrderController {
    private final ArrayList<Order> ordersList = new ArrayList<>();

    public Order get(int id) {
        for (Order order : ordersList) {
            if (order.id() == id) {
                return order;
            }
        }
        return null;
    }

    public ArrayList<Order> getAll() {
        return ordersList;
    }

    public ArrayList<Order> getAllPending() {
        return (ArrayList<Order>) ordersList.stream()
                .filter((Order order) -> order.status().equals("pending"))
                .collect(Collectors.toList());
    }

    public void add(Order order) {
        if (!ordersList.contains(order)) {
            ordersList.add(order);
        }
    }

    public void remove(int id) {
        ordersList.removeIf((Order order) -> order.id() == id);
    }

    public void update(Order order) {
        // Nothing for now
    }

    public ArrayList<Order> searchSender(String orderSender) {
        return (ArrayList<Order>) ordersList.stream()
                .filter((Order order) -> order.orderSender().contains(orderSender))
                .collect(Collectors.toList());
    }

    public ArrayList<Order> searchReceiver(String orderReceiver) {
        return (ArrayList<Order>) ordersList.stream()
                .filter((Order order) -> order.orderSender().contains(orderReceiver))
                .collect(Collectors.toList());
    }
}


