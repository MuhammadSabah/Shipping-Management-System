package model.DAO;

import model.Employee;
import java.util.List;

public interface EmployeeDao {

    List<Employee> retrieveAll();
    Employee findById(int id);
    Employee findByName(String name);
    boolean insertEmployee(Employee employee);
    void deleteEmployeeByID(int id);
    void deleteEmployeeByName(String Username);

}
