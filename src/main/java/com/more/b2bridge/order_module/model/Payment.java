package com.more.b2bridge.order_module.model;

import com.more.b2bridge.order_module.enumeration.PaymentMethod;
import com.more.b2bridge.order_module.enumeration.Status;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "payments")
public class Payment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @Enumerated(EnumType.STRING)
    private Status status;

    private LocalDateTime paymentDate;
    private BigDecimal amount;

    @OneToOne(mappedBy = "payment")
    private Order order;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

