package org.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

@CrossOrigin(origins="*")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employee_id;

    @Column
    private long manager_id;
    @Column
    private String employee_name;
    @Column
    private int years_of_experience;

    @OneToMany(targetEntity = Cart.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_fk", referencedColumnName = "employee_id")
    private List<Cart> carts;

    public Employee(long manager_id, String employee_name, int years_of_experience) {
        this.manager_id = manager_id;
        this.employee_name = employee_name;
        this.years_of_experience = years_of_experience;
    }

    public Employee(long employee_id, long manager_id, String employee_name, int years_of_experience) {
        this.employee_id = employee_id;
        this.manager_id = manager_id;
        this.employee_name = employee_name;
        this.years_of_experience = years_of_experience;
    }

    public void addCart(Cart cart) {this.carts.add(cart);}
    public void removeCart(Cart cart) {this.carts.remove(cart);}
}
