package com.more.b2bridge.product_module.repo;

import com.more.b2bridge.product_module.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}
