package controller;

import model.Order;

import java.util.ArrayList;

public class OrderController {
    private final ArrayList<Order> ordersList = new ArrayList<>();

    public ArrayList<Order> getOrdersList() {
        return ordersList;
    }

    public Order get() {
        return null;
    }

    public void getAllPending() {
    }

    public void add(Order order) {
        ordersList.add(order);
    }

    public void remove(int id) {
    }

    public void update(Order order) {
    }

    public void search() {
    }

}


