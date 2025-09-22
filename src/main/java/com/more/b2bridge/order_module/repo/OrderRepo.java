package com.more.b2bridge.order_module.repo;

import com.more.b2bridge.order_module.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
