package controller.client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientConnection {
    public static Socket socket;
    public static ObjectInputStream objIn;
    public static ObjectOutputStream objOut;

    public static void startConnection() {
        try {
            socket = new Socket("localhost", 4444);
            objIn = new ObjectInputStream(socket.getInputStream());
            objOut = new ObjectOutputStream(socket.getOutputStream());
            System.out.println("---- Successfully connected to server ----");
        } catch (IOException e) {
            System.err.println("Initializing stream failed" + e.getMessage());
        }
    }

    public static void stopConnection() {
        try {
            objIn.close();
            objOut.close();
            socket.close();
        } catch (IOException e) {
            System.err.println("Stopping connection was failed" + e.getMessage());
        }
    }
}
