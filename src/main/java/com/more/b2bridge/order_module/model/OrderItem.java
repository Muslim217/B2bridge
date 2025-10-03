package com.more.b2bridge.order_module.model;

import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "order_items")
public class OrderItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    private Long productId;
    private int quantity;
    private BigDecimal pricePerUnit;
    private BigDecimal totalPrice;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}