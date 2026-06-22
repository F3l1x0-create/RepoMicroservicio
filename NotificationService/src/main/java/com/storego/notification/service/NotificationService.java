package com.storego.notification.service;

import org.springframework.stereotype.Service;

import com.storego.notification.Dto.NotificationRequest;
import com.storego.notification.Dto.NotificationResponse;
import com.storego.notification.model.Notification;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class NotificationService {
    public Notification createNotification (){
        Notification notification = new Notification();
        return notification;
    }

    public NotificationResponse sendNotification(NotificationRequest request) {
        throw new UnsupportedOperationException("Unimplemented method 'sendNotification'");
    }

    public Object getAllNotifications() {
        throw new UnsupportedOperationException("Unimplemented method 'getAllNotifications'");
    }

    public Object getNotificationById(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'getNotificationById'");
    }

    public Object getNotificationsByRecipient(String email) {
        throw new UnsupportedOperationException("Unimplemented method 'getNotificationsByRecipient'");
    }
}
