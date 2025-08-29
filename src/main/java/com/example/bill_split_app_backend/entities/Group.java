package com.example.bill_split_app_backend.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity
@Table(name = "groups")
@NoArgsConstructor @Getter @Setter
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int group_id;
    
    private String name;
    private String description;
    private String category;
    
    @CreationTimestamp
    private Instant created_at;
    
    public Group(String name, String description, String category) {
        this.name = name;
        this.description = description;
        this.category = category;
    }
}
