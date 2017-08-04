package com.example.customer.repository;

import com.example.customer.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by solderedmachd on 8/4/17.
 */

@Repository
public interface CustomerRepository {
    void add(Customer customer);
    Customer getById(int id);
    List<Customer> get();
    void update(Customer customer);
    void delete(int id);
}
