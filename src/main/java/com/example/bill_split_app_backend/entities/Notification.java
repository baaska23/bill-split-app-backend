package com.example.bill_split_app_backend.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity
@Table(name = "notifications")
@NoArgsConstructor @Getter @Setter
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int notification_id;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    
    private String message;
    private boolean is_read;
    
    @CreationTimestamp
    private Instant created_at;
    
    public Notification(User user, String message, boolean is_read) {
        this.user = user;
        this.message = message;
        this.is_read = is_read;
    }
}
