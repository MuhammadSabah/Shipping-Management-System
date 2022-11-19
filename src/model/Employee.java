package model;

import java.io.Serializable;

public record Employee(int id,
                       String username,
                       String password,
                       String address,
                       int age,
                       char gender,
                       String phoneNumber,
                       String email,
                       double yearlySalary) implements Serializable {
    public Employee {
        if (username.length() < 3) {
            throw new IllegalArgumentException("Employee name is too short");
        }
    }
}



