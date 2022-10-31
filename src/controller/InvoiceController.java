package controller;

import model.Invoice;

import java.util.ArrayList;

public class InvoiceController {
    private final ArrayList<Invoice> invoices = new ArrayList<>();

    public ArrayList<Invoice> getInvoices() {
        return invoices;
    }

    public static double calcCMB(double width, double height, double length) {
        return width * length * height;
    }

    public Invoice get() {
        return null;
    }

    public void getAll() {
    }

    public void add(Invoice invoice) {
        invoices.add(invoice);
    }

    public void remove() {
    }
}
