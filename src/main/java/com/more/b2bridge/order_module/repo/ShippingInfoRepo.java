package com.more.b2bridge.order_module.repo;

import com.more.b2bridge.order_module.model.ShippingInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippingInfoRepo extends JpaRepository<ShippingInfo, Long> {
}
