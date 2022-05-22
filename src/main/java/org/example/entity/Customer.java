package org.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Customer {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String first_name;
    @Column
    private String last_name;
    @Column
    private boolean banned;

    public Customer(String username, String password, String first_name, String last_name, boolean banned){
        this.username = username;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.banned = banned;
    }
}
