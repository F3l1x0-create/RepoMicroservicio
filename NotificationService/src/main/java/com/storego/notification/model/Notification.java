package com.storego.notification.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "notifications")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Notification {
    @Id
    @Column(name = "notifications_id")
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long notificationId;

    @Column(name = "notification_title", nullable = false )
    private String notificationTitle;

    @Column(name= "notification_message", nullable = false, columnDefinition = "TEXT")
    private String notificationMessage;
    


}
