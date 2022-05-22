package org.example.controller;
import org.example.entity.Employee;
import org.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Employee add_employee(@RequestBody Employee employee){
        return employeeService.add_employee(employee);
    }

    @GetMapping("/get")
    public List<Employee> get_all_employees(){
        return employeeService.get_all_employees();
    }

    @GetMapping("/get/{id}")
    public Employee get_employee_by_id(@PathVariable("id") long id){
        return employeeService.get_employee_by_id(id);
    }

    @PutMapping("/update/{id}")
    public Employee update_employee(@RequestBody Employee employee, @PathVariable("id") long id){
        return employeeService.update_employee(employee, id);
    }

    @DeleteMapping("/delete/{id_to_delete}")
    public void delete_employee(@PathVariable("id_to_delete") Long id){
        employeeService.delete_employee(id);
    }

}
