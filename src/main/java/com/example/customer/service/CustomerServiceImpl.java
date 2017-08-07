package com.example.customer.service;

import com.example.customer.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import com.example.customer.model.Customer;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by solderedmachd on 8/4/17.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Transactional
    @Override
    public void add(Customer customer) {
        customerRepository.save(customer);
    }
    @Override
    public Customer getById(int id) {
        return customerRepository.findOne(id);
    }
    @Override
    public List<Customer> get() {
        return customerRepository.findAll();
    }

    @Transactional
    @Override
    public void update(Customer customer) {
        customerRepository.save(customer);
    }

    @Transactional
    @Override
    public void delete(int id) {
        customerRepository.delete(id);
    }

}