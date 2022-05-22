package org.example.data;

import org.example.entity.Customer;

import java.sql.ResultSet;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao {
    @Override
    public void insert(Customer customer) {

    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }

    @Override
    public boolean delete(int idData) {
        return false;
    }

    @Override
    public Customer getCustomer(ResultSet resultSet) {
        return null;
    }

    @Override
    public Customer getCustomerById(int idData) {
        return null;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return null;
    }
}
