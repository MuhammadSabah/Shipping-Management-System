package view;

import java.util.Scanner;

public class StartView {
    public static void start() {
        Scanner input = new Scanner(System.in);
        System.out.println("***** WELCOME TO SHIPPING MANAGEMENT SYSTEM *****");
        while (true) {
            System.out.println("Please Login to start the system \n [1]: Login \n [2]: Quit");
            int ans = input.nextInt();
            if (ans == 1) {
                if (AuthView.showLogin()) {
                    // Start employee view
                    EmployeeView.start();
                    break;
                } else continue;
            } else {
                System.out.println("System Exited!");
                break;
            }
        }
    }
}
