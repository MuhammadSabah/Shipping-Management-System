package model;

import java.sql.Date;

public record Manager(String id,
                      String password,
                      String firstName,
                      String lastName,
                      int age,
                      char gender,
                      Date dateOfBrith) {

    public Manager {
    }
}