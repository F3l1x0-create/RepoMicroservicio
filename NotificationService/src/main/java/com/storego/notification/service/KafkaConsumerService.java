package com.storego.notification.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.storego.notification.Dto.NotificationRequest;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaConsumerService {
    
    private final NotificationService notificationService;
    
    @KafkaListener(topics = "notification-topic", groupId = "notification-group")
    public void consumeNotification(NotificationRequest request) {
        log.info("Mensaje recibido de Kafka: {}", request);
        try {
            notificationService.sendNotification(request);
            log.info("Notificación procesada exitosamente");
        } catch (Exception e) {
            log.error("Error al procesar notificación de Kafka: {}", e.getMessage(), e);
        }
    }
}