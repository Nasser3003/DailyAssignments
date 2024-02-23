package com.skillstorm.grocerygrabber.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.grocerygrabber.models.Customer;
import com.skillstorm.grocerygrabber.repositories.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepo;
    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepo) {
        this.customerRepo = customerRepo;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepo.findAll();
    }

    @Override
    public Customer findById(long id) {
        return customerRepo.getReferenceById(id);
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepo.save(customer);
    }

}