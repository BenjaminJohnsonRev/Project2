package org.example.entity;
import org.example.entity.menu.Sandwich;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@CrossOrigin(origins="*")
@AllArgsConstructor
@Data
@ToString
@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long cart_id;
    private long customer_id;
    private double cost_sum;
    private Timestamp cart_date;
    private boolean submitted;

    @OneToMany(targetEntity = Sandwich.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "cart_fk", referencedColumnName = "cart_id")
    private List<Sandwich> sandwiches;


    public Cart(long customer_id, double cost_sum) {
        this.customer_id = customer_id;
        this.cost_sum = cost_sum;
        this.cart_date = new Timestamp(System.currentTimeMillis());
        System.out.println(cart_date);
        this.submitted = false;
        this.sandwiches = new ArrayList<>();
    }

    public Cart(long cart_id, long customer_id, double cost_sum, Timestamp cart_date,boolean submitted) {
        this.cart_id = cart_id;
        this.customer_id = customer_id;
        this.cost_sum = cost_sum;
        this.cart_date = cart_date;
        this.submitted = submitted;

        this.sandwiches = new ArrayList<>();
    }

    public Cart() {this.sandwiches = new ArrayList<>();
        this.cart_date = new Timestamp(System.currentTimeMillis());
        System.out.println(cart_date);}


    public void addSandwich(Sandwich sandwich) {this.sandwiches.add(sandwich);}
    public void removeSandwich(Sandwich sandwich) {this.sandwiches.remove(sandwich);}
}
