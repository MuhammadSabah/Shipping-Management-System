package controller;

import model.Shipment;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class ShipmentController {
    private final ArrayList<Shipment> shipments = new ArrayList<>();

    public void addShipment(Shipment shipment) {
        if (!shipments.contains(shipment)) {
            shipments.add(shipment);
        }
    }

    public void removeShipment(int id) {
        shipments.removeIf((Shipment shipment) -> shipment.id() == id);
    }

    public Shipment getShipment(int id) {
        for (Shipment shipment : shipments) {
            if (shipment.id() == id) {
                return shipment;
            }
        }
        return null;
    }

    public ArrayList<Shipment> getAllShipments() {
        return shipments;
    }

    public ArrayList<Shipment> searchByBasePort(String basePort) {
        return (ArrayList<Shipment>) shipments.stream()
                .filter((Shipment shipment) -> shipment.basePort().contains(basePort))
                .collect(Collectors.toList());
    }

    public ArrayList<Shipment> searchByDestinationPort(String destinationPort) {
        return (ArrayList<Shipment>) shipments.stream()
                .filter((Shipment shipment) -> shipment.destinationPort().contains(destinationPort))
                .collect(Collectors.toList());
    }

    public ArrayList<Shipment> searchByMaxWeight(double maxWeight) {
        return (ArrayList<Shipment>) shipments.stream()
                .filter((Shipment shipment) -> shipment.maxWeight() == maxWeight)
                .collect(Collectors.toList());
    }
}
