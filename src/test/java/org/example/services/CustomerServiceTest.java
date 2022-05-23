package org.example.services;

import org.example.dao.CustomerRepository;
import org.example.entity.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

@DataJpaTest
class CustomerServiceTest {

    @Mock
    CustomerRepository customer_repository;

    @InjectMocks
    CustomerService customer_service;

    Customer test_customer1;
    Customer test_customer2;

    @BeforeEach
    public void setup(){
        test_customer1 = new Customer(1l, "tom_username", "tom_password", "tom", "mot", "tom@gmail.com", false);
        test_customer2 = new Customer(2l, "mat_username", "mat_password", "mat", "tam", "mat@gmail.com",false);
    }

    @Test
    void add_customer_test() {
        Customer savedCustomer1 = customer_service.add_customer(test_customer1);

        assertThat(savedCustomer1).isNotNull();
    }

    @Test
    void get_all_customers_test() {
        customer_service.add_customer(test_customer1);
        customer_service.add_customer(test_customer2);

        given(customer_repository.findAll()).willReturn(List.of(test_customer1,test_customer2));

        List<Customer> customer_list = customer_service.get_all_customers();

        assertThat(customer_list).isNotNull();
        assertThat(customer_list.size()).isEqualTo(2);
    }

    @Test
    void get_customer_by_id_test() {
        customer_service.add_customer(test_customer1);

        given(customer_repository.getById(test_customer1.getCustomer_id())).willReturn(test_customer1);

        assertThat(customer_service.get_customer_by_id(test_customer1.getCustomer_id())).isEqualTo(test_customer1);
    }

    @Test
    void delete_customer_test() {
        customer_service.add_customer(test_customer1);

        customer_service.delete_customer(test_customer1.getCustomer_id());

        Customer deleted_customer = customer_service.get_customer_by_id(test_customer1.getCustomer_id());
        assertThat(deleted_customer).isNull();
    }
}