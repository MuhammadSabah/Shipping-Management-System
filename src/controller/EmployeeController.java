package controller;

import model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class EmployeeController {
    private final ArrayList<Employee> employees = new ArrayList<>();

    // OR
    // private HashMap<Integer, Employee> employeesHash;

    public void add(Employee employee) {
        if (!employees.contains(employee)) {
            employees.add(employee);
        }
    }

    public void remove(int id) {
        employees.removeIf((Employee employee) -> employee.id() == id);
    }

    public Employee get(int id) {
        for (Employee emp : employees) {
            if (emp.id() == id) {
                return emp;
            }
        }
        return null;
    }

    public ArrayList<Employee> getAll() {
        return employees;
    }

    public ArrayList<Employee> search(String fName) {
        return (ArrayList<Employee>) employees.stream()
                .filter((Employee employee) -> employee.firstName().contains(fName))
                .collect(Collectors.toList());
    }
}




