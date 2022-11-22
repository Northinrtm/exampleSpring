package com.example.examplespring.controller;

import com.example.examplespring.model.Product;
import com.example.examplespring.service.StoreService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping(value = "/store/order/add")
    public void addS(@RequestParam int... ints) {
        this.storeService.addProducts(ints);
    }

    @GetMapping(value = "/store/order/get")
    public Collection<Product> getProducts() {
        return this.storeService.getProducts();
    }
}
