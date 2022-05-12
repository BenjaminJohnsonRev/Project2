package com.megabites.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Order {
    private long order_id;
    private long customer_id;
    private long employee_id;
    private int cost_sum;
    private Timestamp order_date;

    public Order(long customer_id, long employee_id, int cost_sum, Timestamp order_date) {
        this.customer_id = customer_id;
        this.employee_id = employee_id;
        this.cost_sum = cost_sum;
        this.order_date = order_date;
    }
}
