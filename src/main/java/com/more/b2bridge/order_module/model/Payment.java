package com.more.b2bridge.order_module.model;

import com.more.b2bridge.order_module.enumeration.PaymentMethod;
import com.more.b2bridge.order_module.enumeration.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Payment {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long orderId;
    private PaymentMethod paymentMethod;
    private LocalDateTime paymentDate;
    private BigDecimal amount;
    private Status status;
}
