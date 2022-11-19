package controller.server;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(4444)) {
            while (true) {
                // The start() here is calling run() inside Thread class.
                new PacketController(serverSocket.accept()).start();
            }

        } catch (IOException e) {
            System.err.println("Server Error" + e.getMessage());
        }
    }
}
