package model;

import java.util.Date;

public record Invoice(int id,
                      double price,
                      char currency,
                      Date date,
                      String description,
                      String method,
                      boolean status) {

}
