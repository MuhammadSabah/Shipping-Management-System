package controller;

import model.Item;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class ItemController {
    private final ArrayList<Item> itemsList = new ArrayList<>();

    public void addItem(Item item) {
        if (!itemsList.contains(item)) {
            itemsList.add(item);
        }
    }

    public void removeItem(int id, int orderID) {
        itemsList.removeIf((Item item) -> item.id() == id);
    }

    public Item get(int id) {
        for (Item item : itemsList) {
            if (item.id() == id) {
                return item;
            }
        }
        return null;
    }

    public ArrayList<Item> getAllItems() {
        return itemsList;
    }

    public void updateItem() {
    }
}
