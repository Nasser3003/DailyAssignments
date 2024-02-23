package com.skillstorm.grocerygrabber.controllers;

import com.skillstorm.grocerygrabber.models.GroceryItem;
import com.skillstorm.grocerygrabber.services.GroceryItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/groceries")
public class GroceryController {

    private final GroceryItemService service;

    @Autowired
    public GroceryController(GroceryItemService service) {
        this.service = service;
    }

    @GetMapping
    public List<GroceryItem> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public GroceryItem findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public GroceryItem save(@RequestBody GroceryItem groceryItem) {
        return service.save(groceryItem);
    }
}
