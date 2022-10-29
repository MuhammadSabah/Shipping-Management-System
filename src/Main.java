import model.Employee;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Shipping Management System");

        // Serialization:
        Serializer serializer = new Serializer("test.ser");
        Employee muhammad = new Employee(
                0,
                "Muhammad",
                "Sabah",
                "Ibrahim",
                "Erbil city",
                19,
                'M',
                "0000 000 0000",
                "hama.s.ibrahim9@gmail.com",
                900000
        );
        serializer.serialize(muhammad);
        serializer.closeSerializer();
    }
}