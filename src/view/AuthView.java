package view;

import controller.AuthController;
import controller.EmployeeController;
import model.Employee;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class AuthView {
    public static boolean showLogin() {
        EmployeeController employeeController = new EmployeeController();
        Scanner input = new Scanner(System.in);
        String username, password;
        System.out.println("***** LOGIN *****");
        while (true) {
            System.out.print("Enter your Username: ");
            username = input.next();
            System.out.print("Enter your Password: ");
            password = input.next();

            if (employeeController.authenticateEmployee(username, password)) {
                System.out.println("Login Successful!");
                return true;
            } else {
                System.out.println("Incorrect username or password!,\n [1]: Try again \t [2]: Quit");
                return false;
            }
        }
    }

    public static boolean showSignup() {
        EmployeeController employeeController = new EmployeeController();
        Scanner input = new Scanner(System.in);
        int id, age;
        char gender;
        String username, password, address, phoneNumber, email;
        System.out.println("***** SIGNUP *****");
        while (true) {
            System.out.println("Enter an ID: ");
            id = input.nextInt();
            System.out.print("Enter your Username: ");
            username = input.next();
            System.out.print("Enter your Password: ");
            password = input.next();
            System.out.print("Enter your Address: ");
            address = input.next();
            System.out.println("Enter your Age: ");
            age = input.nextInt();
            System.out.println("Enter your gender: M/F");
            gender = input.next().charAt(0);
            System.out.println("Enter your phone number: ");
            phoneNumber = input.next();
            System.out.println("Enter your Email: ");
            email = input.next();

            Employee employee = new Employee(new AtomicInteger(id), username, password, address, age, gender, phoneNumber, email);

            if (employeeController.addEmployee(employee)) {
                System.out.println("Signup Successful, " + employee.username() + " Added!");
                return true;
            } else {
                System.out.println("Employee already exists!");
                return false;
            }
        }
    }
}
