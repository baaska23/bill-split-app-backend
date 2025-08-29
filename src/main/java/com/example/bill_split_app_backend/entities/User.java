package com.example.bill_split_app_backend.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity
@Table(name = "users")
@NoArgsConstructor @Getter @Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;
    private String username;
    private String email;
    private String hashed_password;
    private Double balance;
    
    @CreationTimestamp
    private Instant created_at;
    
    public User(String username, String email, String hashed_password, Double balance) {
        this.username = username;
        this.email = email;
        this.hashed_password = hashed_password;
        this.balance = balance;
    }
}
