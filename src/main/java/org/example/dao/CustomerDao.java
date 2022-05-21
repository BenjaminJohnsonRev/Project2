package com.megabites.data;

import com.megabites.entity.Customer;

import java.sql.ResultSet;
import java.util.List;

public interface CustomerDao {
    public void insert(Customer customer);
    public Customer update(Customer customer);
    public boolean delete(int idData);
    public Customer getCustomer(ResultSet resultSet);
    public Customer getCustomerById(int idData);
    public List<Customer> getAllCustomers();
}
