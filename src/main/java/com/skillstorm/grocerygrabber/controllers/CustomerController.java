package com.skillstorm.grocerygrabber.controllers;

import com.skillstorm.grocerygrabber.models.Customer;
import com.skillstorm.grocerygrabber.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private CustomerService service;

    @Autowired
    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping
    public List<Customer> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Customer findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Customer save(@RequestBody Customer customer) {
        return service.save(customer);
    }

}