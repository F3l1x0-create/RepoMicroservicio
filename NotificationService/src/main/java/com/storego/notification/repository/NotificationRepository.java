package com.storego.notification.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.storego.notification.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long>{

}
