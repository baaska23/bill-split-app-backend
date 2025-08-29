package com.example.bill_split_app_backend.repositories;

import com.example.bill_split_app_backend.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {
}
