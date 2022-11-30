package model.DAO;

import model.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class EmployeeDaoImpl implements EmployeeDao{

    private static AtomicInteger atomicInteger;
    private static final String URL = "jdbc:mysql://localhost:3306/shipping";
    private static final String USER = "root";
    private static final String PASS = "";
    Connection connection = DriverManager.getConnection(URL, USER, PASS);
    PreparedStatement statement;

    private static final String retrieveAll = "SELECT * FROM `EMPLOYEE`";
    private static final String findByID = "SELECT * FROM `EMPLOYEE` WHERE id LIKE ?";
    private static final String findByName = "SELECT * FROM `EMPLOYEE` WHERE username LIKE ?";
    private static final String addEmployeeFull = "INSERT INTO `employee`(`id`, `username`, `password`, `age`, `gender`, `number`, `email`) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String deleteEmployeeByID = "DELETE FROM `employee` WHERE id like ?";
    private static final String deleteEmployeeByUsername = "DELETE FROM `employee` WHERE username like ?";

    public EmployeeDaoImpl() throws SQLException {
    }

    @Override
    public ArrayList<Employee> retrieveAll() {
        ArrayList<Employee> employeeList = null;
        try {
            statement = connection.prepareStatement(retrieveAll);
            ResultSet resultSet = statement.executeQuery();
            employeeList = new ArrayList<Employee>(resultSet.getRow());
                while (resultSet.next()) {
                    employeeList.add(new Employee(resultSet.getInt(1),
                            resultSet.getString(2),
                            resultSet.getString(3),
                            resultSet.getString(4),
                            resultSet.getInt(5),
                            resultSet.getString(6),
                            resultSet.getInt(7),
                            resultSet.getString(8)));
                }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return employeeList;
    }

    @Override
    public Employee findById(int id) {
        Employee employee = null;
        try {
        statement = connection.prepareStatement(findByID);
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                employee = new Employee(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4),
                        resultSet.getInt(5), resultSet.getString(6),
                        resultSet.getInt(7), resultSet.getString(8));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return employee;
    }

    @Override
    public Employee findByName(String name) {
        Employee employee = null;
        try {
            statement = connection.prepareStatement(findByName);
            statement.setString(1, name);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                employee = new Employee(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4),
                        resultSet.getInt(5), resultSet.getString(6),
                        resultSet.getInt(7), resultSet.getString(8));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return employee;
    }

    @Override
    public boolean insertEmployee(Employee employee) {
        boolean added = false;
        try {
            statement = connection.prepareStatement(addEmployeeFull);
            statement.setInt(1, employee.id());
            statement.setString(2, employee.username());
            statement.setString(3, employee.password());
            statement.setString(4, employee.address());
            statement.setInt(5, employee.age());
            statement.setString(6, String.valueOf(employee.gender()));
            statement.setInt(7, employee.phoneNumber());
            statement.setString(8, employee.email());
            statement.executeUpdate();
            added = true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return added;
    }

    @Override
    public void deleteEmployeeByID(int id) {
        try {
            statement = connection.prepareStatement(deleteEmployeeByID);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void deleteEmployeeByName(String username) {
        try {
            statement = connection.prepareStatement(deleteEmployeeByUsername);
            statement.setString(1, username);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
