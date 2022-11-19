package view;

import controller.InvoiceController;
import controller.ItemController;
import controller.OrderController;
import model.Invoice;
import model.Item;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class EmployeeView {

    //
    static OrderController orderController = new OrderController();
    static ItemController itemController = new ItemController();
    static InvoiceController invoiceController = new InvoiceController();
    //
    static Scanner in = new Scanner(System.in);

    public static void start() {
        System.out.println("\n***** EMPLOYEE VIEW *****\n");
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
                    Scanner input = new Scanner(System.in);
                    int id, shipmentId;
                    double orderWeight;
                    Invoice shippingInvoice;
                    ArrayList<Item> itemsList;
                    String orderSender, orderReceiver, receiverAddress, status, deliveredDate, shippingDate;
                    switch (num) {
                        case 1:
                            System.out.println("Enter an Order ID: ");
                            id = input.nextInt();
                            System.out.println("Enter an Shipment ID: ");
                            shipmentId = input.nextInt();
                            System.out.println("Enter the Items: ");
                            //
                            System.out.println("Enter an Order Weight: ");
                            orderWeight = input.nextDouble();
                            System.out.println("Enter the Shipping Invoice: ");
                            //
                            System.out.println("Enter the Order Sender: ");
                            orderSender = input.next();
                            System.out.println("Enter the Order Receiver: ");
                            orderReceiver = input.next();
                            System.out.println("Enter the Receiver Address: ");
                            receiverAddress = input.next();
                            System.out.println("Enter the Delivered Date: ");
                            deliveredDate = input.next();
                            System.out.println("Enter the Delivered Date: ");
                            shippingDate = input.next();
                            System.out.println("Enter the Order Status: Delivered/Pending");
                            status = input.next();
                            break;
                        case 2:
                            System.out.println("Enter the order ID that you want to remove: ");
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
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
                            addItems();
                            break;
                        case 2:
                            removeItem();
                            break;
                        case 3:
                            listItems();
                            break;
                        case 4:
                            break;
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
        System.out.println("[3] list items");
        System.out.println("[4] search for item");
    }

    // Item Methods:
    public static void addItems() {
        Scanner input = new Scanner(System.in);
        int i = 1;
        int itemNo;
        System.out.println("How many items do you want to add? ");
        itemNo = input.nextInt();
        while (i <= itemNo) {
            int id, orderID;
            String name;
            double weight;
            System.out.println("Enter an item ID: ");
            System.out.println("Enter an order ID: ");
            orderID = input.nextInt();
            id = input.nextInt();
            System.out.println("Enter an item name: ");
            name = input.next();
            System.out.println("Enter an item weight: ");
            weight = input.nextDouble();
            Item item = new Item(id, orderID, name, weight);
            itemController.addItem(item);
            i++;
        }
    }

    public static void removeItem() {
        Scanner input = new Scanner(System.in);
        int itemID, orderID;
        System.out.println("Enter an item ID to remove: ");
        itemID = input.nextInt();
        System.out.println("Enter order ID for that item: ");
        orderID = input.nextInt();
        itemController.removeItem(itemID, orderID);
    }

    public static void listItems() {
        int i = 1;
        for (Item item : itemController.getAllItems()) {
            System.out.println(i + "- " + item);
            i++;
        }
    }
    // Invoice Methods:

}

