package com.more.b2bridge.order_module.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "shipping_info")
public class ShippingInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String address;
    private String city;
    private String country;
    private String phoneNumber;

@OneToOne(mappedBy = "shippingInfo")
    private Order order;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
