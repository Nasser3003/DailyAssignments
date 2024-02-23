package com.skillstorm.grocerygrabber.repositories;

import com.skillstorm.grocerygrabber.models.GroceryItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroceryItemRepository extends JpaRepository<GroceryItem, Long> {
}