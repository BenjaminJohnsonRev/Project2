package org.example.controller;

import org.example.entity.Customer;
import org.example.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping
    public Customer add_customer(@RequestBody Customer customer){
        return customerService.add_customer(customer);
    }

    @GetMapping
    public List<Customer> get_all_customers(){
        return customerService.get_all_customers();
    }

    @GetMapping("/{id}")
    public Customer get_customer_by_id(@PathVariable("id") long id){
        return customerService.get_customer_by_id(id);
    }

    @PutMapping("/{id}")
    public Customer update_customer(@RequestBody Customer customer, @PathVariable("id") long id){
        return customerService.update_customer(customer, id);
    }

    @DeleteMapping("/{id_to_delete}")
    public void delete_customer(@PathVariable("id_to_delete") Long id){
        customerService.delete_customer(id);
    }

}
