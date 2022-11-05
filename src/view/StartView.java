package view;

import controller.AuthController;
import model.Employee;

import java.util.Scanner;

public class StartView {
    public static void start() {
        Scanner input = new Scanner(System.in);
        System.out.println("***** WELCOME TO SHIPPING MANAGEMENT SYSTEM *****");
        while (true) {
            System.out.println("Already have an account?");
            System.out.println(" [1]: Yes \n [2]: No, Create an account \n [3]: Quit");
            int accAns = input.nextInt();
            if (accAns == 1) {
                if (AuthView.showLogin()) {
                    // Later: Use controller to check the type of user.
                    if (true) {
                        // start employee view
                        EmployeeView.start();
                    } else {
                        // start manager view
                    }
                    break;
                }
            } else if (accAns == 2) {
                // show signup
                break;
            } else {
                System.out.println("System Exited!");
                break;
            }
        }
    }
}
