package com.example.examplespring.service;

import com.example.examplespring.model.Product;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class StoreService {
    private final Map<Integer, Product> productMap = new HashMap<>();

    public void addProducts(int... ints) {
        for (int i : ints) {
            productMap.put(i, new Product(i));
        }
    }

    public Collection<Product> getProducts() {
        return this.productMap.values();
    }
}
