package com.more.b2bridge.product_module.model;

import com.more.b2bridge.user_module.model.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Setter
@Getter
@Entity
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
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
