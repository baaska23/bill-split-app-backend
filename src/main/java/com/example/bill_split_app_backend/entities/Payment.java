package com.example.bill_split_app_backend.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity
@Table(name = "payments")
@NoArgsConstructor @Getter @Setter
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int payment_id;
    
    @ManyToOne
    @JoinColumn(name = "bill_id")
    private Bill bill;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    
    private double amount;
    
    @CreationTimestamp
    private Instant created_at;
    
    private String payment_type;
    private boolean is_success;
    
    public Payment(Bill bill, User user, double amount, String payment_type, boolean is_success) {
        this.bill = bill;
        this.user = user;
        this.amount = amount;
        this.payment_type = payment_type;
        this.is_success = is_success;
    }
}
