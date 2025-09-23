package com.more.b2bridge.order_module.repo;

import com.more.b2bridge.order_module.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepo extends JpaRepository<OrderItem, Long> {
}
