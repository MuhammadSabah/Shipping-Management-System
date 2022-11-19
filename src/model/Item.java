package model;

import java.io.Serializable;

public record Item(int id,
                   String name,
                   double weight) implements Serializable {

    public Item {
    }
}
