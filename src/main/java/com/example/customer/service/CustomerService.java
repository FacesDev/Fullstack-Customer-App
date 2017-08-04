package com.example.customer.service;

import com.example.customer.model.Customer;

import java.util.List;

/**
 * Created by solderedmachd on 8/4/17.
 */
public interface CustomerService {
    void add(Customer person);
    Customer getById(int id);
    List<Customer> get();
    void update(Customer customer);
    void delete(int id);
}
