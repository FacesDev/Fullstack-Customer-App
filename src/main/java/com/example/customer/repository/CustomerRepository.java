package com.example.customer.repository;

import com.example.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by solderedmachd on 8/4/17.
 */


public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
