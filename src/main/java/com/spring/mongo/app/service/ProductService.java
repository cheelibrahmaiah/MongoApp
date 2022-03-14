package com.spring.mongo.app.service;

import com.spring.mongo.app.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product saveProduct(Product product);
    Optional<List<Product>> findProducts();
    Optional<Product> findProduct(Long id);
}
