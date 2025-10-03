package com.more.b2bridge.order_module.repo;

import com.more.b2bridge.order_module.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepo extends JpaRepository<CartItem, Long> {
}
