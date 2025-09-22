package com.more.b2bridge.order_module.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class OrderItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long orderId;
    private long productId;
    private int quantity;
    private BigDecimal pricePerUnit;
    private BigDecimal totalPrice;

}
