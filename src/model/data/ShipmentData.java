package model.data;

import controller.client.ClientController;
import model.Packet;
import model.Shipment;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ShipmentData {
    private static AtomicInteger ID_GENERATOR;
    private static List<Shipment> shipments = new ArrayList<>();
    private static ClientController<Shipment> shipmentClientController = new ClientController<>();

    public void fetchAndSetShipmentsList() {
        Packet<Shipment> shipmentPacket = new Packet<>(6);
        try {
            shipments = shipmentClientController.get(shipmentPacket).getItems();
        } catch (NullPointerException e) {
            System.err.println("Items List is null");
        }
        fetchId();
    }

    public void fetchId() {
        ID_GENERATOR = new AtomicInteger(shipments.size());
    }

    public boolean addShipment(Shipment shp) {
        Shipment shipment = new Shipment(ID_GENERATOR, shp.orders(), shp.maxWeight(), shp.shippingStatus(), shp.basePort(), shp.destinationPort());
        shipments.add(shipment);
        Packet<Shipment> shipmentPacket = new Packet<>(5);
        shipmentPacket.setItems(shipments);
        return shipmentClientController.post(shipmentPacket);
    }
}


