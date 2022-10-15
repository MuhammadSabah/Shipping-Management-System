package model;

import java.sql.Date;
import java.util.Objects;

class Manager implements ManagerInterface {
    private String ManagerID;
    private String ManagerPassword;
    private String ManagerFirstName;
    private String ManagerLastName;
    private int age;
    private char gender;
    private Date DateOfBirth;

    public Manager() {

    }

    public Manager(String ManagerID, String managerPassword, String managerFirstName, String managerLastName, int age, char gender, int year, int month, int day) {
        this.ManagerID = ManagerID;
        this.ManagerPassword = managerPassword;
        this.ManagerFirstName = managerFirstName;
        this.ManagerLastName = managerLastName;
        this.age = age;
        this.gender = gender;
        setDateOfBirth(year, month, day);
    }

    public void setDateOfBirth(int year, int month, int day) {
        Date dob = new Date(year, month, day);
        this.DateOfBirth = dob;
    }

    @Override
    public void addEmployee() {
    }

    @Override
    public void removeEmployee() {
    }

    @Override
    public void listEmployees() {
    }

    @Override
    public void searchEmployees() {
    }

    @Override
    public void addContainer() {
    }

    @Override
    public void editContainerInfo() {
    }

    @Override
    public void removeContainer() {
    }

    @Override
    public void listContainer() {
    }

    @Override
    public void searchContainers() {
    }

    @Override
    public void searchOrders() {
    }

    @Override
    public void listOrders() {
    }

    public String getManagerID() {
        return ManagerID;
    }

    public void setManagerID(String managerID) {
        ManagerID = managerID;
    }

    public String getManagerPassword() {
        return ManagerPassword;
    }

    public void setManagerPassword(String managerPassword) {
        ManagerPassword = managerPassword;
    }

    public String getManagerFirstName() {
        return ManagerFirstName;
    }

    public void setManagerFirstName(String managerFirstName) {
        ManagerFirstName = managerFirstName;
    }

    public String getManagerLastName() {
        return ManagerLastName;
    }

    public void setManagerLastName(String managerLastName) {
        ManagerLastName = managerLastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    // Used for comparing instance members.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager)) return false;
        Manager manager = (Manager) o;
        return getAge() == manager.getAge() && getGender() == manager.getGender() && getManagerID().equals(manager.getManagerID()) && getManagerPassword().equals(manager.getManagerPassword()) && getManagerFirstName().equals(manager.getManagerFirstName()) && getManagerLastName().equals(manager.getManagerLastName()) && getDateOfBirth().equals(manager.getDateOfBirth());
    }

    // A hashcode is a number generated from any object. This is what allows objects to be stored/retrieved quickly in
    @Override
    public int hashCode() {
        return Objects.hash(getManagerID(), getManagerPassword(), getManagerFirstName(), getManagerLastName(), getAge(), getGender(), getDateOfBirth());
    }
}