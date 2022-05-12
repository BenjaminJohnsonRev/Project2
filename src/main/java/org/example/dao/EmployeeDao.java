package com.megabites.data;

import com.megabites.entity.Employee;

import java.sql.ResultSet;
import java.util.List;

public interface EmployeeDao {
    public void insert(Employee employee);
    public Employee update(Employee employee);
    public boolean delete(int idData);
    public Employee getEmployee(ResultSet resultSet);
    public Employee getEmployeeById(int idData);
    public List<Employee> getAllEmployees();
}
