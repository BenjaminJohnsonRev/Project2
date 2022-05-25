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
        if (customer.getUsername() ==null || customer.getPassword() ==null){
            return null;
        } else {
            System.out.println("Customer: " + customer.toString());
            return customerRepository.save(customer);
        }
    }

//    public CustomerService(CustomerRepository customerRepository) {
//        this.customerRepository = customerRepository;
//    }

    public List<Customer> get_all_customers(){
        return customerRepository.findAll();
    }

    public Customer get_customer_by_id(Long id){
        return customerRepository.getById(id);
    }

    public Customer update_customer(Customer customer){
        return customerRepository.save(customer);
    }


    public Customer authenticate(String username, String password){
        return customerRepository.getByUsernameAndPassword(username, password).orElse(null);
    }

    public void delete_customer(Long id){
        customerRepository.deleteById(id);
    }
}

