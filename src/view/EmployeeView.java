package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeView {

    static Scanner in = new Scanner(System.in);

    public static void start() {
        System.out.println("\n***** EMPLOYEE VIEW *****");
        String n = "";
        int num = 0;
        boolean looping = true;
        employeeMainCommands();
        while (looping) {
            try {
                n = in.nextLine();
                if (n.equals("1")) {
                    orderCommands();
                    num = in.nextInt();
                    switch (num) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                    }
                } else if (n.equals("2")) {
                    invoiceCommands();
                    num = in.nextInt();
                    switch (num) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                    }
                } else if (n.equals("3")) {
                    itemCommands();
                    num = in.nextInt();
                    switch (num) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                    }
                } else if (n.equals("help")) {
                    employeeMainCommands();
                } else if (n.equalsIgnoreCase("exit")) {
                    System.out.print("Are you sure you want to exit? Y/N ");
                    char c = in.next().charAt(0);
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

    public static void employeeMainCommands() {
        System.out.println("[1] Order");
        System.out.println("[2] Invoice");
        System.out.println("[3] Item");
        System.out.println("\nType 'help' for a list of commands");
    }

    public static void orderCommands() {
        System.out.println("[1] add order");
        System.out.println("[2] remove order");
        System.out.println("[3] search for order");
        System.out.println("[4] get orders list");
        System.out.println("[5] display pending orders");
    }

    public static void invoiceCommands() {
        System.out.println("[1] add invoice");
        System.out.println("[2] remove invoice");
        System.out.println("[3] get invoice list");
        System.out.println("[4] search for order");
    }

    public static void itemCommands() {
        System.out.println("[1] add item");
        System.out.println("[2] remove item");
        System.out.println("[3] update item");
        System.out.println("[4] list items");
        System.out.println("[5] search for item");
    }
}
