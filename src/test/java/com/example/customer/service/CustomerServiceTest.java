package com.example.customer.service;

import com.example.customer.repository.CustomerRepository;
import org.junit.runner.RunWith;


import com.example.customer.model.Customer;
import org.junit.Assert;
import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by solderedmachd on 8/4/17.
 */

@RunWith(SpringRunner.class)
@SpringBootTest

public class CustomerServiceTest {

    @Autowired
    CustomerRepository customerRepository;

    @Test
    public void testAddGet() {
        String firstName = "Bill";
        String lastName = "Green";
        String phone = "999-9999";
        String email = "all@nines.com";
        Customer newCustomer = new Customer();
        newCustomer.setFirstName(firstName);
        newCustomer.setLastName(lastName);
        newCustomer.setEmail(email);
        newCustomer.setPhone(phone);
        customerRepository.save(newCustomer);

        List<Customer> customers = customerRepository.findAll();

        Boolean customerFind = customers.isEmpty();
        Assert.assertFalse(customerFind);
    }
}
    

