import controller.*;
import model.*;
import object_state.Serializer;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;

public class Serialize {
    public static void main(String[] args) throws IOException {
        Serializer serializer = new Serializer("storage\\data.ser");
        HashMap<String, ArrayList> stateData = new HashMap<>();
        // Controllers:
        EmployeeController empController = new EmployeeController();
        InvoiceController invoiceController = new InvoiceController();
        OrderController orderController = new OrderController();
        ItemController itemController = new ItemController();
        ShipmentController shipmentController = new ShipmentController();
        //
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
        empController.addEmployee(muhammad);
        Manager zina = new Manager(0,
                "password",
                "Zina",
                "Kamaran",
                20,
                'F',
                new Date(2000, 1, 1),
                40000
        );
        Invoice invoice1 = new Invoice(11,
                201,
                new Date(2022, 10, 31),
                new Date(2022, 12, 16),
                "Sea",
                "Nothing",
                6,
                20.0,
                200,
                0.0,
                200,
                "Dollar",
                13.0
        );
        invoiceController.add(invoice1);
        Item item1 = new Item(301, "Cereal", 0.5);
        Item item2 = new Item(302, "Coat", 1.5);
        itemController.add(item1);
        itemController.add(item2);
        Order order1 = new Order(101,
                201,
                55.0,
                invoice1,
                itemController.getItemsList(),
                "Yara",
                "AR",
                "Erbil",
                new Date(2022, 6, 6),
                new Date(2021, 12, 12)
        );
        orderController.add(order1);
        //
        stateData.put("employeesList", empController.getEmployees());
        stateData.put("ordersList", orderController.getOrdersList());
        stateData.put("invoicesList", invoiceController.getInvoices());
        stateData.put("itemsList", itemController.getItemsList());
        stateData.put("shipmentsList", shipmentController.getShipments());

        serializer.serialize(stateData);
        serializer.closeSerializer();
    }
}
