package model;

import java.io.Serializable;
import java.util.List;

// Packet is used for holding the data that we want to store.
public class Packet<T> implements Serializable {
    private List<T> items;
    private int message;

    public Packet(int msg) {
        this.message = msg;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public int getMessage() {
        return message;
    }

}
