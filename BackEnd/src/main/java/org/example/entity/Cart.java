package org.example.entity;
import org.example.entity.menu.Sandwich;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


@AllArgsConstructor
@Data
@ToString
@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long cart_id;
    private long customer_id;
    private long employee_id;
    private double cost_sum;
    private Timestamp cart_date;

    public Cart(long customer_id, long employee_id, int cost_sum, Timestamp cart_date) {
        this.customer_id = customer_id;
        this.employee_id = employee_id;
        this.cost_sum = cost_sum;
        this.cart_date = cart_date;
    }

    @OneToMany(targetEntity = Sandwich.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "cart_fk", referencedColumnName = "cart_id")
    private Set<Sandwich> sandwiches;

    public Cart() {this.sandwiches = new HashSet<>();}

    public void addSandwich(Sandwich sandwich) {this.sandwiches.add(sandwich);}
    public void removeSandwich(Sandwich sandwich) {this.sandwiches.remove(sandwich);}
}
