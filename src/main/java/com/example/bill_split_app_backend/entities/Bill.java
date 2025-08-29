package com.example.bill_split_app_backend.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity
@Table(name = "bills")
@NoArgsConstructor @Getter @Setter
public class Bill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bill_id;
    
    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;
    
    @CreationTimestamp
    private Instant created_at;
    
    private Instant due_at;
    private double amount;
    private String category;
    private String description;
    private String status;
    
    public Bill(Group group, Instant due_at, double amount, String category, String description, String status) {
        this.group = group;
        this.due_at = due_at;
        this.amount = amount;
        this.category = category;
        this.description = description;
        this.status = status;
    }
}
