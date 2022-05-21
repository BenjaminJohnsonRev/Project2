package com.megabites.data;

import com.megabites.entity.Order;

import java.sql.ResultSet;
import java.util.List;

public class OrderDaoImpl implements OrderDao{

    @Override
    public void insert(Order order) {

    }

    @Override
    public Order update(Order order) {
        return null;
    }

    @Override
    public boolean delete(int idData) {
        return false;
    }

    @Override
    public Order getOrder(ResultSet resultSet) {
        return null;
    }

    @Override
    public Order getOrderById(int idData) {
        return null;
    }

    @Override
    public List<Order> getAllOrders() {
        return null;
    }
}
