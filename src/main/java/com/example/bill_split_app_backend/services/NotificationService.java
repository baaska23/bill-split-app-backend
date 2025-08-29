package com.example.bill_split_app_backend.services;

import com.example.bill_split_app_backend.entities.Notification;
import com.example.bill_split_app_backend.repositories.NotificationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {
    private final NotificationRepository notificationRepository;
    
    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }
    
    public List<Notification> getNotifications() {
        return notificationRepository.findAll();
    }
}
