package org.example.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Manager {
    private long manager_id;
    private String manager_name;
    private int years_of_experience;

    public Manager(String manager_name, int years_of_experience) {
        this.manager_name = manager_name;
        this.years_of_experience = years_of_experience;
    }
}
