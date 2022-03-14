package com.spring.mongo.app.service.impl;

import com.spring.mongo.app.entity.Product;
import com.spring.mongo.app.repository.ProductRepository;
import com.spring.mongo.app.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        product.setCreatedDate(LocalDateTime.now());
        return productRepository.insert(product);
    }

    @Override
    public Optional<List<Product>> findProducts() {
        return Optional.empty();
    }

    @Override
    public Optional<Product> findProduct(Long id) {
        return Optional.empty();
    }
}
