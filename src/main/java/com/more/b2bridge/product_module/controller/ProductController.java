package com.more.b2bridge.product_module.controller;

import com.more.b2bridge.product_module.model.Product;
import com.more.b2bridge.product_module.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping
    public Optional<Product> getProduct(Long productId) {
        return service.getProduct(productId);
    }

    @PostMapping
    public void createProduct(@RequestBody Product product) {
        service.createProduct(product);
    }

    @DeleteMapping
    public void deleteProduct(Long productId) {
        service.deleteProduct(productId);
    }

    @PutMapping
    public void updateProduct(@RequestBody Product product) {
        service.updateProduct(product);
    }
}
