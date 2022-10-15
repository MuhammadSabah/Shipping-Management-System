package model;

import java.util.Objects;

public record Employee(int employeeID, String firstName, String middleName, String lastName, String address,
                       int age, char gender, String phoneNumber,
                       String email, int managerID, int yearlySalary) {
    public Employee {
        if (employeeID < 0) {
            throw new IllegalArgumentException("Employee ID cannot be negative!");
        }
        if (firstName.length() < 3 || lastName.length() < 3 || middleName.length() < 3) {
            throw new IllegalArgumentException("Employee name is too short");
        }
    }

    public void listPendingOrders() {
    }

    public void availableOrders() {
    }

    public void receivePaymentFromCustomer() {

    }

    public void removeOrders() {

    }

    public void searchForOrders() {

    }

}



