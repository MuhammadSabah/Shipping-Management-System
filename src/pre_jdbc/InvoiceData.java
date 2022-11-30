package pre_jdbc;

import model.Invoice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class InvoiceData {
    private static AtomicInteger ID_GENERATOR;
    private static List<Invoice> invoices = new ArrayList<>();
    private static ClientController<Invoice> invoiceClientController = new ClientController<>();

    public void fetchAndSetInvoiceList() {
        Packet<Invoice> invoicePacket = new Packet<>(4);
        try {
            invoices = invoiceClientController.get(invoicePacket).getItems();
        } catch (NullPointerException e) {
            System.err.println("Invoice List is null");
        }
        fetchId();
    }

    public void fetchId() {
        ID_GENERATOR = new AtomicInteger(invoices.size());
    }

//    public boolean addInvoice(Invoice inv) {
//        Invoice invoice = new Invoice(ID_GENERATOR, inv.shipmentId(), inv.invoiceDate(), inv.shipmentDate(), inv.shipmentType(), inv.note(), inv.boxesQuantity(), inv.price(), inv.totalAmount(), inv.discount(), inv.finalAmount(), inv.payedIn(), inv.CBM());
//
//        invoices.add(invoice);
//        Packet<Invoice> invoicePacket = new Packet<>(3);
//        invoicePacket.setItems(invoices);
//        return invoiceClientController.post(invoicePacket);
//    }
}
