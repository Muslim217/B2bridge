package com.more.b2bridge.product_module.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Setter
@Getter
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private User sellerId;

    private String name;
    private String description;
    private long categoryId;
    private BigDecimal price;
    private int stockQuantity;
    private int minOrderQuantity;
    private int minStockThreshold;
    private String imageUrl;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    private boolean isActive;
}
