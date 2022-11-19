package model;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

public record Item(AtomicInteger id,
                   String name,
                   double weight) implements Serializable {

    public Item {
    }
}
