package model.data;

import controller.client.ClientController;
import model.Employee;
import model.Packet;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class EmployeeData {
    /*Atomic operations are performed in a single unit of
      task without interference from other operations.
      Atomic operations are necessity in
      multi-threaded environment to avoid data inconsistency.
      Therefore, we will use AtomicInteger for ID's */
    private static AtomicInteger ID_GENERATOR;

    // We use this Controller to perform CRUD operations on the files.
    private static ClientController<Employee> employeeClientController = new ClientController<>();

    // List of employees that we want to save.
    private static List<Employee> employees = new ArrayList<>();

    // We use this method to fetch list of employees from the file and then setting it to our ArrayList.
    public void fetchAndSetEmployees() {
        Packet<Employee> employeePacket = new Packet<>(2);
        try {
            employees = employeeClientController.get(employeePacket).getItems();
        } catch (NullPointerException e) {
            System.err.println("Employee List is null!");
        }
        fetchEmployeeID();
    }

    // Fetching a new ID every time.
    public void fetchEmployeeID() {
        ID_GENERATOR = new AtomicInteger(employees.size());
    }

    // Adding the employee and using the clientController to also add it to the file with "post" method.
    public boolean addEmployee(Employee emp) {
        Employee employee = new Employee(ID_GENERATOR.getAndIncrement(), emp.username().toLowerCase(), emp.password().toLowerCase(), emp.address(), emp.age(), emp.gender(), emp.phoneNumber(), emp.email(), emp.yearlySalary());
        employees.add(employee);
        System.out.println("---- Employee Added Successfully! ----");
        Packet<Employee> employeePacket = new Packet<>(1);
        employeePacket.setItems(employees);
        return employeeClientController.post(employeePacket);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
