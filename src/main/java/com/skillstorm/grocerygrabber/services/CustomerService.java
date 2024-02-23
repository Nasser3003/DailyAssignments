package com.skillstorm.grocerygrabber.services;

import com.skillstorm.grocerygrabber.models.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    Customer findById(long id);

    Customer save(Customer customer);
}
