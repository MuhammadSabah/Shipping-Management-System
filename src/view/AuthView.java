package view;

import java.util.Scanner;

public class AuthView {
    public static boolean showLogin() {
        Scanner input = new Scanner(System.in);
        String username, password;
        System.out.println("***** LOGIN *****");
        while (true) {
            System.out.print("Enter your Username: ");
            username = input.next();
            System.out.print("Enter your Password: ");
            password = input.next();

            if (username.equals("user") && password.equals("user")) {
                System.out.println("Login Successful!");

                return true;
            } else {
                System.out.println("Incorrect username or password!,\n [1]: Try again \t [2]: Quit");
                int out = input.nextInt();
                if (out == 1) {
                } else {
                    return false;
                }
            }
        }
    }
}
