package com.megabites.data;

import com.megabites.entity.Order;

import java.sql.ResultSet;
import java.util.List;

public interface OrderDao {
    public void insert(Order order);
    public Order update(Order order);
    public boolean delete(int idData);
    public Order getOrder(ResultSet resultSet);
    public Order getOrderById(int idData);
    public List<Order> getAllOrders();
}
