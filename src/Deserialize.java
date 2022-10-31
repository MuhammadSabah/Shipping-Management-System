import model.Employee;

import java.io.IOException;

public class Main2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Deserialization:
        Deserializer deserializer = new Deserializer("C:\\Users\\Leonvo\\IdeaProjects\\Shipping-Management\\test.ser");
        Employee muhammad = (Employee) deserializer.deserialize();
        deserializer.closeDeserializer();
        System.out.println(muhammad.toString());
    }
}
