package view;

import java.util.Scanner;

public class AuthView {
    public static boolean showLogin() {
        Scanner input = new Scanner(System.in);
        String username, password;
        System.out.println("Login");
        while (true) {
            System.out.println("Enter your Username: ");
            username = input.nextLine();
            System.out.println("Enter your Password: ");
            password = input.nextLine();

            if (username.equals("Correct") && password.equals("Correct")) {
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
