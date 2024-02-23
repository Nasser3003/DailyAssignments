package com.skillstorm.grocerygrabber.controllers;

import com.skillstorm.grocerygrabber.models.OrderInfo;
import com.skillstorm.grocerygrabber.services.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderInfoService service;

    @Autowired
    public OrderController(OrderInfoService service) {
        this.service = service;
    }

    @GetMapping
    public List<OrderInfo> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public OrderInfo findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public OrderInfo save(@RequestBody OrderInfo orderInfo) {
        return service.save(orderInfo);
    }
}
