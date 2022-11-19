package view;

import java.util.Scanner;

public class StartView {
    public static void start() {
        Scanner input = new Scanner(System.in);
        System.out.println("***** WELCOME TO SHIPPING MANAGEMENT SYSTEM *****");
        while (true) {
            System.out.println("Please Login or Signup to start the system \n [1]:Signup   [2]: Login   [3]: Quit");
            int ans = input.nextInt();
            if (ans == 1) {
                if (AuthView.showSignup()) {
                    EmployeeView.start();
                    break;
                } else {
                    continue;
                }
            } else if (ans == 2) {
                if (AuthView.showLogin()) {
                    // Start employee view
                    EmployeeView.start();
                    break;
                } else {
                    continue;
                }
            } else {
                System.out.println("System Exited!");
                break;
            }
        }
    }
}
