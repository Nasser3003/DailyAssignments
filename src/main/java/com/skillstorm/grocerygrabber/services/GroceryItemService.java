package com.skillstorm.grocerygrabber.services;

import com.skillstorm.grocerygrabber.models.GroceryItem;

import java.util.List;

public interface GroceryItemService {
    List<GroceryItem> findAll();

    GroceryItem findById(long id);

    GroceryItem save(GroceryItem customer);
}
