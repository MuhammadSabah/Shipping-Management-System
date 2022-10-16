package model;

public record Employee(int employeeID,
                       String firstName,
                       String middleName,
                       String lastName,
                       String address,
                       int age,
                       char gender,
                       String phoneNumber,
                       String email,
                       int yearlySalary) {
    public Employee {
        if (firstName.length() < 3 || lastName.length() < 3 || middleName.length() < 3) {
            throw new IllegalArgumentException("Employee name is too short");
        }
    }

    public int employeeID() {
        return employeeID;
    }

    public String firstName() {
        return firstName;
    }

    public String middleName() {
        return middleName;
    }

    public String lastName() {
        return lastName;
    }

    public String address() {
        return address;
    }

    public int age() {
        return age;
    }

    public char gender() {
        return gender;
    }

    public String phoneNumber() {
        return phoneNumber;
    }

    public String email() {
        return email;
    }

    public int yearlySalary() {
        return yearlySalary;
    }
}


//
//    public void listPendingOrders() {
//    }
//
//    public void availableOrders() {
//    }
//
//    public void receivePaymentFromCustomer() {
//    }
//
//    public void removeOrders() {
//    }
//
//    public void searchForOrders() {
//    }
