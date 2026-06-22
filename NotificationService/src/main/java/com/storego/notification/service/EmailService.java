package com.storego.notification.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class EmailService {
    
    private final JavaMailSender mailSender;
    
    @Async
    public boolean sendEmail(String to, String subject, String text) {
        try {
            log.info("Enviando email a: {}", to);
            
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(to);
            message.setSubject(subject);
            message.setText(text);
            message.setFrom("noreply@storrego.com");
            
            mailSender.send(message);
            
            log.info("Email enviado exitosamente a: {}", to);
            return true;
            
        } catch (Exception e) {
            log.error("Error al enviar email: {}", e.getMessage());
            return false;
        }
    }
}