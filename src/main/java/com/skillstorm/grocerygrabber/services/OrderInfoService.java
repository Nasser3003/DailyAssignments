package com.skillstorm.grocerygrabber.services;

import com.skillstorm.grocerygrabber.models.OrderInfo;

import java.util.List;

public interface OrderInfoService {
    List<OrderInfo> findAll();

    OrderInfo findById(long id);

    OrderInfo save(OrderInfo customer);
}
