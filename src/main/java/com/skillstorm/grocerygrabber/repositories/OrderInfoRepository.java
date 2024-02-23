package com.skillstorm.grocerygrabber.repositories;

import com.skillstorm.grocerygrabber.models.OrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderInfoRepository extends JpaRepository<OrderInfo, Long> {
}
