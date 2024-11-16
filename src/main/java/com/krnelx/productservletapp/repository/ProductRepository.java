package com.krnelx.productservletapp.repository;

import com.krnelx.productservletapp.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private final List<Product> products = new ArrayList<>();

    public ProductRepository() {
        for (int i = 1; i <= 10; i++) {
            products.add(new Product(i, "Product " + i, i * 10.0));
        }
    }

    public List<Product> getAllProducts() {
        return products;
    }
}
