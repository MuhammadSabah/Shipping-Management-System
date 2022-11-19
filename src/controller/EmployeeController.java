package controller;

import model.Employee;

import java.util.ArrayList;
import java.util.Locale;
import java.util.stream.Collectors;

public class EmployeeController {
    private final ArrayList<Employee> employees = new ArrayList<>();
    private static Employee authenticatedEmployee;
//    EmployeeData employeeData = new EmployeeData();

    public boolean authenticateEmployee(String userName, String password) {
        for (Employee employee : employeeData.getEmployees()) {
            if ((employee.username().equals(userName.toLowerCase())) && (employee.password().equals(password))) {
                System.out.println("---- Employee successfully authenticated! ----");
                authenticatedEmployee = employee;
                return true;
            }
        }
        return false;
    }

    public boolean isEmployeeExist(String username) {
        return employeeData.getEmployees().stream().anyMatch(employee -> employee.username().equals(username));
    }

    public static Employee getAuthenticatedEmployee() {
        return authenticatedEmployee;
    }

    public void addEmployee(Employee employee) {
        if (!employees.contains(employee)) {
            employees.add(employee);
        }
    }

    public void removeEmployee(int id) {
        employees.removeIf((Employee employee) -> employee.id() == id);
    }

    public Employee getEmployee(int id) {
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

    public ArrayList<Employee> searchByFirstName(String fName) {
        return (ArrayList<Employee>) employees.stream()
                .filter((Employee employee) -> employee.firstName().contains(fName))
                .collect(Collectors.toList());
    }

    public ArrayList<Employee> searchByGender(char g) {
        return (ArrayList<Employee>) employees.stream()
                .filter((Employee employee) -> employee.gender() == g)
                .collect(Collectors.toList());
    }

}




