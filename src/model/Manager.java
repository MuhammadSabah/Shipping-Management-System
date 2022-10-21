package model;

import java.sql.Date;

public record Manager(String ManagerID,
                      String managerPassword,
                      String managerFirstName,
                      String managerLastName,
                      int age,
                      char gender,
                      int year,
                      int month,
                      int day,
                      Date dateOfBrith) {

    public Manager {
    }
}