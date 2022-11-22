package com.example.examplespring.model;


public class Product {
    private final int id;


    public Product(int i) {
        id = i;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                '}';
    }
}
