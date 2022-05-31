package org.example.services;

import org.example.dao.CustomerRepository;
import org.example.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@CrossOrigin(origins="*")
@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public Customer add_customer(Customer customer){
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
    public Customer ban_hammer(Customer customer){
        customer.setBanned(true);
        return customerRepository.save(customer);
    }

    public List<Customer> get_all_customers(){
        return customerRepository.findAll();
    }

    public Customer get_customer_by_id(Long id){
        return customerRepository.getById(id);
    }

    public Customer update_customer(Customer customer){
        Customer customerDB = customerRepository.getById(customer.getCustomer_id());
        customerDB.setFirst_name(customer.getFirst_name());
        customerDB.setLast_name(customer.getLast_name());
        customerDB.setEmail(customer.getEmail());
        customerDB.setUsername(customer.getUsername());
        customerDB.setPassword(customer.getPassword());
        customerRepository.save(customer);
        return customer;
    }


    public Customer authenticate(String username, String password){
        Customer customer = customerRepository.getByUsernameAndPassword(username, password).orElse(null);

        if(customer == null || customer.isBanned()){
            customer = null;
        }
        return customer;
    }

    public void delete_customer(Long id){
        customerRepository.deleteById(id);
    }
}

