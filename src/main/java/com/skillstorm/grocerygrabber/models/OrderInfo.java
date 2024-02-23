package com.skillstorm.grocerygrabber.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class OrderInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderId;
    private LocalDateTime scheduledTime;
    @OneToMany
    private List<GroceryItem> groceryItems;
}
