package com.more.b2bridge.notification_module.dto;

import com.more.b2bridge.notification_module.enumeration.Type;
import com.more.b2bridge.order_module.enumeration.Status;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CreateNotificationDto {
    private long userId;
    private Type type;
    private String message;
    private Status status;
    private LocalDateTime createDate;
    private LocalDateTime readDate;
}
