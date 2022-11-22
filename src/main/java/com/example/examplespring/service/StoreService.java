package com.example.examplespring.service;

import com.example.examplespring.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Service
@SessionScope
public class StoreService {
    private final List<Product> productList = new ArrayList<>();

    public void addProducts(int... ints) {
        for (int i : ints) {
            productList.add(new Product(i));
        }
    }

    public Collection<Product> getProducts() {
        return this.productList;
    }
}
