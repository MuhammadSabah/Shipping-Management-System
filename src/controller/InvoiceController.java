package controller;

import model.Invoice;

import java.util.ArrayList;

public class InvoiceController {
    private final ArrayList<Invoice> invoiceList = new ArrayList<>();

    public static double calcCMB(double width, double height, double length) {
        return width * length * height;
    }

    public Invoice get(int id) {
        for (Invoice invoice : invoiceList) {
            if (invoice.id() == id) {
                return invoice;
            }
        }
        return null;
    }

    public ArrayList<Invoice> getAll() {
        return invoiceList;
    }

    public void add(Invoice invoice) {
        if (!invoiceList.contains(invoice)) {
            invoiceList.add(invoice);
        }
    }

    public void remove(int id) {
        invoiceList.removeIf((Invoice invoice) -> invoice.id() == id);
    }
}
