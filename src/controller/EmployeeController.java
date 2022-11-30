package controller;

import model.DAO.EmployeeDao;
import model.DAO.EmployeeDaoImpl;
import model.Employee;

import java.sql.SQLException;
import java.util.ArrayList;

import java.util.stream.Collectors;

public class EmployeeController {
    private final ArrayList<Employee> employees = new ArrayList<>();
    EmployeeDaoImpl employeeDao;
    {
        try {
            employeeDao = new EmployeeDaoImpl();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public boolean addEmployee(Employee employee) {
        return employeeDao.insertEmployee(employee);
    }
    public void removeEmployeeId(int id) {
        employeeDao.deleteEmployeeByID(id);
    }
    public void removeEmployeeUsername(String username) {
        employeeDao.deleteEmployeeByName(username);
    }
    public Employee searchForEmployee(String username) {
        return employeeDao.findByName(username);
    }
    public ArrayList<Employee> getAllEmployees() {
        return employeeDao.retrieveAll();
    }
}

