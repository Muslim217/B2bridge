package com.more.b2bridge.product_module.repo;

import com.more.b2bridge.product_module.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
