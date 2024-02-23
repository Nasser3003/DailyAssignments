package com.skillstorm.grocerygrabber.services;

import com.skillstorm.grocerygrabber.models.OrderInfo;
import com.skillstorm.grocerygrabber.repositories.OrderInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderInfoServiceImpl implements OrderInfoService {

    private final OrderInfoRepository orderRepo;

    @Autowired
    public OrderInfoServiceImpl(OrderInfoRepository orderRepo) {
        this.orderRepo = orderRepo;
    }

    @Override
    public List<OrderInfo> findAll() {
        return orderRepo.findAll();
    }

    @Override
    public OrderInfo findById(long id) {
        return orderRepo.getReferenceById(id);
    }

    @Override
    public OrderInfo save(OrderInfo order) {
        return orderRepo.save(order);
    }

}