package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Manager {
    @Id
    @GeneratedValue
    private long manager_id;
    @Column
    private String manager_name;
    @Column
    private int years_of_experience;

    public Manager(String manager_name, int years_of_experience) {
        this.manager_name = manager_name;
        this.years_of_experience = years_of_experience;
    }
}
