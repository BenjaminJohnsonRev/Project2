package com.megabites.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Employee {
    private long employee_id;
    private long manager_id;
    private String employee_name;
    private int years_of_experience;

    public Employee(long manager_id, String employee_name, int years_of_experience) {
        this.manager_id = manager_id;
        this.employee_name = employee_name;
        this.years_of_experience = years_of_experience;
    }
}
