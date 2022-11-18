import controller.client.ClientConnection;
import view.StartView;

public class Main {
    public static void main(String[] args) {
        ClientConnection.startConnection();
        StartView.start();
    }
}