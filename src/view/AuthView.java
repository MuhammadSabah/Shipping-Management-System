package view;

import java.util.Scanner;

public class AuthView {

//    public static boolean showSignup() {
//        Scanner input = new Scanner(System.in);
//        String username, password;
//        System.out.println("***** SIGNUP *****");
//        System.out.print("Enter your Username: ");
//        username = input.nextLine();
//        System.out.print("Enter your Password: ");
//        password = input.nextLine();
//
//    }

    public static boolean showLogin() {
        Scanner input = new Scanner(System.in);
        String username, password;
        System.out.println("***** LOGIN *****");
        while (true) {
            System.out.print("Enter your Username: ");
            username = input.next();
            System.out.print("Enter your Password: ");
            password = input.next();

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
