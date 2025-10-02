package com.more.b2bridge.notification_module.model;

import com.more.b2bridge.order_module.enumeration.Status;
import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import com.more.b2bridge.notification_module.enumeration.Type;

import java.time.LocalDateTime;

@Setter
@Getter
@Entity
public class Notification {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long userId;
    private Type type;
    private String message;
    private Status status;
    private LocalDateTime createDate;
    @Nullable
    private LocalDateTime readDate;
}
