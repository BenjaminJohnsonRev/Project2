package org.example.entity;
import org.example.entity.menu.Sandwich;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

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
    /*attempted solutions:
    using @Column(name="datecreated", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    using @Generated(GenerationTime.INSERT)
    using @DynamicInsert
    defining cart_date as a Date
    importing util.Timestamp, util.Date, sql.Timestamp, sql.Date
    dropping cart cascade, and restarting server each time one these changes are made
    */
    private Timestamp cart_date;

    public Cart(long customer_id, long employee_id, int cost_sum) {
        this.customer_id = customer_id;
        this.employee_id = employee_id;
        this.cost_sum = cost_sum;
        this.cart_date = new Timestamp(System.currentTimeMillis());
        System.out.println(cart_date);
    }

    @OneToMany(targetEntity = Sandwich.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "cart_fk", referencedColumnName = "cart_id")
    private Set<Sandwich> sandwiches;

    public Cart() {this.sandwiches = new HashSet<>();
        this.cart_date = new Timestamp(System.currentTimeMillis());
        System.out.println(cart_date);}

    public void addSandwich(Sandwich sandwich) {this.sandwiches.add(sandwich);}
}
