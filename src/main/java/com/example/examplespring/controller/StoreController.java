package com.example.examplespring.controller;

import com.example.examplespring.model.Product;
import com.example.examplespring.service.StoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @PostMapping("/store/order/add")
    public void addS(@RequestParam int... ints){
        this.storeService.addProducts(ints);
    }

    @GetMapping("/store/order/get")
    public Collection<Product> getProducts() {
        return this.storeService.getProducts();
    }
}
