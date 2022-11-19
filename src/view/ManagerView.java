package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManagerView {

    static Scanner in = new Scanner(System.in);

    public static void start() {
        System.out.println("\n***** MANAGER VIEW *****");
        String n = "";
        int num = 0;
        boolean looping = true;
        managerMainCommands();
        while (looping) {
            try {
                n = in.nextLine();
                if (n.equals("1")) {
                    manageEmployeesCommands();
                    num = in.nextInt();
                    switch (num) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                    }
                } else if (n.equals("2")) {
                    shipmentCommands();
                    num = in.nextInt();
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

    public static void managerMainCommands() {
        System.out.println("[1] Manage Employees");
        System.out.println("[2] Manage Container/Shipment");
        System.out.println("\nType 'help' for a list of commands");
    }

    public static void manageEmployeesCommands() {
        System.out.println("[1] add employee");
        System.out.println("[2] remove employee");
        System.out.println("[3] update employee");
        System.out.println("[4] get employee details");
        System.out.println("[5] search for employee");
        System.out.println("[6] get employee list");
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
