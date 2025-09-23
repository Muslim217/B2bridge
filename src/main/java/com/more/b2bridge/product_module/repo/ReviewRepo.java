package com.more.b2bridge.product_module.repo;

import com.more.b2bridge.product_module.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepo extends JpaRepository<Review, Long> {
}
