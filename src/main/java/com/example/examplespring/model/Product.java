package com.example.examplespring.model;


public class Product {
    private final int id;

    public Product(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                '}';
    }
}
