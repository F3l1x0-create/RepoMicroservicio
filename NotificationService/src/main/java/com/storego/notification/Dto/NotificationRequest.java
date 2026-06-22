package com.storego.notification.Dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotificationRequest {
    
    @NotBlank(message = "El destinatario es obligatorio")
    @Email(message = "Email inválido")
    private String recipient;
    
    @NotBlank(message = "El asunto es obligatorio")
    private String subject;
    
    @NotBlank(message = "El mensaje es obligatorio")
    private String message;
    
    @NotNull(message = "El tipo de notificación es obligatorio")
    private String type; 
}
