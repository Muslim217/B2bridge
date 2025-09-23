package com.more.b2bridge.order_module.model;

import com.more.b2bridge.order_module.enumeration.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Setter
@Getter
@Entity
public class Order {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long customerId;
    private LocalDateTime orderDate;
    private Status status;
    private BigDecimal totalAmount;
    private long paymentId;
}