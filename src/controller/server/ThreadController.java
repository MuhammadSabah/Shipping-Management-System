package controller.server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;


public class ThreadController extends Thread {
    // File paths:
    // public static String employeesFilePath = "files/employees.txt";
    // public static String invoicesFilePath = "files/invoices.txt";
    // public static String itemsFilePath = "files/items.txt";
    // public static String ordersFilePath = "files/orders.txt";
    // public static String shipmentsFilePath = "files/shipments.txt";
    //

    private Socket socket;
    ObjectOutputStream outStream;
    ObjectInputStream inStream;

    public ThreadController(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            System.out.println("Client Connected");
            outStream = new ObjectOutputStream(socket.getOutputStream());
            inStream = new ObjectInputStream(socket.getInputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}