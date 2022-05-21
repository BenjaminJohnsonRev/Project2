package com.example.project2.services;

import com.example.project2.entity.user.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    public Employee add_employee(Employee employee){
        System.out.println("Employee: " + employee.toString());
        return employee;
    }

    public List<Employee> get_all_employees(){
        Employee employee1 = new Employee(1l, "name1", 2);
        Employee employee2 = new Employee(1l, "name2", 3);
        Employee employee3 = new Employee(1l, "name3", 1);
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        return employees;
    }

    public Employee get_employee_by_id(Long id){
        System.out.println("passed in id: " + id);

        return new Employee(1l, "name1", 4);
    }

    public Employee update_employee(Employee employee, Long id){
        System.out.println("Updating employee with id: " + id);
        System.out.println(employee);
        return employee;
    }

    public void delete_employee(Long id){
        System.out.println("Deleting employee with id: " + id);

    }
}
