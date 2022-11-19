package controller.server;

import model.*;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;


public class PacketController extends Thread {
    // File paths:
    public static String employeesFilePath = "files/employees.txt";
    public static String invoicesFilePath = "files/invoices.txt";
    public static String itemsFilePath = "files/items.txt";
    public static String ordersFilePath = "files/orders.txt";
    public static String shipmentsFilePath = "files/shipments.txt";
    //

    private Socket socket;
    ObjectOutputStream outStream;
    ObjectInputStream inStream;

    public PacketController(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            System.out.println("Client Connected");
            outStream = new ObjectOutputStream(socket.getOutputStream());
            inStream = new ObjectInputStream(socket.getInputStream());
            Packet packet;

            while (true) {
                System.out.println("1");
                packet = (Packet) inStream.readObject();
                int packetMsg = packet.getMessage();
                System.out.println("Client input: " + packetMsg);
                if (packetMsg == 0) {
                    packet = new Packet<>(0);
                } else {
                    packet = processPacket(packet);
                }
                System.out.println("Before OutputStream");
                outStream.writeObject(packet);
                outStream.flush();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    //
    // 1 -> Employee: Save list
    // 2 -> Employee: Get list
    // 3 -> Invoice: Save list
    // 4 -> Invoice: Get list
    // 5 -> Item: Save list
    // 6 -> Item: Get list
    // 7 -> Order: Save list
    // 8 -> Order: Get list
    // 9 -> Shipment: Save list
    // 10-> Shipment: Get list

    private static Packet processPacket(Packet packet) {
        int packetMessage = packet.getMessage();

        // Employee
        if (packetMessage == 1) {
            DataController<Employee> employeesData = new DataController<>(employeesFilePath);
            if (employeesData.saveListToFile(packet.getItems())) {
                packet = new Packet<Employee>(1);
            } else {
                packet = new Packet<Employee>(0);
            }
        } else if (packetMessage == 2) {
            DataController<Employee> employeesData = new DataController<>(employeesFilePath);
            List<Employee> employees = employeesData.getList();
            if (employees.isEmpty()) {
                packet = new Packet(0);
            } else {
                packet = new Packet<Employee>(1);
                packet.setItems(employees);
            }
        }

        // Invoice
        else if (packetMessage == 3) {
            DataController<Invoice> invoicesData = new DataController<>(invoicesFilePath);
            if (invoicesData.saveListToFile(packet.getItems())) {
                packet = new Packet<Invoice>(1);
            } else {
                packet = new Packet<Invoice>(0);
            }
        } else if (packetMessage == 4) {
            DataController<Invoice> invoicesData = new DataController<>(invoicesFilePath);
            List<Invoice> invoices = invoicesData.getList();
            if (invoices.isEmpty()) {
                packet = new Packet(0);
            } else {
                packet = new Packet<Invoice>(1);
                packet.setItems(invoices);
            }
        }
        // Item
        else if (packetMessage == 5) {
            DataController<Item> itemsData = new DataController<>(itemsFilePath);
            if (itemsData.saveListToFile(packet.getItems())) {
                packet = new Packet<Item>(1);
            } else {
                packet = new Packet<Item>(0);
            }
        } else if (packetMessage == 6) {
            DataController<Item> itemsData = new DataController<>(itemsFilePath);
            List<Item> items = itemsData.getList();
            if (items.isEmpty()) {
                packet = new Packet(0);
            } else {
                packet = new Packet<Item>(1);
                packet.setItems(items);
            }
        }

        // Order
        else if (packetMessage == 7) {
            DataController<Order> ordersData = new DataController<>(ordersFilePath);
            if (ordersData.saveListToFile(packet.getItems())) {
                packet = new Packet<Order>(1);
            } else {
                packet = new Packet<Order>(0);
            }
        } else if (packetMessage == 8) {
            DataController<Order> ordersData = new DataController<>(ordersFilePath);
            List<Order> orders = ordersData.getList();
            if (orders.isEmpty()) {
                packet = new Packet(0);
            } else {
                packet = new Packet<Item>(1);
                packet.setItems(orders);
            }
        }
        // Shipment
        else if (packetMessage == 9) {
            DataController<Shipment> shipmentsData = new DataController<>(shipmentsFilePath);
            if (shipmentsData.saveListToFile(packet.getItems())) {
                packet = new Packet<Order>(1);
            } else {
                packet = new Packet<Order>(0);
            }
        } else if (packetMessage == 10) {
            DataController<Shipment> shipmentsData = new DataController<>(shipmentsFilePath);
            List<Shipment> shipments = shipmentsData.getList();
            if (shipments.isEmpty()) {
                packet = new Packet(0);
            } else {
                packet = new Packet<Item>(1);
                packet.setItems(shipments);
            }
        } else {
            packet = new Packet(3);
        }
        return packet;
    }
}
