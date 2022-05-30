package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;

@CrossOrigin(origins="*")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long manager_id;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String first_name;
    @Column
    private String last_name;
    @Column
    private int years_of_experience;

    public Manager(String username, String password, String first_name, String last_name, int years_of_experience) {
        this.username = username;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.years_of_experience = years_of_experience;
    }
}
