package view;

import controller.EmployeeController;
import model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ManagerView {

    static Scanner input = new Scanner(System.in);
    static EmployeeController employeeController = new EmployeeController();

    public static void start() {

        int id, age, phoneNumber;
        String username, password, address, gender, email;

        System.out.println("\n***** MANAGER VIEW *****");
        String n = "";
        int num = 0;
        boolean looping = true;
        managerMainCommands();
        while (looping) {
            try {
                n = input.nextLine();
                if (n.equals("1")) {
                    manageEmployeesCommands();
                    num = input.nextInt();
                    switch (num) {
                        case 1:
                            System.out.println("Enter Employee ID: ");
                            id = input.nextInt();
                            System.out.print("Enter Employee Username: ");
                            username = input.next();
                            System.out.print("Enter Employee Password: ");
                            password = input.next();
                            System.out.print("Enter Employee Address: ");
                            address = input.next();
                            System.out.println("Enter Employee Age: ");
                            age = input.nextInt();
                            System.out.println("Enter Employee gender (preferrably M/F): ");
                            gender = input.next().substring(0, 1);
                            System.out.println("Enter Employee phone number: ");
                            phoneNumber = input.nextInt();
                            System.out.println("Enter Employee Email: ");
                            email = input.next();
                            Employee employee = new Employee(id, username, password, address, age, gender, phoneNumber, email);
                            employeeController.addEmployee(employee);
                            System.out.println("employee " + username + " added!");
                            break;
                        case 2:
                            System.out.println("username or ID?");
                            String choice = input.next();
                            if(choice.equalsIgnoreCase("id")) {
                                System.out.println("Enter the id of the employee: ");
                                id = input.nextInt();
                                employeeController.removeEmployeeId(id);
                                System.out.println("Employee removed. ");
                            } else if(choice.equalsIgnoreCase("username")) {
                                System.out.println("Enter the username of the employee: ");
                                username = input.next();
                                employeeController.removeEmployeeUsername(username);
                                System.out.println("Employee removed. ");
                            } else {
                                System.out.println("not a valid input.");
                            }
                            break;
                        case 3:
                            System.out.println("Enter the username you want to look for: ");
                            Employee existingEmployee = employeeController.searchForEmployee(input.next());
                            if (existingEmployee != null) {
                                System.out.println(existingEmployee.toString());
                            } else {
                                System.out.println("Employee does not exist");
                            }
                            break;
                        case 4:
                            ArrayList<Employee> returnedList =  employeeController.getAllEmployees();
                            for(int i = 0; i < returnedList.size(); i++) {
                                System.out.println(returnedList.get(i).toString());
                            }
                            break;
                    }
                } else if (n.equals("2")) {
                    shipmentCommands();
                    num = input.nextInt();
                    switch (num) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                    }
                } else if(n.equalsIgnoreCase("help")){
                    managerMainCommands();
                } else if (n.equalsIgnoreCase("exit")) {
                    System.out.print("Are you sure you want to exit? Y/N ");
                    char c = input.next().charAt(0);
                    if (c == 'y' || c == 'Y') {
                        looping = false;
                    }
                    break;
                }
            } catch (InputMismatchException ex) {
                System.out.println("command does not exist");
            }
        }

    }

    public static void managerMainCommands() {
        System.out.println("[1] Manage Employees");
        System.out.println("[2] Manage Container/Shipment");
        System.out.println("\nType 'help' for a list of commands");
    }

    public static void manageEmployeesCommands() {
        System.out.println("[1] add employee");
        System.out.println("[2] remove employee");
        System.out.println("[3] get employee details");
        System.out.println("[4] list employees");
    }

    public static void shipmentCommands() {
        System.out.println("[1] add shipment");
        System.out.println("[2] remove shipment");
        System.out.println("[3] update shipment");
        System.out.println("[4] get shipment details");
        System.out.println("[5] list shipments");
        System.out.println("[6] search for shipment");
    }
}
