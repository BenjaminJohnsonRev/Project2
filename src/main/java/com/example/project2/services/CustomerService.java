package com.example.project2.services;

import com.example.project2.entity.user.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    public Customer add_customer(Customer customer){
        System.out.println("Customer: " + customer.toString());
        return customer;
    }

    public List<Customer> get_all_customers(){
        Customer customer1 = new Customer(1l, "name1", "password1");
        Customer customer2 = new Customer(2l, "name2", "password2");
        Customer customer3 = new Customer(3l, "name3", "password3");
        List<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        return customers;
    }

    public Customer get_customer_by_id(Long id){
        System.out.println("passed in id: " + id);

        return new Customer(1l, "name1", "password1");
    }

    public Customer update_customer(Customer customer, Long id){
        System.out.println("Updating customer with id: " + id);
        System.out.println(customer);
        return customer;
    }

    public void delete_customer(Long id){
        System.out.println("Deleting customer with id: " + id);

    }
}
