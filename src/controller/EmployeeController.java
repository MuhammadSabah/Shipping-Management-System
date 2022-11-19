package controller;

import model.Employee;
import model.data.EmployeeData;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class EmployeeController {
    private final ArrayList<Employee> employees = new ArrayList<>();
    private static Employee authenticatedEmployee;
    EmployeeData employeeData = new EmployeeData();

    public boolean isEmployeeExist(String username) {
        return employeeData.getEmployees().stream().anyMatch(employee -> employee.username().equals(username));
    }

    public boolean authenticateEmployee(String userName, String password) {
        employeeData.fetchAndSetEmployees();
        for (Employee employee : employeeData.getEmployees()) {
            if ((employee.username().equals(userName.toLowerCase())) && (employee.password().equals(password))) {
                authenticatedEmployee = employee;
                return true;
            }
        }
        return false;
    }


    public boolean addEmployee(Employee employee) {
        if (!isEmployeeExist(employee.username())) {
            employees.add(employee);
            employeeData.addEmployee(employee);
            return true;
        }
        return false;
    }

    public void removeEmployee(AtomicInteger id) {
        employees.removeIf((Employee employee) -> Objects.equals(employee.id(), id));
    }

    public Employee getEmployee(AtomicInteger id) {
        for (Employee emp : employees) {
            if (emp.id() == id) {
                return emp;
            }
        }
        return null;
    }

    public ArrayList<Employee> getAllEmployee() {
        return employees;
    }

    public static Employee getAuthenticatedEmployee() {
        return authenticatedEmployee;
    }

    public ArrayList<Employee> searchByGender(char g) {
        return (ArrayList<Employee>) employees.stream()
                .filter((Employee employee) -> employee.gender() == g)
                .collect(Collectors.toList());
    }
}

