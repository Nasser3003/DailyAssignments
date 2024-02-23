package com.skillstorm.grocerygrabber.services;

import com.skillstorm.grocerygrabber.models.GroceryItem;
import com.skillstorm.grocerygrabber.repositories.GroceryItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroceryItemServiceImpl implements GroceryItemService {

    private final GroceryItemRepository groceryItemRepo;
    @Autowired
    public GroceryItemServiceImpl(GroceryItemRepository groceryItemRepo) {
        this.groceryItemRepo = groceryItemRepo;
    }

    @Override
    public List<GroceryItem> findAll() {
        return groceryItemRepo.findAll();
    }

    @Override
    public GroceryItem findById(long id) {
        return groceryItemRepo.getReferenceById(id);
    }

    @Override
    public GroceryItem save(GroceryItem groceryItem) {
        return groceryItemRepo.save(groceryItem);
    }

}