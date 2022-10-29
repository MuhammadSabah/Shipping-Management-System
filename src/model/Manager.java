package model;

import java.io.Serializable;
import java.sql.Date;

public record Manager(String id,
                      String password,
                      String firstName,
                      String lastName,
                      int age,
                      char gender,
                      Date dateOfBrith,
                      double yearlySalary) implements Serializable {

    public Manager {
    }
}