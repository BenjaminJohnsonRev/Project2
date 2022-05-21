package com.megabites.service;
import com.megabites.entity.Order;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    public Order add_order(Order order){
        System.out.println("Order: " + order.toString());
        return order;
    }

    public List<Order> get_all_orders(){
        Order order1 = new Order(1l, 1l, 10, new Timestamp(System.currentTimeMillis()));
        Order order2 = new Order(2l, 1l, 10, new Timestamp(System.currentTimeMillis()));
        Order order3 = new Order(3l, 1l, 10, new Timestamp(System.currentTimeMillis()));

        List<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);

        return orders;
    }

    public Order get_order_by_id(Long id){
        System.out.println("passed in id: " + id);

        return new Order(1l, 1l, 10, new Timestamp(System.currentTimeMillis()));
    }

    public Order update_order(Order order, Long id){
        System.out.println("Updating order with id: " + id);
        System.out.println(order);
        return order;
    }

    public void delete_order(Long id){
        System.out.println("Deleting order with id: " + id);

    }
}
