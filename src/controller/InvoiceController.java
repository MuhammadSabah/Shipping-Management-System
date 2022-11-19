package controller;

import model.Invoice;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class InvoiceController {
    private final ArrayList<Invoice> invoiceList = new ArrayList<>();

    public static double calcCMB(double width, double height, double length) {
        return width * length * height;
    }

    public Invoice getInvoice(AtomicInteger id) {
        for (Invoice invoice : invoiceList) {
            if (invoice.id() == id) {
                return invoice;
            }
        }
        return null;
    }

    public ArrayList<Invoice> getAllInvoices() {
        return invoiceList;
    }

    public void addInvoice(Invoice invoice) {
        if (!invoiceList.contains(invoice)) {
            invoiceList.add(invoice);
        }
    }

    public void removeInvoice(AtomicInteger id) {
        invoiceList.removeIf((Invoice invoice) -> invoice.id() == id);
    }
}
