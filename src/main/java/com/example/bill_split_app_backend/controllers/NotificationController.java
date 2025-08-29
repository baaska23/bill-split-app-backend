package com.example.bill_split_app_backend.controllers;

import com.example.bill_split_app_backend.entities.Notification;
import com.example.bill_split_app_backend.services.NotificationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NotificationController {
    private final NotificationService notificationService;
    
    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    
    @GetMapping("/notifications")
    public List<Notification> getNotifications() {
        return notificationService.getNotifications();
    }
}