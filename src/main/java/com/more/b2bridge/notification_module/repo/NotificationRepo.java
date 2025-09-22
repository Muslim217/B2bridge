package com.more.b2bridge.notification_module.repo;

import com.more.b2bridge.notification_module.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepo extends JpaRepository<Notification, Long> {
}
