package controller.client;

import model.Packet;

import java.io.IOException;

public class ClientController<T> {
    // Client CRUD operations:
    public Packet<T> get(Packet<T> packet) {
        try {
            ClientConnection.objOut.writeObject(packet);
            ClientConnection.objOut.flush();
            Packet<T> response = (Packet<T>) ClientConnection.objIn.readObject();
            int message = response.getMessage();

            if (message != 1) {
                System.out.println("Error: " + message);
                return null;
            }
            return response;
        } catch (IOException e) {
            System.err.println("Error" + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Error" + e.getMessage());
        }
        return null;
    }

    public boolean post(Packet<T> packet) {
        try {
            ClientConnection.objOut.writeObject(packet);
            ClientConnection.objOut.flush();
            Packet<T> response = (Packet<T>) ClientConnection.objIn.readObject();
            int message = response.getMessage();
            return message == 1;

        } catch (IOException e) {
            System.err.println("Error" + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Error" + e.getMessage());
        }
        return true;
    }
}
