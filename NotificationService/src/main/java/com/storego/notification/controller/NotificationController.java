package com.storego.notification.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.storego.notification.Dto.NotificationRequest;
import com.storego.notification.Dto.NotificationResponse;
import com.storego.notification.service.NotificationService;

@RestController
@RequestMapping("/api/notifications")
@RequiredArgsConstructor
public class NotificationController {

    private final NotificationService notificationService;

    @PostMapping("/send")
    public ResponseEntity<NotificationResponse> sendNotification(
            @Valid @RequestBody NotificationRequest request) {
        NotificationResponse response = (NotificationResponse) notificationService.sendNotification(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    } 

    @GetMapping
    public ResponseEntity<Object> getAllNotifications() {
        return ResponseEntity.ok(notificationService.getAllNotifications());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getNotificationById(
            @PathVariable Long id) {
        return ResponseEntity.ok(notificationService.getNotificationById(id));
    } 

    @GetMapping("/recipient/{email}")
    public ResponseEntity<Object> getNotificationsByRecipient(
            @PathVariable String email) {
        return ResponseEntity.ok(notificationService.getNotificationsByRecipient(email));
    } 
} 