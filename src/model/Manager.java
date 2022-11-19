package model;

import java.io.Serializable;
import java.sql.Date;

public record Manager(int id,
                      String password,
                      String username,
                      int age,
                      char gender,
                      Date dateOfBrith,
                      double yearlySalary) implements Serializable {

    public Manager {
    }
}