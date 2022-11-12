package controller;

import model.Employee;
import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeController {
    private final ArrayList<Employee> employees = new ArrayList<>();

    // OR
    // private HashMap<Integer, Employee> employeesHash;

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee() {
    }

    public Employee get() {
        return null;
    }

    public void getAll() {
    }

    public void searchEmployee() {
    }
}




