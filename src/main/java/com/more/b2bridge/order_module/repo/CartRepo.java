package com.more.b2bridge.order_module.repo;

import com.more.b2bridge.order_module.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepo extends JpaRepository<Cart, Long> {
}
