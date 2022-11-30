package model.DAO;

import controller.client.ClientController;
import model.Item;
import model.Packet;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ItemData {
    private static AtomicInteger ID_GENERATOR;
    private static List<Item> items = new ArrayList<>();
    private static ClientController<Item> itemClientController = new ClientController<>();

    public void fetchAndSetItemsList() {
        Packet<Item> itemPacket = new Packet<>(6);
        try {
            items = itemClientController.get(itemPacket).getItems();
        } catch (NullPointerException e) {
            System.err.println("Items List is null");
        }
        fetchId();
    }

    public void fetchId() {
        ID_GENERATOR = new AtomicInteger(items.size());
    }

    public boolean addItem(Item itm) {
        Item item = new Item(itm.id(), itm.name(), itm.weight());
        items.add(item);
        Packet<Item> itemPacket = new Packet<>(5);
        itemPacket.setItems(items);
        return itemClientController.post(itemPacket);
    }
}


