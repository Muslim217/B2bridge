package com.more.b2bridge.product_module.service;

import com.more.b2bridge.product_module.model.Product;
import com.more.b2bridge.product_module.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;

    public Optional<Product> getProduct(Long productId) {
       return repo.findById(productId);
    }

    public void createProduct(Product product) {
        repo.save(product);
    }

    public void deleteProduct(Long productId) {
        repo.deleteById(productId);
    }

    public void updateProduct(Product product) {
        repo.save(product);
    }
}
