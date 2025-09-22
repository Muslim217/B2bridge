package com.more.b2bridge.notification_module.service;

import com.more.b2bridge.notification_module.dto.CreateNotificationDto;
import com.more.b2bridge.notification_module.exception.NotificationNotFoundException;
import com.more.b2bridge.notification_module.model.Notification;
import com.more.b2bridge.notification_module.repo.NotificationRepo;
import com.more.b2bridge.user_module.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepo notificationRepo;

    public Notification getNotification(long id) {
        Optional<Notification> optionalNotification = notificationRepo.findById(id);

        if (optionalNotification.isPresent()) {
            return optionalNotification.get();
        } else {
            throw new NotificationNotFoundException("Товар не был найден");
        }
    }
}
