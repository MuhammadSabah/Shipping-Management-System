package view;

import controller.AuthController;
import controller.EmployeeController;
import model.Employee;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class AuthView {

   private static final String employeeQuery = "SELECT * FROM `EMPLOYEE` WHERE username LIKE ? AND password LIKE ?;";
   private static final String managerQuery = "SELECT * FROM `MANAGER` WHERE username LIKE ? AND password LIKE ?;";


    public static String showLogin() {
        EmployeeController employeeController = new EmployeeController();
        Scanner input = new Scanner(System.in);
        String username, password;
        System.out.println("***** LOGIN *****");
            System.out.print("Enter your Username: ");
            username = input.next();
            System.out.print("Enter your Password: ");
            password = input.next();

            boolean isEmployee = AuthController.checkCredential(username, password, employeeQuery);
            boolean isManager = AuthController.checkCredential(username, password, managerQuery);
            if(isEmployee) {
                System.out.println("\n---- Employee " + username + " Logged in Successfully! ----");
                return "employee";
            }
            if(isManager) {
                System.out.println("\n---- Manager " + username + " Logged in Successfully! ----");
                return "manager";
            } else {
                System.out.println("\n---- Incorrect username or password! ----\n");
                return "";
            }
    }


    public static boolean showSignup() {
        EmployeeController employeeController = new EmployeeController();
        Scanner input = new Scanner(System.in);
        int id, age, phoneNumber;
        String username, password, address, gender, email;
        System.out.println("***** SIGNUP *****");
        while (true) {
            System.out.println("Enter an ID: ");
            id = input.nextInt();
            System.out.print("Enter your Username: ");
            username = input.next();
            System.out.print("Enter your Password: ");
            password = input.next();
            System.out.print("Enter your address: ");
            address = input.next();
            System.out.println("Enter your Age: ");
            age = input.nextInt();
            System.out.println("Enter your gender (preferably M/F): ");
            gender = input.next().substring(0, 1);
            System.out.println("Enter your phone number: ");
            phoneNumber = input.nextInt();
            System.out.println("Enter your Email: ");
            email = input.next();

            Employee employee = new Employee(id, username, password, address, age, gender, phoneNumber, email);

            if (employeeController.addEmployee(employee)) {
                System.out.println("---- Signup Successful, " + employee.username() + " Added! ----");
                return true;
            } else {
                System.out.println("\n---- Employee already exists! ----\n");
                return false;
            }
        }
    }
}
