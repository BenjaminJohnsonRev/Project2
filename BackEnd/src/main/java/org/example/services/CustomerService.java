package org.example.services;

import org.example.dao.CustomerRepository;
import org.example.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public Customer add_customer(Customer customer){
        customerRepository.save(customer);
        System.out.println("Customer: " + customer.toString());
        return customer;
    }

    public List<Customer> get_all_customers(){
        return customerRepository.findAll();
    }

    public Customer get_customer_by_id(Long id){
        return customerRepository.getById(id);
    }

    public Customer update_customer(Customer customer, Long id){
        Customer customerDB = customerRepository.findById(id).get();
        customerDB.setUsername(customer.getUsername());
        customerDB.setPassword(customer.getPassword());
        customerRepository.save(customerDB);
        return customerDB;
    }

    public void delete_customer(Long id){
        customerRepository.deleteById(id);
    }
}




/*
//this is an example from Rory's demo, I kept it just in case it could be useful later
    public List<Customer> get_customers_custom(String flag){
        switch(flag){
            case "new":
                return customerRepository.findByYearGreaterThan(2000);
            case "old":
                return customerRepository.findByYearLessThan(2001);
            case "suez":
                return customerRepository.findByAuthorName("authorrrr");
            default:
                return get_all_customers();
        }
    }

 */